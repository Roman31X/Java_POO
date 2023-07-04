package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	/**
	 * Este método captura ell tiempo exacto de visualización
	 *
	 * @param dateI es un objeto {@code Date} con el tiempo de inicio exacto
	 * @return devuelve la fecha y hora capturada
	 * */
	Date startToSee(Date dateI);

	/**
	 * Este método captura el tiempo exacto de inicio de visualización
	 * @param dateI es un objeto {@code Date} con el tiempo inicio exacto
	 * @param dateF es un objeto {@code Date} con el tiempo de final exacto
	 * */
	void stopToSee(Date dateI, Date dateF);
	
}
