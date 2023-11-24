package com.ns21.common.mist.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * packageName    : com.ns21.common.mist.dto
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
public class PresetDto {
    private String name;
    private String version;
    private String description;
    private String author;
    private Category category;
    private Attribute attribute;
    private Visibility visibility;
    @JsonProperty("annotation_type")
    private AnnotationType annotationType;


    @Getter
    @Setter
    @ToString
    public static class Category {
        private String name;
        private String version;
        private String description;
        private List<Content> contents;

        @Getter
        @Setter
        @ToString
        public static class Content {
            private String label;
            private String value;
            private String description;
            @JsonProperty("default_wlh")
            private List<Double> defaultWlh;
            private List<String> attribute;
            private List<Content> children;


        }
    }

    @Getter
    @Setter
    @ToString
    public static class Attribute {
        private String name;
        private String version;
        private String description;
        private List<AttributeContent> contents;

        @Getter
        @Setter
        @ToString
        public static class AttributeContent {
            private String label;
            private String value;
            private String type;
            private List<AttributeOption> list;

            @Getter
            @Setter
            @ToString
            public static class AttributeOption {
                private String label;
                private String value;

            }
        }
    }

    @Getter
    @Setter
    @ToString
    public static class Visibility {
        private String name;
        private String version;
        private String description;
        private List<VisibilityContent> contents;

        @Getter
        @Setter
        @ToString
        public static class VisibilityContent {
            private Integer level;
            private String description;
        }
    }

    @Getter
    @Setter
    @ToString
    public static class AnnotationType {
        private String name;
        private String version;
        private String description;
        private List<AnnotationContent> contents;

        @Getter
        @Setter
        @ToString
        public static class AnnotationContent {
            private String name;
            private String description;

        }
    }
}
