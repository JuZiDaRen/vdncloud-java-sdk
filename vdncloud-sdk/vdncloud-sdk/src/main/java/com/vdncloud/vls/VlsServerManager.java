package com.vdncloud.vls;

import com.alibaba.fastjson.JSON;
import com.vdncloud.common.Constants;
import com.vdncloud.common.HttpRequest;
import com.vdncloud.util.UrlSafeBase64;
import com.vdncloud.vo.ResultJsonVo;
import java.util.List;

public final class VlsServerManager
{
  public ResultJsonVo callServerCheckVls(String vlsUrl, String callid, String cmd, List<String> snList)
  {
    VlsPostData postData = new VlsPostData();
    postData.setId(callid);
    postData.setType(Constants.VLSACCEPTANCE);
    postData.setReplyurl("");
    postData.setSn(snList);
    
    VlsPostDetail detail = new VlsPostDetail();
    detail.setBase64(true);
    detail.setCmd(UrlSafeBase64.encodeToString(cmd));
    detail.setTimeout(Constants.timeout);
    
    postData.setDetail(detail);
    
    ResultJsonVo result = HttpRequest.post(vlsUrl, JSON.toJSONString(postData));
    return result;
  }
}
