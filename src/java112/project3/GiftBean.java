package java112.project3;


/**
 * This class represents a gift recipient
 *
 * @author threebeansalad
 */

public class GiftBean implements Comparable<GiftBean>  {
    private int id;
    private String recipient;
    private String gift;
    private double cost;
    private boolean purchased;


    /**
     * Instantiates a new recipient.
     */
    public GiftBean() {
        // no arg constructor
        // put stuff you always want to do here
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    /**
     * Instantiates a new gift recipient.
     * // creates a recipient with all values
     * @param recipient   name of recipient
     * @param gift   type of gift
     * @param cost    cost of gift
     * @param purchased    whether or not the gift has been purchased
     */
    public GiftBean(int id, String recipient, String gift, double cost, boolean purchased) {

        this();
        this.id = id;
        this.recipient = recipient;
        this.gift = gift;
        this.cost = cost;
        this.purchased = false;
    }

    // no toString override prints out just object info as opposed to values
    @Override
    public String toString() {
        return "Gift List {" +
                "Recipient ='" + recipient + '\'' +
                ", Gift ='" + gift + '\'' +
                ", Cost ='" + cost + '\'' +
                ",  Purchased =" + purchased +
                '}';
    }

    public int compareTo(GiftBean thatGiftBean) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if (this == thatGiftBean) {
            return EQUAL;
        }
        else if (this.id < thatGiftBean.id) {
            return BEFORE;
        }
        else if (this.id > thatGiftBean.id) {
            return AFTER;
        }
        else {
            return EQUAL;
        }
    }

}