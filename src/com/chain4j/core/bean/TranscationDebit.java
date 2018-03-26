package com.chain4j.bean;

/**
 * Created by rocketz@aliyun.com on 2018/3/8.
 * 借入类
 */
public class TranscationDebit {
    private String sig;
    private String publicKey;

    public String getSig() {
        return sig;
    }

    public TranscationDebit setSig(String sig) {
        this.sig = sig;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public TranscationDebit setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
}
