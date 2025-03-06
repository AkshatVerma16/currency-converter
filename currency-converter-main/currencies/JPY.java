package currencies;
public class JPY extends converter {
    public JPY() {
        INR=0.66839;
        USD=0.009177;
        EUR=0.007535;
        GBP=0.006483;
        KWD=0.002758;
        JPY=1.0;
        KYD=0.007659;
       
    }

    public double JPYToUSD (double yen) { return (yen * USD); }

    public double JPYToEUR (double yen) { return (yen *EUR); }

    public double JPYToGBP (double yen) { return (yen * GBP); }

    public double JPYToINR (double yen) { return (yen * INR); }

    public double JPYToKWD (double yen) { return (yen * KWD); }

    public double JPYToKYD (double yen) { return (yen * KYD); }
}