package objectsComparator;

import objectsComparator.sheffield.EasyReader;

/**
 * 
 * @author peterwong
 *这个class里包含两个存在包含关系的classes
 *Person和PC
 *在这个class中存在主方法调用了ObjectsComparator
 *用于进行比较
 */

public class Person {
	private String name;
	private String sexy;
	private int age;
	private PC pc;
	private EasyReader keyboard;
	public Person(String name, String sexy, int age, PC pc){
		this.name = name;
		this.sexy = sexy;
		this.age = age;
		this.pc = pc;
	}
	public String getName() {
		return this.name;
	}
	public String getSexy() {
		return this.sexy;
	}
	public int getAge() {
		return this.age;
	}
	public PC getPC() {
		return this.pc;
	}
	
	/*
	 *接下来写一个toString（）功能
	 *里面包含if else判断需要return什么属性
	 *下面上代码：
	 */
	public String toString() {
		keyboard = new EasyReader();
		String a = keyboard.readString("What do you wanna know about this person? please select(name,sexy,age,pc)");
		if (a.equals("name")) {
			return this.name;
		}
		if (a.equals("sexy")) {
			return this.sexy;
		}
		if (a.equals("age")) {
			return "This person's age is"+this.age;
		}
		else if (a.equals("pc")) {
			/*
			 * 注意：此处PC类型的对象pc并不需要被实例化！
			 * 下面上代码：
			 */
			return "the brand of this pc is "+pc.getBrand()+" and the size of it is"+pc.getScreenSize();
		}
		return "Please try again!";
	}
	
	/*
	 * 下面写进行比较器的主方法：
	 * 对象比较器写在另一个类中!
	 * 下面上代码:
	 */
	public static void main(String[] args) {
		/*
		 * 先实例化两个PC对象
		 * 下面上代码:
		 */
		PC peterPC = new PC("Dell", 27);
		PC frankPC = new PC("Mi", 13);
		/*
		 * 再实例化两个Person对象用于测试
		 * 下面上代码:
		 */
		Person peter = new Person("Peter","male", 21, peterPC);
		Person frank = new Person("Frank", "male", 17, frankPC);
		Person frankA = new Person("Frank", "female", 17, frankPC);
		/*
		 * 实例化PersonClassComparator
		 * 下面上代码:
		 */
		PersonClassComparator test = new PersonClassComparator(peter);
		PersonClassComparator test2 = new PersonClassComparator(frank);
		System.out.println(test.compareTo(frank));
		System.out.println(test2.compareTo(frankA));
		

		
	}
}
/*
 * 接下来直接在同一个文件里多写一个class。
 * 下面上代码：
 * 
 */
class PC {
	private String brand;
	private int screenSize;
	public PC(String brand, int screenSize) {
		this.brand = brand;
		this.screenSize = screenSize;
	}
	public String getBrand() {
		return this.brand;
	}
	public int getScreenSize() {
		return this.screenSize;
	}
}
