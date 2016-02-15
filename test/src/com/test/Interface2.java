package com.test;

public interface Interface2 {

	default void method1() {
		System.out.println("The default method of Interface2.");
	}
}