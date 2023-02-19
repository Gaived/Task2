public class Main {
    public static void main(String[] args) {
        int[] sales = {112, 23, 31, 47, 59, 7, 115};
        SalesManager manager = new SalesManager(sales);
        int max = manager.max();
        System.out.println("Максимум продаж в день - " + max);
    
        int minP = sales[0];
        int maxP = sales[0];
        int sumP = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minP) {
                minP = sales[i];
            }
            if (sales[i] > maxP) {
                maxP = sales[i];
            }
            sumP += sales[i];
        }

        int stat = (sumP - minP - maxP) / (sales.length - 2);

        System.out.println("Обрезанное среднее равно: " + stat);
    }
}