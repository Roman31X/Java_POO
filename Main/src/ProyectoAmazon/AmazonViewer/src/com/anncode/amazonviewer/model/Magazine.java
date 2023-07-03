package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Magazine extends Publication implements IVisualizable{
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

	@Override
	public Date startToSee(Date dateI) {
		return null;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {

	}

	//Método Lector de datos
	public static ArrayList<Magazine> makeMagazineList() {
		ArrayList<Magazine> books = new ArrayList();

		return books;
	}
}
