package com.cxy.malart.manager.aimanager;

import com.cxy.malart.common.ErrorCode;
import com.cxy.malart.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 讯飞星火API调用
 */
@Service
public class YuAiCallStrategy implements AiCallStrategy{
    @Resource
    private YuCongMingClient yuCongMingClient;

    @Override
    public boolean newChat() {
        return false;
    }

    @Override
    public String doChat(String chatMsg) {
        DevChatRequest devChatRequest = new DevChatRequest();

        devChatRequest.setModelId(1651468516836098050L);
        devChatRequest.setMessage(chatMsg);

        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);

        if (response == null) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "AI响应错误");
        }
        return response.getData().getContent();
    }

    @Override
    public boolean endChat() {
        return false;
    }
}
