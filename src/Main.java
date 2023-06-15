//Write a while loop for our trading bot!
//        The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.*
//        It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
//        It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
//        On days where it sells, it can only sell 1000 pounds for euros.
//        Write a while loop
//        Use the calculation for exchange rate below
//        1 + (Math.random() * 0.2); To recalculate our rate every day (once per loop)
//        Print the number of days it takes for our bot to sell its pounds

public class Main {
    public static void main(String[] args){
        int botPounds = 10000;
        double exchangeRate;
        int days = 1;

        while(botPounds != 0) {
            System.out.println("\nDay number: " + days++);

            exchangeRate = 1 + (Math.random() * 0.2);
            System.out.println("Current exchange rate: " + exchangeRate);

            if (exchangeRate > 1.15) {
                botPounds -= 1000;
                System.out.println("Sold 1000 pounds");
            } else {
                System.out.println("No pounds have been sold");
            }

            System.out.println("Amount of pounds at the end of the day: " + botPounds);
        }

        System.out.println("All the pounds have been sold!");
    }
}
