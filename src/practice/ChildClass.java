package practice;

public class ChildClass extends Inheri{
    public static void main(String[] args) {
        Inheri abc=new Inheri();
        ChildClass cde=new ChildClass();
     cde.run();
     Inheri.turn();
     jump();
    cde.talk();

    }


    public static void jump(){

        System.out.println("I like to jump");
    }
    public void talk(){
        System.out.println("I like to talk");
        super.same();
    }
    public void same(){
talk();

        System.out.println("This is mine");
    }
    public void eat(){
        run();
        System.out.println("eat all ");
    }

    // Child class cannot inherit private method
    //static in both parent and child can be
    // accessed only under class name not by object.
    // object access all public void methods
    // for static just type method like jump()


}
