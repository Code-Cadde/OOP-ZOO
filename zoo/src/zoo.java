public class zoo {
    public static void main(String[] args) {
        Bird bird1 = new Bird("hawk", true, true, false);
        Bird bird2 = new Bird("blackcap", true, true, false);

        Mammel mammel1 = new Mammel("Horse", true, false, false);
        Mammel mammel2 = new Mammel("Dolphin", false, false, false);

        Reptile reptile1 = new Reptile("Tutle", true, false, false);
        Reptile reptile2 = new Reptile("Alligator", true, false, true);

        Fish fish1 = new Fish("White-Shark", false, false, true);
        Fish fish2 = new Fish("Whale-Shark", false, false, false);

        Water water1 = new Water("Salt-water", true, false);
        Water water2 = new Water("Water", true, true);

        Farm farm1 = new Farm();
         Farm farm2 = new Farm();
       

        bird1.infoAnimal();
        


    }
    
}
