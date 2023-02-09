import java.util.*;
public class Exam_System {

    Scanner sc = new Scanner(System.in);
    HashMap<String,Integer> data = new HashMap<String,Integer>();

    public void login() {
        data.put("SANYUKTA",2882);

        System.out.println("\n\n**WELCOME TO ONLINE EXAM SYSTEM***");
        String UserId;
        int password;
        System.out.println("CONTINUE TO LOGIN");
        System.out.print("Enter UserId : ");
        UserId = sc.next();
        System.out.print("Enter password : ");
        password = sc.nextInt();
        if(data.containsKey(UserId) && data.get(UserId)==password) {
            System.out.println("\nSUCCESSFULLY LOGIN");
            option_menu();
        }
        else {
            System.out.println(" OOPS INVALID LOGIN ");
            System.out.println("Try Again");
            login();
        }
    }
    public void option_menu() {
        int select;
        System.out.println("\nEnter the Option you want to Perform Operation");
        System.out.println("1.Update Profile and Password");
        System.out.println("2.Start  Exam");
        System.out.println("3.Logout");
        select = sc.nextInt();
        switch(select) {
            case 1:
                data=update();
                option_menu();
                break;
            case 2:
                exam_que();
                option_menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Entry");
        }
    }
    public HashMap<String,Integer> update(){
        String uUser;
        int upassword;
        System.out.println("Welcome to Update Profile");
        System.out.println("Enter Username");
        uUser = sc.next();
        if(data.containsKey(uUser)) {
            System.out.println("Enter new Password you to want to Update to your Profile");
            upassword = sc.nextInt();
            data.replace(uUser, upassword);
        }
        else {
            System.out.println("User Doesn't Exist");
        }
        return data;
    }
    public void exam_que() {
        long examtime=System.currentTimeMillis();
        long endtime=examtime+30;
        int ans_count=0;
        int ans,score;
        System.out.println("Start Your Exam");


//Question starts
        while(System.currentTimeMillis()<endtime) {
            System.out.println("You have 30 seconds to answer 5 questions");
            System.out.println("Each Question carries 10 marks"+" "+"-5 for wrong answer");
            System.out.println("\n\nQ.1) How are String represented in memory in C?");
            System.out.println("\n(1) An object of some class"+"\t"+"(2) An array of character"+"\t"+"(3)linkedList of characters"+"\t"+"(4) none");
            System.out.println("Enter Correct Option");
            ans=sc.nextInt();
            System.out.println("Answer Locked...");
            if(ans==2) {
                ans_count++;
            }
            System.out.println("\n\nQ.2)What is the size of the int data type(in bytes)in C?");
            System.out.println("1)  4"+"\t"+"2)  8"+"\t"+"3)  2"+"\t"+"4)  1");
            System.out.println("Enter correct option");
            ans=sc.nextInt();
            System.out.println("Answer Locked...");
            if(ans==1) {
                ans_count++;
            }
            System.out.println("\n\nQ.3)How to declare a double-pointer in C?");
            System.out.println("1) int *val"+"\t"+"(2) int **val"+"\t"+"3)int &val"+"\t"+"4)int *&val");
            System.out.println("Enter correct option");
            ans=sc.nextInt();
            System.out.println("Answer Locked...");
            if(ans==2) {
                ans_count++;
            }
            System.out.println("\n\nQ.4)Which of the following are not standard header files in C?");
            System.out.println("1) stdio.h"+"\t"+"2) stdlib.h"+"\t"+"3) conio.h"+"\t"+"4)none of the above");
            System.out.println("Enter correct option");
            ans=sc.nextInt();
            System.out.println("Answer Locked...");
            if(ans==4) {
                ans_count++;
            }
            System.out.println("\n\nQ.5)Which of the following function is used to open a file in C++?");
            System.out.println("1) fopen"+"\t"+"2) fclose"+"\t"+"3) fseek"+"\t"+"4) fgets");
            System.out.println("Enter correct option");
            ans=sc.nextInt();
            System.out.println("Answer Locked...");
            if(ans==1) {
                ans_count++;
            }
            break;
        }
        System.out.println("You have finished the exam");
        score=ans_count*10-((5-ans_count)*5);
        System.out.println("Your score is..."+" "+score+"/50");
    }

    public static void main (String[] args)
    {
        Exam_System log =new Exam_System();
        log.login();
    }
}