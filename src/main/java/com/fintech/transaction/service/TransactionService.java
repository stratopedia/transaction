package com.fintech.transaction.service;

import com.fintech.transaction.kafka.TransactionProducer;
import com.fintech.transaction.model.Transaction;
import com.fintech.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private final TransactionRepository repository;
    private final TransactionProducer transactionProducer;

    public TransactionService(TransactionRepository repository, TransactionProducer transactionProducer) {
        this.repository = repository;
        this.transactionProducer = transactionProducer;
    }

    public Transaction addTransaction(String sender, String receiver, Double amount, String currency, String type) {
        Transaction transaction = new Transaction();
        transaction.setSender(sender);
        transaction.setReceiver(receiver);
        transaction.setAmount(amount);
        transaction.setCurrency(currency);
        transaction.setType(type);
        transaction.setStatus("PENDING");
        Transaction savedTransaction = repository.save(transaction);
        transactionProducer.sendTransaction(savedTransaction);
        return savedTransaction;
    }

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return repository.findById(id);
    }
}