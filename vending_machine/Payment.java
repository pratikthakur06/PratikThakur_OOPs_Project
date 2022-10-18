package gl.oops.project.vending_machine;

public class Payment {
	
	public double calculateTotalPrice(Customer customer) {
		double totalPrice=0;
		for(Product product:customer.getProducts()) {
			totalPrice += product.getPrice();
		}
		return totalPrice;
	}

	public void cashPayment(Customer customer) {
		System.out.println("Paying Rs"+ customer.getTotalPrice() + " in cash.");
	}
	
	public void cardPayment(Customer customer) {
		System.out.println("Paying Rs"+ (2 * customer.getTotalPrice()) + " through card.");
	}
}
