package Q2;

import java.util.Scanner;

class ServicesPrice{
	
	private static int HairCutPrice = 200 ;
	private static int  SpaPrice = 400 ;
	private static int PedicurePrice = 500 ;
	
	public static int getPrice(String service)
	{
		if(service == "HairCut")
		{
			return HairCutPrice ;
		}
		else if(service == "Spa")
		{
			return SpaPrice ;
		}
		else 
		{
			return PedicurePrice ;
		}
	}
}

interface MemberShip{
	 int costOfService(String service) ;	
}

class NonMemberShip implements MemberShip{
	
    public  int costOfService(String service)
	{
    	int price ;
		price = ServicesPrice.getPrice(service) ;
		return price ;
	}
}

class SilverMemberShip implements  MemberShip{
	
	 public int costOfService(String service)
		{
		    int price = 0 ;
			if(service == "Spa" || service == "Spa")
			{
				price = ServicesPrice.getPrice(service) * 50 / 100 ;
			}
			return price ;
		}
}

class GoldMemberShip implements  MemberShip{
	
	 public  int costOfService(String service)
		{
	    	int price = 0 ;
			if(service == "Pedicure")
			{
				price = ServicesPrice.getPrice(service) * 25/100 ;
			}
			return price ;
		}
}
public class Main {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		MemberShip ms = null ;
		
		System.out.println("Select the type of membership  you have : ");
		System.out.println(" 1 - Non Member") ;
		System.out.println(" 2 - Silver Member") ;
		System.out.println(" 3 - Gold Member") ;
		int membership = scan.nextInt();
		
		switch(membership) 
		{
			case 1 :
				ms = new NonMemberShip();
				availAllServicesForMembership(ms)  ;
				break;
				
			case 2 :
				ms = new SilverMemberShip();
				 availAllServicesForMembership(ms)  ;
				 break;
					
			case 3 :
				ms = new GoldMemberShip();
				 availAllServicesForMembership(ms)  ;
				 break;
				 
			default :
				System.out.println("Sorry,you entered invalid input");
				break;
		}
			
	}
	
   static void availAllServicesForMembership(MemberShip ms) {
	   
	   Scanner scan = new Scanner(System.in);
	   
	   String service = null ;
		int ans;
		int price = 0 ;
		int totalPrice = 0 ;
		
		do{
			service = getService();
			if(service != null) 
			{
				price = ms.costOfService(service) ; 
				totalPrice = totalPrice +price ;
				System.out.println(service + " cost is "+price) ;
			}
			System.out.println("Press 1 to avail more services and 0 to exit . ");
			ans = scan.nextInt();
			}while(ans == 1);
		
		System.out.println("Your total price is : "+totalPrice) ;
	}
   
	static String getService()
	{
    	Scanner scan = new Scanner(System.in);
		System.out.println("Select the type of service  you want to avail : ");
		System.out.println(" 1 - HairCut") ;
		System.out.println(" 2 - Spa") ;
		System.out.println(" 3 - Pedicure") ;
		int service = scan.nextInt();
		switch(service) 
		{
			case 1 :
				return "HairCut"  ; 
			case 2 :
				return "Spa"  ; 
			case 3 :
				return "Pedicure"  ; 
			default :
				System.out.println("Sorry,you entered invalid input");
		}
		return null ;
	}
}