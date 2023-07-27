package newspapersubscrition2;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class NewspaperSubscription {
	    private String newspaperName;
	    private double subscriptionCost;

	    public NewspaperSubscription(String newspaperName, double subscriptionCost) {
	        this.newspaperName = newspaperName;
	        this.subscriptionCost = subscriptionCost;
	    }

	    public String getNewspaperName() {
	        return newspaperName;
	    }

	    public double getSubscriptionCost() {
	        return subscriptionCost;
	    }
	

	public class NewspaperSubscriptionManager {
	    public static void main(String[] args) {
	        List<NewspaperSubscription> subscriptions = new ArrayList<>();
	        subscriptions.add(new NewspaperSubscription("TOI", 26));
	        subscriptions.add(new NewspaperSubscription("BM", 20.5));
	        subscriptions.add(new NewspaperSubscription("ET", 34));
	        subscriptions.add(new NewspaperSubscription("HINDU", 10.5));
	        subscriptions.add(new NewspaperSubscription("HT", 18));

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Newspapers budget:40");
	        double budget = scanner.nextDouble();

	        System.out.println("Newspapers within your budget:35");
	        for (NewspaperSubscription subscription : subscriptions) {
	            if (subscription.getSubscriptionCost() <= budget) {
	                System.out.println(subscription.getNewspaperName() + " - $" + subscription.getSubscriptionCost());
	            }
	        }

	        scanner.close();
	    }}}
	
	






