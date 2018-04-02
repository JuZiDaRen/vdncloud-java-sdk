package com.vdncloud.vls;

public class VlsPostDetail
{
  private String cmd;
  private boolean base64;
  private Integer timeout;
  
  public String getCmd()
  {
    return this.cmd;
  }
  
  public void setCmd(String cmd)
  {
    this.cmd = cmd;
  }
  
  public boolean isBase64()
  {
    return this.base64;
  }
  
  public void setBase64(boolean base64)
  {
    this.base64 = base64;
  }
  
  public Integer getTimeout()
  {
    return this.timeout;
  }
  
  public void setTimeout(Integer timeout)
  {
    this.timeout = timeout;
  }
}
