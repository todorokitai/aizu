import java.util.*;
class ex4{
    public static void main(String[] args){
        Random randam = new Random();
        int count;
        int countHeads = 0;
        int countTails = 0;
        System.out.println("Tossing a coin...");
        for(int i=1;i<=3;i++){
            int num = randam.nextInt(2);
            System.out.print("Rount "+ i + ": ");
            if(num==0){
                System.out.println("Heads");
                countHeads++;
            }
            else if(num==1){
                System.out.println("Tails");
                countTails++;
            }
        }
        System.out.println("Heads: " + countHeads + " Tails: " + countTails);
        if(countHeads>countTails) System.out.println("You won");
        else System.out.println("You lose");
    }
}

