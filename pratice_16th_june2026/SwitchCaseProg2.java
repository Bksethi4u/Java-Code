package pratice_16th_june2026;

import java.util.Scanner;

public class SwitchCaseProg2 {

	//static Scanner s1;
    public static void main(String[] args) 
    {
           Scanner  s1=new Scanner(System.in);
            System.out.println("Please enter which case u wish to execute?");
            int whichCase=s1.nextInt();
            switch(whichCase)
            {
                    case 1:
                            System.out.println("Chrome browser Launch");
                    //                break;
                            
                    case 2:        
                            System.out.println("Firefox browser Launch");
                    //        break;
                            
                    case 3:
                            System.out.println("Edge browser Launch");
                    //        break;
                            
                    case 4:        
                            System.out.println("Safari browser Launch");
                    //        break;
            //        default:
            //                System.out.println("Sorry but your options seems Wrong");
            }
            s1.close();

	}

}
