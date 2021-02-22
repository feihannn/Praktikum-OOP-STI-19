public class Apple implements Fruit {
    private boolean isSeedless;

    /**
     * Constructor
     * 
     * @param isSeedless apakah apel tidak memiliki biji
     */
    public Apple(boolean isSeedless) {
        this.isSeedless = isSeedless;
    }

    public boolean isAppleSeedless() {
        return this.isSeedless;
    }
}