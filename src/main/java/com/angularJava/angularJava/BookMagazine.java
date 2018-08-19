package com.angularJava.angularJava;

import java.util.ArrayList;
import java.util.List;

public class BookMagazine {

  private List<Books> list = new ArrayList<>();

  public BookMagazine() {
    this.list.add(new Books("Relentless", 2017));
  }

  public Books selectByTitle(String title) {
    for(Books book: list) {
      if(book.getTitle().equalsIgnoreCase(title)){
        return book;
      }
    }
    return null;
  }

  public Books selectByYear(int year) {
    for(Books book: list) {
      if(book.getYear() == year){
        return book;
      }
    }
    return null;
  }
}
