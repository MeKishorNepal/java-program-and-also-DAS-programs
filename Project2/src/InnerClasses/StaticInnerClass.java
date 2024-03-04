package InnerClasses;
class Outerclass{
	int x=5;
	static class Innerclass{
		int y=9;
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		Outerclass.Innerclass inner=new Outerclass.Innerclass();
		System.out.println(inner.y);
		
		

	}

}
