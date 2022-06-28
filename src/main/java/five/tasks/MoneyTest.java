package five.tasks;

public class MoneyTest {
    Money shortName;
    public MoneyTest (Money shortName) {this.shortName = shortName;}
    public void describe(){
        System.out.print("This money abb is: ");
        switch (shortName) {
            case BYR:
                System.out.println("Belarus rub");
                break;
            case EUR:
                System.out.println("EURO");
                break;
            case RUB:
                System.out.println("Russian rub");
                break;
            case GBP:
                System.out.println("English pounds");
                break;
            case USD:
                System.out.println("US dollar");
                break;
            case CNY:
                System.out.println("China yeans");
                break;
            default:
                System.out.println("Error abb");
        }
    }
    public static void main(String[] args) {
        MoneyTest
                belarus = new MoneyTest(Money.BYR),
                russian = new MoneyTest(Money.RUB),
                american = new MoneyTest(Money.USD),
                british = new MoneyTest(Money.GBP),
                chinies = new MoneyTest(Money.CNY),
                europe = new MoneyTest(Money.EUR);
        belarus.describe();
        russian.describe();
        american.describe();
        british.describe();
        chinies.describe();
        europe.describe();

        //for (Money m : Money.values())
          //  System.out.println(m + ", ordinal " + m.ordinal());
    }
}
