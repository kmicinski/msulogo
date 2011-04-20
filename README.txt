Project 5 --

Hey there, I finished the next project (mostly probably...) for you
guys.  I've done it slightly differently, using an intermediate form
that was mostly homebrewed.  The code is translated to Turtle
intermediate code and then ultimately dumped by a visitor that goes
through the intermediate statements.  The translator to turn the ASTs
into intermediate code is in ICodeGenerator, while the translator to
Jasmin code is in JasminEmitter.  There are a few other hacks to put
in the necessary calls to do things like loading objects for the
virtual code.  I've just cheated (instead of doing analysis to find
out the needed stack size and used locals and stack set to 100 in the
dumped code.  Other than the code should mostly work,

Oh, and this doesn't work

make "k 234 make "j "k make :j 12 ;; Now "k" should be set to 12

If you find anyone who gets that to work, have them come talk to me
(Kris) because I'd be impressed at how they did it without using
pointer aliasing analysis (that might be a nice excercise, but non in
a dynamically typed language, and especially not when you need a
runtime symbol table (which is what you need to make this work in the
general case)).

Other than that, you should be able to run the code on some examples.
You should be able to do an "ant compile" and "ant jar" then go into
the build/ directory and run the compiler as shown below.  The thing
just prints the output to the screen and waits around (you can just
kill it with a ^C I suppose...)

I did the print stuff, and all of the turtle functions *should* be
there, if you have any other questions I suppose I'm around.

Have fun!  -- Kris and Team 9 (or whatever our team is.)

P.s., umm...  Oh...., I talked to Austin about how we should handle
the Point and double functions for the turtle library, but I did most
of the coding on this one, helped by checking some of the test cases
and pointing out what probably wouldn't work, I ran his test cases
before submitting the project.

kmicinski@kmicinski-desktop:~/projects/cse450/msulogo/build$ java -jar interpreter.jar >test.j
print "Hello
make "k 23 * 3 + 5
make "d "Hello
print :k
print :d
forward :k
kmicinski@kmicinski-desktop:~/projects/cse450/msulogo/build$ nano test.j
kmicinski@kmicinski-desktop:~/projects/cse450/msulogo/build$ java jasmin/Main test.j
Generated: TurtleTestJasmin.class
kmicinski@kmicinski-desktop:~/projects/cse450/msulogo/build$ java TurtleTestJasmin 
Hello
74
Hello

Thanks!
Kris

Project 4 --

Mr. Horne,

Man have I got some cute stuff for you to print to the screen this
time...  Like the polish cooking maxim: ``anything worth doing, is
worth overdoing.''  As before, you can compile the project using a
simple:

ant compile

and

ant jar

Now you should be able to go into build and do a:

java -jar ./interpreter.jar < ../tests/checkerboard_pretty.logo

which will produce for you a jar file which you can run the same way
as described below from the previous project (or pulling into Eclipse,
I even do that myself these days instead of emacs).

There is a set of test cases in the tests directory.  Like I said,
some of them are pretty intense... see the checkerboard one...

in the home directory here. There have not been many changes, however,
I have fully implemented scoping. Most of this has been accomplished
by going through and changing EvaluatorVisitor.java. This file takes
all of the program trees and performs the evaluation on them. To
implement function calls we just took uninterpreted function ASTs and
stored them to variable names, which are them stuck in later during
evaluation. I use the exception trick to handle return values.

I set up the standard set of tests, but I also got a bit inventive and
started just messing around trying to break my interpreter: good news,
I haven't yet, but I'm sure you will be able to if you try hard
enough.  A few notes, I the previous tests for the code had to be
modified a bit: since we made not and modulo functions now they must
have parenthesis before their arguments. I hope that's cool, if not
just drop us a note and we can make some slight modifications in the
grammar and get it fixed up for you.

Along with that, we changed the grammar as requested to LogoTurtle.g
in the directory, so hopefully that will be fine. We implemented type
propagation as requested, and that should be working well enough (we
haven't tried to break it, just kind of tested it in isolation a bit.)
Oh, one thing to note: the turtle commands only take integers as
arguments: in my mind this is the correct implementation, it is
completely unsafe to round off decimals in the library, so if you pass
them they will (hopefully you know...) throw errors...

And on to project 5 / 6!

Thanks for grading, hopefully you won't run into any troubles!

(Oh right... The coding... There's a guy who developed a popular
analysis technique for flow analysis in higher order languages, his
acknowledgements section is here:
http://www.scsh.net/docu/html/man.html (this crazy guy would have been
my PhD advisor had I chosen to go to Northeastern...)  But for ours
Austin did some of the test stuff (except the checkerboard one...)
and I (Kris) expanded on some more of the coding.)

Until next time,
      -- Team (idon'trememberwhatourteamnumberis...)

Project 3 --

Mr. Horne,

METHODOLOGY
------------------------------------------------------------
I made a lot of changes to the main structure of the compiler to
support a few extra operations for my honors option with Dr. Punch.
Hopefully this won't make it too hard for you to grade.  Let me
describe to you the basic structure of the compiler:

We first translate the CommonTree class provided by ANTLR into my own
homebrew tree class. I keep track of tokens for error reporting, but
eventually I'd like to add facilities for static analysis in here. The
root of my own AST is in ToplevelAST.java. The CommonTree ->
ToplevelAST conversion is done by the CommonTreeTranslator(.java)
class

I also added a simplistic type system that that uses strongly enforced
type rules (can't add int and string, operations must be identical on
simmilar types).  This aligns with what you would get in the JVM in a
standard implementation of project 3, except we now have better error
reporting. The base class of this is Type.java. Eventually this will
be able to support full out type constructors, higher order type
unification, etc... Not that any of that exists in Logo. But also I
was looking to write this with an eye to type unification, so
abstracting types into their own classes sort of makes sense.

I added a symbol table handling.  Right now we enforce a single global
symbol table as per the requirements of project 3, however the option
is there to branch out and support fully chained symbol tables.  This
is stored in the DeclarationEnvironment.java and
DeclarationDataEnvironment.java (a derived class containing symbol
table data along with variable assignments, which changes as
expressions are evaluated).

I have implemented the LogoAST.g file as requested by project 2: I
work toward implementing S expression syntax, along with the hacked
logo syntax, and include a slight hack to do the ``print arity one''
rule enforced by project 3.

Evaluation, and type elaboration is done by a set of visitor classes.
Currently I've combined type checking and evaluation into a single
class: EvaluatorVisitor(.java).  This is *the single most important
class of the project* because it does the actual evaluation of our
code.

Along with this, I have created an extensible command layout, new
commands are implemented by putting handlers into the symbol table,
the handlers are instantiated by the evaluator but I should probably
put them in a static {} come to think of it.  All of the commands to
do things like printing, ``make'' and the others are in the
basicevaluatorhandlers subdirectory.

I've also included a bit of logo stuff for my own honors option, 
which I've commented out to make the fancy stuff disappear.

ACTUALLY BUILDING IT
------------------------------------------------------------
To actually build the interpreter you can use the ant build 
file I've included, here's what a clean build for me looks like:

ant compile

Buildfile: /home/kmicinski/projects/cse450/play/msulogo/build.xml

compile:
    [mkdir] Created dir: /home/kmicinski/projects/cse450/play/msulogo/build
    ...
    ...

BUILD SUCCESSFUL
Total time: 1 second

Now what should you do?

I've also created a ``jar'' target, create that:

ant jar
...

jar:
      [jar] Building jar: /home/kmicinski/projects/cse450/play/msul...

BUILD SUCCESSFUL
Total time: 1 second

TESTING IT
------------------------------------------------------------
I included punch's standard tests in the tests/ directory 
in the main tree.  You can run the interpreter.jar with 

cd build
java -jar interpreter.jar

It now accepts input from the standard input.  One example on the hailstone 
test can now be done:

/build$ java -jar interpreter.jar < ../tests/hailstone.lgo 
N 25 
N 76 
N 38 
N 19 
N 58 
N 29 
N 88 
N 44 
N 22 
N 11 
N 34 
N 17 
N 52 
N 26 
N 13 
N 40 
N 20 
N 10 
N 5 
N 16 
N 8 
N 4 
N 2 

And that should be the extent of it!

Thanks, surely I messed up somewhere, hopefully you'll be able 
to compile it, and it's not too much extra work for you...

   -- Kristopher Micinski
