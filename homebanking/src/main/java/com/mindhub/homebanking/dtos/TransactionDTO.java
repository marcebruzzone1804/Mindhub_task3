package com.mindhub.homebanking.dtos;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;
import java.time.LocalDate;

public class TransactionDTO {
    private Long id;
    private TransactionType type;
    public double amount;
    private String description;
    public LocalDate date;

    public TransactionDTO(Transaction transaction){
        this.id = transaction.getId();
        this.description = transaction.getDescription();
        this.type = transaction.getType();
        this.date = transaction.getDate();
        this.amount = transaction.getAmount();
    }
}