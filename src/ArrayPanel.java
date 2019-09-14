import javax.swing.*;

/**
 * Created by Nkem Ohanenye on 5/2/17.
 *
 * Old trying to add grid to panel
 */

public class ArrayPanel {
    public static void main(String args[]){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Array Panel");
        frame.setResizable(false);
        JPanel[][] grid = new JPanel[5][5];
        for (int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[x].length; y++){
                //frame.panel.add(grid);
            }
        }
        frame.setVisible(true);
    }
}
