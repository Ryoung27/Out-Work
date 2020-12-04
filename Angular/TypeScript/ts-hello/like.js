"use strict";
exports.__esModule = true;
exports.Like = void 0;
var Like = /** @class */ (function () {
    function Like(like, selected) {
        this.like = like;
        this.selected = selected;
    }
    Like.prototype.click = function () {
        if (this.selected === true) {
            this.selected = false;
            this.like += -1;
        }
        else {
            this.selected = true;
            this.like += 1;
        }
    };
    Like.prototype.show = function () {
        if (this.selected === true) {
            console.log("Number of likes: " + this.like + " thumbs up");
        }
        else {
            console.log("Number of likes: " + this.like + " thumbs down");
        }
    };
    return Like;
}());
exports.Like = Like;
