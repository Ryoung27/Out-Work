
import { Component } from '@angular/core';
import { AuthorsService } from './authors.service';

@Component({
    selector: 'authors',
    template : `
        <h2>{{ title }}</h2>
        <ul>
            <li *ngFor="let author of authors">
                {{ author }}
            </li>
        </ul>
        `
})
export class AuthorsComponent{
    title = "List of authors"
    authors;

    constructor(service: AuthorsService){
        this.authors = service.getAuthors();
    }

    //The logic for calling an http component, could go here.
}