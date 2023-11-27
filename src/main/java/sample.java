
public class sample {
    private int populality;
    private int freshness;

    public sample(int populality, int freshness) {
        this.populality = populality;
        this.freshness = freshness;
    }
    public sample() {
        this.populality = 0;
        this.freshness = 0;
    }
    public int getPopulality() {
        return populality;
    }
    public void setPopulality(int populality) {
        this.populality = populality;
    }
    public int getFreshness() {
        return freshness;
    }
    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }
}

