package com.ns21.rsa;

import io.vertx.core.Vertx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * packageName    : com.ns21.rsa
 * fileName       : RsaLauncher.java
 * author         : kjg08
 * date           : 2023-11-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-11-17        kjg08           최초 생성
 */
public class RsaLauncher {
    private static final Logger logger = LoggerFactory.getLogger(RsaLauncher.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new ExecutionRsaModule(), res -> {
            if (res.succeeded()) {
                logger.info("Verticle deployed successfully!");
                vertx.close(); // Vert.x 인스턴스를 종료합니다.
            } else {
                logger.info("Failed to deploy verticle: " + res.cause());
                vertx.close(); // 실패한 경우에도 Vert.x 인스턴스를 종료합니다.
            }
        });
    }
}
