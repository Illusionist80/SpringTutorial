package com.springtrainig.security.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
 
public class SHAUtil {
 
    /**
     * @param args
     * @throws NoSuchAlgorithmException 
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(sha2("567"));
    }
     
    static String sha2(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
         
        return sb.toString();
    }
}