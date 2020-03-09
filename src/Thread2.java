class Thread2 extends Thread1 {
    public void run() {
        while (true) {
            System.out.println("Thread2: " + Math.pow(i, 2));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}