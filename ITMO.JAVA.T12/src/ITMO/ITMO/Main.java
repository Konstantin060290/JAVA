package ITMO.ITMO;

public class Main {


    public static void main(String args[]) throws InterruptedException {
        //region<Task1>
//        Thread t = new Thread();
//        for (int i = 0; i <10; i++ )
//        {
//            HelloRunnable hr = new HelloRunnable();
//            hr.start();
//            Wait();
//        }
        //endregion<Task1>

        //region<Task2>
//        MyThread mt2 = new MyThread();
//        System.out.println(mt2.getState());//new
//        mt2.start();//in work
//        Thread.sleep(1000);
//        System.out.println(mt2.getState()); //after
        //endregion<Task2>

        //region<Task3>


//        Counter counter = new Counter();
//        for (int i = 0; i < 100; i++) {
//            new CounterThread(counter).start();
//        }
//        Thread.sleep(1000);
//        System.out.println(counter.count);

        //endregion<Task3>

        //region<Task4>

        Object lock = new Object();
        Thread thread1 = new MyRunnable(lock);
        Thread thread2 = new MyRunnable(lock);
        thread1.start();
        thread2.start();

        //endregion<Task4>

    }

}

    //region<Task1>

class HelloRunnable extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 100; i++)
        {
            System.out.print(i+";");
        }
        System.out.println("\n");

    }

    static void Wait()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)
            {
            e.printStackTrace();
            }

    }
}
    //endregion<Task1>

    //region<Task2>

class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println(this.getState());
    }
}
    //endregion<Task2>

    //region<Task3>

    class Counter {
        int count = 0;
        public void increment()
        {
            count = count + 1;
        }
        public int getCount()
        {
            return count;
        }
    }

    class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
}

//endregion<Task3>

    //region<Task 4>

class MyRunnable extends Thread{
    private Object lock;

    public MyRunnable(Object lock) {
        this.lock = lock;
    }

    @Override
    public  void run() {
        while (true) {
            synchronized (lock) {
                lock.notify();
                System.out.println(Thread.currentThread().getName());
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
//endregion<Task 4>