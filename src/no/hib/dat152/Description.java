package no.hib.dat152;

public class Description {
	
	private Product pno;
	private String langCode;
	private String text;
	
	public Description(String langCode, String text, Product pno) {
		this.text = text;
	}
	
	public Description(){
		
	}
	public Product getPno() {
		return pno;	
	}

	public void setPno(Product pno) {
		this.pno = pno;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	

}
