interface Person{
		public void display(String name,int age);

}
class Student implements Person{
	String name;
	int age;
        public void display(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Name="+name+" Age="+age);
	}
} 
class TestAstraction1{
	public static void main(String[] args){
	 Person p;
	 p=new Student();
	 p.display("",22);
	}
}