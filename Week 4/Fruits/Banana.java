public class Banana implements Fruit {
    private String bananaType;

    /**
     * Constructor
     * 
     * @param bananaType jenis pisang (misalnya Cavendish, Raja, dll)
     */
    public Banana(String bananaType) {
        this.bananaType = bananaType;
    }

    public String getBananaType() {
        return this.bananaType;
    }
}