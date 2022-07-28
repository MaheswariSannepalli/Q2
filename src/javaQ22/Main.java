package javaQ22;

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
		String service = null ;
		System.out.println("Select the type of membership  you have : ");
		System.out.println(" 1 - Non Member") ;
		System.out.println(" 2 - Silver Member") ;
		System.out.println(" 3 - Gold Member") ;
		int membership = scan.nextInt();
		
		switch(membership) 
		{
			case 1 :
				ms = new NonMemberShip();
				service = getService();
				break;
			case 2 :
				ms = new SilverMemberShip();
				service = getService();
				break;
			case 3 :
				ms = new GoldMemberShip();
				service = getService();
				break;
			default :
				System.out.println("Sorry,you entered invalid input");
				break;
		}
		if( !ms.equals(null) && service != null )
		{
			int price = ms.costOfService(service) ; 
			System.out.println(service + " cost is "+price) ;
		}
			
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
