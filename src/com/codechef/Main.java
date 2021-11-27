package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	While purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 1000.
    If the quantity and price per item are input, write a program to calculate the total expenses.

    Input
    The first line contains an integer T, total number of test cases. Then follow T lines, each line contains
    integers quantity and price.

    Output
    For each test case, output the total expenses while purchasing items, in a new line.

    Constraints
    1 ≤ T ≤ 1000
    1 ≤ quantity,price ≤ 100000
    Example
    Input

    3
    100 120
    10 20
    1200 20

    Output
    12000.000000
    200.000000
    21600.000000
                   */
        Scanner sc = new Scanner(System.in);
        double quantity;
        double price;
        double total;
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            quantity = sc.nextInt();
            price = sc.nextInt();
            if(quantity>1000){
                quantity = (0.9*quantity);
                total = price*quantity;
                System.out.println(total);
            }
            else{
                total = price*quantity;
                System.out.println(total);
            }
        }
    }
}
// codechef problem to find the total expenses: