package com.currentAccount.models.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Document(collection = "current_account")
public class CurrentAccount {

	@Id
	private String id;
	private String accountNumber;
	private String customerId;
	private String created_date;
}
