package com.ns21.rsa;

import com.ns21.rsa.creator.RsaMessageCreator;
import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * packageName    : com.ns21.rsa
 * fileName       : RsaLauncher.java
 * author         : kjg08
 * date           : 2023-11-17
 * description    :Vert.x 프레임워크를 사용하는 런처 클래스(애플리케이션의 진입점)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-17        kjg08           최초 생성
 */
public class RsaLauncher {
    private static final Logger logger = LoggerFactory.getLogger(RsaLauncher.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        // RsaMessageCreator Verticle 배포
        vertx.deployVerticle(new RsaMessageCreator(), res -> {
            if (res.failed()) {
                logger.info("Failed to deploy RsaMessageCreator verticle: " + res.cause());
                vertx.close(); // 실패한 경우 Vert.x 인스턴스를 종료합니다.
                return;
            }
            logger.info("RsaMessageCreator Verticle deployed successfully!");
        });

    }
}
