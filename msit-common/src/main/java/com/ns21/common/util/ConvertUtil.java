package com.ns21.common.util;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/**
 * packageName    : com.ns21.common.util
 * fileName       : ConvertUtil.java
 * author         : kimhansol
 * date           : 2023-08-08
 * description    : byte 관련 convert util [필요한것들 추가 가능]
 *  method name patter -> type1 To type2
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-08        kimhansol       최초 생성
 */
public class ConvertUtil {

    public static String bytesToHexString(byte[] bytes) {
        int pCount = bytes.length;
        StringBuffer buff = new StringBuffer(pCount * 2);
        for (int pIndex = 0; pIndex < pCount; pIndex++) {
            if (((int) bytes[pIndex] & 0xff) < 0x10) {
                buff.append(0);
            }
            buff.append(Long.toString((int) bytes[pIndex] & 0xff, 16));
        }
        return buff.toString();
    }

    public static String byteToHexString(byte b) {
        StringBuffer buff = new StringBuffer(2);
        if(((int) b &0xff) < 0x10 ) {
            buff.append(0);
        }
        buff.append(Long.toString((int)b & 0xff, 16));
        return buff.toString();
    }

    public static byte[] hexStringToBytes(String pSource) {
        StringBuffer buff = new StringBuffer(pSource);
        int bCount = buff.length() / 2;
        byte[] bArr = new byte[bCount];
        for (int bIndex = 0; bIndex < bCount; bIndex++) {
            bArr[bIndex] = (byte) Long.parseLong(buff.substring(2 * bIndex, (2 * bIndex) + 2), 16);
        }
        return bArr;
    }

    public static short unsignedByte(byte b) {
        return (short)(b < 0 ? b+256 : b);
    }


    public static byte[] shortToBytes(short value) {
        return new byte[] {
                (byte)((value >> 8) & 0xFF),
                (byte)((value) & 0xFF )
        };
    }

    public static short bytesToShort(byte[] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(Short.BYTES);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        return byteBuffer.getShort();
    }

    public static byte[] intToBytes(int value) {
        return new byte[] {
                (byte) ((value >> 24) & 0xFF),
                (byte) ((value >> 16) & 0xFF),
                (byte) ((value >> 8) & 0xFF),
                (byte) ((value >> 0) & 0xFF)
        };
    }

    public static int bytesToInt(byte[] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(Integer.BYTES);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        return byteBuffer.getInt();
    }


    public static byte [] longToBytes(long value) {
        return new byte [] {
                (byte) ((value >> 56) & 0xFF),
                (byte) ((value >> 48) & 0xFF),
                (byte) ((value >> 40) & 0xFF),
                (byte) ((value >> 32) & 0xFF),
                (byte) ((value >> 24) & 0xFF),
                (byte) ((value >> 16) & 0xFF),
                (byte) ((value >> 8) & 0xFF),
                (byte) ((value >> 0) & 0xFF)
        };
    }

    public static long bytesToLong(byte [] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(Long.BYTES);
        byteBuffer.put(bytes);
        byteBuffer.flip();
        return byteBuffer.getLong();
    }

    public static byte[] getBytesSection(byte[] bytes, int from, int to) {
        byte [] slice = Arrays.copyOfRange(bytes, from, to);
        return slice;
    }

    public static byte[] bytesConcat(byte[] ... bytesL) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        if (bytesL != null) {
            Arrays.stream(bytesL).filter(Objects::nonNull)
                    .forEach(bytes -> baos.write(bytes, 0, bytes.length));
        }
        return baos.toByteArray();
    }

    public static byte[] byteConcat(byte ... byteL) {
        return byteL;
    }

}
