class SleepDemo extends Thread {
public void run() {
try {
Thread.sleep(1000);
System.out.println("Thread resumed after sleep");
} catch (InterruptedException e) {
System.out.println("Thread interrupted");
}
}
}
