package com.ns21.tim;

import com.ns21.tim.codec.Asn1JsonCodec;
import com.ns21.common.mist.parser.MetaDataExtracting;
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
public class TimLauncher {
    private static final Logger logger = LoggerFactory.getLogger(TimLauncher.class);

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        // Asn1JsonCodec Verticle 배포 생성된 json 메세지를 asn.1로 혹은 asn.1 메세지를 json 메세지로 변환
        vertx.deployVerticle(new Asn1JsonCodec(), res -> {
            if (res.failed()) {
                logger.info("Failed to deploy Asn1JsonCodec verticle: " + res.cause());
                vertx.close(); // 실패한 경우 Vert.x 인스턴스를 종료합니다.
                return;
            }
            logger.info("Asn1JsonCodec Verticle deployed successfully!");

            // MetaDataExtracting Verticle 배포 metadata 정보를 추출하는 버티클
            vertx.deployVerticle(new MetaDataExtracting(), res2 -> {
                if (res2.failed()) {
                    logger.info("Failed to deploy MetaDataExtracting verticle: " + res2.cause());
                    vertx.close(); // 실패한 경우 Vert.x 인스턴스를 종료합니다.
                    return;
                }
                logger.info("MetaDataExtracting Verticle deployed successfully!");
                // 모든 Verticle이 성공적으로 배포된 후 작업 (필요한 경우)
            });
        });
    }
}
