package com.ns21.common.mist.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


/* packageName    : com.ns21.common.mist.dto
 * fileName       : DataSetDto.java
 * author         : kjg08
 * date           : 2023-11-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-23        kjg08           최초 생성
 */
@Getter
@Setter
@ToString
public class SensorDto {
    private String uuid;
    private String name;
    private String type;
    private List<Double> translation;
    private List<Double> rotation;
    private Intrinsic intrinsic;
    @JsonProperty("height_from_ground")
    private Double heightFromGround;

    @Getter
    @Setter
    @ToString
    public static class Intrinsic {
        private String model;
        private List<List<Double>> parameter;
    }
}
