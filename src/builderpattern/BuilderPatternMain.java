/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thuannd
 */
public class BuilderPatternMain {

    /**
     * Builder pattern nhằm phục vụ việc khởi tạo đối tượng phức tạp bằng cách
     * khởi tạo từng thuộc tính của đối tượng đó, để có thể tiến hành khởi tạo
     * đối tượng cho từng hoàn cảnh khác nhau.
     */
    public static void main(String[] args) {
        List<String> languages = new ArrayList<String>();
        languages.add("English");
        Person p = new Person.Builder().name("thuannd").age(22).languages(languages).build();
        System.out.println(p.getInfor());
    }

}
