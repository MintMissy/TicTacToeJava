import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companiesAmount = scanner.nextInt();

        int[] companiesIncomes = new int[companiesAmount];
        for (int i = 0; i < companiesAmount; i++) {
            companiesIncomes[i] = scanner.nextInt();
        }

        int[] companiesTaxRate = new int[companiesAmount];
        for (int i = 0; i < companiesAmount; i++) {
            companiesTaxRate[i] = scanner.nextInt();
        }

        int companyPayingHighestTax = 0;
        double highestPaidTax = 0;

        for (int i = 0; i < companiesAmount; i++) {
            double paidTax = companiesIncomes[i] * companiesTaxRate[i];
            if (paidTax > highestPaidTax){
                companyPayingHighestTax = i+1;
                highestPaidTax = paidTax;
            }
        }

        System.out.println(companyPayingHighestTax);
    }
}