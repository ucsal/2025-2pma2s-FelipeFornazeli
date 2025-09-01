package br.com.mariojp.solid.srp;

public class ReceiptService {
 private final TaxCalculator taxCalculator;
	private final ReceiptFormatter formatter;

	public ReceiptService(TaxCalculator taxCalculator , ReceiptFormatter formatter ){
		this.taxCalculator = taxCalculator;
		this.formatter = formatter;
	}

	public String generateReceipt( Order order) {
		
		double subtotal  = order.getItems().stream()
		.mapToDouble(i->i.getUnitPrice() * i.getQuantity())
		.sum();

		double tax = taxCalculator.calculate(subtotal);
		double total = subtotal + tax;

		return formatter.format(order, subtotal, tax, total);

	}

     
	
	}