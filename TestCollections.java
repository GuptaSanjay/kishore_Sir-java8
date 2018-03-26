class Employee{
	int id;
	String name;
	double salary;
	Employee(){};
	Employee(int id,String name, double salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(double salary){
	this.salary=salary;
	}
	public int getId(){
		return id;	
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}

}