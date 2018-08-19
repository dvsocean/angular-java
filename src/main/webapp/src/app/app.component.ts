import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'; 

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})



export class AppComponent {
  constructor(private httpClient:HttpClient){}
  onNameKeyUpEvent(event: any){
    console.log(event.target.value)
  }
  
  title = 'Hero angular form';
}
