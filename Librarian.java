package com.library.staff;

public class Librarian {
		private String librarianName;
		private int yearsOfExperience;
		public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
		}
		public void setYearsOfExperirnce(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
		}
		public String getLibrarianName() {
		return librarianName;
		}
		public double getYearsOfExperience() {
			return yearsOfExperience;
		}
			public void showLibrarianInfo() {
			System.out.println("Librarian Name: " + librarianName);
			System.out.println("Years Of Experience:" + yearsOfExperience);
			}
			}
