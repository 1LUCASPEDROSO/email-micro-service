package com.ms.email.Consumers;

import com.ms.email.DTO.EmailDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer
{
    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDTO dto){
        System.out.println(dto.mailTo());
        System.out.println(dto.subject());
        System.out.println(dto.text());
    }
}
