export class Like{
    constructor(public like: number, public selected: boolean){
    }

    click(){
        this.like += (this.selected) ? 1 : -1;
        this.selected = !this.selected;
    }

    show(){
        if(this.selected === true){
            console.log("Number of likes: " + this.like + " thumbs up");
        }
        else{
            console.log("Number of likes: " + this.like + " thumbs down");
        }
    }
}