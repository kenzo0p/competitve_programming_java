import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        // mid => 2, 2       1, 4 -> 2,1 2,2
        int row = -1;
        int col = -1;
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }

        if(row == -1 && col == -1){
            System.out.println(0);
            return;
        }
        int op = 0;
        while(row !=2){
            if(row < 2){
                row++;

            }else {
                row--;
            }
            op++;
        }while(col !=2){
            if(col < 2){
                col++;

            }else {
                col--;
            }
            op++;
        }
        System.out.println(op);
    }
}



