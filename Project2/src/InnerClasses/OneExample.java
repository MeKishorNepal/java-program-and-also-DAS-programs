package InnerClasses;
class outerclass{
	int x=4;
	class innerclass{
		int y=6;
	}
}
public class OneExample {

	public static  void main(String args[]) {
		outerclass outer=new outerclass();
		outerclass.innerclass inner=outer.new innerclass();
		System.out.println(outer.x+inner.y);
	}
}
