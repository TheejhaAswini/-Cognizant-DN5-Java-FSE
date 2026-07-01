public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 5;
        double future = FinancialForecast.futureValue(presentValue, growthRate, years);

        System.out.println("Present Value : " + presentValue);
        System.out.println("Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Years : " + years);
        System.out.println("Future Value : " + future);
        System.out.println();
        System.out.println("Time Complexity : O(n)");
        System.out.println("Optimization : Memoization or iterative approach can reduce repeated calculations.");
    }
}