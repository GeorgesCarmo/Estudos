package DevSuperiorInterfaces.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	
	double interest(double amount, int mounths);
}
