
class privateConstructor {
	
	private int a;
	private privateConstructor() {
		a=10;
	}
class derived extends privateConstructor{
	
	derived(){
		
		super();
		System.out.println(a);
		//Super should be the first line inside the constructor
	}
}


	public static void main(String[] args) {
	
		privateConstructor obj=new privateConstructor();
		System.out.println(obj.a);
				
	}

}
