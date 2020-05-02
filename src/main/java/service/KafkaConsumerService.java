package service;

import model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

@KafkaListener(topics = "KAFKA_CONSUMER_EXAMPLE", groupId = "group_id",
        containerFactory = "kafkaListenerContainerFactory")
    public void consumer(User user){
    System.out.println("The message was consumed: " +user );

}





}
