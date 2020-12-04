import { Point } from './point';
import { Like } from './like.component';

let like = new Like(0, false);
like.show();
like.click();
like.show();
like.click();
like.show();
let point = new Point(1, 2);
point.draw();