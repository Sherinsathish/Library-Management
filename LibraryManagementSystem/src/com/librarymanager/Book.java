package com.librarymanager;

public class Book {
	
	//private fields
	private String title;
	private String author;
	private String isbn;
	
	//constructor
	Book(String title,String author,String isbn)
	{
		//L.I
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	//getters
	public String gettitle()
	{
		return title;
	}
	
	public String getauthor()
	{
		return author;
	}
	
	public String getisbn()
	{
		return isbn;
	}
	
	//To display
	public void displaybook_details()
	{
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("ISBN: "+isbn);
		System.out.println("\n");
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) 
	    	return true;
	    if (!(obj instanceof Book)) 
	    	return false;
	    Book other = (Book) obj;
	    return this.isbn.equals(other.isbn);
	}

	@Override
	public int hashCode() {
	    return isbn.hashCode();
	}


}
