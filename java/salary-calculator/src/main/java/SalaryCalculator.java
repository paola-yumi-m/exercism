public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
    	return daysSkipped > 5 ? 0.85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
    	return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
    	return this.multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
    	double finalSalary = this.multiplierPerDaysSkipped(daysSkipped) * 1000 + this.bonusForProductSold(productsSold);
    	return finalSalary > 2000 ? 2000 : finalSalary;
    } 
}
