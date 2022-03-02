package one.digitalinnovation.gof.singleton;
/**
*Singleton "Lazy Holder"
*@author Lexleon-Oliver
*
*/
public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia=new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
