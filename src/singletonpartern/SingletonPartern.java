/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpartern;

/**
 *
 * @author thuannd
 */
public class SingletonPartern {

    /**
     * Singleton Pattern được dùng trong các trường hợp mà các object được tạo ra duy nhất
     * trên toàn bộ project tại cùng 1 thời điểm, hoặc là giới hạn số lượng các object được tạo ra VD: connection tới database
     */
    public static void main(String[] args) {
        Printer printer = Printer.newInstance();
        printer.connect();
    }
    
}
