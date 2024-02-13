import java.text.ChoiceFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Atm {
          public static void main(String[] args) {
         Scanner myobj = new Scanner(System.in);
        Scanner myobj1 = new Scanner(System.in);
        Scanner myobj2 = new Scanner(System.in);
        Scanner myobj3 = new Scanner(System.in);
        Scanner myobj4 = new Scanner(System.in);
        Scanner myobj5 = new Scanner(System.in);
        Scanner myobj6 = new Scanner(System.in);
         String name;
         String time;
         String Emailid;
         int Account;
         int pin;
         int Choice;
         int Money;
         int Add;
         int Change_pin;
         int Old_Pin;
         int New_pin;        
// enter name//

System.out.println("WELCOM TO ICIC BANK OF INDIA");
System.out.println("PLEASE ENTER YOUR NAME");
// input from the user
          name = myobj.nextLine();
//printing system date
          System.out.println(new Date());
          System.out.println("ENTER EmaiL id");
           Emailid = myobj.nextLine();
           JOptionPane.showMessageDialog(null,"Email is scuessfully enterd","Email",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("ENTER VALUE BETWEEN 50");
            pin = myobj.nextInt();
 // if statement //DEPOSIT MONEY
            if (pin <=50) {
              System.out.println("WELCOM");
            }
            System.out.println("DEPOSIT your ammount");
            System.out.println("maxum ammount TO DEPOSIT 10,0000"); 
             Account = myobj.nextInt();
             if (Account<=100000){
                    System.out.println("DEPOSITE MONEY SUCESSFULLY");
                                 System.out.println("ENTER YOUR CHOICE 1:CHECK AMMOUNT 2:WITHDRAW,3: ADD MONEY");
             Choice = myobj.nextInt();
// switch case statement start            
             switch(Choice) {
                    case 1:
                    System.out.println("YOUR BLANCE "+ Account);
                    System.out.println("THANK YOU VISIT AGAIN");
                    break;
                    case 2:
                    System.out.println("PLEASE WITHDRAW YOUR AMOUNT");
                    System.out.println("ENTER YOUR AMMOUNT");
                    Money = myobj.nextInt();
                    JOptionPane.showConfirmDialog(null,"DO YOU WANT TO GENERATE RECEPT","Recept",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("YOUR MONEY TRANSFER PLEASE WAIT    " + Money);
                    float Blance = Math.abs(Money-Account);
                    System.out.println("REMAINING AMMOUNT  "+ Blance);  
                    System.out.println("THANK YOU VISIT AGAIN");    
                    break;
                    case 3:
                    System.out.println("ENTER AMMOUNT TO ADD");
                    Add = myobj.nextInt();
                    System.out.println("AMMOUNT ADDED SUCESSFULLY");
                    int Addingamount = Math.abs(Add+Account);
                    System.out.println("AMMOUNT ADDED SUCESSFULLY " + Addingamount );
                    System.out.println("THANK YOU VISIT AGAIN");
                    break;                                                    
            }
             // SWITCH CASE 2
             System.out.println("1:DO YOU WANT TO CHANGE PIN 2:FEEDBACK");
             Change_pin = myobj.nextInt();
// switch case statement start            
             switch(Change_pin) {
             case 1:
// if condaction
         String User ="YES";
         System.out.println("PLEASE ENTER YES OR NO");
         User = myobj1.nextLine();
         if(User.equalsIgnoreCase("YES")){
          System.out.println(" ENTER YOUR OLD PIN");
         Old_Pin =myobj2.nextInt();
         System.out.println(Old_Pin);
         System.out.println("PLEASE ENTER NEW PIN");
         New_pin =myobj3.nextInt();
         }else if(User.equalsIgnoreCase("NO")) {
           System.out.println("EXIT");
          
         }
         break;
        case 2:
        System.out.println(" PLEASE ENTER YOUR FEEDBACK");
        JOptionPane.showInputDialog(null,"Feedback","feedbackbox ",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("THANK YOU VISIT AGAIN");
        

        }
        //switch case end 
          
          }         
          else{
                    
                  JOptionPane.showMessageDialog(null,"AMOUNT FAIL","ERROR3",JOptionPane.ERROR_MESSAGE);
                  System.out.println("YOU DEPOSIT MAXUMMUM AMOUNT");
                  
          }
         
        
        
        }
   

                          
}