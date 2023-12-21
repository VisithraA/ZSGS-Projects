package com.visithraa23.librarymanagementsystem.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookId;
	private String bookName;
	private String author;
	private String publisher;
	private byte edition;
	private byte quantity;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public byte getEdition() {
		return edition;
	}

	public void setEdition(byte edition) {
		this.edition = edition;
	}

	public byte getQuantity() {
		return quantity;
	}

	public void setQuantity(byte quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher
				+ ", edition=" + edition + ", quantity=" + quantity + "]";
	}

}
