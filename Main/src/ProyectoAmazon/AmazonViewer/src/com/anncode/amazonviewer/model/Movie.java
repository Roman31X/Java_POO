package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Hereda de {@link Film}
 * Implementa de {@link IVisualizable}
 * */

public class Movie extends Film implements IVisualizable {
	//Atributos
	private int id;
	private int timeViewed;
	//Constructor
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}
	//GETTER Y SETTER
	public int getId() {
		return id;
	}
	public int getTimeViewed() {
		return timeViewed;
	}
	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}

	//Método toString
	@Override
	public String toString() {
		return  "\n :: MOVIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

	//Implementación
	/**
	 * {@inheritDoc}
	 * */
	@Override
	public Date startToSee(Date dateI) {
		return dateI;
	}

	/**
	 * {@inheritDoc}
	 * */
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		if (dateF.getTime() > dateI.getTime()) {
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}else {
			setTimeViewed(0);
		}
	}

	//Método lector de datos
	public static ArrayList<Movie> makeMoviesList() {
		ArrayList<Movie> movies = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			movies.add(new Movie("Movie " + i, "Genero " + i, "Creador " + i, 120+i, (short)(2023+i)));
		}
		return movies;
	}
	/**
	 * {@inheritDoc}
	 * */
	@Override
	public void view() {
		setViewed(true);
		Date dateI = startToSee(new Date());

		for (int i = 0; i < 100000; i++) {
			System.out.println("..........");
		}

		//Termine de verla
		stopToSee(dateI, new Date());
		System.out.println();
		System.out.println("Viste: " + toString());
		System.out.println("Por: " + getTimeViewed() + " milisegundos");

	}
}







