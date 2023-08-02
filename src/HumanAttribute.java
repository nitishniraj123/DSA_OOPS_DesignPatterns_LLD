public class HumanAttribute {
    private String name;
    private int noOfHands;
    private int noOfLegs;

    public HumanAttribute(String name, int noOfHands, int noOfLegs) {
        this.name = name;
        this.noOfHands = noOfHands;
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfHands() {
        return noOfHands;
    }

    public void setNoOfHands(int noOfHands) {
        this.noOfHands = noOfHands;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    @Override
    public String toString() {
        return "HumanAttribute{" +
                "name='" + name + '\'' +
                ", noOfHands='" + noOfHands + '\'' +
                ", noOfLegs='" + noOfLegs + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HumanAttribute humanAttribute1 = new HumanAttribute("nitish",2,2);
        HumanAttribute humanAttribute2 = new HumanAttribute("niraj",1,2);
        System.out.println(humanAttribute1.toString() + "\n"+humanAttribute2.toString());
    }
}
