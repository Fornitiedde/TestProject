package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hblbl");
        Page test;
        test = new Page();
        test.setLink("Hblbl");
        test.printLink();
        test.add("test1");
        test.add("test2");
        test.printList();
    }
}
