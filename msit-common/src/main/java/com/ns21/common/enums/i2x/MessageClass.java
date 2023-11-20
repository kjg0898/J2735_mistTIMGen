package com.ns21.common.enums.i2x;

import com.ns21.common.mist.dto.MessageDto;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;
import lombok.Getter;

import java.util.Arrays;

/**
 * packageName    : com.ns21.common.enums.i2x
 * fileName       : MessageClass.java
 * author         : kimhansol
 * date           : 2023-08-24
 * description    : vertx message body class check 용 enum
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-08-24        kimhansol       최초 생성
 */
@Getter
public enum MessageClass {
    I2X_MESSAGE(MessageDto.class.getName()),
    JSON_OBJECT(JsonObject.class.getName()),
    BUFFER(Buffer.class.getName());

    private String className;

    MessageClass(String name) {
        this.className = name;
    }

    public static MessageClass valuesOfClass(String className) {
        return Arrays.stream(values()).filter(X -> X.getClassName().equals(className)).findAny().orElse(null);
    }
}
