package com.ns21.tim;

import com.ns21.tim.creator.TimMessageCreator;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * packageName    : com.ns21.tim
 * fileName       : TimLauncher.java
 * author         : kjg08
 * date           : 2023-11-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-17        kjg08           최초 생성
 */
public class TimLauncher {
    private static final Logger logger = LoggerFactory.getLogger(TimLauncher.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        // TimMessageCreator Verticle 배포
        vertx.deployVerticle(new TimMessageCreator(), res -> {
            if (res.failed()) {
                logger.info("Failed to deploy TimMessageCreator verticle: " + res.cause());
                vertx.close(); // 실패한 경우 Vert.x 인스턴스를 종료합니다.
                return;
            }
            logger.info("TimMessageCreator Verticle deployed successfully!");
        });

    }
}
