
public class  Cat
{
    public static final int LEGS_COUNT = 4;
    public static final int EYES_COUNT = 2;
    public static final double MAX_WEIGHT = 9000.0;
    public static final double MIN_WEIGHT = 1000.0;

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double eatenFood = 0;
    private double howEat = 0;
    private static int count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        if (weight > maxWeight || weight < minWeight){
        count--;}
    }

    public void feed(Double amount)
    {
        howEat += amount;
        weight = weight + amount;
    }
    private void setWeight(double weight) {
        this.weight = weight;
        if (weight < minWeight || maxWeight < weight) {
            count--;
        }
    }
    public void drink(Double amount)
    {
        //setWeight(getWeight() + 1);
        weight = weight + amount;
        if (weight > maxWeight || weight < minWeight) {

        count--;}
    }

    public Double getWeight()
    {
        return weight;
    }
    public void pee () {
        weight = weight*0.95;
        System.out.println("Ohhh... Crap...");
        if (weight > maxWeight || weight < minWeight) {

            count--;
        }

    }

    public Double howEat() {
        return howEat;
    }
    public static int getCount()
    {
        return count;

    }
    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}