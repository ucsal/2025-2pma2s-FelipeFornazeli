package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private double taxRate;
   

    public TaxCalculator () {
        String rate = System.getProperty("tax.rate", "0.08");
        if (rate != null) {
            this.taxRate = Double.parseDouble(rate);
        } else {
        this.taxRate = 0.0;    
       
    }
    
}
 public double calculate(double amount){
    return amount * taxRate;
 }
public double getTaxRate() {
    return  taxRate;
}

}
