import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Define exchange rates
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0); // 1 USD to USD (base currency)
        exchangeRates.put("EUR", 0.85); // 1 USD to EUR
        exchangeRates.put("JPY", 110.0); // 1 USD to JPY
        exchangeRates.put("GBP", 0.75); // 1 USD to GBP
        exchangeRates.put("AUD", 1.30); // 1 USD to AUD

        // Input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double amountInUSD = scanner.nextDouble();

        System.out.print("Enter the target currency (e.g., EUR, JPY, GBP, AUD): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Check if the target currency is valid
        if (!exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid target currency.");
        } else {
            // Perform the currency conversion
            double conversionRate = exchangeRates.get(targetCurrency);
            double convertedAmount = amountInUSD * conversionRate;

            // Display the result
            System.out.println(amountInUSD + " USD is equivalent to " + convertedAmount + " " + targetCurrency);
        }

        scanner.close();
    }
}

