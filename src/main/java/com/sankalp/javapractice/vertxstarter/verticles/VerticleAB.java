package com.sankalp.javapractice.vertxstarter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleAB extends AbstractVerticle {
  private static final Logger logger = LoggerFactory.getLogger(VerticleAB.class);
  @Override
  public void start(final Promise<Void> startPromise){
    logger.info("start {}", getClass().getName());
    startPromise.complete();
  }

  @Override
  public void stop (final Promise<Void> stopPromise){
    logger.info("Stop {}", getClass().getName());
    stopPromise.complete();
  }
}
