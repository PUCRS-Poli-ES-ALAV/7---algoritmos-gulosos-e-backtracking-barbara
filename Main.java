import java.util.Scanner;
import java.util.Stack;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">");
        int numberOfQueens = sc.nextInt();
        positionQueens(numberOfQueens);
        sc.close();

    }

    public static void positionQueens(int numberOfQueens){
        Stack<Position> positions = new Stack<>();
        int toBeAddedQueens = numberOfQueens;
        for (int i = 0; i < numberOfQueens; i++) {
            if (toBeAddedQueens==0) {
                    break;
            }
            for (int j = 0; j < numberOfQueens; j++) {
                
            }           }


    }
    public static boolean isOccupied(int i, int j, Stack<Position> positions,int numberOfQueens){
        for (Position position : positions) {
            if (position.i == i) {
                return true;
            }
            if (position.j == j) {
                return true;
            }
            if (position.i==position.j && i==j) {
                return true;
            }
            int nextI = position.i;
            int nextJ = position.j;
            int backI = position.i;
            int backJ = position.j;
            for(int counter = 0; counter < numberOfQueens; counter++){
                if(nextI>numberOfQueens || nextJ> numberOfQueens || backI<0 || backJ<0){
                        break;
                }


            }
        }
    return false;
    }
}