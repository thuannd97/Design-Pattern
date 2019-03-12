/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpattern;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class FactoryMethodPattern {

    /**
     * Factory Method pattern nhằm giải quyết vấn đề: tạo 1 đối tượng
     * mà không cần thiết chỉ ra 1 cách chính xác là đối tượng nào sẽ được tạo.
     * Đối tượng sẽ được tạo phù hợp với yêu cầu của client.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so de chon xe:" );
        int a = sc.nextInt();
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.getCar(a).view());
    }
    
}
