/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prtotypepattern;

/**
 *
 * @author thuannd
 */
public class PrtotypePatternMain {

    /**
     * Khi muốn khởi tạo đối tượng bằng cách sao chép đối tượng đã có sẵn mà vẫn
     * giữ được performance
     */
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape shape = ShapeCache.getShape("1");
        shape.draw();

        Shape shape1 = ShapeCache.getShape("2");
        shape1.draw();
    }

}
