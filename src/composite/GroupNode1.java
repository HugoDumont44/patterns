package composite;

import java.util.ArrayList;
import java.util.List;

public class GroupNode1 implements CompositeNode {
	private List<CompositeNode> nodes = new ArrayList <CompositeNode>();
	
	public void add(CompositeNode node){
		nodes.add(node);
	}
	
	public void remove(CompositeNode node){
		nodes.remove(node);
	}
	
	public void empty(){
		nodes.clear();
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("GroupNode");
		
		for (CompositeNode composite : nodes){
			composite.draw();
		}
	}

}
