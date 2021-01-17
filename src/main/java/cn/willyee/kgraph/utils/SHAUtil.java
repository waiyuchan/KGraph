package cn.willyee.kgraph.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHAUtil {

    public static String getSHA256(String str) {

        MessageDigest md = null;
        String encodeStr = null;

        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] resultByteArray = md.digest();
            encodeStr = bytesToHex(resultByteArray);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return encodeStr;
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (byte aByte : bytes) {
            String hex = Integer.toHexString(aByte & 0xFF);
            if (hex.length() < 2) {
                sb.append(0);
            }
            sb.append(hex);
        }
        return sb.toString();
    }

}
