package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer;

import ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model.*;
import ProyectoAmazon.MakeReport.src.com.anncode.makereport.Report;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * <h1>Proyecto AmazonViewer</h1>
 *
 * Es programa diseña para la simulación de visualización de funciones
 * de estado de movies, series con sus respectivos chapters, Book y Magazinees.
 * También permite generar reportes generales y fecha al dia.
 * <p>
 * Existe algunas reglas como que todos los elementos pueden ser visualizados
 * o leidos a exepción de las Megazines,estas solo pueden ser visualizadas a modo
 * de exposición sin ser leido.
 *
 * @author DIEGO
 * @version 1.1
 * @since 2023
 * */

public class Main {
	//Método ejecutor
	public static void main(String[] args) {
		double num = 3;
		num = num * 10000;
		System.out.println("num = " + num);
		//showMenu();
	}

	//Método principal de Menu
	public static void showMenu() {
		int exit = 0;
		do {
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");

			//Leer la respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			switch (response) {
				case 0:
					//salir

					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					//Date date = new Date();
					makeReport(new Date());
					break;

				default:
					System.out.println();
					System.out.println("....¡¡Selecciona una opción!!....");
					System.out.println();
					break;
			}


		}while(exit != 0);
	}

	static ArrayList<Movie> movies = Movie.makeMoviesList();

	public static void showMovies() {
		int exit = 1;

		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();

			for (int i = 0; i < movies.size(); i++) { //1. Movie 1
				System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if(response == 0) {
				exit = 0;
				showMenu();
				break;
			}

			if(response > 0){
				Movie movieSelected = movies.get(response-1);
				movieSelected.view();
			}


		}while(exit !=0);

	}

	static ArrayList<Serie> series = Serie.makeSeriesList();

	public static void showSeries() {
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();

			for (int i = 0; i < series.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if(response == 0) {
				exit=0;
				showMenu();
			}

			if(response > 0){
				showChapters(series.get(response-1).getChapters());
			}

		}while(exit !=0);
	}

	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int exit = 0;

		do {
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();


			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if(response == 0) {
				showSeries();
			}

			if(response > 0){
				Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
				chapterSelected.view();
			}

		}while(exit !=0);
	}

	static ArrayList<Book> books = Book.makeBookList();

	public static void showBooks() {
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();

			//Lector de menu
			for (int i = 0; i < books.size(); i++) { //1. Serie 1
				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Leido: " + books.get(i));
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if(response == 0) {
				exit=0;
				showMenu();
			}

			if(response > 0){
				Book bookSelectd = books.get(response-1);
				bookSelectd.view();
			}


		}while(exit !=0);
	}

	public static void showMagazines() {
		ArrayList<Magazine> magazines = Magazine.makeMagazineList();
		int exit = 0;
		do {
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();

			for (int i = 0; i < magazines.size(); i++) {
				System.out.println(i+1 + ". "+magazines.get(i).getTitle());
			}

			System.out.println("0. Regresar al Menu");
			System.out.println();

			//Leer Respuesta usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());

			if(response == 0) {
				exit=0;
				showMenu();
			}

		}while(exit !=0);
	}

	public static void makeReport() {
		Report report = new Report();
		report.setNameFile("Reporte");
		report.setExtension("txt");
		report.setTitle("::VISTOS::");
		String contenReport = "";

		for (Movie movie : movies) {
			contenReport+= movie.toString()+"\n";
		}
	}

	public static void makeReport(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-h-m-s-S");
		String dateString = df.format(date);
		Report report = new Report();

		report.setNameFile("Reporte : "+dateString);
		report.setExtension("txt");
		report.setTitle("::VISTO::");

		SimpleDateFormat dfNameDays = new SimpleDateFormat("E,W MM Y");
		dateString = dfNameDays.format(date);
		String contentReport = "Date: "+ dateString + "\n\n\n";
	}

}






