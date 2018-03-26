package com.chain4j.bean;

/**
 * Created by rocketz@aliyun.com on 2018/3/7.
 * 贷出类
 */
public class TranscationCredit {
    private String acceptPublicKey;

    public String getAcceptPublicKey() {
        return acceptPublicKey;
    }

    public TranscationCredit setAcceptPublicKey(String acceptPublicKey) {
        this.acceptPublicKey = acceptPublicKey;
        return this;
    }
}
