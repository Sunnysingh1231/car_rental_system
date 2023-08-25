package project.Dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import project.Dto.Customers;
import project.Dto.Vehicle;
import project.Utility.Util;

public class DaoImpl implements Dao {

	// -----------------------viewAllCustomers------------------------*-

	@Override
	public void viewAllCustomers() {

		EntityManager em = null;
		List<Customers> c = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();

			TypedQuery<Customers> tq = em.createQuery("SELECT c FROM Customers c", Customers.class);
			c = tq.getResultList();

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			if(c.isEmpty()) {
				System.out.println("empty");
			}
			else{
				for (Customers data : c) {
				
					if(data.isDelete() == false) {
						System.out.println("|" + data);
					}

				}
			}

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			et.commit();

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e.getMessage());
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

	// -----------------------addCustomer-----------------------------*-

	@Override
	public void addCustomer(Customers c) {

		EntityManager em = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();
			em.persist(c);
			et.commit();

			System.out.println("+-------------------------+");
			System.out.println("| Registration successful |");
			System.out.println("+-------------------------+");

			em.close();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	// -----------------------deleteCustomer--------------------------*-

	@Override
	public void deleteCustomer(int id) {

		EntityManager em = null;
		Customers c = null;

		try {
			em = Util.getConnection();

			c = em.find(Customers.class, id);

			EntityTransaction et = em.getTransaction();
			et.begin();

			c.setDelete(true);

			et.commit();

			System.out.println("+--------------------------------+");
			System.out.println("| Customers Deleted Successfully |");
			System.out.println("+--------------------------------+");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	// -----------------------addVehicle------------------------------*-

	@Override
	public void addVehicle(Vehicle v) {

		EntityManager em = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();
			em.persist(v);
			et.commit();

			System.out.println("+----------------------------+");
			System.out.println("| Vehicle added Successfully |");
			System.out.println("+----------------------------+");

			em.close();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	// -----------------------updateVehicle----------------------------

	@Override
	public void updateVehicle(Vehicle v) {
		// TODO Auto-generated method stub

	}

	// -----------------------deleteVehicla---------------------------*-

	@Override
	public void deleteVehicla(int id) {

		EntityManager em = null;
		Vehicle v = null;

		try {
			em = Util.getConnection();

			v = em.find(Vehicle.class, id);

			EntityTransaction et = em.getTransaction();
			et.begin();

			v.setDelete(true);
			System.out.println("+------------------------------+");
			System.out.println("| Vehical Deleted Successfully |");
			System.out.println("+------------------------------+");

			et.commit();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	// -----------------------viewAllVeicle---------------------------*-

	@Override
	public void viewAllVeicle() {

		EntityManager em = null;
		List<Vehicle> v = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();

			TypedQuery<Vehicle> tq = em.createQuery("SELECT v FROM Vehicle v", Vehicle.class);
			v = tq.getResultList();

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			for (Vehicle data : v) {

				if (data.isDelete() == false) {
					System.out.println("|" + data);
				}

			}

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			et.commit();

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e.getMessage());
			if (em != null) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	// -----------------------viewAllDeletedCustomers-----------------*-

	@Override
	public void viewAllDeletedCustomers() {

		EntityManager em = null;
		List<Customers> c = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();

			TypedQuery<Customers> tq = em.createQuery("SELECT c FROM Customers c", Customers.class);
			c = tq.getResultList();

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			for (Customers data : c) {

				if (data.isDelete() == true) {
					System.out.println("|" + data);
				}

			}

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			et.commit();

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e.getMessage());
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	// -----------------------viewAllDeletedVeicle--------------------*-

	@Override
	public void viewAllDeletedVeicle() {

		EntityManager em = null;
		List<Vehicle> c = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();

			TypedQuery<Vehicle> tq = em.createQuery("SELECT c FROM Vehicle c", Vehicle.class);
			c = tq.getResultList();

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			for (Vehicle data : c) {

				if (data.isDelete() == true) {
					System.out.println("|" + data);
				}

			}

			System.out.println(
					"+----------------------------------------------------------------------------------------------+");

			et.commit();

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e.getMessage());
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

	}

	
	
	// -----------------------viewAllDeletedVeicle---------------------
	


}
