package com.vdncloud.util;

import com.vdncloud.common.Constants;

public final class UrlSafeBase64
{
  public static String encodeToString(String data)
  {
    return encodeToString(data.getBytes(Constants.UTF_8));
  }
  
  public static String encodeToString(byte[] data)
  {
    return Base64.encodeToString(data, Base64.URL_SAFE | Base64.NO_WRAP);
  }
  
  public static byte[] decode(String data)
  {
    return Base64.decode(data, Base64.URL_SAFE | Base64.NO_WRAP);
  }
}
