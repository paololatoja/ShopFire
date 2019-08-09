package Shopfire.Model;

import java.sql.*;

public class ShopfireBean implements ShopfireOnlineOrdering{

	public boolean cardStatus = false; //default false
	public String creditCard;
	
	public ShopfireBean() {
		
	}
	
	public ShopfireBean(String cardNum) {
		//instantiate values
		creditCard = cardNum;
	}
	
	public void saveInfoToCookie() {
		// everytime a product is added to the cart, the itemName and itemQuantityNum is saved in the cookie
	}
	
	public void validateOrder() {
		//quantity item must be valid, item quantity must not be zero or negative
	}
	
	
	@Override
	public void validateCreditCard() {
		if(creditCard.length() == 16) {
//			if(Luhn algorithm passed) {
//				cardStatus = true;
//			}
			// default is cardStatus = false
		}
		//Luhn algorithm
		//https://rosettacode.org/wiki/Luhn_test_of_credit_card_numbers
		//credit card number must be 16 digits (Philippine standard) and passed the LUHN or Modulus 10 algorithm
	}
	
	@Override
	public void computeGrossPay() {
		// sum of all items in the cart
	}
	
	@Override
	public void computeVAT() {
		// vatValue = gross pay value *  0.12
	}
	
	@Override
	public void generatePDFReceipt() {
		// The application will generate a PDF file containing your store name, your store, summation of
//		items ordered per model, summation of amount per model and net amount earned for the day.
//		All these must be in table format.
//		For every successful transaction, the system will generate a receipt (sample receipt but with
//		your store logo, store address, DTI number – fictitious
	}
	
	@Override
	public void netPay() {
		
	}
	
	@Override
	public void printPDFSalesReport() {
		
	}
	
	
	public void process() {
		validateCreditCard();
		if(cardStatus == false) {
//			sendRedirect with user defined exception throws saying invalid Card
		} else {
			
			computeGrossPay();
			computeVAT();
			generatePDFReceipt();
			netPay();
			printPDFSalesReport();
		}
	}
}
