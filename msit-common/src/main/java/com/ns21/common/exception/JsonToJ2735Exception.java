package com.ns21.common.exception;

/**
 * packageName    : com.ns21.common.util
 * fileName       : JsonToJ2735Exception.java
 * author         : kjg08
 * date           : 2023-11-17
 * description    :JSON을 J2735 형식으로 변환할 때 발생하는 예외를 처리함
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-17        kjg08           최초 생성
 */

public class JsonToJ2735Exception extends Exception {

    /**
     * 예외를 생성합니다.
     *
     * @param message 예외에 대한 설명 메시지
     */
    public JsonToJ2735Exception(String message) {
        super(message);
    }

    /**
     * 예외를 생성하며 원인 예외를 첨부합니다.
     *
     * @param message 예외에 대한 설명 메시지
     * @param cause 원인이 되는 예외
     */
    public JsonToJ2735Exception(String message, Throwable cause) {
        super(message, cause);
    }

    // 필요에 따라 추가적인 생성자 또는 메서드를 구현할 수 있습니다.
}
