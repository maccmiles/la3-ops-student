package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * LA3a
 * @author Miles Macchiaroli
 *
 */
public class LA3a {
/**
 * This program utilizes multiple methods to compute different problems
 * @param args
 */
	public static void main(String[] args) {//Begin
		Scanner input = new Scanner(System.in);//Call Scanner Object
	double in1, in2, in3;//set VARS
	String op = "";
	System.out.printf("Enter three numbers: ");
	in1 = input.nextDouble();//in1
	in2 = input.nextDouble();//in2
	in3 = input.nextDouble();//in3
	System.out.printf("Enter operation: ");
	op = input.next();//Take input for operation
	if (op.equals("min")) {
		min(in1, in2, in3);//min
	}else if (op.equals("l1")) {
		l1(in1, in2, in3);//L1
	}else if (op.equals("l2")) {
		l2(in1, in2, in3);//L2
	}else {
		System.out.printf("Invalid operation!%n");//invalid operation provided
		System.exit(0);//Stop Program
	}
	
	}
	
	public static void min(double a, double b, double c) {//Minimum number
		double min = 0.0;
		if ((a < b)&&(a < c)) {min = a;}//A is lowest
		else if ((b < a)&&(b < c)) {min = b;}//B is lowest
		else {min = c;}//C is lowest
		System.out.printf("min(%.2f, %.2f, %.2f) = %.2f%n", a, b, c, min);
	}
	public static void l1(double a, double b, double c) {//Sum ABS
		double sum = 0.0;
		sum = Math.abs(a)+Math.abs(b)+Math.abs(c);//Add all ABS together
		System.out.printf("l1(%.2f, %.2f, %.2f) = %.2f%n", a, b, c, sum);
	}
	public static void l2(double a, double b, double c) {//SQRT Sum Squares
		double sqrt = 0.0;
		sqrt = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));//sqrt all squared
		System.out.printf("l2(%.2f, %.2f, %.2f) = %.2f%n", a, b, c, sqrt);
	}
	

}
