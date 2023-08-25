package project.Dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Name", length = 30)
	private String name;

	@Column(name = "Type", length = 30)
	private String type;

	@Column(name = "Brand", length = 10)
	private String brand;

	@Column(name = "PPKM", length = 8)
	private double price;
	
	@Column(name = "Manufacture Date")
    private LocalDate manufactureDate;
	
	@Column(name = "isDelete", columnDefinition = "boolean default false")
    private boolean isDelete;

	

	public Vehicle(String name, String type, String brand, double price, LocalDate manufactureDate) {
		super();
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String toString() {
		return "Vehicla [id=" + id + ", name=" + name + ", type=" + type + ", brand=" + brand + ", price=" + price
				+ ", manufactureDate=" + manufactureDate + "]";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
