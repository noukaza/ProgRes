public class Main {

    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();

        Thread thread1 = new Thread(exo1);
        Thread thread2 = new Thread(exo1);
        thread1.start();
        thread2.start();


    }
}
