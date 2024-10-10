package com.example.project;


public class test {
    public static void main(String[] args) {
        StringProblems o = new StringProblems();
        String expectedOutput = "Hi";
        String studentOutput= o.withoutX("xHix");
        System.out.println(studentOutput);
    }
}
