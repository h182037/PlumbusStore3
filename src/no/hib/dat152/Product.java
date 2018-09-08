package no.hib.dat152;

import java.util.ArrayList;
import java.util.List;

public class Product {
		
	private int pno;
	private String pName;
	private double priceInEuro;
	private String imageFile;
	
	private List<Description> description;
	
	public Product(int pno, String pName, double priceInEuro, String imageFile){
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
		description = new ArrayList<Description>();
		
	}
	
	public Product(){
		
	}

	public int getPno() {
		return pno;
	}

	public void setPno(Integer pno) {
		this.pno = pno;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPriceInEuro() {
		return priceInEuro;
	}

	public void setPriceInEuro(Double priceInEuro) {
		this.priceInEuro = priceInEuro;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}
	
	public String toString(){
		return description.get(0).getText();
	}
	
	public Description getLocalisedDescription(String langcode){
		for(Description description : this.description){
			if(description.getLangCode().equals(langcode))
				return description;	
		}
		
		return null;
	}
	
	public void addDescription(String langcode, String text){
		Description localDesc = getLocalisedDescription(langcode);
		if(localDesc == null)
			description.add(new Description(langcode, text, this));
		else
			localDesc.setText(text);
	}

	public List<Description> getDescription() {
		return description;
	}

	public void setDescription(List<Description> description) {
		this.description = description;
	}
	
	public String localDescriptionText(String langcode){
		return getLocalisedDescription(langcode).getText();
	}
	
}
