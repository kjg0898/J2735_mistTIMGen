package com.ns21.common.mist;

import com.ns21.common.mist.dto.FrameAnnotationDto;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * packageName    : com.ns21.common.mist
 * fileName       : DataStorage.java
 * author         : kjg08
 * date           : 2023-11-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-27        kjg08           최초 생성
 */
public class DataStorage {
    private static final DataStorage instance = new DataStorage();
    private final ConcurrentHashMap<String, Object> dataMap;

    private DataStorage() {
        dataMap = new ConcurrentHashMap<>();
    }

    public static DataStorage getInstance() {
        return instance;
    }

    public void storeFrameAnnotations(List<FrameAnnotationDto> annotations) {
        dataMap.put("frameAnnotations", annotations);
    }

    @SuppressWarnings("unchecked")
    public List<FrameAnnotationDto> getFrameAnnotations() {
        return (List<FrameAnnotationDto>) dataMap.get("frameAnnotations");
    }


}
