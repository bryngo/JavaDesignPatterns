/**
 * Created by Bryan1 on 2/8/18.
 */
public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        this._decoratedShape.draw();
        setBlueBorder(this._decoratedShape);

    }

    private void setBlueBorder(Shape decoratedShape) {
        System.out.println("Setting blue border");
    }
}
