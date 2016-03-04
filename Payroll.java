package Lab2;

import java.text.DecimalFormat;

public class Payroll {
	
	//decimal formatter
	DecimalFormat format = new DecimalFormat("#,##0.00");
	//fields
	private int[] _employeeId = {5658845, 4520125, 7895122, 8777541, 84551277, 1302850, 7580489};
	private int[] _hours = new int[7];
	private double[] _payRate = new double[7];
	private double[] _wages = new double[7];
	
	//accessors
	public int[] get_employeeId() {
		return _employeeId;
	}
	
	public void set_employeeId(int[] _employeeId) {
		this._employeeId = _employeeId;
	}
	
	public int[] get_hours() {
		return _hours;
	}
	
	public void set_hours(int hours, int count) {
		this._hours[count] = hours;
	}
	
	public double[] get_payRate() {
		return _payRate;
	}
	
	public void set_payRate(double payRate, int count) {
		this._payRate[count] = payRate;
	}
	
	public double[] get_wages() {
		return _wages;
	}
	
	public void set_wages() {
		for (int i = 0; i < _wages.length; ++i) {
			this._wages[i] = this._hours[i] * this._payRate[i];
			
		}
	}
	
	//toString
	public String toString(){
		String str = "Payroll Sheet\n\n";
		
		for (int i = 0; i < _employeeId.length; ++i) {
			str += "Employee #" + _employeeId[i] + "\nGross Wages: $" + _wages[i] + "\n\n";
		}
		
		return str;
	}
	

}
