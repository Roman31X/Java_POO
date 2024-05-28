package ProgramacionJFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class Juego extends JFrame{

        private static final int GRID_SIZE = 20;
        private static final int CELL_SIZE = 25;
        private static final int GAME_SIZE = GRID_SIZE * CELL_SIZE;

        private ArrayList<Point> snake;
        private Point food;
        private int direction; // 0: arriba, 1: derecha, 2: abajo, 3: izquierda

        public Juego() {
            setTitle("Snake Game");
            setSize(GAME_SIZE, GAME_SIZE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            snake = new ArrayList<>();
            snake.add(new Point(GRID_SIZE / 2, GRID_SIZE / 2));
            direction = 1; // Comenzar moviéndose hacia la derecha

            generateFood();

            Timer timer = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    move();
                    checkCollision();
                    checkFood();
                    repaint();
                }
            });
            timer.start();

            addKeyListener(new KeyListener() {
                @Override
                public void keyPressed(KeyEvent e) {
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            if (direction != 2) direction = 0;
                            break;
                        case KeyEvent.VK_RIGHT:
                            if (direction != 3) direction = 1;
                            break;
                        case KeyEvent.VK_DOWN:
                            if (direction != 0) direction = 2;
                            break;
                        case KeyEvent.VK_LEFT:
                            if (direction != 1) direction = 3;
                            break;
                    }
                }

                @Override
                public void keyTyped(KeyEvent e) {
                }

                @Override
                public void keyReleased(KeyEvent e) {
                }
            });

            setFocusable(true);
        }

        private void move() {
            Point head = snake.get(0);
            Point newHead;

            switch (direction) {
                case 0:
                    newHead = new Point(head.x, (head.y - 1 + GRID_SIZE) % GRID_SIZE);
                    break;
                case 1:
                    newHead = new Point((head.x + 1) % GRID_SIZE, head.y);
                    break;
                case 2:
                    newHead = new Point(head.x, (head.y + 1) % GRID_SIZE);
                    break;
                case 3:
                    newHead = new Point((head.x - 1 + GRID_SIZE) % GRID_SIZE, head.y);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + direction);
            }

            snake.add(0, newHead);

            if (!newHead.equals(food)) {
                snake.remove(snake.size() - 1);
            } else {
                generateFood();
            }
        }

        private void generateFood() {
            Random rand = new Random();
            int x, y;
            do {
                x = rand.nextInt(GRID_SIZE);
                y = rand.nextInt(GRID_SIZE);
            } while (snake.contains(new Point(x, y)));

            food = new Point(x, y);
        }

        private void checkCollision() {
            Point head = snake.get(0);
            for (int i = 1; i < snake.size(); i++) {
                if (head.equals(snake.get(i))) {
                    JOptionPane.showMessageDialog(this, "Game Over!");
                    System.exit(0);
                }
            }
        }

        private void checkFood() {
            if (snake.get(0).equals(food)) {
                generateFood();
            }
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            g.clearRect(0, 0, GAME_SIZE, GAME_SIZE);

            g.setColor(Color.RED);
            g.fillRect(food.x * CELL_SIZE, food.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);

            g.setColor(Color.GREEN);
            for (Point point : snake) {
                g.fillRect(point.x * CELL_SIZE, point.y * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Juego().setVisible(true);
                }
            });
        }
    }
