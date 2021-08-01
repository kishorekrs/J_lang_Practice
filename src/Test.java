class Test   
{  
	int id, age;
	String name, city;
	
	public Test(int age) {
		this.age = age;
	}
	public Test(int id, int age) {
		this(age);
		this.id = id;
	}
	
	public Test(int id, int age, String name, String city) {
		this(id,age);
		this.name = name;
		this.city = city;
				
	}
	
	public static void main(String[] args) {
		Test t = new Test(101,25,"KK","Chennai");
		System.out.println("Id: "+t.id+" age: "+t.age+" Name: "+t.name+" city: "+t.city);
	}
}  