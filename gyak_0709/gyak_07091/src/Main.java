public class Main {
    public static void main(String[] args) {
        int a = 18;
        int b = (a + 2);
        int c = (a - 5);
        int age = howOld(a, b, c);
        System.out.println(age + " évesek együtt");

        int apple = 30;
        int banana = buyBanana(apple);
        int lemon = buyLemon(apple);
        float fruits = buyFruits(apple, banana, lemon);
        System.out.println((apple + " dkg almát, " + banana + " dkg banánt és " + lemon + " dkg citromot kell vennünk, ami összesen " + fruits + "kg gyümölcsöt jelent."));

        double celsius = 5.0;
        temperatureConverter(celsius);
    }
    //1. feladat
    public static int howOld(int a, int b, int c) {
        int result = a+b+c;
        return result;
    }

    //2. feladat
    public static int buyBanana(int apple) {
        int banana=2*apple;
        return banana;
    }

    public static int buyLemon(int apple) {
        int lemon=3*apple;
        return lemon;
    }

    public static float buyFruits(int apple, int banana, int lemon) {
        float fruits=(apple+banana+lemon)/100f;
        return fruits;
    }

    //3. feladat
    public static void temperatureConverter(double celsius) {
        double kelvin = celsius +273;
        double farenheit = ((celsius*18)/10)+32;
        System.out.println("A mai hőmérséklet celsiusban " + celsius + " , kelvinben " + kelvin + ", farenheitben pedig " + farenheit + " fok.");
    }
}