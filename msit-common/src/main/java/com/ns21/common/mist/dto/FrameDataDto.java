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
public class FrameDataDto extends BaseDto {
    @JsonProperty("frame_uuid")
    private String frameUuid;
    @JsonProperty("ego_pose_uuid")
    private String egoPoseUuid;
    @JsonProperty("sensor_uuid")
    private String sensorUuid;
    private String timestamp;
    @JsonProperty("is_key_frame")
    private Boolean isKeyFrame;
    private Integer height;
    private Integer width;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("file_format")
    private String fileFormat;
    private String prev;
    private String next;
    @JsonProperty("prev_key_frame_data")
    private String prevKeyFrameData;
    @JsonProperty("next_key_frame_data")
    private String nextKeyFrameData;
}
