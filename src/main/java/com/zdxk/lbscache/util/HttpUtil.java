package com.zdxk.lbscache.util;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.alibaba.fastjson.JSONObject;

/**
 * http 相关工具
 */
public class HttpUtil {

    /**
     * 返回JSON格式的HTTP请求
     * @param requestUrl
     * @param requestMethod
     * @return
     */
    public static JSONObject httpRequestJSON(String requestUrl, String requestMethod) {
        JSONObject jsonObject = null;
        String buffer = httpRequest(requestUrl,requestMethod);
        jsonObject = JSONObject.parseObject(buffer.toString());
        return jsonObject;
    }

    /**
     * HTTP请求
     * @param requestUrl
     * @param requestMethod
     * @return
     */
    public static String httpRequest(String requestUrl, String requestMethod) {
        StringBuffer buffer = new StringBuffer();
        String retStr = null;
        try {

            URL url = new URL(requestUrl);
            // http协议传输
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();

            httpUrlConn.setDoOutput(true);
            httpUrlConn.setDoInput(true);
            httpUrlConn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            httpUrlConn.setRequestMethod(requestMethod);

            if ("GET".equalsIgnoreCase(requestMethod))
                httpUrlConn.connect();
            // 将返回的输入流转换成字符串
            InputStream inputStream = httpUrlConn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            bufferedReader.close();
            inputStreamReader.close();
            // 释放资源
            inputStream.close();
            inputStream = null;
            httpUrlConn.disconnect();
            retStr = buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retStr;
    }
}
