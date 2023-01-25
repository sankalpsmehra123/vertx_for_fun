package com.sankalp.javapractice.vertxstarter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleN extends AbstractVerticle {
  private static final Logger logger = LoggerFactory.getLogger(VerticleN.class);
  @Override
  public void start(final Promise<Void> startPromise){
    logger.info("start {} thread {} with config {}" , getClass().getName() , Thread.currentThread().getName()
      , config().toString());
    startPromise.complete();
  }
}
