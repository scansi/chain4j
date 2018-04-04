package com.chain4j.service.bean;

/**
 * Created by rz on 2018/3/7.
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
