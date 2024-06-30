import jdk.jshell.spi.ExecutionControl;

public class ShapeFactory {
    public Shape getShape(String type)  {
        Shape shape = null;
        switch (type.toLowerCase()) {
            case "rectangle":
                shape = new Rectangle();
                break;
            case "circle":
                shape = new Circle();
                break;
            case "square":
                shape = new Square();
                break;
            default:
                
        }
        return shape;
    }
}
