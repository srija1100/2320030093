package subject.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuctionItem auctionItem1 = new AuctionItem("Vintage Car");
        AuctionItem auctionItem2 = new AuctionItem("Antique Vase");

       
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

       
        auctionItem1.addObserver(bidder1);
        auctionItem1.addObserver(bidder2);
        auctionItem2.addObserver(bidder2);
        auctionItem2.addObserver(bidder3);

        auctionItem1.itemAvailable();
        auctionItem1.biddingStart();
        auctionItem1.biddingEnd();

        auctionItem2.itemAvailable();
        auctionItem2.biddingStart();
        auctionItem2.biddingEnd();

       
        auctionItem1.removeObserver(bidder2);
        System.out.println("\nAfter unsubscribing Bob from Vintage Car auction:\n");
        auctionItem1.itemAvailable();
	}

}
