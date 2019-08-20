package com.class30;

public abstract class Insurance {

	public String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class CarInsurance extends Insurance {
    public String model;

    public CarInsurance(String insuranceName, String model) {
        super(insuranceName);
        this.model=model;
    }
    @Override
    public void getQuote() {
        System.out.println("This is quote for " + insuranceName + " and " + model);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ insuranceName + " and " + model);
    }
}

class HealthInsurance extends Insurance {
    public HealthInsurance(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("This is quote for " + insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ insuranceName );
    }
}
class PetInsurance extends Insurance {
    public String petType;
    public PetInsurance(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("This is quote for " + insuranceName + " and " + petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ insuranceName + " and " + petType);
    }
}
