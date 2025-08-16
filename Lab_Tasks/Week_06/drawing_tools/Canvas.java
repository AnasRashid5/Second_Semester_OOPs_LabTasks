package drawing_tools;

import geometry.Point;               // Point class
import java.awt.Graphics;            // For drawing shapes (lines, rectangles, etc.)
import java.util.ArrayList;          // Dynamic array for storing lines
import java.util.List;               // Interface for ArrayList
import javax.swing.JPanel;           // Jframe.Base class for creating a drawing area

public class Canvas extends JPanel {

    private List<Line> lines = new ArrayList<>();

    public void addLine(Point p1, Point p2) {
        lines.add(new Line(p1, p2));
        System.out.println("Adding line from " + p1 + " to " + p2);
        repaint(); // To trigger paintComponent and draw immediately
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Line line : lines) {
            g.drawLine((int) line.start.getX(), (int) line.start.getY(),
                    (int) line.end.getX(), (int) line.end.getY());
        }
    }
}
