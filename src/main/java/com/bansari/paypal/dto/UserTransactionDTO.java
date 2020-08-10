package com.bansari.paypal.dto;

import org.springframework.stereotype.Component;

import com.bansari.paypal.model.Transaction;
import com.bansari.paypal.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class UserTransactionDTO {

	private String userId;
	public String firstName;
	private String lastName;
	private String transactionType;

	public UserTransactionDTO(Transaction transaction, User user) {
		this.userId = user.getUserId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.transactionType = transaction.getTransactionType();
	}
}
