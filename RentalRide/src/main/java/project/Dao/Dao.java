package project.Dao;

import project.Dto.Customers;
import project.Dto.Vehicle;


public interface Dao {
	public void addCustomer(Customers c);
	public void deleteCustomer(int id);
	public void addVehicle(Vehicle v);
	public void updateVehicle(Vehicle v);
	public void deleteVehicla(int id);
	
}
