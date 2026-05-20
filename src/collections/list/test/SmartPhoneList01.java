package collections.list.test;

import collections.list.domain.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneList01 {
    public static void main(String[] args) {


        SmartPhone smartPhone01 = new SmartPhone("01","SAMSUNG");
        SmartPhone smartPhone02 = new SmartPhone("02","Iphone");
        SmartPhone smartPhone03 = new SmartPhone("03","Pixel");


        List<SmartPhone> phones = new ArrayList<>();


        phones.add(smartPhone01);
        phones.add(smartPhone02);
        phones.add(smartPhone03);


        for (SmartPhone phone : phones ){
            System.out.println(phone);
        }





    }
}
