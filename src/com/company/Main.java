package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Page test;
        test = new Page();
        test.setLink("http://www.brainjar.com/java/host/test.html");
        test.read();
        System.out.print(test.size());
    }
}
