package org.amogoscode.kafkaexample;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "code",
            groupId = "groupId"
    )
    void listener(String msg) {
        System.out.println("Listener received " + msg + " 🙂");
    }


}
