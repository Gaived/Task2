public class Main {
    public static void main(String[] args) {
        long[] sales = {112, 23, 31, 47, 59, 7, 115};
        SalesManager manager = new SalesManager(sales);
        long max = manager.max();
        System.out.println("Максимум продаж в день - " + max);
    
        long minP = sales[0];
        long maxP = sales[0];
        long sumP = 0;

        for (long i = 0; i < sales.length; i++) {
            if (sales[i] < minP) {
                minP = sales[i];
            }
            if (sales[i] > maxP) {
                maxP = sales[i];
            }
            sumP += sales[i];
        }

        long stat = (sumP - minP - maxP) / (sales.length - 2);

        System.out.println("Обрезанное среднее равно: " + stat);
    }
}