package project.Service;

import project.Dao.Dao;
import project.Dao.DaoImpl;
import project.Dto.Customers;
import project.Dto.Vehicle;

public class ServiceImpl implements Service {
	
	@Override
	public void viewAllCustomers() {
		Dao dao = new DaoImpl();
		dao.viewAllCustomers();
		
	}

	@Override
	public void addCustomer(Customers c) {
		Dao dao = new DaoImpl();
		dao.addCustomer(c);
		
	}

	@Override
	public void deleteCustomer(int id) {
		Dao dao = new DaoImpl();
		dao.deleteCustomer(id);
		
	}

	@Override
	public void addVehicle(Vehicle v) {
		Dao dao = new DaoImpl();
		dao.addVehicle(v);
		
	}

	@Override
	public void updateVehicle(Vehicle v) {
		Dao dao = new DaoImpl();
		dao.updateVehicle(v);
		
	}

	@Override
	public void deleteVehicla(int id) {
		Dao dao = new DaoImpl();
		dao.deleteVehicla(id);
		
	}

	@Override
	public void viewAllVeicle() {
		Dao dao = new DaoImpl();
		dao.viewAllVeicle();
		
	}

	@Override
	public void viewAllDeletedCustomers() {
		Dao dao = new DaoImpl();
		dao.viewAllDeletedCustomers();
		
	}

	@Override
	public void viewAllDeletedVeicle() {
		Dao dao = new DaoImpl();
		dao.viewAllDeletedVeicle();
		
	}

	@Override
	public void viewAllBookedVehicle() {
		Dao dao = new DaoImpl();
		dao.viewAllBookedVehicle();
		
	}

	@Override
	public void vehicleAvailability() {
		Dao dao = new DaoImpl();
		dao.vehicleAvailability();
		
	}

	@Override
	public void addMoney(int id,double m) {
		Dao dao = new DaoImpl();
		dao.addMoney(id, m);
	}

	@Override
	public void withdraw(int id,double m) {
		Dao dao = new DaoImpl();
		dao.withdraw(id, m);
	}
}
