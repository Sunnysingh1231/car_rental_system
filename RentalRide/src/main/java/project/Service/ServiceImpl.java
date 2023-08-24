package project.Service;

import project.Dao.Dao;
import project.Dao.DaoImpl;
import project.Dto.Customers;
import project.Dto.Vehicle;

public class ServiceImpl implements Service {

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

}
