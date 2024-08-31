
public class Planet {
    double gravity;
    double orbit;
    double mass;
}

class Rocky_Planet extends Planet{
    void Rock(){
        System.out.println("I'm a rocky planet");
    }
}

class Gas_Giant_Planet extends Planet{
    void Gas(){
        System.out.println("I'm a gaseous planet");
    }
}

class Ice_Giant_Planet extends Planet {
    void Ice(){
        System.out.println("Brrrr I'm a cold planet");
    }
}




