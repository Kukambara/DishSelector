package ua.nure.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by Dmitry on 15.04.2014.
 */
public class Digest {

    public static String md5(String s) {
        return md5(s.getBytes());
    }
    public static String md5(byte[] bytes) {
        StringBuffer hexString = new StringBuffer();
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(bytes);
            byte byteData[] = m.digest();
            for (int i=0;i<byteData.length;i++) {
                String hex=Integer.toHexString(0xff & byteData[i]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hexString.toString();
    }

    public static String sha256(String s) {
        return sha256(s.getBytes());
    }
    public static String sha256(byte[] bytes) {
        StringBuffer hexString = new StringBuffer();
        try {
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            m.update(bytes);
            byte byteData[] = m.digest();
            for (int i=0;i<byteData.length;i++) {
                String hex=Integer.toHexString(0xff & byteData[i]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hexString.toString();
    }
}
