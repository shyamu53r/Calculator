public class Calculator{
 static void add(int a,int b){
	System.out.println("Addition: "+(a+b));
}
 static void subtract(int a,int b){
        System.out.println("Subtraction: "+(a-b));
}
static void menu(){
 	System.out.println("Choose your option: ");
  	System.out.println("1. Addition ");
  	System.out.println("2. Subtraction ");
  	System.out.println("3. Multiplication ");
  	System.out.println("4. Division ");
 	System.out.println("5. exit ");
}

 public static void main(String[] args){
 	Scanner sc =  new Scanner(System.in);
  	int a = 15;
 	int b = 10;
 	char ch = sc.next().charAt(0);
 	do{
 	 menu();
	 switch(){
  	    case 1: 
   		add();
		break;
	    case 2:
		subtract();
		break;
  	    case 3:
  		multiply();
  		break;
            case 4:
  		division();
		break;
	    default:
  		break;
}
 	System.out.println("Do you want to continue(Y/y): ");
 	ch = sc.next().charAt(0);
}while(ch=='Y' || ch=='y');
}
}
