import java.util.*;
class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rand = r.nextInt(101);
        System.out.println("guess the number between 0 to 100");
        System.out.println(" enter  n to exit");
        while(true) {
            String str = sc.next();
            if(str.equalsIgnoreCase("n")) {
                break;
            }
            try {
                int num = Integer.parseInt(str);
                if(num<rand){
                    System.out.println("greater!!");
            
                }else if(num>rand) {
                    System.out.println("smaller!!");
                }else {
                    System.out.println("right guess you won!!");
                    break;
                }
            }catch(NumberFormatException e) {
                System.out.println("either enter number or press *n* to exit");
            }
        }sc.close(); 
    }
}