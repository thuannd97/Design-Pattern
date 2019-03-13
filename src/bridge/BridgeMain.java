/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author thuannd
 */
public class BridgeMain {

    /**
     * Bridge Pattern được sử dụng để tách thành phần trừu tượng (abstraction)
     * và thành phần thực thi (implementation) riêng biệt. Khi abstraction thay
     * đổi thì implement ko phải thay đổi theo.
     */
    public static void main(String[] args) {
        Shape shape1 = new Circle(new RedCircle());
        Shape shape2 = new Circle(new GreenCircle());
        Shape shape3 = new Circle(new BlueCircle());
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        shape1.Draw();
        shape2.Draw();

    }

}
