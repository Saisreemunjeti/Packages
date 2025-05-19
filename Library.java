package com.library.books;

public class Library {
	private int totalbooks;
	private String libraryname;
	public void setTotalBooks(int string) {
	this.totalbooks = string;
	}
	public void setLibraryName(String libraryname) {
	this.libraryname = libraryname;
	}
	public int getTotalBooks() {
	return totalbooks;
	}
	public String getLibraryName() {
		return libraryname;
	}
		public void showLibraryDetails() {
		System.out.println("Total Books: " + totalbooks);
		System.out.println("Library Name:" + libraryname);
		}
		}