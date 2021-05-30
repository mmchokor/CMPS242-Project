
public class CheckOut {
	protected double discount;
	protected double subTotal;
	protected double taxes = 0.11;
	protected double total;
	protected double amountPaid;
	protected double amountReturn;

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getAmountReturn() {
		return amountReturn;
	}

	public void setAmountReturn(double amountReturn) {
		this.amountReturn = amountReturn;
	}

}
