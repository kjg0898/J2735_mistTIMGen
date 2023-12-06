package com.ns21.common.mist.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


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
public class LogDto extends BaseDto {
     private String uuid;
    @JsonProperty("map_uuids")
    private String mapUuids;
    private String device;
    @JsonProperty("date_captured")
    private String dateCaptured;
    private String location;
    @JsonProperty("driving_distance")
    private Double drivingDistance;
}
