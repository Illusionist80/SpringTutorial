package com.springtraining.corejavacustomannotation;

public class BuildHouse {
    @Developer("Amar")
	public void buildGarden(){
    	System.out.println("The code for garden is built by Amar");
    	
    }
    @Developer("Parag")
	public void buildRoom(){
    	
    	System.out.println("The code for room is built by Parag");
    }
}
