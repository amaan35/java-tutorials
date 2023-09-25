public class MainClass {
    public static void main(String[] args) {
        Asset asset = new MutualFunds("AMAZON", 300);
        System.out.println(asset.getMarketValue());
        //no values entered so thats why 0 output
    }
}
