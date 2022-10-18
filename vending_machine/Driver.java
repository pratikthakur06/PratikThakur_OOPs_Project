package gl.oops.project.vending_machine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product1 = new Product("Coffee", 250);
		Product product2 = new Product("Tea", 100);
		Product product3 = new Product("Coke", 200);
		Product product4 = new Product("Juice", 300);
		Product product5 = new Product("Energy Drink", 500);
		List<Product> products = Arrays.asList(product1, product2, product3, product4, product5);
		
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.setProducts(products);
		
		Customer customer = new Customer("Pratik", "Kolkata", 789411211);
		List<Product> cartProducts = Arrays.asList(product1, product2);
		customer.setProducts(cartProducts);
		
		Payment payment = new Payment();
		customer.setTotalPrice(payment.calculateTotalPrice(customer));
		System.out.println(customer.getTotalPrice());
		
		System.out.println("Select 1 for Cash Payment and 0 for Card Payment(Note:- Total price will be doubled in card payment): ");
		int choice = sc.nextInt();
		if(choice==1) {
			payment.cashPayment(customer);
		}
		else if(choice == 0) {
			payment.cardPayment(customer);
		}
	}
}
