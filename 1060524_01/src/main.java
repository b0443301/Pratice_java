
public class main {
	public static void main(String args[]) {
		char sumArray[] = new char[100];
		int sum=1;
		
		for (int i = 1; i < 50; i++) {//判斷進位
			for (int j = 0; j <100; j++) {// for迴圈進位式自動做,所以加continue時會自動執行進位式
				 sum*= i;
				 if(sum>){
					sumArray[i]=sum/10;
					sumArray[i++]=sum%10;
					
					
				}
			}
		}
		for(int i=1;i<100;i++){
			System.out.println(sumArray[i]);
			}
		
		
		

		// int i = 1;
		// long test = 1;
		// while (i <= 50)
		// {//while迴圈進位式不會自動做,所以加continue時會不會自動執行進位式,因為i++是自己加上去的,i永遠==1無限迴圈
		// test = test * i;
		// i++;
		// }

		System.out.println(sum);
	}
}
