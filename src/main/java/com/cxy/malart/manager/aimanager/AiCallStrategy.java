package com.cxy.malart.manager.aimanager;

/**
 * AI请求调用接口
 *
 * 用途：抽象的AI请求调用类，对于不同的AI调用API，编写不同的实现类
 * @author cxy
 */
public interface AiCallStrategy {
    /**
     * 新建对话
     * @return 创建结果，成功：true，失败：false
     */
    boolean newChat();

    /**
     * 进行对话，传入String，返回String
     *
     * @return 返回结果
     */
    String doChat(String chatMsg);

    /**
     * 结束对话
     *
     * @return 结束结果，成功：true，失败：false
     */
    boolean endChat();
}
