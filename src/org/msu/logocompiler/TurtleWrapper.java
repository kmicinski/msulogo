package org.msu.logocompiler;

import java.awt.Point;

import msu.cse.turtlegraphics.Turtle;

public class TurtleWrapper {
	public static void setHeading(Turtle t, int h)
	{
		t.turtleSetHeading((double)h);
	}
	
	public static void setPoint(Turtle t, int x, int y)
	{
		t.turtleGoto(new Point(x,y));
	}
	
	
}
