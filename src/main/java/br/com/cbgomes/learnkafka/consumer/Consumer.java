package br.com.cbgomes.learnkafka.consumer;

import br.com.cbgomes.learnkafka.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "messages", groupId = "group_id")
    public void consumeMessages(Message message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> key - %s -  value  - %s", message.getTitle(),
                message.getContent()));
    }
}
