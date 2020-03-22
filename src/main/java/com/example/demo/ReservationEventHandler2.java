package com.example.demo;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "city-reservation-q1")
public class ReservationEventHandler2
{
   private static final Logger log = LoggerFactory.getLogger(ReservationEventHandler2.class);
   
   
   @RabbitHandler
   public void receive(String in) {
      System.out.println(in);
      log.info(" [ReservationEventHandler] Received '" + in + "'");
   }
}
