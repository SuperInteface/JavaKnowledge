package com.javaEE.util.encryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class AESUtil {

    private static final String KEY_ALGORITHM = "AES";
    private static final String DEFAULT_CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";//默认的加密算法

    /**
     * @param content 代加密字符串
     * @param key     密钥
     * @param iv      偏移量
     * @return 将加密后的byte字节以Base64编码后返回
     * 字符集 utf-8
     * @throws Exception
     */
    public static String encrypt(String content, String key, String iv) throws Exception {
        // 创建密码器
        Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
        // 密钥
        SecretKey secretKey = new SecretKeySpec(key.getBytes("utf-8"), "AES");
        // 偏移量
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes("utf-8"));
        //初始化为加密模式的密码器
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
        // 加密
        byte[] result = cipher.doFinal(content.getBytes("utf-8"));
        // 将加密后的byte字节以Base64编码后返回
        return Base64.getEncoder().encodeToString(result);//通过Base64转码返回
    }

    /**
     * @param content 待解密字符串
     * @param key     密钥
     * @param iv      偏移量
     * @return 解密后的字符串
     * 字符集 utf-8
     * @throws Exception
     */
    public static String decrypt(String content, String key, String iv) throws Exception {
        // 创建密码器
        Cipher cipher = Cipher.getInstance(DEFAULT_CIPHER_ALGORITHM);
        // 密钥
        SecretKey secretKey = new SecretKeySpec(key.getBytes("utf-8"), "AES");
        // 偏移量
        IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes("utf-8"));
        // 初始化
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);//使用密钥初始化，设置为解密模式
        // 解密
        byte[] result = cipher.doFinal(Base64.getDecoder().decode(content));
        // 返回解密后字符串
        return new String(result, "utf-8");
    }

    public static void main(String[] args) throws Exception {
        String content = "hello,您好";
        String key = "1234567890123456";
        String iv = "1234567891012345";
        System.out.println("content:" + content);
        String s1 = AESUtil.encrypt(content, key, iv);
        System.out.println("s1:" + s1);
        System.out.println("s2:" + AESUtil.decrypt(s1, key, iv));
    }
}