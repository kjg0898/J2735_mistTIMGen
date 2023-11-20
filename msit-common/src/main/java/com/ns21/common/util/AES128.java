package com.ns21.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AES128 {

    private static final Logger logger = LoggerFactory.getLogger(AES128.class);

    private static final byte [] KEYNAME =  { (byte) 0x2b, (byte) 0x7e, (byte) 0x15, (byte) 0x16, (byte) 0x28, (byte)0xae, (byte) 0xd2, (byte) 0xa6, (byte) 0xab, (byte) 0xf7, (byte) 0x15, (byte) 0x88, (byte) 0x09, (byte) 0xcf, (byte) 0x4f, (byte)0x3c };
    private static final String ALGORITHM = "AES";
    public static final byte [] IV = { 0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f };
    public static final String AES_CBC_NOPADDING = "AES/CBC/NoPadding";

    //KEYNAME => 업체에서 보내준 KEY
    //IV (Initiailzation vector) >> chper init 시 사용 함

    public static String encrypt(final String source) throws Exception {
        byte[] eArr = null;
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        eArr = cipher.doFinal(addPadding(ConvertUtil.hexStringToBytes(source)));
        return ConvertUtil.bytesToHexString(eArr);
    }

    public static byte[] encrypt(final byte[] source) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        return cipher.doFinal(addPadding(source));
    }

    public static String decrypt(final String source) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        byte[] eArr = removePadding(cipher.doFinal(ConvertUtil.hexStringToBytes(source)));
        return ConvertUtil.bytesToHexString(eArr);
    }

    public static byte[] decrypt(final byte[] source) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        return removePadding(cipher.doFinal(source));
    }

    private static byte[] addPadding(final byte[] pBytes) {
        int pCount = pBytes.length;
        int tCount = pCount + (16 - (pCount % 16));
        byte[] tBytes = new byte[tCount];
        System.arraycopy(pBytes, 0, tBytes, 0, pCount);
        for (int rIndex = pCount; rIndex < tCount; rIndex++) {
            tBytes[rIndex] = 0x00;
        }
        return tBytes;
    }

    private static byte[] removePadding(final byte[] pBytes) {
        int pCount = pBytes.length;
        int index = 0;
        boolean loop = true;
        while (loop) {
            if (index == pCount || pBytes[index] == 0x00) {
                loop = false;
                index--;
            }
            index++;
        }
        byte[] tBytes = new byte[index];
        System.arraycopy(pBytes, 0, tBytes, 0, index);
        return tBytes;
    }

    //reverse
    public static String encryptReverse(final String source) throws Exception {
        byte[] eArr = null;
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        eArr = cipher.doFinal(addPaddingReverse(ConvertUtil.hexStringToBytes(source)));
        return ConvertUtil.bytesToHexString(eArr);
    }


    public static byte[] encryptReverse(final byte[] source) throws Exception {
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        return cipher.doFinal(addPaddingReverse(source));
    }


    public static String decryptReverse(final String source, int len) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        byte[] eArr = removePaddingReverse(cipher.doFinal(ConvertUtil.hexStringToBytes(source)), len);
        return ConvertUtil.bytesToHexString(eArr);
    }

    public static byte[] decryptReverse(final byte[] source, int len) throws Exception {
        Cipher cipher = Cipher.getInstance(AES_CBC_NOPADDING);
        SecretKeySpec skeySpec = new SecretKeySpec(KEYNAME, ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, new IvParameterSpec(IV));
        return removePaddingReverse(cipher.doFinal(source), len);
    }

    private static byte[] addPaddingReverse(final byte[] pBytes) {
        int pCount = pBytes.length;
        int tCount = pCount + (16 - (pCount % 16));
        byte[] tBytes = new byte[tCount];
        System.arraycopy(pBytes, 0, tBytes, 0, pCount);
        for (int rIndex = pCount; rIndex < tCount; rIndex++) {
            tBytes[rIndex] = (byte) (0xFF & 0xFF);
        }
        return tBytes;
    }

    private static byte[] removePaddingReverse(final byte[] pBytes, int len) throws Exception {
        int pCount = pBytes.length;
        int index = 0;
        boolean loop = true;
        if(pCount >= len) {
            while (loop) {
                if (index == pCount || pBytes[index] == (byte)0xFF) {
                    if(index != 5 && index >= len) { //i2x seqNo 255까지 (seqNo 0xff 인것 제외)
                        break;
                    }
                }
                index++;
            }
            byte[] tBytes = new byte[index];
            System.arraycopy(pBytes, 0, tBytes, 0, index);
            return tBytes;
        } else {
            logger.error("Remove Padding ERROR -> source message length is too Small");
            throw new Exception();
        }
    }
}
