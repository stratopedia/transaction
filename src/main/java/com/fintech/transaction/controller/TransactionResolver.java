package com.fintech.transaction.controller;

import com.fintech.transaction.model.Transaction;
import com.fintech.transaction.service.TransactionService;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TransactionResolver {
    private final TransactionService transactionService;

    @QueryMapping
    public List<Transaction> transactions() {
        return transactionService.getAllTransactions();
    }

    @MutationMapping
    public Transaction addTransaction(
            @Argument String senderAccount,
            @Argument String receiverAccount,
            @Argument Double amount,
            @Argument String currency) {
        return transactionService.addTransaction(senderAccount, receiverAccount, amount, currency);
    }
}