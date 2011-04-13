.class public TurtleTestJasmin
.super java/lang/Object

.method public <init>()V
	aload_0
	invokespecial java/lang/Object/<init>()V
	return
.end method

.method public static main([Ljava/lang/String;)V
	.limit locals 10
	.limit stack 10

	new    msu/cse/turtlegraphics/Turtle
	dup
	invokespecial msu/cse/turtlegraphics/Turtle/<init>()V
	astore_1
	new	msu/cse/turtlegraphics/TurtleDisplayFrame
	dup
	invokespecial	msu/cse/turtlegraphics/TurtleDisplayFrame/<init>()V
	astore_2
	aload_2
	iconst_1
	invokevirtual	msu/cse/turtlegraphics/TurtleDisplayFrame/setVisible(Z)V
	aload_1
	aload_2
	invokevirtual	msu/cse/turtlegraphics/TurtleDisplayFrame/getCurrentCanvas()Lmsu/cse/turtlegraphics/TurtleDisplayCanvas;
	invokevirtual	msu/cse/turtlegraphics/Turtle/setCurrentTurtleDisplayCanvas(Lmsu/cse/turtlegraphics/TurtleDisplayCanvas;)V
	ldc 2
	ldc 3
	iadd
	istore 1
	iload 1
	i2d
	lsdc2_w 3.0
	dmul
	dstore 2
	return
.end method
