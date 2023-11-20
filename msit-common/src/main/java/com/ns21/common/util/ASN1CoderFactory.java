package com.ns21.common.util;

import com.oss.asn1.Coder;
import dsrc.Dsrc;


/**
 * ASN.1 Coder 팩토리 메서드
 * <p>
 * NOTE :
 *
 * @author htkim
 * @version 1.0
 * @see << 개정이력(Modification Information) >>
 * 수정일        수정자          수정내용
 * ------------ -------------- --------------------------
 * 2019.04.03   htkim          최초 생성
 * @since 2019.04.03
 */
public abstract class ASN1CoderFactory {

    /**
     * create coder
     *
     * @param type - coder type
     * @return Coder
     */
    public static Coder createCoder(CODER_TYPE type) {
        Coder coder;
        switch (type) {
            case N_ANYANG_BER:
                coder = Dsrc.getBERCoder();
                setCoderConfig(coder);
                break;
            case N_ANYANG_UPER:
                coder = Dsrc.getPERUnalignedCoder();
                setCoderConfig(coder);
                break;
            case N_ANYANG_JSON:
                coder = Dsrc.getJSONCoder();
                setCoderConfig(coder);
                break;
            default:
                coder = Dsrc.getPERUnalignedCoder();
                setCoderConfig(coder);
        }
        return coder;
    }



    /**
     * set coder configuration
     *
     * @param coder - coder
     */
    private static void setCoderConfig(Coder coder) {
        coder.enableAutomaticEncoding();
        coder.enableAutomaticDecoding();
        coder.enableContainedValueEncoding();
        coder.enableContainedValueDecoding();
    }

    /**
     * coder type
     */
    public enum CODER_TYPE {
        N_ANYANG_BER("안양C-ITS 표준 DATEX BER 코더"),
        N_ANYANG_UPER("안양C-ITS 표준 J2735 UPER 코더"),
        N_ANYANG_JSON("안양C-ITS 표준 JSON 코더")
        ;

        private final String description;

        CODER_TYPE(String description) {
            this.description = description;
        }

        public String description() {
            return description;
        }

    }
}
