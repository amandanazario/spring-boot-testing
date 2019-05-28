package br.com.michelmilezzi.DemoApp.service.impl;

import org.springframework.stereotype.Service;

import br.com.michelmilezzi.DemoApp.service.FibonacciService;

@Service
public class FibonacciServiceImpl implements FibonacciService {

	@Override
	public Long calcularFibonacci(int i) {

		// 0,1,1,2,3,5,8,13,21,34,55,89,144,233,377

		if (i <= 1) {
			return Long.valueOf(i);
		}

		long l = calcularFibonacci(i - 1) + calcularFibonacci(i - 2);
		
		System.out.println(l);
		
		return l;
	}

}
