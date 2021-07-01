package test_25;

class MyArrayAlg{
	
//	<template T>
	public static <T> void swap(T arr[], T a, T b){
		T temp = arr[(int)a];
		arr[(int)a] = arr[(int)b];
		arr[(int)b] = temp;
	}
}
public class MyArrayAlgTest {

	public static void main(String[] args) {

		String[] language = {"java", "c++", "c#"};
		MyArrayAlg.swap(language, 1, 2);
		for(String value : language)
			System.out.println(value);
	}

}
