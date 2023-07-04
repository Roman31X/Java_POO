package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.ArrayList;

/**
 * Hereda de {@link  Movie}
 * @see Film
 * */
public class Chapter extends Movie {
	//Atributos
	private int id;
	private int sessionNumber;
	private Serie serie;

	//Constructor
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.setSessionNumber(sessionNumber);
		this.setSerie(serie);
	}

	//Getter y Setter
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}

	public Serie getSerie(){
		return serie;
	}

	public void setSerie(Serie serie){
		this.serie=serie;
	}

	//Método toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIE ::" +
				"\n Title: " + getSerie().getTitle() +
				"\n :: CHAPTER ::" +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}

	//Método lector de datos
	public static ArrayList<Chapter> makeChaptersList() {
		ArrayList<Chapter> chapters = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2023+i), i));
		}
		return chapters;
	}

	//Método para marcar una serie con todos los capitulos vistos
	@Override
	public void view() {
		super.view();
		ArrayList<Chapter> chapters = getSerie().getChapters();
		int chapterViewCounter = 0;
		for (Chapter chapter : chapters) {
			if(chapter.getViewed()){
				chapterViewCounter++;
			}
		}
		if(chapterViewCounter == chapters.size()){
			//getSerie().view(true);
		}
	}
}
