//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class internationalization {
    public internationalization() {
    }

    public static void main(String[] var0) {
        Locale var1 = Locale.US;
        String var2 = var1.getDisplayLanguage();
        System.out.println("Language:" + var2);
        String var3 = var1.getCountry();
        System.out.println("Country Code: " + var3);
        Currency var4 = Currency.getInstance(var1);
        String var5 = var4.getCurrencyCode();
        String var6 = var4.getSymbol();
        System.out.println("Currency Code: " + var5);
        System.out.println("Currency Symbol: " + var6);
        DateFormat var7 = DateFormat.getDateInstance(1, var1);
        String var8 = var7.format(new Date());
        System.out.println("Date Format: " + var8);
        DateFormat var9 = DateFormat.getTimeInstance(1, var1);
        String var10 = var9.format(new Date());
        System.out.println("Time Format: " + var10);
        NumberFormat var11 = NumberFormat.getNumberInstance(var1);
        String var12 = var11.format(1234567.89);
        System.out.println("Number Format: " + var12);
    }
}
