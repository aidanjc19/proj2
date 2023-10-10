import java.awt.Graphics;
import java.awt.Color;

public class GraphicsProject {
    public static final int DRAW_PAN_HEIGHT = 400;
    public static final int DRAW_PAN_WIDTH = 400;
    public static final int Y_CENTER = DRAW_PAN_HEIGHT / 2;
    public static final int X_CENTER = DRAW_PAN_WIDTH / 2;
    public static final double LINE_INCREMENT = 10;
    public static final Color BG_COLOR = Color.BLACK;
    public static final Color START_SHAPE_COLOR = Color.MAGENTA;
    public static final Color END_SHAPE_COLOR = Color.ORANGE;

    public static final double RADIUS = 200;


    public static void main(String[] args) {
        drawParabolicLines();
    }

    public static void drawParabolicLines() {
        DrawingPanel drawPan = new DrawingPanel(DRAW_PAN_WIDTH, DRAW_PAN_HEIGHT);
        Graphics gR = drawPan.getGraphics();
        gR.setColor(BG_COLOR);
        gR.fillRect(0, 0, 400, 400);
        gR.setColor(START_SHAPE_COLOR);
        for (double currentIncrement = 0; currentIncrement <= RADIUS; currentIncrement += LINE_INCREMENT) {
            double angleIntervalRad = Math.PI/4;
            gR.drawLine(getXCoordinateStart(0, currentIncrement), getYCoordinateStart(0, currentIncrement),
                        getXCoordinateEnd(Math.PI/4, currentIncrement), getYCoordinateEnd(Math.PI/4, currentIncrement));
            gR.drawLine(getXCoordinateStart(Math.PI/4, currentIncrement), getYCoordinateStart(Math.PI/4, currentIncrement),
                        getXCoordinateEnd(2 * Math.PI/4, currentIncrement), getYCoordinateEnd(2 * Math.PI/4, currentIncrement));
            drawPan.sleep(300);
            gR.drawLine(getXCoordinateStart(2 * Math.PI/4, currentIncrement), getYCoordinateStart(2 * Math.PI/4, currentIncrement),
                        getXCoordinateEnd(3 * Math.PI/4, currentIncrement), getYCoordinateEnd(3 * Math.PI/4, currentIncrement));
            gR.drawLine(getXCoordinateStart(3 * Math.PI/4, currentIncrement), getYCoordinateStart(3 * Math.PI/4, currentIncrement),
                        getXCoordinateEnd(4 * Math.PI/4, currentIncrement), getYCoordinateEnd(4 * Math.PI/4, currentIncrement));
            drawPan.sleep(300);
            gR.drawLine(getXCoordinateStart(4 * Math.PI/4, currentIncrement), getYCoordinateStart(4 * Math.PI/4, currentIncrement),
                        getXCoordinateEnd(5 * Math.PI/4, currentIncrement), getYCoordinateEnd(5 * Math.PI/4, currentIncrement));
            gR.drawLine(getXCoordinateStart(5 * Math.PI/4, currentIncrement), getYCoordinateStart(5 * Math.PI/4, currentIncrement),
                        getXCoordinateEnd(6 * Math.PI/4, currentIncrement), getYCoordinateEnd(6 * Math.PI/4, currentIncrement));
            drawPan.sleep(300);
            gR.drawLine(getXCoordinateStart(6 * Math.PI/4, currentIncrement), getYCoordinateStart(6 * Math.PI/4, currentIncrement),
                        getXCoordinateEnd(7 * Math.PI/4, currentIncrement), getYCoordinateEnd(7 * Math.PI/4, currentIncrement));
            gR.drawLine(getXCoordinateStart(7 * Math.PI/4, currentIncrement), getYCoordinateStart(7 * Math.PI/4, currentIncrement),
                        getXCoordinateEnd(8 * Math.PI/4, currentIncrement), getYCoordinateEnd(8 * Math.PI/4, currentIncrement));
            drawPan.sleep(300);
        }
    }

    public static int getXCoordinateStart(double theta, double incrementLevel) {
        return (int) Math.round(X_CENTER + (RADIUS - incrementLevel) * Math.cos(theta));
    }

    public static int getYCoordinateStart(double theta, double incrementLevel) {
        return (int) Math.round(Y_CENTER + (RADIUS - incrementLevel) * Math.sin(theta));
    }

    public static int getXCoordinateEnd(double theta, double incrementLevel) {
        return (int) Math.round(X_CENTER + incrementLevel * Math.cos(theta));
    }

    public static int getYCoordinateEnd(double theta, double incrementLevel) {
        return (int) Math.round(Y_CENTER + incrementLevel * Math.sin(theta));
    }
}