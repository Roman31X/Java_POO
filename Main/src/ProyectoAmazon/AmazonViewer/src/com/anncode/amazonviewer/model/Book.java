package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.*;

public class Book extends Publication implements IVisualizable {
	//Atributos
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	private ArrayList<Page> pages;

	//Constructor
	public Book(String title, Date edititionDate, String editorial, String[] authors, ArrayList<Page> pages) {
		super(title, edititionDate, editorial);
		setAuthors(authors);
		this.pages = pages;
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

	public ArrayList<Page> getPages() {
		return pages;
	}

	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
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

		int i = 0;
		do{
			System.out.println("..............");
			System.out.println("Pagina: "+getPages().get(i).getNumber());
			System.out.println(getPages().get(i).getTexContent());
			System.out.println("..............");

			if(i != 0){
				System.out.println(" [1] - Regresar Pagina ");
			}
			System.out.println(" [2] - Siguiente Pagina");
			System.out.println(" [0] - Cerra Libro");

			//Leer ocpion del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if(response == 2){
				i++;
			}else if(response == 1){
				i--;
			}else if(response == 0){
				break;
			}

		}while(i < getPages().size());

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

		ArrayList<Page> pages = new ArrayList();
		int pagina = 0;
		for (int i = 0; i < 3; i++) {
			pagina = i + 1;
			pages.add(new Book.Page(pagina,"El contenido de la Pagina: "+pagina));
		}

		for (int i = 0; i <= 5; i++) {
			books.add(new Book("Book: " + i,new Date(),"Editorial: " + i,authors,pages));
		}
		return books;
	}

	//Métodos static
	public static class Page{
		//Atributos
		private int id;
		private int number;
		private String texContent;

		//Constructor
		public Page(int number, String texContent) {
			this.number = number;
			this.texContent = texContent;
		}

		//Getter y setter
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getTexContent() {
			return texContent;
		}

		public void setTexContent(String texContent) {
			this.texContent = texContent;
		}
	}

}
