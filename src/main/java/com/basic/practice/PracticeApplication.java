package com.basic.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Slf4j
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Bean
	public ApplicationRunner init(){
		return args -> {
//			log.info("Result, {}", henry(1, 3));
			log.info("Factors of number, {} is {}", 6, getFactorsOfANumber(6));
//			log.info("Perfect Numbers Sum, {}", getSumOfFactors(10));
		};

	}

	static int henry(int i, int j){
		int henry = 0;
		int max = Integer.MAX_VALUE;
		int perfectCount = 0;
		for(int number=1; number <= max; number++){
			int sum = 0;
			for(int divider = 1; divider < number; divider++){
				if(number % divider == 0){
					sum += divider;
				}
			}
			if(sum == number){
				perfectCount++;
				if(perfectCount == i){
					henry += sum;
				}else if(perfectCount == j){
					henry += sum;
					break;
				}
			}
		}
		return henry;
	}

	private static int getSumOfFactors(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	private List<Integer> getFactorsOfANumber(int number){
		List<Integer> interList = new ArrayList<>();
		for(int i = 1; i<=number; i++){
			if(number % i == 0){
				interList.add(i);
			}
		}
		return interList;
	}
}
