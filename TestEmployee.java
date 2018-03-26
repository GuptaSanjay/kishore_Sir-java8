import java.util.*;

public class TestEmployee{
	public static void main(String[] args){
		List<Employee> l=new ArrayList<>();
		for(int i=100;i<=105;i++)
		{
			Employee e=new Employee(i,"Name"+i,500*i);
			l.add(e);
		}
		Iterator<Employee> i=l.iterator();
		System.out.println("Size= "+l.size());
		
		while(i.hasNext())
		{
			Employee e=i.next();
			System.out.println(e.getName());
			if(e.getId()==102)
			{
				i.remove();
			}
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println("Size= "+l.size());
	}	
}