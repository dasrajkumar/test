package com.test;

public interface Interface1 {
	default void method1() {
		System.out.println("The default method of Interface1.");
		System.out.println();
	}
}