package com.angularJava.angularJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngularController {

  private BookMagazine bm = new BookMagazine();

  @PostMapping("/bookByTitle")
  public Books findBookByTitle(@RequestParam("title") String title){
    return bm.selectByTitle(title);
  }

  @GetMapping("/bookByYear/{year}")
  public Books findBookByYear(@PathVariable("year") int year){
    return bm.selectByYear(year);
  }

}
