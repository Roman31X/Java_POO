package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film {
	//Atributos
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;

	//Constructor
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
	}

	//Getter y setter
	public int getId() {
		return id;
	}
	public int getSessionQuantity() {
		return sessionQuantity;
	}
	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}


	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return  "\n :: SERIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

	//Método de lectura de datos
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			//Serie serie = new Serie("Serie: "+i,"Genero: "+i,"Creador"+i,1200,5);
			//serie.setChapters(Chapter.makeChaptersList(serie));
			//series.add(serie);
		}
		return series;
	}

	@Override
	public void view() {

	}
}
