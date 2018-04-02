package com.vdncloud.common;

import com.vdncloud.vo.ResultJsonVo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;

public class HttpRequest
{
  public static ResultJsonVo post(String URL, String jsonStr)
  {
    DefaultHttpClient client = new DefaultHttpClient();
    HttpPost post = new HttpPost(URL);
    
    post.setHeader("Content-Type", "application/json");
    ResultJsonVo resultVo = new ResultJsonVo();
    try
    {
      StringEntity s = new StringEntity(jsonStr, "utf-8");
      s.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
      post.setEntity(s);
      
      HttpResponse httpResponse = client.execute(post);
      
      InputStream inStream = httpResponse.getEntity().getContent();
      BufferedReader reader = new BufferedReader(new InputStreamReader(inStream, "utf-8"));
      StringBuilder strber = new StringBuilder();
      String line = null;
      while ((line = reader.readLine()) != null) {
        strber.append(line + "\n");
      }
      inStream.close();
      resultVo.setStatus(httpResponse.getStatusLine().getStatusCode());
      resultVo.setResult(strber.toString());
      return resultVo;
    }
    catch (Exception e)
    {
      resultVo.setStatus(-1);
      resultVo.setResult(e.getMessage());
    }
    return resultVo;
  }
}
