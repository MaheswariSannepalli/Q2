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

interface Saloon{
	int nonMembershipDiscount(String service);
	int silverMembershipDiscount(String service);
	int goldMembershipDiscount(String service);
}

class Saloon1 implements Saloon{
	
	private static int HairCutDiscount_nonMember = 0 ;
	private static int  SpaDiscount_nonMember = 0 ;
	private static int PedicureDiscount_nonMember = 0 ;
	private static int HairCutDiscount_silverMember = 100 ;
	private static int  SpaDiscount_silverMember = 0 ;
	private static int PedicureDiscount_silverMember = 0 ;
	private static int HairCutDiscount_goldMember = 100 ;
	private static int  SpaDiscount_goldMember = 50 ;
	private static int PedicureDiscount_goldMember = 50 ;
	
	public int nonMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_nonMember ;
		case "Spa":
			return SpaDiscount_nonMember ;
		case "Pedicure":
			return PedicureDiscount_nonMember ;
		default :
			return 0 ;
		}
	}
	public int silverMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_silverMember ;
		case "Spa":
			return  SpaDiscount_silverMember ;
		case "Pedicure":
			return PedicureDiscount_silverMember ;
		default :
			return 0 ;
		}
	}
	public int goldMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_goldMember ;
		case "Spa":
			return SpaDiscount_goldMember ;
		case "Pedicure":
			return PedicureDiscount_goldMember ;
		default :
			return 0 ;
		}
	}
}
class Saloon2 implements Saloon{
	
	private static int HairCutDiscount_nonMember = 0 ;
	private static int  SpaDiscount_nonMember = 0 ;
	private static int PedicureDiscount_nonMember = 0 ;
	private static int HairCutDiscount_silverMember = 100 ;
	private static int  SpaDiscount_silverMember = 20 ;
	private static int PedicureDiscount_silverMember = 30 ;
	private static int HairCutDiscount_goldMember = 100 ;
	private static int  SpaDiscount_goldMember = 60 ;
	private static int PedicureDiscount_goldMember = 70 ;
	
	public int nonMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_nonMember ;
		case "Spa":
			return SpaDiscount_nonMember ;
		case "Pedicure":
			return PedicureDiscount_nonMember ;
		default :
			return 0 ;
		}
	}
	public int silverMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_silverMember ;
		case "Spa":
			return  SpaDiscount_silverMember ;
		case "Pedicure":
			return PedicureDiscount_silverMember ;
		default :
			return 0 ;
		}
	}
	public int goldMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_goldMember ;
		case "Spa":
			return SpaDiscount_goldMember ;
		case "Pedicure":
			return PedicureDiscount_goldMember ;
		default :
			return 0 ;
		}
	}
}
class Saloon3 implements Saloon{
	
	private static int HairCutDiscount_nonMember = 0 ;
	private static int  SpaDiscount_nonMember = 0 ;
	private static int PedicureDiscount_nonMember = 0 ;
	private static int HairCutDiscount_silverMember = 100 ;
	private static int  SpaDiscount_silverMember = 50 ;
	private static int PedicureDiscount_silverMember = 20 ;
	private static int HairCutDiscount_goldMember = 100 ;
	private static int  SpaDiscount_goldMember = 60 ;
	private static int PedicureDiscount_goldMember = 50 ;
	
	public int nonMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_nonMember ;
		case "Spa":
			return SpaDiscount_nonMember ;
		case "Pedicure":
			return PedicureDiscount_nonMember ;
		default :
			return 0 ;
		}
	}
	public int silverMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_silverMember ;
		case "Spa":
			return  SpaDiscount_silverMember ;
		case "Pedicure":
			return PedicureDiscount_silverMember ;
		default :
			return 0 ;
		}
	}
	public int goldMembershipDiscount(String service)
	{
		switch(service) {
		case "HairCut":
			return HairCutDiscount_goldMember ;
		case "Spa":
			return SpaDiscount_goldMember ;
		case "Pedicure":
			return PedicureDiscount_goldMember ;
		default :
			return 0 ;
		}
	}
}

interface MemberShip{
	 int costOfService(String service,Saloon s) ;	
}

class NonMemberShip implements MemberShip{
	
    public  int costOfService(String service,Saloon s)
	{
    	int price ,discount ;
		price = ServicesPrice.getPrice(service) ;
		discount = s.nonMembershipDiscount(service);
		return price - (price*discount)/100 ;
	}
}

class SilverMemberShip implements  MemberShip{
	
	 public int costOfService(String service,Saloon s)
		{
		 int price ,discount ;
		 price = ServicesPrice.getPrice(service) ;
		 discount = s.silverMembershipDiscount(service);
		  return price - (price*discount)/100 ;
		}
}

class GoldMemberShip implements  MemberShip{
	
	 public  int costOfService(String service,Saloon s)
		{
		 int price ,discount ;
		 price = ServicesPrice.getPrice(service) ;
		 discount = s.goldMembershipDiscount(service);
		  return price - (price*discount)/100 ;
		}
}
public class Main {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		Saloon s = null ;
		
		System.out.println("Select Saloon : ");
		System.out.println(" 1 - Saloon 1") ;
		System.out.println(" 2 - Saloon 2") ;
		System.out.println(" 3 - Saloon 3") ;
		int saloon = scan.nextInt();
		
		switch(saloon) 
		{
			case 1 :
				s = new Saloon1();
				MembershipInTheSaloon(s)  ;
				break;
				
			case 2 :
				s = new  Saloon2();
				MembershipInTheSaloon(s)  ;
				 break;
					
			case 3 :
				s = new  Saloon3();
				MembershipInTheSaloon(s)  ;
				 break;
				 
			default :
				System.out.println("Sorry,you entered invalid input");
				break;
		}
			
	}
	static void MembershipInTheSaloon(Saloon s)
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
				availAllServicesForMembership(ms,s)  ;
				break;
				
			case 2 :
				ms = new SilverMemberShip();
				 availAllServicesForMembership(ms,s)  ;
				 break;
					
			case 3 :
				ms = new GoldMemberShip();
				 availAllServicesForMembership(ms,s)  ;
				 break;
				 
			default :
				System.out.println("Sorry,you entered invalid input");
				break;
		}
	}
   static void availAllServicesForMembership(MemberShip ms,Saloon s) {
	   
	   Scanner scan = new Scanner(System.in);
	   
	   String service = null ;
		int ans;
		int price = 0 ;
		int totalPrice = 0 ;
		
		do{
			service = getService();
			if(service != null) 
			{
				price = ms.costOfService(service,s) ; 
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
