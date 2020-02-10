package fr.epsi.atlas;

public class Rectangle {

	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) throws LongueurLargeurInvalideException {
		if (longueur <= 0) {
			throw new LongueurLargeurInvalideException("La longueur doit être un nom positif !");
		}
		if (largeur <= 0) {
			throw new LongueurLargeurInvalideException("La largeur doit être un nom positif !");
		}
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public double getPerimetre() {
		return (this.longueur + this.largeur) * 2;
	}

	public double getAire() {
		return this.longueur * this.largeur;
	}

	@Override
	public String toString() {
		return "Rectangle de longueur " + longueur + " et de largeur " + largeur;
	}

}
