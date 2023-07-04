package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

/**
 * <h1>Film</h1>
 * Film es una clase padre
 * <p>
 * Esta clase es la clase padre y abstracta
 * no puede crearse intancias pero contiene el métodos abstractos
 * {@code view()} que es obligatorio implementar por las hijas
 *
 * @author DIEGO
 * @version 1.1
 * @2023
 * */

public abstract class Film {
	//Atributos
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	//Constructor
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	//Getter y Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if(viewed == true) {
			visto = "Sí";
		}else {
			visto = "No";
		}
		return visto;
	}
	public boolean getViewed(){
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	//Métodos Abstractos
	/**
	 * {@code view()} es un metodo abstracto necesario a implementar
	 * */
	public abstract void view();
}
