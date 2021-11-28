package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void shouldCreateAFinanceWithValidData() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;

		Financing financing = new Financing(totalAmount, income, months);

		Assertions.assertNotNull(financing);
		Assertions.assertEquals(totalAmount, financing.getTotalAmount());
		Assertions.assertEquals(income, financing.getIncome());
		Assertions.assertEquals(months, financing.getMonths());

	}

	@Test
	public void shouldThrowExceptionAndNotCreateAFinanceWithInvalidData() {

		Double totalAmount = 100000.00;
		Double income = 1000.00;
		Integer months = 20;

		Assertions.assertThrows(IllegalArgumentException.class, (() -> {

			Financing financing = new Financing(totalAmount, income, months);

			})
		);
	}
	
	@Test
	public void shouldUpdateTotalAmountWhenValidRequest() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Double newTotalAmount = 120000.00;
		Financing financing = new Financing(totalAmount, income, months);
		financing.setTotalAmount(newTotalAmount);

		Assertions.assertEquals(newTotalAmount, financing.getTotalAmount());

	}
	
	@Test
	public void shouldThrowExceptionAndNotUpdateTotalAmountWhenInvalidRequest() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Double newTotalAmount = 150000.00;
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class, (() -> {

			financing.setTotalAmount(newTotalAmount);

			})
		);

	}
	
	@Test
	public void shouldUpdateIncomeValueWhenValidRequest() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Double newIncome = 9000.00;
		Financing financing = new Financing(totalAmount, income, months);
		financing.setIncome(newIncome);

		Assertions.assertEquals(newIncome, financing.getIncome());

	}
	
	@Test
	public void shouldThrowExceptionAndNotUpdateIncomeValueWhenInvalidRequest() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Double newIncome = 5000.00;
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class, (() -> {

			financing.setIncome(newIncome);

			})
		);

	}
	
	@Test
	public void shouldUpdateMonthsWhenValidRequest() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Integer newMonthsValue = 17;
		Financing financing = new Financing(totalAmount, income, months);
		financing.setMonths(newMonthsValue);

		Assertions.assertEquals(newMonthsValue, financing.getMonths());

	}
	
	@Test
	public void shouldThrowExceptionAndNotUpdateMonthsWhenInvalidRequest() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Integer newMonthsValue = 15;
		Financing financing = new Financing(totalAmount, income, months);
		
		Assertions.assertThrows(IllegalArgumentException.class, (() -> {

			financing.setMonths(newMonthsValue);

			})
		);

	}
	
	@Test
	public void shouldCalculeEntryCorrectlyWhenCreateANewFinancing() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Double expectedEntry = 20000.00;
		
		Financing financing = new Financing(totalAmount, income, months);
		Double actualEntry = financing.entry();
		
		Assertions.assertEquals(expectedEntry, actualEntry);

	}
	
	@Test
	public void shouldCalculeQuotaCorrectlyWhenCreateANewFinancing() {
		Double totalAmount = 100000.00;
		Double income = 10000.00;
		Integer months = 20;
		Double expectedQuota = 4000.00;
		
		Financing financing = new Financing(totalAmount, income, months);
		Double actualQuota = financing.quota();
		
		Assertions.assertEquals(expectedQuota, actualQuota);

	}

}
