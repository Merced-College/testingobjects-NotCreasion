public class Pizza
{
    public String topping;
    public int age;
    public String type;
    public Pizza() //default constructor
    {
        topping = "Unknown";
        age = 0;
        type = "Combination";

    }
    public Pizza(String topping, int age, String type) //parameterized constructor
    {
        this.topping = topping;
        this.age = age;
        this.type = type;
    }
    @Override
    public String toString()
    {
        return "Pizza{topping='" + topping + "', age=" + age + ", type='" + type + "'}";    
    }
    public String getTopping() { return topping; }
    public void setTopping(String topping) { this.topping = topping; }

    public int getAge() { return age; }
    public void setAge(int age) { 
        // simple guard (optional)
        if (age >= 0) this.age = age;       
    }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}