package com.ns21.common.mist.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * packageName    : com.ns21.common.mist.dto
 * fileName       : BaseDto.java
 * author         : kjg08
 * date           : 2023-11-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-30        kjg08           최초 생성
 */
@Getter
@Setter
@ToString
public abstract class BaseDto {
    protected String uuid; // 공통 속성
}
