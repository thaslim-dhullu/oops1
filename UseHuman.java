package onesoft.course.day10OOPSCompostion;

public class UseHuman {
	public static void main(String[] args) {
	String name = "hanif";
	String initial = "J";
	int age = 31;
	boolean isTall=true;
	Human h = new Human(name,initial,age,isTall);
	System.out.println(h);
}
}
	
class Human {
	private String name;
	private String initial;
	private int age;
	private boolean isTall;
	
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setInitial (String initial) {
		this.initial=initial;
	}
	public String getInitial() {
		return initial;
	}
	public void setAge (int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsTall (boolean isTall) {
		this.isTall=isTall;
	}
	public boolean getIsTall() {
		return isTall;
	}
	public Human(String name,String initial,int age,boolean isTall) {
		this.name=name;
		this.initial=initial;
		this.age = age;
		this.isTall=isTall;
	}
	public String toString() {
		return name+initial+age+isTall;
	}
	}
	
