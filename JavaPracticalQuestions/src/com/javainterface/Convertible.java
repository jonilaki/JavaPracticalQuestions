package com.javainterface;

public interface Convertible {
	 void openRoof();

}
class Sedan implements Convertible {
    private boolean isRoofOpen;
        
    public Sedan() {
		
		this.isRoofOpen =false;
	}

    @Override
    public void openRoof() {
        if (!isRoofOpen) {
            System.out.println("Opening the roof of the sedan,Please!");
            isRoofOpen = true;
        } else {
            System.out.println("The roof is already open.");
        }
    }
}


    
        