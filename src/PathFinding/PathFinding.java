package PathFinding;  
  
public class PathFinding {  
    /* 定義迷宮 */
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
        //如果抵達迷宮右下角
        if (i == maxRow - 1 && j == maxLine - 1) {  
            print();  
            return;  
        }  
        //向右走
        if (canMove(i, j, i, j + 1)) {  
            array[i][j] = 5;  
            check(i, j + 1);  
            array[i][j] = 0;  
        }  
        //向左走 
        if (canMove(i, j, i, j - 1)) {  
            array[i][j] = 5;  
            check(i, j - 1);  
            array[i][j] = 0;  
        }  
        //向上走  
        if (canMove(i, j, i + 1, j)) {  
            array[i][j] = 5;  
            check(i + 1, j);  
            array[i][j] = 0;  
        }  
        //向下走
        if (canMove(i, j, i - 1, j)) {  
            array[i][j] = 5;  
            check(i - 1, j);  
            array[i][j] = 0;  
        }  
    }  
  
    private boolean canMove(int i, int j, int targetI, int targetJ) {  

        if (targetI < 0 || targetJ < 0 || targetI >= maxRow || targetJ >= maxLine) {  
        //抵達最左或最右邊，失敗
            return false;  
        }  
        if (array[targetI][targetJ] == 1) {  
        //目標為墻，失敗
            return false;  
        }  
        //避免在兩個空格内來回走動 
        if (array[targetI][targetJ] == 5) {  
        //來回走，失敗
            return false;  
        }  
  
        return true;  
    }  
  
    private void print() {  
        System.out.println("Answer:");  //得到結果
        for (int i = 0; i < maxRow; i++) {  
            for (int j = 0; j < maxLine; j++) {  
                System.out.print(array[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}  
