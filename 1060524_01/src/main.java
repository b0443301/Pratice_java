
public class main {
	public static void main(String args[]) {
		char sumArray[] = new char[100];
		int sum=1;
		
		for (int i = 1; i < 50; i++) {//�P�_�i��
			for (int j = 0; j <100; j++) {// for�j��i�즡�۰ʰ�,�ҥH�[continue�ɷ|�۰ʰ���i�즡
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
		// {//while�j��i�즡���|�۰ʰ�,�ҥH�[continue�ɷ|���|�۰ʰ���i�즡,�]��i++�O�ۤv�[�W�h��,i�û�==1�L���j��
		// test = test * i;
		// i++;
		// }

		System.out.println(sum);
	}
}