package ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.DAO;

import ProyectoAmazon.AmazonViewer.src.com.anncode.amazonviewer.model.Movie;

import java.util.ArrayList;

public interface MovieDAO {

    default Movie setMoviewed(Movie movie){
        return movie;
    }

    default ArrayList<Movie> read(){
        ArrayList<Movie> movies = new ArrayList();
        return movies;
    }

    private boolean getMovieViewed(){
        return false;
    }
}
