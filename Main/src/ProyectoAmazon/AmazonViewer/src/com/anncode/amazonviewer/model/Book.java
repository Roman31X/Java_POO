package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.*;

public class Book extends Publication implements IVisualizable {
	//Atributos
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;

	//Constructor
	public Book(String title, Date edititionDate, String editorial, String[] authors) {
		super(title, edititionDate, editorial);
		setAuthors(authors);
	}

	//Getter y setter
	public int getId() {
		return id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String isReaded() {
		String leido = "";
		if(readed == true){
			leido = "Si";
		}else{
			leido = "No";
		}
		return leido;
	}

	public void setReaded(boolean readed) {
		this.readed = readed;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	//Método toString
	@Override
	public String toString() {
		String detailBook = "\n :: BOOK ::" +
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() +
				"\n Edition Date: " + getEdititionDate() +
				"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return  detailBook;
	}

	//IMPLEMENTS
	@Override
	public Date startToSee(Date dateI) {
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		if (dateF.getTime() > dateI.getTime()) {
			setTimeReaded((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeReaded(0);
		}
	}

	//Método visualizador
	public void view(){
		setReaded(true);
		Date dateI = startToSee(new Date());
		for (int i = 0; i < 100; i++) {
			System.out.println("..............");
		}
		//Termine de leer
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Leiste: "+toString());
		System.out.println("Por: "+getTimeReaded()+ " milisegundos");
	}

	//Método lector de datos
	public static ArrayList<Book> makeBookList() {
		ArrayList<Book> books = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 3; i++) {
			authors[i] = "authors" + i;
		}

		for (int i = 0; i <= 5; i++) {
			books.add(new Book("Book: " + i,new Date(),"Editorial: " + i,authors));
		}
		return books;
	}

}
