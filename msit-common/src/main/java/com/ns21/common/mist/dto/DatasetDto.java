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
public class DatasetDto extends BaseDto {
    @JsonProperty("log_uuid")
    private String logUuid;
    @JsonProperty("scenario_names")
    private List<String> scenarioNames;
    private String name;
    private String description;
    @JsonProperty("base_path")
    private String basePath;
    @JsonProperty("num_frames")
    private int numFrames;
    @JsonProperty("first_frame_uuid")
    private String firstFrameUuid;
    @JsonProperty("last_frame_uuid")
    private String lastFrameUuid;

}
