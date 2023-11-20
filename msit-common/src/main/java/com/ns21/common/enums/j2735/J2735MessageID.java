package com.ns21.common.enums.j2735;

import lombok.Getter;

@Getter
public enum J2735MessageID {

    SPAT(19, "SignalPhaseAndTimingMessage"),
    EVA(22,"EmergencyVehicleAlert" ),
    RSA(27, "RoadSideAlert"),
    TIM(31, "TravelerInformation"),
    ;

    private int id;
    private String description;

    J2735MessageID(int id, String des) {
        this.id = id;
        this.description = des;
    }

}
