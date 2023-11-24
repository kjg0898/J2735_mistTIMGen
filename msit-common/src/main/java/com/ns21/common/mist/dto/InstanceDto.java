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
public class InstanceDto {
    private String uuid;
    @JsonProperty("category_name")
    private String categoryName;
    @JsonProperty("first_frame_annotation_uuid")
    private String firstFrameAnnotationUuid;
    @JsonProperty("last_frame_annotation_uuid")
    private String lastFrameAnnotationUuid;
    @JsonProperty("num_annotations")
    private Integer numAnnotations;
    private String description;
}
