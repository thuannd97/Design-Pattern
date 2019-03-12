/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpattern;

/**
 *
 * @author nguye
 */
public class CarFactory {
    // factory method

    public Car getCar(int a) {
        if (a < 0) {
            return new Honda();
        } else if (a == 0) {
            return new Toyota();
        } else if (0 < a && a< 10) {
            return new Vinfast();
        } else{
            return new Ford();
        }
    }

}
