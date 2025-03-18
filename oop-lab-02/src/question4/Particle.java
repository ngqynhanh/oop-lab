package question4;

import java.util.Random;

enum Direction {
    North, NorthEast, East, SouthEast, South, SouthWest, West, NorthWest
}

public class Particle {
    private int x;
    private int y;

    Particle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveRandomly() {
        Random random = new Random();   
        Direction direction = Direction.values()[random.nextInt(Direction.values().length)];

        int newX = x;
        int newY = y;

        switch (direction) {
            case North -> newY--;
            case NorthEast -> {
                newY--;
                newX++;
            }
            case East -> newX++;
            case SouthEast -> {
                newY++;
                newX++;
            }
            case South -> newY++;
            case SouthWest -> {
                newY++;
                newX--;
            }
            case West -> newX--;
            case NorthWest -> {
                newY--;
                newX--;
            }
        }

        // Ensure the particle stays within the box boundaries
        if (newX >= 0 && newX < Box.getInstance().getWidth()) {
            x = newX;
        }
        if (newY >= 0 && newY < Box.getInstance().getHeight()) {
            y = newY;
        }
    }
}
