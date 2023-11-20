package com.ns21.common.enums.eb;

import lombok.Getter;

@Getter
public enum MsgSrcAddress {

    VERTICLE_MAKER("message-source-maker","verticle.maker")
    ;
    private String name;
    private String address;


    MsgSrcAddress(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
