/**
 * Created by Bryan1 on 2/8/18.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape _decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this._decoratedShape = decoratedShape;
    }

    public void draw() {
        _decoratedShape.draw();
    }

}
