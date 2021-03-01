import static java.lang.System.exit;

public class QuizZero {

    public static void main(String[] args) {
        QuizZero qz = new QuizZero();

        int score = qz.test();
        exit(score);
    }

    public int test() {
        int runningTotal;
        return 15 - 15;
    }

    // return zero
    public static  int Qzero(int a, int b) {
        return 0;
    }

    // return the sum of a and b
    public static  int Qone(int a, int b) {
        return a + b;
    }

    //return the product
    public static  int Qtwo(int a, int b) {
        return a * b;
    }
    //return the difference of a and b
    public static  int Qthree(int a, int b) {
        return b - a;
    }

    //return the nagation of a
    public static  int Qfour(int a) {
        return a * -1;
    }

    // write code to pass the test
    public static  int Qfive(int a, int b) {
        return  (a + b) - Math.abs((a - b));
    }

    // write code to pass the test
    public static  int Qsix(int a) {
        return (int) Math.pow(a, 3);
    }

    // write code to pass the test
    public static  int Qseven(int a, int b) {
        return a % b;
    }

    //return the sum of a and b divded by c
    public static  int Qeight(int a, int b, int c) {
        return (a + b) / c;
    }

    // write code to pass the test
    public static  int Qnine(int a, int b) {
        return  a * b + 5;
    }

    // write code to pass the test
    public static  boolean Qaay(boolean a, boolean b) {
        return a && b;
    }

    // write code to pass the test
    public static  boolean Qbee(boolean a, boolean b) {
        return a || b;
    }

    // write code to pass the test
    public static  int Qcee(boolean a, boolean b) {
        if ( a == b) {
            return -2;
        } else {
            return 1;
        }
    }

    //return x dvided by b squared
    public static  float Qdee(float x, int b) {
        return (float) (x / Math.pow(b, 2));
    }

    // if x-y is less than 1/10,000 return zero otherwise return 1
    public static int Qeee(double x, double y) {
        if (Math.abs(x - y) < 1.0 / 10000.0) {
            return 0;
        } else {
            return 1;
        }
    }

    //if a is zero return zero, if a is even return a random number times zero, if not even return 5 - 5
    public static  int Qeff(int a) {
        if (a == 0) {
            return 0;
        } else if (a % 2 == 0) {
            return (int) (Math.random() * 0);
        } else {
            return 5 - 5;
        }
    }

}
