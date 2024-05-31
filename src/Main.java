public class Main {
    public static void main(String[] args) {

        User geera = new User("Geera", "geera@swed.de");

        Website website1 = new Website("https://github.com/");
        Website website2 = new Website("https://wttr.in/");

        Systems system = new Systems();

        system.addUser(geera);

        system.subscribe(geera, website1);
        system.subscribe(geera, website2);

        while (true) {
            system.checkUpdate();
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("Error occured");
            }
        }
    }
}