public class Film extends Camera{
	private int filmtype;
	private double filmsize;

	public double getFilmsize() {
		return filmsize;
	}

	public int getFilmtype() {
		return filmtype;
	}

	public void setFilmsize(double filmsize) {
		this.filmsize = filmsize;
	}
	public void setFilmtype(int filmtype) {
		this.filmtype = filmtype;
	}
}
