package com.ns21.common.util;

import com.ns21.common.enums.j2735.CODER_TYPE;
import com.oss.asn1.Coder;
import dsrc.Dsrc;

/**
 * packageName    : com.ns21.common.util
 * fileName       : ASN1CodeFactory.java
 * author         : kimhansol
 * date           : 2023-08-08
 * description    : ASN1 decoding setting
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-08        kimhansol       최초 생성
 */
public class ASN1CodeFactory {

    public static Coder createCoder(CODER_TYPE type) {
        Coder coder = null;
        switch (type) {
            case BER:
                coder = Dsrc.getBERCoder();
                setCoderConfig(coder);
                break;
            case JSON:
                coder = Dsrc.getJSONCoder();
                setCoderConfig(coder);
                break;
        }
        return coder;
    }

    private static void setCoderConfig(Coder coder) {
        coder.enableAutomaticEncoding();
        coder.enableAutomaticDecoding();
        coder.enableContainedValueEncoding();
        coder.enableContainedValueDecoding();
    }
}
