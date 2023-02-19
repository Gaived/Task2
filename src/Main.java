public class Main {
    public static void main(String[] args) {
        long[] sales = {112, 23, 31, 47, 59, 7, 115};
        SalesManager manager = new SalesManager(sales);
        long max = manager.max();
        System.out.println("Максимум продаж в день - " + max);
    }
}