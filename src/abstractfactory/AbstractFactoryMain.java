/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author thuannd
 */
public class AbstractFactoryMain {

    /**
     * Abstract pattern là mở rộng của Factory method, Factory của nhiều
     * Factories. Trong Factory Method các object sẽ được tạo ở compile time,
     * Abstract Factory các object sẽ được tạo ở run time
     */
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("BLUE");
        color1.fill();
    }

}
