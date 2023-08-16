package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import com.mindhub.homebanking.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository, TransactionRepository transactionRepository){
		return (args -> {
			Client cliente1 = new Client("Melba", "Morel", "melba@mindhub.com");
			Client cliente2 = new Client("Marcelo", "Bruzzone", "bruzzone1804@gmail.com");
			clientRepository.save(cliente1);
			clientRepository.save(cliente2);

			Account cuenta1 = new Account("VIN001", LocalDate.now(), 5000.0);
			Account cuenta2 = new Account("VIN002", LocalDate.now().plusDays(1), 7500.0);

			cliente1.addAccount(cuenta1);
			cliente2.addAccount(cuenta2);

			accountRepository.save(cuenta1);
			accountRepository.save(cuenta2);

			Transaction transaction1 = new Transaction(TransactionType.CREDITO, 5000.00, "Transaccion 1", LocalDate.now());
			Transaction transaction2 = new Transaction(TransactionType.DEBITO, -10000.00, "Transaccion 2", LocalDate.now());

			cuenta1.addTransaction(transaction1);
			cuenta1.addTransaction(transaction2);

			transactionRepository.save(transaction1);
			transactionRepository.save(transaction2);

		});
	}

}
