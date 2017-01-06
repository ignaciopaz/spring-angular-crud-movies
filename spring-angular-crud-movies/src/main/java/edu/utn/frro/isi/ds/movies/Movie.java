package edu.utn.frro.isi.ds.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private String releaseYear;
	private String director;
	private String genre;

	protected Movie() {
	}

	public Movie(String title, String releaseYear, String director, String genre) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.director = director;
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	

}
