package org.test;

import builder.ComplexObject;

public class MainTestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComplexObject complexObject = new ComplexObject.ComplexObjectBuilder("test", "123456789")
				.setAuto(true)
				.setBig(true)
				.setNumber(5)
				.build();
		

		
		System.out.println(complexObject);
	}

}