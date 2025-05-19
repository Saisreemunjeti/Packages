package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String [] args) {
		Library library=new Library();
		library.setTotalBooks(10098);
		library.setLibraryName("Central Library");
		
		Librarian librarian=new Librarian();
		librarian.setLibrarianName("Ramesh");
		librarian.setYearsOfExperirnce(15);
		
		library.showLibraryDetails();
		System.out.println();
		librarian.showLibrarianInfo();
		
	}

}
