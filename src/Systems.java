import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Systems {
    private List<User> userList = new ArrayList<>();
    private Notification notification = new Notification();

    public void addUser(User user){
        userList.add(user);
    }
    public void subscribe(User user, Website website) {
        WebsiteSubscription subscription = new WebsiteSubscription(website);
        user.addSubscriptions(subscription);
    }

    public void checkUpdate(){
        for (User user : userList) {
            for (WebsiteSubscription subscription : user.getSubscriptionList()) {
                try {
                    String currentContent = subscription.getWebsite().downloadContent();
                    if (currentContent.equals(subscription.getLastcontent())) {

                    } else {
                        subscription.setLastcontent(currentContent);
                        Notification.sendmessage(user, "Website " + subscription.getWebsite().getUrl() + " has been updated.");
                    }
                } catch (IOException e) {
                    System.out.println("Error connecting to Website:" + subscription.getWebsite().getUrl());
                }
            }
        }
    }
}