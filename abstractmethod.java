class person
{
  String name;
  int age;
  public void accept()
  {
  
  };
  public void display()
  {
  
  };
}
class student extends person
{
  int marks;
  float fee;
  public void accept()
  {
    super.name="raj";
	super.age=52;
	this.marks=90;
	this.fee=3500.56f;
  }
  public void display()
  {
   System.out.println("student name="+name);
   System.out.println("student age="+age);
   System.out.println("student marks="+marks);
   System.out.println("student fee="+fee);
  }
}
class employee extends person
{
	 String desg;
	 float sal;
	 public void accept()
	 {
		 super.name="rehman";
		 super.age=30;
		 this.desg="professor";
		 this.sal=65000.0f;
	 }
	public void display()
	{
		System.out.println("employee name="+name);
        System.out.println("employee age="+age);
        System.out.println("employee designation="+desg);
        System.out.println("employee salary="+sal);
	}
}
class abstractTest
{
	public static void main(String args[])
	{
		 person p;
		 if(args.length>=1)
		     p=new student();
		 else
		 {
			  p=new employee();
		      p.accept();
		      p.display();
		 }
	}
}
		
		 
   
 