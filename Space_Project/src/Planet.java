
public class Planet extends Celestial_Body {
    double gravity;
    float orbit;
    String type;

    Planet(String name, double gravity, float orbit){
        this.name = name;
        this.gravity = gravity;
        this.orbit = orbit;
        celestial_body = "Planet";
    }

    public void display(){
        System.out.println("Celestial Body: " + celestial_body);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Gravity: " + gravity + " m/s^2");
        System.out.println("Orbit: " + orbit + " days or "  + (orbit / 365) + " year(s)");
    }
}

class Rocky_Planet extends Planet{
    Rocky_Planet(String name, double gravity, float orbit) {
        super(name, gravity, orbit);
        type = "Rocky Planet";
    }

}

class Gas_Giant_Planet extends Planet{
    Gas_Giant_Planet(String name, double gravity, float orbit) {
        super(name, gravity, orbit);
        type = "Gas Giant Planet";
    }

}

class Ice_Giant_Planet extends Planet {
    Ice_Giant_Planet(String name, double gravity, float orbit) {
        super(name, gravity, orbit);
        type = "Ice Giant Planet";
    }
}




