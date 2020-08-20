package pack1;

import pack1.Address;

public class Main {

    public static void main(String[] args) {

        Address ad1= new Address();
        ad1.setIndex("006");
        ad1.setCountry("Ukraine");
        ad1.setCity("Kyiv");
        ad1.setStreet("Nova");
        ad1.setHouse(34);
        ad1.setApartment(2);

        System.out.println(ad1.getIndex());
        System.out.println(ad1.getCountry());
        System.out.println(ad1.getCity());
        System.out.println(ad1.getStreet());
        System.out.println( ad1.getHouse());
        System.out.println(ad1.getApartment());

    }

}