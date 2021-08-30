package br.com.cbgomes.learnkafka.producer;

import br.com.cbgomes.learnkafka.model.Message;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Producer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "messages";

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public void sendMessage(Message message){
        logger.info("send message to topic");
        this.kafkaTemplate.send(TOPIC,message);
    }
}
