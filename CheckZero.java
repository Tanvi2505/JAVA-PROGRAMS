class CheckZero{
	public static void main(String[] args) {
		int num=240516;
		while(num>0)
		{
			int last= num%10;
			if(last==0)
			{
				break;
			}
			num=num/10;
}
			if(num>0)
			{
				System.out.println("It is duck number");
			}
			else{
				System.out.print("It is not duck number");
			}
		}
	}
