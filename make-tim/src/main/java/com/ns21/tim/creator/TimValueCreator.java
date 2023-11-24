package com.ns21.tim.creator;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns21.common.mist.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;
/**
 * packageName    : com.ns21.tim.creator
 * fileName       : TimMessageCreator.java
 * author         : kjg08
 * date           : 2023-11-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-24        kjg08           최초 생성
 */
public class TimValueCreator {
    public static <SensorDto> String createTimMessage(DatasetDto datasetDto,
                                                      EgoPoseDto egoPoseDto,
                                                      FrameAnnotationDto frameAnnotationDto,
                                                      LogDto logDto,
                                                      PresetDto presetDto,
                                                      SensorDto sensorDto) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // Construct the JSON message
        Map<String, Object> timMessage = new HashMap<>();
        timMessage.put("msgCnt", 0);

        // Add dataFrames
        List<Map<String, Object>> dataFrames = new ArrayList<>();
        Map<String, Object> dataFrame = new HashMap<>();
        dataFrame.put("frameType", "advisory");
        // Assume egoPoseDto contains methods to get timestamp, translation, and rotation
        dataFrame.put("startYear", egoPoseDto.getTimestamp());
        dataFrame.put("startTime", egoPoseDto.getTimestamp());
        dataFrame.put("durationTime", 0);
        dataFrame.put("priority", 0);

        // Add regions
        List<Map<String, Object>> regions = new ArrayList<>();
        Map<String, Object> region = new HashMap<>();
        Map<String, Object> anchor = new HashMap<>();
        anchor.put("lat", egoPoseDto.getTranslation());
        anchor.put("long", egoPoseDto.getTranslation());
        anchor.put("elevation", egoPoseDto.getTranslation());
        region.put("anchor", anchor);
        //region.put("direction", egoPoseDto.getRotation().toString()); // Adjust as per actual method

        // Add description
        Map<String, Object> description = new HashMap<>();
        Map<String, Object> path = new HashMap<>();
        // Fill path details as per egoPoseDto
        description.put("path", path);
        region.put("description", description);
        regions.add(region);
        dataFrame.put("regions", regions);

        // Add content
        Map<String, Object> content = new HashMap<>();
        List<Map<String, String>> advisory = new ArrayList<>();
        Map<String, String> item = new HashMap<>();
        //item.put("itis", presetDto.get); // Assuming getValue() method exists
        advisory.add(item);
        content.put("advisory", advisory);
        dataFrame.put("content", content);

        dataFrames.add(dataFrame);
        timMessage.put("dataFrames", dataFrames);

        // Add regional
        List<Map<String, Object>> regional = new ArrayList<>();
        Map<String, Object> regionalItem = new HashMap<>();
        regionalItem.put("regionId", 4);
        Map<String, Object> regExtValue = new HashMap<>();
        List<Map<String, Object>> cits = new ArrayList<>();
        Map<String, Object> cit = new HashMap<>();
        List<String> text = new ArrayList<>();
        text.add(datasetDto.getUuid());
        //text.add(datasetDto.getScenarioNames().get(0));
        //text.add(sensorDto.getName());
        //text.add(frameAnnotationDto.getVehicleState());
        cit.put("text", text);
        List<String> subtext = new ArrayList<>();
        //subtext.add(presetDto.getValue());
        //subtext.add(presetDto.getValue() + "-" + presetDto.getValue()); // Modify as needed
        cit.put("subtext", subtext);
        cit.put("stopID", logDto.getLocation());
        cits.add(cit);
        regExtValue.put("cits", cits);
        regionalItem.put("regExtValue", regExtValue);
        regional.add(regionalItem);

        timMessage.put("regional", regional);

        // Convert the map to JSON string
        return mapper.writeValueAsString(timMessage);
    }
}