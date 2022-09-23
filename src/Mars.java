public class Mars {
    public static boolean main(String[] args) {
        String ColonyName = "SpaceZizi";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;
        String landingLocation = "The Ocean";

        ShipFood = ShipFood -(ShipFood * 0.75);
        ShipFood = ShipFood -(ShipFood * 0.75);
        System.out.println(ShipFood);

        ShipFood = ShipFood + (ShipFood * 0.5);

        ShipPopulation = ShipPopulation + 5;

        String LandingLocation = "The Ocean";

        if (LandingLocation.equalsIgnoreCase("The plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        }else {
            System.out.println("Error!!!! Flight plan already set. Landing on the Plain");
        }

        public static boolean landingCheck(int Loops)  {
            for (int i = 0; i <= loops; i++) {
                if (((i % 3) == 0) && ((i % 5) == 0)) {
                    System.out.println("Keep Center");

                }
                else if ((i % 5) == 0) {
                    System.out.println("Right");

                }
                else if ((i % 3) == 0){
                    System.out.println("Left");
                }
                else {
                    System.out.println("Calculating");
                }
                Thread.sleep(250);
            }
            System.out.println("Landed");

            return false;



    }











    }


}
