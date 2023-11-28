public class Vehiculos {

    private String color;

    private String brand;

    private String type;

    private int price;
     
   
    public void consultVehicleDetails() {
      System.out.print("Color: ");
      String color = entrada.nextLine();
      System.out.print("Brand: ");
      String brand = entrada.nextLine();
      System.out.print("Type: ");
      String type = entrada.nextLine();
      System.out.print("Price: ");
    }
     
    private String model;

    private static class entrada {

        private static String nextLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public entrada() {
        }
    }
}
