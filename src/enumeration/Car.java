package enumeration;

public enum Car {
    BWM(700000),
    BENZ(650000),
    MAZDA(370000),
    TOYOTA(450000);

    private int amount;
    Car(int amount){
        this.amount = amount;
    }

    public int displayPrice(){
        return amount;
    }
}
