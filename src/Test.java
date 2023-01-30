import singleton.SingletonLazy;
import singleton.SingletonEager;
import singleton.SingletonLazyHolder;

public class Test {

    public static void main(String[] args){

        cleanConsoleScreen();

        // SingletonLazy lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);
        // lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);
        // System.out.println();
        
        // SingletonEager eager = SingletonEager.getInstancia();
        // System.out.println(eager);
        // eager = SingletonEager.getInstancia();
        // System.out.println(eager);
        // System.out.println();

		// SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		// System.out.println(lazyHolder);
		// lazyHolder = SingletonLazyHolder.getInstancia();
		// System.out.println(lazyHolder);

        Behavior normal = new BehaviorNormal();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.toMove();
        robot.toMove();
    }

    public static void cleanConsoleScreen(){

        System.out.print("[H[2J");
        System.out.flush();

    }

}
