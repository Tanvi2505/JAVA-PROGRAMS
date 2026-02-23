class RangeOfPronic{
	public static void main(String[] args) {
		int start=100;
		int end=1000;
		for(int i=0;i*(i+1)<=end;i++)
		{
          if(i*(i+1)>=start)
          {
          	System.out.println(i*(i+1));
          }
		}
	}
}