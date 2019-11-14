package cn.itcast.thread;

/**
 * author: john
 * date:2019/11/14
 */
public class demo extends Thread {


    private demo(String name){
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0 ; i< 100 ; i++){
            System.out.println(Thread.currentThread().getName()+":"+ i);
        }
    }

    public static void main(String[] args) {

        demo d = new demo("狗娃");
        d.start(); //开启线程。 线程一旦开启就会指定run方法中 的代码。


        for(int i = 0 ; i< 100 ; i++){
            System.out.println(Thread.currentThread().getName()+":"+ i);
        }
    }


}