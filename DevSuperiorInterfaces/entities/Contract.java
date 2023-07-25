package DevSuperiorInterfaces.entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Contract {
	
	private Integer number;
	private Date date;
	private double totalValues;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
	}

	public Contract(Integer number, Date date, double totalValues) {
		super();
		this.number = number;
		this.date = date;
		this.totalValues = totalValues;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValues() {
		return totalValues;
	}

	public void setTotalValues(double totalValues) {
		this.totalValues = totalValues;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	
	

}
