package com.ns21.common.mist.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;


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
public class FrameAnnotationDto extends BaseDto{
    @JsonProperty("frame_data_uuid")
    private String frameDataUuid;
    @JsonProperty("instance_uuid")
    private String instanceUuid;
    @JsonProperty("visibility_level")
    private Integer visibilityLevel;
    @JsonProperty("annotation_type_name")
    private String annotationTypeName;
    @JsonProperty("is_lidar_synced")
    private Boolean isLidarSynced;
    private Geometry geometry;
    @JsonProperty("num_pts")
    private Integer numPts;
    private Map<String, String> attribute;
    private String description;
    private String prev;
    private String next;

    @Getter
    @Setter
    @ToString
    public static class Geometry {
        private List<Double> wlh;
        private List<Double> center;
        private List<Double> orientation;
        @JsonProperty("is_visible")
        private Boolean isVisible;
        @JsonProperty("bbox_image3d")
        private List<List<Double>> bboxImage3d;
    }
}
