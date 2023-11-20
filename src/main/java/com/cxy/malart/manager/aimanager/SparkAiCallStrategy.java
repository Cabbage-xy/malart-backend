package com.cxy.malart.manager.aimanager;

/**
 * 讯飞星火API调用
 */
public class SparkAiCallStrategy implements AiCallStrategy{
    // todo: 可使用配置文件对字段进行配置
    public static final String hostUrl = "https://spark-api.xf-yun.com/v2.1/chat";
    public static final String appid = "6b4e9942";
    public static final String apiSecret = "ZTk2NzRhOGQ5MDMwMTJiMzRjYzIxNDA5";
    public static final String apiKey = "50a16720886829ec9c826daaba96b0da";
    @Override
    public boolean newChat() {
        return false;
    }

    @Override
    public String doChat(String chatMsg) {
        return null;
    }

    @Override
    public boolean endChat() {
        return false;
    }
}
