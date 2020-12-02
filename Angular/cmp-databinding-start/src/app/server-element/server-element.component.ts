import { Component, OnInit, Input, ViewEncapsulation, OnChanges, SimpleChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy, ViewChild, ElementRef, ContentChild } from '@angular/core';
import { staticNever } from 'rxjs-compat/add/observable/never';

@Component({
  selector: 'app-server-element',
  templateUrl: './server-element.component.html',
  styleUrls: ['./server-element.component.css'],
  encapsulation: ViewEncapsulation.Emulated //Could be None, or Native.
})
export class ServerElementComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {
  @Input('srvElement') element: {type: string, name: string, content: string};
  @Input() name: string;
  @ViewChild('heading', {static: true}) header: ElementRef;
  @ContentChild('contentParagraph', {static: true}) paragraph: ElementRef;

  constructor() {
  }

  ngOnChanges(changes: SimpleChanges){
    console.log("Ng on changes called.");
    console.log(changes);
  }

  ngOnInit(): void {
    console.log('Text Content' + this.header.nativeElement.textContent);
  }

  ngDoCheck(){
    console.log('Ng-DoCheck Called.');
  }

  ngAfterContentInit(){
    console.log("ngAfterContentInit Called.");
  }

  ngAfterContentChecked(){
    console.log("ngAfterContentChecked Called.");
  }

  ngAfterViewInit(){
    console.log("ngAfterViewInit Called.");
    console.log('Text Content' + this.header.nativeElement.textContent);
  }

  ngAfterViewChecked(){
    console.log("ngAfterViewChecked Called.");
  }

  ngOnDestroy(){
    console.log("On Destroy called.");
  }

}
