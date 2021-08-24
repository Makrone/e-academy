package com.epam.jwd.home.task1.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.epam.jwd.home.task1.domain.Car;

public class TaxPark {

	public static final Comparator<Car> CAR_FUEL_CONSUMPTION_COMPORATOR = new Comparator<Car>() {

		@Override
		public int compare(Car o1, Car o2) {
			if (o1.getFuelConsumption() > o2.getFuelConsumption()) {
				return 1;
			} else if (o1.getFuelConsumption() < o2.getFuelConsumption()) {
				return -1;
			} else {
				return 0;
			}
		}

	};
	
	public static final Comparator<Car> CAR_COST_COMPARATOR = new Comparator<Car>() {

		@Override
		public int compare(Car o1, Car o2) {
			if (o1.getCost() > o2.getCost()) {
				return 1;
			} else if (o1.getCost() < o2.getCost()) {
				return -1;
			} else {
				return 0;
			}
		}

	};

	private ArrayList<Car> cars = new ArrayList<>();

	public TaxPark() {
		cars = new ArrayList<>();
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void addCar(Car car) {
		cars.add(car);
	}

	public void removeCar(Car car) {
		cars.remove(car);
	}

	public void removeCar(int index) {
		cars.remove(index);
	}

	public Double getTotalCost() {

		double totalCost = 0;

		for (Car car : cars) {
			totalCost += car.getCost();

		}

		return totalCost;
	}

	public void printCars() {
		for (Car car : cars) {
			System.out.println(car);

		}

	}

	public void sortByFuelConsumption() {
		Collections.sort(cars, CAR_FUEL_CONSUMPTION_COMPORATOR);
	}
	
	public void sortByCost () { 
		Collections.sort(cars,CAR_COST_COMPARATOR);
	}

	public List<Car> getCarsBySpeedRange(Double minSpeed, Double maxSpeed) {

		ArrayList<Car> arrayList = new ArrayList<>();
		for (Car car : cars) {
			if (minSpeed <= car.getMaxSpeed() && maxSpeed > car.getMaxSpeed()) {
				arrayList.add(car);
			}
		}

		return arrayList;

	}

}
