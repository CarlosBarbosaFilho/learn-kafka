package br.com.cbgomes.learnkafka.controller;

import br.com.cbgomes.learnkafka.model.Message;
import br.com.cbgomes.learnkafka.producer.Producer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
public class MessageController {

    private final Producer producer;

    @PostMapping("/publish")
    public void sendMessage(@RequestBody Message message){
        this.producer.sendMessage(message);
    }
}
