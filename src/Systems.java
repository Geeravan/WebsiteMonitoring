import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Systems {
    private List<User> userList = new ArrayList<>();
    private Notification notification = new Notification();

    // comparison methods
    private ComparisonStrategy htmlComparisonStrategy = new HTMLComparisonStrategy(); 
    private ComparisonStrategy contentSizeComparisonStrategy = new ContentSizeComparisonStrategy();
    private ComparisonStrategy textContentComparisonStrategy = new TextContentComparisonStrategy();
    
    public void addUser(User user){
        userList.add(user);
    }
    public void subscribe(User user, Website website) {
        WebsiteSubscription subscription = new WebsiteSubscription(website);
        user.addSubscriptions(subscription);
    }
    // iterate userlist and the subscription list
    // compares the old currentContent with the new downloaded content
    public void checkUpdate(){
        for (User user : userList) {
            for (WebsiteSubscription subscription : user.getSubscriptionList()) {
                try {
                    String currentContent = subscription.getWebsite().downloadContent();
                    if (!textContentComparisonStrategy.compare(currentContent,subscription.getWebsite().downloadContent())) {
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