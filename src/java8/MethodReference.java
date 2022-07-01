package java8;

/*interface Engine {
	abstract public void speed();
}

class Car {
	public static void average() {
		System.out.println("The averge of the car is very Good");
	}
}

public class MethodReference {
	public static void main(String[] args) {
// Using Lamda epression
		Engine obj = () -> System.out.println("Speed is Good");
		obj.speed();
// Lamda replaced with static method Reference
		Engine obj1 = Car::average;
		obj1.speed();
	}
}*/


/*interface Engine {
	abstract public void speed();
}

class Car {
	public void wheel() {
		System.out.println("Car has wheels of MRF company");
	}
}

public class MethodReference {
	public static void main(String[] args) {
// Using Lamda epression
		Engine obj = () -> System.out.println("Speed is Good");
		obj.speed();
// Lamda replaced with instance method Reference
		Car car = new Car();
		Engine obj4 = car::wheel;
	}
}*/

interface Engine
{
abstract public void speed();
}
class Car
{
public Car()
{
System.out.println("This is constructor of Car");
}
}
public class MethodReference
{
public static void main(String[] args)
{
// Using Lamda epression
Engine obj = ()->System.out.println("Speed is Good");
obj.speed();
// Lamda replaced with instance method Reference
Engine obj4=Car::new;

obj4.speed();
}
}