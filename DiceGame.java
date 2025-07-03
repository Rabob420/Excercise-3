public class DiceGame {
    public void run(){
        int randomnum1 = (int)(Math.random() * 6) + 1;
        int randomnum2 = (int)(Math.random() * 6) + 1;
        int total = randomnum1+randomnum2;
        System.out.println("Rolling DIce...");
        System.out.println("Die 1: " + randomnum1);
        System.out.println("Die 2: " + randomnum2);
        System.out.println("Total value: " + total);
    }
    public static void main(String[] args) {
        new DiceGame().run();
    }
}


