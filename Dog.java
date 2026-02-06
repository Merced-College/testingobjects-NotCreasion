public class Dog 
{
  public String name;
  public int age;
  public String breed;

  public Dog() //default constructor
  {
    name = "Unknown";
    age = 0;
    breed = "Mixed";
  }
  public Dog(String name, int age, String breed)
  {
    this.name = name;
    this.age = age;
    this.breed = breed;
  }
  @Override
  public String toString()
  {
    return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
  }
  public String getName() { return name; }
public void setName(String name) { this.name = name; }

public int getAge() { return age; }
public void setAge(int age) { 
    // simple guard (optional)
    if (age >= 0) this.age = age; 
}

public String getBreed() { return breed; }
public void setBreed(String breed) { this.breed = breed; }
  //int3entionally empty for now
}