package HW4;


import java.util.Random;
import java.util.Scanner;


public class hW4 {
        public static int SIZE = 3;
        public static int DOTS_TO_WIN = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] MAP;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();
        public static void main(String[] args) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }
        public static boolean checkWin(char symb) {
            boolean cols, rows, d1, d2;
            for (int i=0; i<3; i++) {
                cols = true;
                rows = true;
                d1 = true;
                d2 = true;
                for (int j=0; j<3; j++) {
                    cols &= (MAP[i][j] == symb);
                    rows &= (MAP[j][i] == symb);
                    d1 &= MAP[i][i] == symb;
                    d2 &= MAP[i][SIZE - i - 1] == symb;
                }

                if (cols || rows) return true;
            }

            return false;
        }

        /*{
            for (int i = 0; i < SIZE; i++) {
                boolean row = true, column = true, d1 = true, d2 = true;
                for (int j = 0; j < SIZE; j++) {
                    row &= MAP[i][j] == symb;
                    column &= MAP[j][i] == symb;
                    d1 &= MAP[i][i] == symb;
                    d2 &= MAP[i][SIZE - i - 1] == symb;
                }
                if (row || column || d1 || d2) {
                    return true;
                }
            }

        }*/


        /* {
            if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
            if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
            if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
            if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
            if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
            if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
            return false;
        }*/
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (MAP[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            MAP[y][x] = DOT_O;
        }
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            MAP[y][x] = DOT_X;
        }
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (MAP[y][x] == DOT_EMPTY) return true;
            return false;
        }
        public static void initMap() {
            MAP = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    MAP[i][j] = DOT_EMPTY;
                }
            }
        }
        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(MAP[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

