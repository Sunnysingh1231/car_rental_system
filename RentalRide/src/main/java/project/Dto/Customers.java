package project.Dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Name", length = 30)
	private String name;

	@Column(name = "Email", length = 30)
	private String email;

	@Column(name = "MobileNo", length = 10)
	private int mobileNumber;

	@Column(name = "Password", length = 12)
	private String password;

	@Column(name = "Money", length = 8)
	private double money;
	
	

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String name, String email, int mobileNumber, String password, double money) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", password=" + password + ", money=" + money + "]";
	}

}
