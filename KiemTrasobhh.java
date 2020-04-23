import java.util.Scanner;

public class KiemTrasobhh {
      private static int i;


	public static int tong_uoc(int number) {
    	  int tong_uoc = 0;
    	  for (int i = 1; i <= number / 2; i++) {
    		  if (number % i == 0) {
    			  tong_uoc += i;
    			 
    		  }
    	  }
		return tong_uoc;

    	  
      }
	public static void main(String[] args) {
		System.out.println(" Kiem tra so ban hoan hao!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap so: ");
		int number = sc.nextInt();
		boolean ketqua = false;
		//kiem tra so bhh
		/*/*Số bán hoàn hảo là số tự nhiên bằng tổng tất cả hoặc một số ước của nó
		 * Như vậy, tập số bán hoàn hảo rộng hơn tập số hoàn hảo. Một số số bán hoàn hảo: 6, 12, 18, 20, 24, 28, 30, 36, …
		 */
		if (number < 6) {
			ketqua = false;}
		else if (number % 2 == 1) {
			ketqua = false;}
		else if(tong_uoc(number) >= number) {
			ketqua = true; }
		else {
			ketqua = false;
			}
		
		if (ketqua == true) {
			System.out.println(" la so bhh");
	
		
		}
			
		else {
			System.out.println("khong phai la so bhh");
		}
		
		}
	
}
	
	
	
	
	
	
	
      
      

