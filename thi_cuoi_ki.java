package assignment_final;

import java.util.Scanner;

public class thi_cuoi_ki {
	
	public static void main(String[] args) {
		String x, hoten, diachi, sdt;
		int CSM, CSC, TT,tien,tien1,tien2,tien3;
		boolean a, b, c;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten");
		hoten = sc.nextLine();
		System.out.println("Nhap dia chi");
		diachi = sc.nextLine();
		System.out.println("Nhap so dien thoai");
		sdt = sc.nextLine();
		System.out.println("Nhap chi so moi");
		CSM = sc.nextInt();
		System.out.println("Nhap chi so cu");
		CSC = sc.nextInt();
        a=(hoten.matches("[a-z][A-Z][/s].*"));
        b=(diachi.matches("[a-z][A-Z][0-9][/s].*"));
        //error
        c=(sdt.matches("[]"));
        //error
		if(a==true) {
			if(b==true) {
				if(c==true) {
	    System.out.println("Ho ten KH: " + hoten);
	    System.out.println("Dia chi KH: " +diachi);
		System.out.println("So dien thoai lien lac: "+sdt);
		//still nothing
			       TT = CSM - CSC;
			     if(TT >= 0) {
			       if(TT <= 30) {
			    	     tien = TT*1500;
			    	     System.out.println("Dien muc tieu thu dien loai I.");
			    	     System.out.print("Tien dien thang nay:"+ tien);
			    	     }
			       else if(TT<=50) {
			    	     tien = TT*1800;
			    	     System.out.println("Dien muc tieu thu dien loai II.");
			    	     System.out.print("Tien dien thang nay:"+ tien);
			    	     }
			       else if (TT<=100) {
		    	     tien = TT* 2000;
		    	     System.out.println("Dien muc tieu thu dien loai III.");
		    	     System.out.print("Tien dien thang nay:"+ tien);
		    	     }
			       else if(TT <= 150) {
			    	     tien = TT* 2500;
			    	     tien1= tien*13/10;
			    	     if (tien > 300000) {
			    	         System.out.println("Dien muc tieu thu dien loai IV.");
			    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien1);
			    	         }
			    	     else {
			    	     System.out.println("Dien muc tieu thu dien loai IV.");
		        	     System.out.print("Tien dien thang nay:"+ tien);
		        	     }
			    	 }
			       else {
			    	     tien = TT*3500;
			    	     tien1= TT*13/10;
			    	     tien2= TT*18/10;
			    	     tien3=TT*2;
			    	     if(tien > 300000) {
			    	         System.out.println("Dien muc tieu thu dien loai V.");
			    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien1);
			    	     }
			    	     else if(tien > 500000) {
			    	         System.out.println("Dien muc tieu thu dien loai V.");
			    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien2);
			    	     }
			    	     else {
			    	         System.out.println("Dien muc tieu thu dien loai V.");
			    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien3);
			    	    }}}
		        else {
			System.out.println("Chi so moi phai lon hon chi so cu. Vui long nhap lai");
		        }}
				// nothing is nothing
		    else {
					System.out.println("Ban da nhap sai so dien thoai. Vui long khoi dong lai chuong trinh va nhap lai");
			}
    }
			else {
				System.out.println("Ban da nhap sai dia chi. Vui long khoi dong lai chuong trinh va nhap lai");
			}
    }
		    else {
			System.out.println("Ban da nhap sai ho va ten. Vui long khoi dong lai chuong trinh va nhap lai");
		    }
    }
        catch(java.util.InputMismatchException exception) {
	          System.out.println("Ban da nhap sai cu phap. Vui long khoi dong lai chuong trinh va nhap lai");
        }
		catch(java.util.regex.PatternSyntaxException exception) {
			System.out.println("Chuong trinh vua bi loi tuy nhien chung toi da sua no. Vui long nhap lai thong tin de tiep tuc");
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap ho va ten");
			hoten = sc.nextLine();
			System.out.println("Nhap dia chi");
			diachi = sc.nextLine();
			System.out.println("Nhap so dien thoai");
			sdt = sc.nextLine();
			System.out.println("Nhap chi so moi");
			CSM = sc.nextInt();
			System.out.println("Nhap chi so cu");
			CSC = sc.nextInt();
	        a=(hoten.matches("[a-zA-Z/s].*"));
	        b=(diachi.matches("[a-zA-Z0-9/s].*"));
	        c=(sdt.matches("[0]{1}[0-9]{9}"));
	        //space
			if(a==true) {
				if(b==true) {
					if(c==true) {
		    System.out.println("Ho ten KH: " + hoten);
		    System.out.println("Dia chi KH: " +diachi);
			System.out.println("So dien thoai lien lac: "+sdt);
				       TT = CSM - CSC;
				     if(TT >= 0) {
				       if(TT <= 30) {
				    	     tien = TT*1500;
				    	     System.out.println("Dien muc tieu thu dien loai I.");
				    	     System.out.print("Tien dien thang nay:"+ tien);
				    	     }
				       else if(TT<=50) {
				    	     tien = TT*1800;
				    	     System.out.println("Dien muc tieu thu dien loai II.");
				    	     System.out.print("Tien dien thang nay:"+ tien);
				    	     }
				       else if (TT<=100) {
			    	     tien = TT* 2000;
			    	     System.out.println("Dien muc tieu thu dien loai III.");
			    	     System.out.print("Tien dien thang nay:"+ tien);
			    	     }
				       else if(TT <= 150) {
				    	     tien = TT* 2500;
				    	     tien1= tien*13/10;
				    	     if (tien > 300000) {
				    	         System.out.println("Dien muc tieu thu dien loai IV.");
				    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien1);
				    	         }
				    	     else {
				    	     System.out.println("Dien muc tieu thu dien loai IV.");
			        	     System.out.print("Tien dien thang nay:"+ tien);
			        	     }
				    	 }
				       else {
				    	     tien = TT*3500;
				    	     tien1= TT*13/10;
				    	     tien2= TT*18/10;
				    	     tien3=TT*2;
				    	     if(tien > 300000) {
				    	         System.out.println("Dien muc tieu thu dien loai V.");
				    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien1);
				    	     }
				    	     else if(tien > 500000) {
				    	         System.out.println("Dien muc tieu thu dien loai V.");
				    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien2);
				    	     }
				    	     else {
				    	         System.out.println("Dien muc tieu thu dien loai V.");
				    	         System.out.print("Tien dien thang nay:"+ tien +"+ phu thu" + tien3);
				    	    }}}
			        else {
				System.out.println("Chi so moi phai lon hon chi so cu. Vui long nhap lai");
			        }}
					// nothing is nothing
			    else {
						System.out.println("Ban da nhap sai so dien thoai. Vui long khoi dong lai chuong trinh va nhap lai");
				}
	    }
				else {
					System.out.println("Ban da nhap sai dia chi. Vui long khoi dong lai chuong trinh va nhap lai");
				}
	    }
			    else {
				System.out.println("Ban da nhap sai ho va ten. Vui long khoi dong lai chuong trinh va nhap lai");
			    }
		}
    }
}
