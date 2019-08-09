package Shopfire.Model;

interface ShopfireOnlineOrdering {
	void validateCreditCard(); //Luhn algo to check card
	void computeGrossPay();
	void computeVAT();
	void generatePDFReceipt(); //pdf as sales receipt
	void netPay();
	void printPDFSalesReport(); //terminates the app, after checkout
}
