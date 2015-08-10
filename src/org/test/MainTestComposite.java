package org.test;

import composite.*;

public class MainTestComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testNodes();
	}

	private static void testNodes() {
		CompositeNode button = new LeafNodeButton();
		CompositeNode button2 = new LeafNodeButton();
		CompositeNode image = new LeafNodeImage();
		CompositeNode tapis = new LeafNodeTapis();
		GroupNode1 layout = new GroupNode1();
		GroupNode1 layout2 = new GroupNode1();
		GroupNode1 layout3 = new GroupNode1();
		
		layout.add(button);
		layout.add(image);
		layout.add(button2);
		
		layout2.add(tapis);
		
		layout3.add(layout);
		layout3.add(layout2);
		
		layout.draw();
		System.out.println("");
		layout2.draw();
		System.out.println("");
		layout3.draw();
		
	}
	
}
