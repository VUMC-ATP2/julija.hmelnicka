package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Date date = new Date();

        Customer customerOne= new Customer("Anna",true,"Silver");
        Visit customerOneVisit = new Visit(customerOne, new Date());
        customerOneVisit.setServiceExpense(10);
        customerOneVisit.setProductExpense(20);
        System.out.println(customerOneVisit);
        System.out.println("Total expense for today: " + customerOneVisit.getTotalExpense());
        System.out.println("------------------");
        Customer customerTwo= new Customer("Bella",true,"Gold");
        Visit customerTwoVisit = new Visit(customerTwo, new Date());
        customerTwoVisit.setServiceExpense(10);
        customerTwoVisit.setProductExpense(20);
        System.out.println(customerTwoVisit);
        System.out.println("Total expense for today: " + customerTwoVisit.getTotalExpense());
        System.out.println("------------------");
        Customer customerThree= new Customer("John",true,"Premium");
        Visit customerThreeVisit = new Visit(customerThree, new Date());
        customerThreeVisit.setServiceExpense(10);
        customerThreeVisit.setProductExpense(20);
        System.out.println(customerThreeVisit);
        System.out.println("Total expense for today: " + customerThreeVisit.getTotalExpense());



    }
}