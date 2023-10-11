public class Place {
    private String name; 
    private boolean isSafe;
    private boolean pool; 

    public Place (String name, boolean isSafe, boolean pool) {
        this.name = name;
        this.isSafe = isSafe; 
        this.pool = pool;
    }
    public void infoPlace() {
            System.out.println("Typ av plats: " + this.name + " finns det en pool/bad:" + this.pool);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean isSafe) {
        this.isSafe = isSafe;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }
    

    
}
