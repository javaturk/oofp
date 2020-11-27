package org.javaturk.oofp.ch04.staticClass;

public class Citizen {

	private String tckn;
	private String firstName;
	private String lastName;
	private Nationality nationality;

	public Citizen(Nationality nationality, String tckn, String firstName, String lastName) {
		this.nationality = nationality;
		this.tckn = tckn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	static class Nationality {
		private String country;
		private String abbreviation;

		public Nationality(String country, String abbreviation) {
			this.country = country;
			this.abbreviation = abbreviation;
		}

		public String getCountry() {
			return country;
		}

		public String getAbbreviation() {
			return abbreviation;
		}

		@Override
		public String toString() {
			return "Nationality [country=" + country + ", abbreviation=" + abbreviation + "]";
		}
	}

	public String getTckn() {
		return tckn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Nationality getNationality() {
		return nationality;
	}

	@Override
	public String toString() {
		return "Citizen [tckn=" + tckn + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality=" + nationality + "]";
	}
}
