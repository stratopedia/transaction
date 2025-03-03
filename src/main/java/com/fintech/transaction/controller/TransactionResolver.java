package com.fintech.transaction.controller;

import com.fintech.transaction.model.Transaction;
import com.fintech.transaction.service.TransactionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Optional;

@Controller
public class TransactionResolver {
    private final TransactionService transactionService;

    public TransactionResolver(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @QueryMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @QueryMapping
    public Optional<Transaction> getTransaction(@Argument Long id) {
        return transactionService.getTransactionById(id);
    }

    @MutationMapping
    public Transaction addTransaction(@Argument String sender, @Argument String receiver, @Argument Double amount, @Argument String currency, @Argument String type) {
        return transactionService.addTransaction(sender, receiver, amount, currency, type);
    }
}
