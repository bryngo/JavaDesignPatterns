/**
 * Created by Bryan1 on 2/8/18.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this._decoratedShape.draw();
        setRedBorder(this._decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Setting border color to red");
    }
}
