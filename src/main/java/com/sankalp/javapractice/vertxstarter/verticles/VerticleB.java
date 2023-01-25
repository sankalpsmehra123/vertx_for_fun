package com.sankalp.javapractice.vertxstarter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleB extends AbstractVerticle {
  private static final Logger logger = LoggerFactory.getLogger(VerticleB.class);
  @Override
  public void start(final Promise<Void> startPromise){
    logger.info("start {}", getClass().getName());
    startPromise.complete();
  }
}
