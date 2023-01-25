package com.sankalp.javapractice.vertxstarter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleA extends AbstractVerticle {
  private static final Logger logger = LoggerFactory.getLogger(VerticleA.class);
  @Override
  public void start(final Promise<Void> startPromise){
    logger.info("start {}", getClass().getName());
    vertx.deployVerticle(new VerticleAA(), whenDeploy -> {
      logger.info("Deployed {}", VerticleAA.class.getName());
      vertx.undeploy(whenDeploy.result());
    });
    vertx.deployVerticle(new VerticleAB(), whenDeploy -> {
      logger.info("Deployed {}", VerticleAB.class.getName());
    });
    startPromise.complete();
  }
}
