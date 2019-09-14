/**
 * Created by Nkem Ohanenye on 5/2/17.
 *
 * 2d Array test
 */

public class ArrayTest {
    public static void main(String args[]){
        int[][] multi = new int[5][5];
        for(int x = 0; x < multi.length; x++ ){
            for(int y = 0; y < multi[x].length; y++){
                System.out.print(multi[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
