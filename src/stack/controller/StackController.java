package stack.controller;

import java.util.Stack;
import java.awt.Color;

import stack.model.Dish;

public class StackController
{
	private Stack<Dish> dishList;
	
	public StackController()
	{
		dishList = new Stack<Dish>();
	}
	
	public void start()
	{
		buildStack();
	}
	
	private void buildStack()
	{
		dishList.add(new Dish(false, Color.RED, 5));
		dishList.add(new Dish(true, Color.BLUE, 9));
		dishList.add(new Dish(false, Color.GRAY, 4));
	}
}
