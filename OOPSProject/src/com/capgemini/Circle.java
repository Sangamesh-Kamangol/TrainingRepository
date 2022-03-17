package com.capgemini;

public class Circle {
	Operation op; //composition
	double pi=3.14; // aggregation



	double area(int r) {
	op=new Operation();

	int rsquare=op.square(r);
	return pi*rsquare;
	}
}
