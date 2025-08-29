import br.com.mariojp.solid.srp.*;

public class Main {
	
	public static void main(String[] args) {
		System.setProperty("taxRate","0.08");
		Order order = new Order();
		order.add(new Item("Café", 8.0, 2)); // 16
		order.add(new Item("Bolo", 12.5, 1)); // 12.5 -> subtotal 28.5
		TaxCalculator taxCalculator = new TaxCalculator();

		ReceiptFormatter receiptFormatter = new ReceiptFormatter();

		ReceiptService receiptService = new ReceiptService(taxCalculator, receiptFormatter);

		System.out.println(receiptService.generateReceipt(order));

		
	}
}
