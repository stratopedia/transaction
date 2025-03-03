package com.fintech.transaction.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sender;
    private String receiver;
    private Double amount;
    private String currency;
    private String type;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();
}
