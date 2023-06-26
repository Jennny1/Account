package com.example.account.service;



import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.example.account.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionService {
	private final TransactionRepository transactionRepository;
	
	@Transactional
	public TransactionDto useBalance(Long userId, String accountNumber,Long amount) {
		
	}
}
