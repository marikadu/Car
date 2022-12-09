package oop;

public class Car {
    
    private String brand;
    private String model;
    private int amountOfFuel;
    
    public Car(String brand, String model, int amountOfFuel){
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    private void printData(){
	    
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel: " + amountOfFuel);
    }
    
  // added main class
    public static void main(String args[]) {
    	
    	Car car1 = new Car("Opel","Astra",50);
    	System.out.println(car1.brand);
    	System.out.println(car1.model);
    	System.out.println(car1.amountOfFuel);
    	
    	// added setter
    	car1.setModel("Corsa");
    	System.out.println(car1.getModel());
}