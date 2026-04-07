import javax.swing.*;
import java.awt.*;

public class SimpleShapes extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Тіктөртбұрыш
        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 80, 40);

        // Шеңбер (oval)
        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 40);

        // Түзу сызық
        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 100, 190);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Shapes");
        SimpleShapes panel = new SimpleShapes();

        frame.add(panel);
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}