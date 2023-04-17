package firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		
		//b.methodPrivate();
		
		System.out.println(b instanceof Base);
		
		
	}

}
