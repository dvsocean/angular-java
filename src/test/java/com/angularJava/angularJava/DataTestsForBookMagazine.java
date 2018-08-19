package com.angularJava.angularJava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DataTestsForBookMagazine {

  private BookMagazine magazine = new BookMagazine();

  @Test
  public void returnBookByTitle(){
    assertEquals("Relentless", magazine.selectByTitle("Relentless").getTitle());
  }

  @Test
  public void returnBookByYear() {
    assertEquals(2017, magazine.selectByYear(2017).getYear());
  }
}
