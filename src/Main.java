public class Main {
    public static void main(String[] args) {

        User user = new User("Geera", "geera@swed.de");

        Website website = new Website("https://gi.n,mthub.com/");

        Systems system = new Systems();

        system.addUser(user);

        system.subscribe(user, website);

        while (true) {
            system.checkUpdate();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.printf("Error occured");
            }
        }
    }
}