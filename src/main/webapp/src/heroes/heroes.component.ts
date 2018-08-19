import { Component, OnInit } from '@angular/core'; 
import { Hero } from '../classes/hero'; 
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'app-heroes',
    templateUrl: './heroes.component.html',
    styleUrls: ['./heroes.component.css']
})


export class HeroesComponent implements OnInit {

    year: '';

    constructor(private httpClient:HttpClient){}
        onNameKeyUpEvent(event: any){
            this.year = event.target.value;
        }
        getBook(){
            // console.log(this.name);
            this.httpClient.get(`http://localhost:8080/bookByYear/?year=${this.year}`)
            .subscribe(
                (data) => {
                    console.log(data);
                }
            )
        }

    hero: Hero = {
        name: 'John',
        email: 'Jordana@gmail.com',
        type: 3
    };

   

    ngOnInit(): void {
        throw new Error("Method not implemented.");
    }

}