package ex01;

public class Info{
	String name;
	int age;
	Info(String name, int age){
		this.name = name; this.age = age;
	}
	
	public int hashCode() {
		System.out.println("hashCode»£√‚µ ");
		//return super.hashCode();
		return name.hashCode() + age;
	}
	
	public boolean equals(Object o) {
		System.out.println("equals»£√‚µ ");
		//return super.equals(o);
		Info tmp = (Info)o;
		return (this.name.equals(tmp.name) && this.age == tmp.age) ? true : false;
	}
	
	public String toString() {
		return "[" + name + ", "+ age + "]";
	}
}