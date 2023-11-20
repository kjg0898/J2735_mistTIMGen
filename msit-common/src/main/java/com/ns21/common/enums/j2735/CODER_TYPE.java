package com.ns21.common.enums.j2735;

import lombok.Getter;

@Getter
public enum CODER_TYPE {
    JSON(" asn1 json"),
    BER(" asn1 ber")
        ;
    private String desc;
    CODER_TYPE(String desc) {
        this.desc = desc;
    }

}
