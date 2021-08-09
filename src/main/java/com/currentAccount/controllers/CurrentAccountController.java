package com.currentAccount.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.currentAccount.models.entity.CurrentAccount;
import com.currentAccount.services.CurrentAccountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/current-account")
@RestController
public class CurrentAccountController {
	
	@Autowired
	private CurrentAccountService service;
	
	@GetMapping("/getall")
	@ResponseStatus(code = HttpStatus.OK)
	public Flux<CurrentAccount> getAll() {
		return service.getAll();
	}

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Mono<CurrentAccount> insert(@RequestBody CurrentAccount currentAccount) {
		return service.insert(currentAccount);
	}
}
