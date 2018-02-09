/**
 * Created by Bryan1 on 2/8/18.
 */
public class DecoratorDesignDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        Shape blueCircle = new BlueShapeDecorator(new Circle());

        circle.draw();
        System.out.println();

        redCircle.draw();
        System.out.println();

        blueCircle.draw();
        System.out.println();

        redRectangle.draw();

    }
}
