package com.ns21.common.mist.dto;

import com.ns21.common.util.ConvertUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;


/**
 * packageName    : com.ns21.gate.i2x.message.dto
 * fileName       : I2XMessageDto.java
 * author         : kimhansol
 * date           : 2023-08-09
 * description    : I2X message DTO
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-09        kimhansol       최초 생성
 */
@Getter
@Setter
public class MessageDto {
    private byte[] header = {(byte) 0x7e, (byte) 0xe7};
    private byte[] length;
    private byte[] id;
    private byte seqNo;
    private byte opCode;
    private byte[] data;
    private byte[] crc;
    private byte[] tail = {(byte) 0xe7, (byte) 0x7e};

    /**
    * methodName : toHexString
    * author : kimhansol
    * description : messageDto To HexString
    * @params :
    * @return : String
    **/
    public String toHexString() {

        String header = ConvertUtil.bytesToHexString(this.header);
        String length = ConvertUtil.bytesToHexString(this.length);
        String id = ConvertUtil.bytesToHexString(this.id);
        String seqNo = ConvertUtil.byteToHexString(this.seqNo);
        String opCode = ConvertUtil.byteToHexString(this.opCode);
        String data = ConvertUtil.bytesToHexString(this.data);
        String crc = ConvertUtil.bytesToHexString(this.crc);
        String tail = ConvertUtil.bytesToHexString(this.tail);

        String message = header+length+id+seqNo+opCode+data+crc+tail;

        return message;
    }

    /**
    * methodName : getFullMessageBytes
    * author : kimhansol
    * description : messageDto full bytes
    * @params :
    * @return : byte[]
    **/
    public byte[] getFullMessageBytes() {
        byte[] seqOP = ConvertUtil.byteConcat(seqNo, opCode);
        byte[] fullBytes = ConvertUtil.bytesConcat(header, length, id, seqOP, data, crc, tail);
        return fullBytes;
    }

    @Override
    public String toString() {
        return "I2XMessageDto{" +
                "header=" + Arrays.toString(header) +
                ", length=" + Arrays.toString(length) +
                ", id=" + Arrays.toString(id) +
                ", seqNo=" + seqNo +
                ", opCode=" + opCode +
                ", data=" + Arrays.toString(data) +
                ", crc=" + Arrays.toString(crc) +
                ", tail=" + Arrays.toString(tail) +
                '}';
    }


    /**
     * methodName : getSId
     * author : kimhansol
     * description : i2x id convert -> String  [i2x serial-no]
     * @params : id : byte[]
     * @return : String
     **/
    public String getSId(byte[] id) {
        //00 00 00 64 -> 00000100
        //00 00 00 03 -> 00000003
        String sn_gubun = new String(ConvertUtil.getBytesSection(id, 0, 1));
        int sn_no =  ConvertUtil.bytesToInt(ConvertUtil.getBytesSection(id, 1, 5));
        String sn = sn_gubun + String.format("%08d", sn_no);

        return sn;
    }

    /**
    * methodName : getId
    * author : kimhansol
    * description : serial-no byte 형식으로 변경.
    * @params : sid : String
    * @return : byte[]
    **/
    public static byte[] getId(String sid) {
        byte [] sn_gubun = sid.substring(0,1).getBytes();
        byte [] sn_no = ConvertUtil.intToBytes(Integer.parseInt(sid.substring(1)));
        return ConvertUtil.bytesConcat(sn_gubun, sn_no);
    }
}
