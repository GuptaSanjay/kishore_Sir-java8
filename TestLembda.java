interface Calculator{
	 int operations(int a, int b);
}
class TestLembda{
	public static void main(String[] args){
		Calculator c=new Calculator(){
			public int operations(int a,int b){
				return(a>b)?a:b;
			}
		};
		System.out.println("Result="+c.operations(62,30));
	}
}