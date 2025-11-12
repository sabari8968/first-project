package HierarchicalInherit;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		Persons p1 = new Persons();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Persons p;
		p = new Persons("Dhruv", "Mumbai");
		if (p instanceof Persons)
			System.out.println("Person Details "+p);
		
		p = new Employees("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employees)
		System.out.println("Employee Details "+p);
		

		p = new Students("Pankaj", "Pune", "FE", 88);
		if (p instanceof Students)
			System.out.println("Student Details "+p);

	}
}
