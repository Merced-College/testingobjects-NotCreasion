
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22550188)
# testingObjects

this is an example of a ReadMe file.
Reflection & Turn-In

Checkpoint Question 1: What does printing an object with no toString show, and why?
It prints out the name followed by an @ symbol and the objects direct hash code.
 Printing dog1 directly:
Dog@1dbd16a6

Checkpoint Question 2: Record what your three fields printed as defaults. Which are primitives vs. reference types?
When they are declared but not initialized Java gives them a value. 
Int(primative) = 0; Boolean(Primative) = 0; Object(Reference Type) = null;

Defaults for d1 fields (before any assignment):
name = null
age = 0
breed = null
Printing dog1 directly:
Dog@251a69d7

Defaults for p1 fields (beforeany assignment):
Topping = null
age = 0
type = null
Printing pizza1 directly:
Pizza@6b95977

Checkpoint Question 3: How do constructors change the initialization story compared to Part B?
Concstuctors help us declare the vlue of something and without them it picks the default value instead.
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The constructor Dog() is undefined
        The constructor Dog() is undefined
        The constructor Dog() is undefined

Checkpoint Question 4:What changed between Part A’s printout and Part D’s printout? Why is @Override useful?
Changes the default hashcode to  a custom format/string thats more informative.

Defaults for d1 fields (before any assignment):
name = Unknown
age = 0
breed = Mixed
Printing dog1 directly:
Dog{name='Unknown', age=0, breed='Mixed'}

d2 after default constructor;
Name = Unknown, age = 0, breed = Mixed

d3 after parameterized constructor:
Name = Rex, age = 4, breed = Collie

Printing objects after overriding toString():
d2 =Dog{name='Unknown', age=0, breed='Mixed'}
d3 =Dog{name='Rex', age=4, breed='Collie'}

Defaults for p1 fields (before any assignment):
Topping = Unknown
age = 0
type = Combination

p2 after default constructor;
Topping = Unknown, age = 0, type = Combination

p3 after parameterized constructor;
Topping = Meat Lovers, age = 1, type = Deep Dish
Printing pizza1 directly:
Pizza{topping='Unknown', age=0, type='Combination'}

Printing objects after overriding toString():
p2 = Pizza{topping='Unknown', age=0, type='Combination'}
p3 = Pizza{topping='Meat Lovers', age=1, type='Deep Dish'}
@NotCreasion

Checkpoint Question 5: Why prefer private fields with getters/setters over public fields? Give one example of a rule you could enforce in a setter.

Encapsulation allows for more controlled access and modification.



Final Run: @NotCreasion ➜ /workspaces/testingobjects-NotCreasion (main) $  cd /workspaces/testingobjects-NotCreasion ; /usr/bin/env /usr/local/sdkman/candidates/java/25.0.1-ms/bin/java --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp /home/codespace/.vscode-remote/data/User/workspaceStorage/21d89588-1/redhat.java/jdt_ws/testingobjects-NotCreasion_f9050a6c/bin Main 

Defaults for d1 fields (before any assignment):
name = Unknown
age = 0
breed = Mixed
Printing dog1 directly:
Dog{name='Unknown', age=0, breed='Mixed'}

d2 after default constructor;
Name = Unknown, age = 0, breed = Mixed

d3 after parameterized constructor:
Name = Rex, age = 4, breed = Collie

Printing objects after overriding toString():
d2 =Dog{name='Unknown', age=0, breed='Mixed'}
d3 =Dog{name='Rex', age=4, breed='Collie'}

Mutating via setters after making fields private:
d3 age via getter = 6
d3 now = Dog{name='Maxwell', age=6, breed='Border Collie'}

Defaults for p1 fields (before any assignment):
Topping = Unknown
age = 0
type = Combination

p2 after default constructor;
Topping = Unknown, age = 0, type = Combination

p3 after parameterized constructor;
Topping = Meat Lovers, age = 1, type = Deep Dish
Printing pizza1 directly:
Pizza{topping='Unknown', age=0, type='Combination'}

Printing objects after overriding toString():
p2 = Pizza{topping='Unknown', age=0, type='Combination'}
p3 = Pizza{topping='Meat Lovers', age=1, type='Deep Dish'}

Mutating public fields directly:
p3 age via getter = 3
p3 topping via getter = Veggie Lovers
p3 type via getter = Thin Crust
After mutation, p3 = Pizza{topping='Veggie Lovers', age=3, type='Thin Crust'}