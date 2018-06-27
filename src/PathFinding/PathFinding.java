package PathFinding;  
  
public class PathFinding {  

    private int[][] array = {  
            {0, 0, 1, 0, 0, 0, 1, 0},  
            {0, 0, 1, 0, 0, 0, 1, 0},  
            {0, 0, 1, 0, 1, 1, 0, 1},  
            {0, 1, 1, 1, 0, 0, 1, 0},  
            {0, 0, 0, 1, 0, 0, 0, 0},  
            {0, 1, 0, 0, 0, 1, 0, 1},  
            {0, 1, 1, 1, 1, 0, 0, 1},  
            {1, 1, 0, 0, 0, 1, 0, 1},  
            {1, 1, 0, 0, 0, 0, 0, 0}  
  
    };  
    private int maxLine = 8;  
    private int maxRow = 9;  
  
    public static void main(String[] args) {  
        System.out.println(System.currentTimeMillis());  
        new PathFinding().check(0, 0);  
        System.out.println(System.currentTimeMillis());  
    }  
  
    private void check(int i, int j) {  
 
        if (i == maxRow - 1 && j == maxLine - 1) {  
            print();  
            return;  
        }  
  
        if (canMove(i, j, i, j + 1)) {  
            array[i][j] = 5;  
            check(i, j + 1);  
            array[i][j] = 0;  
        }  
 
        if (canMove(i, j, i, j - 1)) {  
            array[i][j] = 5;  
            check(i, j - 1);  
            array[i][j] = 0;  
        }  
  
        if (canMove(i, j, i + 1, j)) {  
            array[i][j] = 5;  
            check(i + 1, j);  
            array[i][j] = 0;  
        }  
  
        if (canMove(i, j, i - 1, j)) {  
            array[i][j] = 5;  
            check(i - 1, j);  
            array[i][j] = 0;  
        }  
    }  
  
    private boolean canMove(int i, int j, int targetI, int targetJ) {  

        if (targetI < 0 || targetJ < 0 || targetI >= maxRow || targetJ >= maxLine) {  
 
            return false;  
        }  
        if (array[targetI][targetJ] == 1) {  
 
            return false;  
        }  
 
        if (array[targetI][targetJ] == 5) {  
  
            return false;  
        }  
  
        return true;  
    }  
  
    private void print() {  
        System.out.println("Answer:");  
        for (int i = 0; i < maxRow; i++) {  
            for (int j = 0; j < maxLine; j++) {  
                System.out.print(array[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}  