package javaQ2;

import java.util.Scanner;

class ServicesPrice{
	
	private static int HairCut = 200 ;
	private static int  Spa = 400 ;
	private static int Pedicure = 500 ;
	
	public static int getHairCutPrice()
	{
		return HairCut ;
	}
	public static int getSpaPrice()
	{
		return Spa ;
	}
	public static  int getPedicurePrice()
	{
		return Pedicure ;
	}
}

interface MemberShip{
	 int costOfService(String service) ;	
}

class NonMemberShip implements MemberShip{
	
    public  int costOfService(String service)
	{
    	int price ;
		if(service == "HairCut")
		{
			price = ServicesPrice.getHairCutPrice() ;
		}
		else if(service == "Spa")
		{
			price = ServicesPrice.getSpaPrice() ;
		}
		else
		{
			price = ServicesPrice.getPedicurePrice() ;
		}
		return price ;
	}
}

class SilverMemberShip implements  MemberShip{
	
	 public  int costOfService(String service)
		{
	    	int price ;
			if(service == "HairCut")
			{
				price = 0 ;
			}
			else if(service == "Spa")
			{
				price = ServicesPrice.getSpaPrice() * 50 / 100 ;
			}
			else
			{
				price = ServicesPrice.getPedicurePrice() *  50/100  ;
			}
			return price ;
		}
}

class GoldMemberShip implements  MemberShip{
	
	 public  int costOfService(String service)
		{
	    	int price ;
			if(service == "HairCut")
			{
				price =0 ;
			}
			else if(service == "Spa")
			{
				price = 0 ;
			}
			else
			{
				price = ServicesPrice.getPedicurePrice() * 25/100 ;
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
