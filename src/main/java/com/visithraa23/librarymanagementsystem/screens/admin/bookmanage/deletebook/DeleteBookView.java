package com.visithraa23.librarymanagementsystem.screens.admin.bookmanage.deletebook;

import java.util.Scanner;

public class DeleteBookView {

	private DeleteBookViewModel deleteBookViewModel;

	public DeleteBookView() {
		deleteBookViewModel = new DeleteBookViewModel(this);
	}

	public void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BookID");
		int bookId = sc.nextInt();
		deleteBookViewModel.deleteBook(bookId);
	}

}
