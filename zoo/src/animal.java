public class animal {
    private String name;
    private boolean liveOnLand;
    private boolean canFly;
    private boolean isDangerous;
    

    public animal(String name, boolean liveOnLand, boolean canFly, boolean isDangerous) {
        this.name = name;
        this.liveOnLand = liveOnLand;
        this.canFly = canFly;
        this.isDangerous = isDangerous;         

    }
    public void infoAnimal() {
            System.out.println("Djur: " + this.name + ", bor på land: " + this.liveOnLand + ", kan flyga: " + canFly + ", är farlig: " + isDangerous );


    }
    


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public boolean isLiveOnLand() {
        return liveOnLand;
    }


    public void setLiveOnLand(boolean liveOnLand) {
        this.liveOnLand = liveOnLand;
    }


    public boolean isCanFly() {
        return canFly;
    }


    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }


    public boolean isDangerous() {
        return isDangerous;
    }


    public void setDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }
    

    

    
    
}
