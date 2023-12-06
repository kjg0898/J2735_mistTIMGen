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
public class EgoPoseDto extends BaseDto {
    private String uuid;
    private String timestamp;
    private List<Double> translation;
    private List<Double> rotation;
    @JsonProperty("coordinate_system")
    private CoordinateSystem coordinateSystem;

    @Getter
    @Setter
    @ToString
    public static class CoordinateSystem {
        private int epsg;
        private String ellipsoid;
        private String geoid;

    }
}
