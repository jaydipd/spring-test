package com.gsit;

public interface BookRepository {

    Book getByIsbn(String isbn);

}