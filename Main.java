    public static void main(String []args)
    {

    
    //A1 dog with no constructors
    Dog dog1 = new Dog();
    Dog d1 = new Dog();
    System.out.println("\nDefaults for d1 fields (before any assignment):");
    System.out.println("name = " + d1.name);   // expected: null
    System.out.println("age = " + d1.age);     // expected: 0
    System.out.println("breed = " + d1.breed); // expected: null
    //A2 print the object directly
    System.out.println("Printing dog1 directly:");
    System.out.println(dog1);
    
    Dog d2 = new Dog(); //uses default constructor values
    System.out.println("\nd2 after default constructor;");
    System.out.println("Name = " + d2.name + ", age = " + d2.age + ", breed = " + d2.breed);

    Dog d3 = new Dog("Rex", 4, "Collie"); //uses parameterized constructor
    System.out.println("\nd3 after parameterized constructor:");
    System.out.println("Name = " + d3.name + ", age = " + d3.age + ", breed = " + d3.breed);

    System.out.println("\nPrinting objects after overriding toString():");
    System.out.println("d2 =" + d2);
    System.out.println("d3 =" + d3);

    System.out.println("\nMutating via setters after making fields private:");
    d3.setAge(6);
    d3.setName("Maxwell");
    d3.setBreed("Border Collie");
    System.out.println("d3 age via getter = " + d3.getAge());
    System.out.println("d3 now = " + d3);

    //pizza 1
    Pizza pizza1 = new Pizza();
    Pizza p1 = new Pizza();
    System.out.println("\nDefaults for p1 fields (before any assignment):");
    System.out.println("Topping = " + p1.topping); 
    System.out.println("age = " + p1.age);
    System.out.println("type = " + p1.type);

    Pizza p2= new Pizza();
    System.out.println("\np2 after default constructor;");
    System.out.println("Topping = " + p2.topping + ", age = " + p2.age + ", type = " + p2.type);

    Pizza p3 = new Pizza("Meat Lovers", 1, "Deep Dish");
    System.out.println("\np3 after parameterized constructor;");
    System.out.println("Topping = " + p3.topping + ", age = " + p3.age + ", type = " + p3.type);
    //pizza2
    System.out.println("Printing pizza1 directly:");
    System.out.println(pizza1);

    System.out.println("\nPrinting objects after overriding toString():");
    System.out.println("p2 = " + p2);
    System.out.println("p3 = " + p3);

    System.out.println("\nMutating public fields directly:");
    p3.setAge(3);
    p3.setTopping("Veggie Lovers");
    p3.setType("Thin Crust");
    System.out.println("p3 age via getter = " + p3.getAge());
    System.out.println("p3 topping via getter = " + p3.getTopping());
    System.out.println("p3 type via getter = " + p3.getType());
    System.out.println("After mutation, p3 = " + p3); // uses toString()
    }
/* Checkpoint Question 1: What does printing an object with no toString show, and why?
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

Checkpoint Question 5: What are the benefits of using constructors and overriding toString() in your classes?
*/
