package com.chain4j.bean;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * Created by rocketz@aliyun.com on 2018/3/7.
 */
public class Key {

    private RSAPublicKey publicKey;
    private RSAPrivateKey privateKey;

    public void makeNewKey() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        this.publicKey = (RSAPublicKey) keyPair.getPublic();
        this.privateKey = (RSAPrivateKey) keyPair.getPrivate();
    }

    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public String getPublicKey() throws Exception {
        return encryptBASE64(publicKey.getEncoded());
    }

    public String getPrivateKey() throws Exception {
        return encryptBASE64(privateKey.getEncoded());
    }
}
