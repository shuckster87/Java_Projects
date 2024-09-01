public class Moon extends Celestial_Body{
    Planet host_planet;

    Moon(String name, Planet host_planet){
        this.host_planet = host_planet;
        celestial_body = "Moon";
        this.name = name;
    }

    public void display(){
        System.out.println("Celestial Body: " + celestial_body);
        System.out.println("Name: " + name);
        System.out.println("Host Planet: " + host_planet.name);
    }

}
