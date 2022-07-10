//Andrew Weekes
//CS 151-05
//Homework 3

public class Shoe{

	private String brand;
	private String model;

	public Shoe(){
		this.brand = brand;
		this.model = model;
	}

	public String getBrand(){
		return brand;
	}

	public void setBrand(String newBrand){
		brand = newBrand;
	}

	public String getModel(){
		return model;
	}

	public void setModel(String newModel){
		model = newModel;
	}

	public String toString(){
		String result = "";
		result += model + " " + "(by " + brand + ")";
		return result;
	}

	public boolean equals (Shoe that){
		boolean result = false;
		result = (this.brand.equals(that.brand))
		&& this.model.equals(that.model);

		return result;
	}

}
