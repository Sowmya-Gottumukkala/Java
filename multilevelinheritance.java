//multilevel inheritance in java
class A
{
 int i,j;
 public void getIJ(int i,int j)
 {
   this.i=i;
   this.j=j;
 }
}
class B extends A
  {
    int k,l;
    public void getKI(int k,int l)
   {
    this.k=k;
    this.l=l;
   }
 }
class C extends B 
{
 int m,n;
 public void getMN(int m,int n)
 {
   this.m=m;
   this.n=n;
 }
}
public void displayAll
{
	System.out.println("i="+i);
	System.out.println("j="+j);
    System.out.println("k="+k);
	System.out.println("l="+l);
	System.out.println("m="+m);
	System.out.println("n="+n);
}
class multilevelTest
{
	public static void main(String args[])
	{
		C ob2=new C();
		ob2.getIJ(10,11);
		ob2.getKI(12,13);
		ob2.getMN(14,15);
		ob2.displayAll();
	}
}

