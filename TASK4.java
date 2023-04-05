//TasK__4
//Online Examination
import java.util.*;

public class TASK4 {
    public static void main(String[] args) {
        int ch=4;
        int choice;
        String name;
        int id=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter user name:");
        name=sc.next();
        System.out.print("Enter roll no:");
        id=sc.nextInt();
        int count=0;
        System.out.println("\t\tWelcome "+name+" to Online Examination");

        do
        {


            System.out.println("1.Start Exam");
            System.out.println("2.View Marks");
            System.out.println("3.Exit Exam");
            System.out.print("Enter your choice:");
            ch=sc.nextInt();
            if(ch==4)
            {
                System.out.println("Thank you for attempting the exam");
                break;
            }
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Select programming language:");
                    System.out.println("1.C \n2.Java \n3.C++");
                    System.out.println("Enter your choice:");
                    int sub=sc.nextInt();
                    System.out.println("There are 5 questions in the examination");


                    System.out.println("Each question consist of 4 option you have to choose correct answer");
                    if(sub==2)
                    {
                        count=0;
                        System.out.println("Q.1.Java is developed by:");

                        System.out.println("1.Dennis Ritchie \n2.James Gosling\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.Java is:");
                        System.out.println("1.Low Level\n2.High Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.Java is:");
                        System.out.println("1.Platform Independent\n2.Platform Depenedent\n3.None of these\n4.Both 1 and 2");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4.Number of primitive data types in Java are?:");
                        System.out.println("1.6\n2.7\n3.8\n4.9");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.Java is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();

                        if(choice==3)
                        {
                            ++count;
                        }
                    }
                    else if(sub==1)
                    {
                        count=0;
                        System.out.println("Q.1.C is developed by:");

                        System.out.println("1.Bjarne Strousrup\n2.Dennis Ritchie\n3.Steve Jobs\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.C is:");
                        System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.4. C is:");
                        System.out.println("1.Procedure Oriented\n2.Object Oriented\n3.Strictly Object Orieneted\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.C is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None of these");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }
                    else
                    {
                        count=0;
                        System.out.println("Q.1.C++ is developed by:");

                        System.out.println("1.Steve Jobs\n2.Dennis Ritchie\n3.Bjarne Strousrup\n4.Ken Thompson");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.2.C++ is:");
                        System.out.println("1.High Level\n2.Low Level\n3.Middle Level\n4.Machine Level");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==3)
                        {
                            ++count;
                        }
                        System.out.println("Q.3.C++ is:");
                        System.out.println("1.Platform Inependent\n2.Platform Depenedent\n3.None\n4.All of the above");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==2)
                        {
                            ++count;
                        }
                        System.out.println("Q.4. C++ is:");
                        System.out.println("1.Object Oriented\n2.Procedure Oriented\n3.Both 1 and 2\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                        System.out.println("Q.5.C++ is:");
                        System.out.println("1.Compiled Language\n2.Interpreted Language\n3.Both Compiled and Interpreted\n4.None");
                        System.out.print("Enter answer:");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            ++count;
                        }
                    }


                    break;
                }
                case 2:
                {
                    System.out.println("Congratulations!  "+name+"  You scored "+count+"marks"+"out of 5");
                }

            }


        }while(true);
    }
}
