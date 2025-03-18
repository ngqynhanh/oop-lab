package question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Box {
    private double width;
    private double height;
    private static Box instance = null;
    private List<Particle> particles;

    private Box(double width, double height) {
        this.width = width;
        this.height = height;
        this.particles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            particles.add(new Particle(random.nextInt((int) width + 1), random.nextInt((int) height + 1)));
        }
    }

    public static Box getInstance() {
        if (instance == null) {
            instance = new Box(10, 10);
        }
        return instance;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void simulate(int step) {
        for (int i = 0; i < step; i++) {
            moveParticles();
            checkCollisions();
            System.out.println("Step " + (i + 1) + ": " + particles.size() + " particles in the box");
            visualize();
        }
    }

    private void moveParticles() {
        for (Particle particle : particles) {
            particle.moveRandomly();
        }
    }

    private void checkCollisions() {
        Random random = new Random();
        for (int i = 0; i < particles.size(); i++) {
            for (int j = i + 1; j < particles.size(); j++) {
                if (particles.get(i).getX() == particles.get(j).getX() && particles.get(i).getY() == particles.get(j).getY()) {
                    particles.add(new Particle(random.nextInt((int) width + 1), random.nextInt((int) height + 1)));
                }
            }
        }
    }

    private void visualize() {


        for (int i = 0; i < height + 3; i++) {
            for (int j = 0; j < width + 3; j++) {
                if (i == 0 || i == height + 2) {
                    System.out.print("_");
                    continue;
                }
                if (j == 0 || j == width + 2) {
                    System.out.print("|");
                    continue;
                }
                boolean found = false;
                for (Particle particle : particles) {
                    if (particle.getX() + 1 == (j) && particle.getY() + 1 == (i)) {
                        System.out.print("X");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        for (Particle particle : particles) {
            System.out.println("Particle at (" + particle.getX() + ", " + particle.getY() + ")");
        }
                
        System.out.println();
    }
}