package project.Dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import project.Dto.Customers;
import project.Dto.Vehicle;
import project.Utility.Util;

public class DaoImpl implements Dao {

	@Override
	public void addCustomer(Customers c) {
		
		EntityManager em = null;
		
		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.persist(c);
			et.commit();
			
			System.out.println("Registration successful");
			
			em.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if(em!=null) {
				em.close();
			}
		}
		
	}

	@Override
	public void deleteCustomer(int id) {
		
		EntityManager em = null;
		Customers c = null;
		
		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();
			
			c = em.find(Customers.class, id);
			
			if (c==null) {
				System.out.println("Invalid Customer Id");
				return;
			}
			et.begin();
			em.remove(c);
			et.commit();
			
			System.out.println("Customer deleted successfully");
			
			em.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if(em!=null) {
				em.close();
			}
		}
		
	}

	@Override
	public void addVehicle(Vehicle v) {
		
		EntityManager em = null;
		
		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();
			
			et.begin();
			em.persist(v);
			et.commit();
			
			System.out.println("Vehicle added successful");
			
			em.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if(em!=null) {
				em.close();
			}
		}
		
	}

	@Override
	public void updateVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVehicla(int id) {
		
		EntityManager em = null;
		Vehicle c = null;
		
		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();
			
			c = em.find(Vehicle.class, id);
			
			if (c==null) {
				System.out.println("Invalid Vehicle Id");
				return;
			}
			et.begin();
			em.remove(c);
			et.commit();
			
			System.out.println("Vehicle deleted successfully");
			
			em.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if(em!=null) {
				em.close();
			}
		}
		
	}

}
