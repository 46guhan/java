import java.util.*;
import java.text.*;
import java.util.Currency;

public class InternationalizationDemo {

    public static void main(String[] args) {

        // ==============================
        // Language and Country Code
        // ==============================

        Locale india = new Locale("en", "IN");
        Locale usa = new Locale("en", "US");
        Locale japan = new Locale("ja", "JP");
        Locale tamil = new Locale("ta", "IN");

        System.out.println("Language: " + india.getDisplayLanguage());
        System.out.println("Country: " + india.getDisplayCountry());

        System.out.println("---------------------");


        // ==============================
        // Currency Format
        // ==============================

        double amount = 123456.78;

        NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(india);
        NumberFormat usaCurrency = NumberFormat.getCurrencyInstance(usa);
        NumberFormat japanCurrency = NumberFormat.getCurrencyInstance(japan);

        System.out.println("India Currency: " + indiaCurrency.format(amount));
        System.out.println("USA Currency: " + usaCurrency.format(amount));
        System.out.println("Japan Currency: " + japanCurrency.format(amount));

        System.out.println("---------------------");


        // ==============================
        // Date Format
        // ==============================

        Date today = new Date();

        DateFormat indiaDate = DateFormat.getDateInstance(DateFormat.LONG, india);
        DateFormat usaDate = DateFormat.getDateInstance(DateFormat.LONG, usa);
        DateFormat japanDate = DateFormat.getDateInstance(DateFormat.LONG, japan);

        System.out.println("India Date: " + indiaDate.format(today));
        System.out.println("USA Date: " + usaDate.format(today));
        System.out.println("Japan Date: " + japanDate.format(today));

        System.out.println("---------------------");


        // ==============================
        // Time Format
        // ==============================

        DateFormat indiaTime = DateFormat.getTimeInstance(DateFormat.LONG, india);
        DateFormat usaTime = DateFormat.getTimeInstance(DateFormat.LONG, usa);
        DateFormat japanTime = DateFormat.getTimeInstance(DateFormat.LONG, japan);

        System.out.println("India Time: " + indiaTime.format(today));
        System.out.println("USA Time: " + usaTime.format(today));
        System.out.println("Japan Time: " + japanTime.format(today));

        System.out.println("---------------------");


        // ==============================
        // Number Format
        // ==============================

        NumberFormat indiaNumber = NumberFormat.getInstance(india);
        NumberFormat usaNumber = NumberFormat.getInstance(usa);
        NumberFormat japanNumber = NumberFormat.getInstance(japan);

        System.out.println("India Number: " + indiaNumber.format(amount));
        System.out.println("USA Number: " + usaNumber.format(amount));
        System.out.println("Japan Number: " + japanNumber.format(amount));

        System.out.println("---------------------");


        // ==============================
        // Currency Code
        // ==============================

        Currency indiaCurr = Currency.getInstance(india);
        Currency usaCurr = Currency.getInstance(usa);
        Currency japanCurr = Currency.getInstance(japan);

        System.out.println("India Currency Code: " + indiaCurr.getCurrencyCode());
        System.out.println("USA Currency Code: " + usaCurr.getCurrencyCode());
        System.out.println("Japan Currency Code: " + japanCurr.getCurrencyCode());

    }
}
