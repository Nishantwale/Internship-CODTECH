import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueChoice = true;

        while (continueChoice) {
        System.out.println("Welcome To The Simple Calulator");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multilication");
        System.out.println("4. Division");
        System.out.print("Enter Your Choice (1/2/3/4) : ");
        int choice = sc.nextInt();
        double result=0;

        System.out.print("Enter The First Number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();
        

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The Addition of "+num1+" and "+num2+" is "+result);
                break;
            
            case 2:
                result = num1 - num2;    
                System.out.println("The Substraction of "+num1+" and "+num2+" is "+result);
                break;

            case 3:
                result = num1 * num2;    
                System.out.println("The Multiplication of "+num1+" and "+num2+" is "+result);
                break;

            case 4:
                if(num2 != 0){
                    result = num1/num2;
                    System.out.println("The Division of "+num1+" and "+num2+" is "+result);
                }else{
                    System.out.println("Cant Divide By Zero");
                }
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
        System.out.print("Do You want to Continue (y/n) : ");
        String continuecal = sc.next();
        if(!continuecal.equalsIgnoreCase("y")){
            continueChoice = false;
        }
        }

       

        System.out.println("Thank You for Using the Simple Calculator! Goodbye");
        
        sc.close();
    }    
}