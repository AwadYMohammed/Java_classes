package package1_23_2021;

import java.util.Arrays;

interface I {

	default boolean equals(Object O) {

		return true;

	}

}

class A implements I {

	public boolean equals(Object O) {

		return false;

	}

}

public class Palace {

	public static void main(String[] args) {

		A a = new A();

		I ia = new A();

		I i = new I() {};

		System.out.println(a.equals(ia) + " " + i.equals(ia));

	}

}