package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
	//Atributo
	private int id;

	//Constructor
	public Magazine(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
	}

	//getter
	public int getId() {
		return id;
	}

	//Metodo toString
	@Override
	public String toString() {
		return  "\n :: MAGAZINE ::" + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Edition Date: " + getEdititionDate();
	}
}
