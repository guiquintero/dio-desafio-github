package com.dio.base;

import java.math.BigDecimal;

import javax.management.RuntimeErrorException;

public class Order {

	private final String code;
	private final BigDecimal totalValue;
	
	/**
	 * @param code..........Codigo do pedido
	 * @param totalValue....Valor total do pedido
	 * */
	
	public Order(String code, BigDecimal totalValue) {
		this.code= code;
		this.totalValue= totalValue;
	}

	/**
	 * Calcula o valor total de acordo com o valor do pedido, se o valor for maior que 100, uma taxa sera cobrada 
	 * @return.......... o valor total mais a taxa
	 * @throws.......... caso o valor do pedido for um valor negativo
	 * */
	
	
	public BigDecimal calculateFee() throws RuntimeException {
		if(this.totalValue.signum()<0) {
			throw new RuntimeErrorException(null, "O pedido nao pode ter valor negativo");
		}
		if(this.totalValue.compareTo(new BigDecimal("100.00"))>100) {
			return this.totalValue.multiply(new BigDecimal("0.99"));
		}
		return this.totalValue;
	}
	
	@Override
	public String toString() {
		return "Order [code=" + code + "]";
	}
	
}
