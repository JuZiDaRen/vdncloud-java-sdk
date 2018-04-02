package com.vdncloud.vls;

import java.util.List;

public class VlsPostData
{
  private String id;
  private String type;
  private List<String> sn;
  private VlsPostDetail detail;
  private String replyurl;
  
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setType(String type)
  {
    this.type = type;
  }
  
  public List<String> getSn()
  {
    return this.sn;
  }
  
  public void setSn(List<String> sn)
  {
    this.sn = sn;
  }
  
  public VlsPostDetail getDetail()
  {
    return this.detail;
  }
  
  public void setDetail(VlsPostDetail detail)
  {
    this.detail = detail;
  }
  
  public String getReplyurl()
  {
    return this.replyurl;
  }
  
  public void setReplyurl(String replyurl)
  {
    this.replyurl = replyurl;
  }
}
