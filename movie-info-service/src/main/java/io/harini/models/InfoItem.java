package io.harini.models;

public class InfoItem {
	
	private String movieId;
	private String movieName;
	private String desc;
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public InfoItem() {}
	
	public InfoItem(String movieId, String movieName, String desc) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.desc = desc;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
}
