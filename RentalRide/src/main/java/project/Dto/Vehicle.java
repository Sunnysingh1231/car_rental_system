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
	
	@Column(name = "isBooked", columnDefinition = "boolean default false")
	private boolean isBooked;

	@Column(name = "Seating Capacity")
	private int seatingCapacity;

	@Column(name = "Mileage")
	private int mileage;

	public Vehicle(String name, String type, String brand, double price, LocalDate manufactureDate, int seatingCapacity,
			int mileage) {
		super();
		this.name = name;
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.seatingCapacity = seatingCapacity;
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", type=" + type + ", brand=" + brand + ", price per Day=" + price
				+ ", manufactureDate=" + manufactureDate + ", seatingCapacity=" + seatingCapacity + ", mileage in KM="
				+ mileage + "]";
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
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
	
	

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

}
