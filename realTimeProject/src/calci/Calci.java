package calci;

interface Calci1 {
	String add(int a,int b); //public abstract Sring add(int a,int b);
	String sub(int a,int b); //public abstract Sring sub(int a,int b);
	String mul(int a,int b); //public abstract Sring mul(int a,int b);
	String div(int a,int b); //public abstract Sring div(int a,int b);
	String dispErrorMessage();
}
class CalciImp implements Calci1{
	@Override
	public String add(int a,int b) {
		int sum= a+b;
		return "Sum of "+a+" + "+b+" is=> "+sum;
	}	
	@Override
	public String sub(int a,int b)	{
		int sub= a+b;
		return "sub of "+a+" - "+b+" is=> "+sub;
	}
	@Override
	public String mul(int a,int b)	{
		int mul= a+b;
		return "Mul of "+a+" * "+b+" is=> "+mul;
	}
	@Override
	public String div(int a,int b){
		if(b!=0) {
			int div= a+b;
			return "div of "+a+" / "+b+" is=> "+div;
		}
		else
			return "Can't devide with 0";
	}
	@Override
	public String dispErrorMessage() {
		return "i m exception, please enter correect choice!!!...";
	}
}


