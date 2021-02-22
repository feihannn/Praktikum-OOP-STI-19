public class Orange implements Fruit {
    private boolean isSeedless;
    private boolean isSweet;

    /**
     * Constructor
     * 
     * @param isSeedless apakah jeruk tidak memiliki biji
     * @param isSweet    apakah jeruk berasa manis
     */
    public Orange(boolean isSeedless, boolean isSweet) {
        this.isSeedless = isSeedless;
        this.isSweet = isSweet;
    }

    public boolean isOrangeSeedless() {
        return this.isSeedless;
    }

    public boolean isOrangeSweet() {
        return this.isSweet;
    }
}