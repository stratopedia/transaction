package com.fintech.transaction.kafka;

import com.fintech.transaction.model.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumer {

    @KafkaListener(topics = "transaction-topic", groupId = "transaction-group", containerFactory = "kafkaListenerContainerFactory")
    public void consumeTransaction(@Payload Transaction transaction) {
        System.out.println("Received transaction: " + transaction);
    }
}
