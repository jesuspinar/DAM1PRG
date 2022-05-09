package com.programacionOO.tema06.practicaExtra;
import com.programacionOO.libs.Ansi;
import com.programacionOO.libs.Util;

public class Bolita {
    public static void main(String[] args) {
        final int NUM_ROWS = 15;
        final int NUM_COLS = 30;
        final int COL = 10;
        final int ROW = 5;
        int iterations = 400;
        int ballX = Util.random(COL + 1, NUM_COLS - 2);
        int ballY = Util.random(ROW + 1, NUM_ROWS - 2);
        int velocity = Util.random(5, 20);
        int dirX = Util.random(0, 1) == 0 ? -1 : 1;
        int dirY = Util.random(0, 1) == 0 ? -1 : 1;
        int delay = 1000 / velocity;

        Ansi.clearScreen();
        Ansi.hideCursor();

        printFrame(' ', COL, ROW, NUM_COLS, NUM_ROWS, Ansi.Color.NONE, Ansi.Color.RED);
        while(iterations > 0) {
            Ansi.printTo(' ', ballX, ballY, true, Ansi.Color.NONE, Ansi.Color.NONE);
            if(ballX >= NUM_COLS + COL - 2 || ballX <= COL + 1)
                dirX *= -1;
            if(ballY >= NUM_ROWS + ROW - 2 || ballY <= ROW + 1)
                dirY *= -1;

            ballX += dirX;
            ballY += dirY;
            Ansi.printTo('O', ballX, ballY, true, Ansi.Color.WHITE, Ansi.Color.NONE);
            Ansi.wait(delay);
            iterations--;
        }
        Ansi.clearScreen();
        Ansi.showCursor();
    }

    public static void printFrame(char c, int xPos, int yPos, int width, int height, Ansi.Color fg, Ansi.Color bg)  {
        for(int x = xPos; x <= xPos + width - 1; x++) {
            Ansi.printTo(c, x, yPos, false, fg, bg);
            Ansi.printTo(c, x, yPos + height - 1, false, fg, bg);
        }
        for(int y = yPos; y <= yPos + height - 1; y++) {
            Ansi.printTo(c, xPos, y, false, fg, bg);
            Ansi.printTo(c, xPos + width - 1, y, false, fg, bg);
        }
    }
}
