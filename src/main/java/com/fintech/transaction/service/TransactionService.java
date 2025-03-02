package com.fintech.transaction.service;

import com.fintech.transaction.model.Transaction;
import com.fintech.transaction.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction addTransaction(String senderAccount, String receiverAccount, Double amount, String currency) {
        Transaction transaction = new Transaction(null, senderAccount, receiverAccount, amount, currency, LocalDateTime.now());
        return transactionRepository.save(transaction);
    }
}