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
			int s1 = 0, s2 = 0;
	        String reverse = new StringBuffer(creditCard).reverse().toString();
	        
	        for(int i = 0 ;i < reverse.length();i++) {
	            int digit = Character.digit(reverse.charAt(i), 10);
	            
	            if(i % 2 == 0) {	//this is for odd digits, they are 1-indexed in the algorithm
	                s1 += digit;
	                
	            } else {	
	                s2 += 2 * digit;	//add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
	                
	                if(digit >= 5){
	                    s2 -= 9;
	                }
	            }
	        }
	        cardStatus = (s1 + s2) % 10 == 0;  //true or false
			// default is cardStatus = false
		}
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
		// Gross pay + VAT
	}
	
	@Override
	public void printPDFSalesReport() {
		// pdf receipt
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
