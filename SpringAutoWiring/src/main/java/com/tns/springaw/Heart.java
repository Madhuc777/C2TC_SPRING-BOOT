package com.tns.springaw;

public class Heart {

	private String nameOfAnimal;
	private int noOfHeart;
	
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}


	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}


	public int getNoOfHeart() {
		return noOfHeart;
	}


	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}


	public void pump()
	{
		System.out.println("Heart is pumping");
		System.out.println("You are alive");
	}

}
