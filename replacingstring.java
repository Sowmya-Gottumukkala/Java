//java program to insert string using string buffer
class SBEx3
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("hello");
		sb.replace(1,3, "java");
		System.out.println(sb);
	}
}