public class EspressoMachine {

    private double ouncesPerCup;
    private double maxGroundsCapacity;
    private double currentGroundsLevel;

    public double getOuncesPerCup() {
        return ouncesPerCup;
    }

    public void setOuncesPerCup(double ouncesPerCup) {
        this.ouncesPerCup = ouncesPerCup;
    }

    public double getMaxGroundsCapacity() {
        return maxGroundsCapacity;
    }

    public void setMaxGroundsCapacity(double maxGroundsCapacity) {
        this.maxGroundsCapacity = maxGroundsCapacity;
    }

    public double getCurrentGroundsLevel() {
        return currentGroundsLevel;
    }

    public void setCurrentGroundsLevel(double currentGroundsLevel) {

        if (currentGroundsLevel >= maxGroundsCapacity) {
            this.currentGroundsLevel = maxGroundsCapacity;
        }else{
            this.currentGroundsLevel = currentGroundsLevel;
        }
    }

    public void addGrounds(double grounds){
        setCurrentGroundsLevel(getCurrentGroundsLevel() + grounds);
    }

    public String orderCupOfEspresso(){
        if(getCurrentGroundsLevel() >= getOuncesPerCup()){
            setCurrentGroundsLevel(getCurrentGroundsLevel() - getOuncesPerCup());
            return "Enjoy this robust cup of espresso.";
        }else{
            return "We regret the machine is out of espresso.";
        }
    }



    public EspressoMachine(double maxGroundsCapacity, double currentGroundsLevel){
        setOuncesPerCup(2.0);
        setMaxGroundsCapacity(maxGroundsCapacity);
        setCurrentGroundsLevel(currentGroundsLevel);
    }

    @Override
    public String toString() {
        return "EspressoMachine{" +
                "ouncesPerCup=" + ouncesPerCup +
                ", maxGroundsCapacity=" + maxGroundsCapacity +
                ", currentGroundsLevel=" + currentGroundsLevel +
                '}';

    }
}
