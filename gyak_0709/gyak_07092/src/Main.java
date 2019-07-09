public class Main {

    public static void main(String[] args) {


        whichIsBigger();

        divisbe();

        perTwo();

        sequenceIt();

        minumum();

        szamjegy();

        szamok();

        parosszamok();

        paratlanszamok();

        multipleofThree();

        backwards();

        multipleofFive();

        betweenImplicit();

        betweenExplicit();

        inBetween();

        cinemaTicket();
    }

    //1. feladat
    public static void whichIsBigger() {
        long x = (Math.round(Math.random() * 9)) + 1;
        long y = (Math.round(Math.random() * 9)) + 1;
        if (x > y) {
            System.out.println("A két szám: " + x + " és " + y + ", és az első a nagyobb.");
        } else if (x < y) {
            System.out.println("A két szám: " + x + " és " + y + ", és a második a nagyobb.");
        } else if (x == y) {
            System.out.println(("A két szám egyenlő és értékük " + x));
        }
    }

    //2. feladat
    public static void divisbe() {
        long x = (Math.round(Math.random() * 99)) + 1;
        long y = (Math.round(Math.random() * 99)) + 1;
        if (x % y == 0) {
            System.out.println(x + " oszható" + y + "-vel");
        } else {
            System.out.println(x + " nem oszható " + y + "-val/vel");
        }
    }

    //3. feladat
    public static void perTwo() {
        long x = 100 - (Math.round(Math.random() * 199)) + 1;
        if (x % 2 == 0) {
            System.out.println("A szám (" + x + ") páros");
        } else {
            System.out.println("A szám (" + x + ") páratlan");
        }
    }

    //4. feladat
    public static void sequenceIt() {
        long x = 50 - (Math.round(Math.random() * 99)) + 1;
        long y = 50 - (Math.round(Math.random() * 99)) + 1;
        long z = 50 - (Math.round(Math.random() * 99)) + 1;
        long temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        if (y > z) {
            temp = y;
            y = z;
            z = temp;

        }
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        System.out.println("A számok növekvő sorrendben: " + x + ", " + y + ", " + z);
    }

    //5. feladat
    public static void minumum() {
        long a = (-110) + (Math.round(Math.random() * 430)) + 1;
        long b = (-110) + (Math.round(Math.random() * 430)) + 1;
        long c = (-110) + (Math.round(Math.random() * 430)) + 1;
        long d = (-110) + (Math.round(Math.random() * 430)) + 1;
        long e = (-110) + (Math.round(Math.random() * 430)) + 1;
        long min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        if (e < min) {
            min = e;
        }
        System.out.println("A legkisebb generált szám a " + min);
    }

    //6. feladat
    public static void szamjegy() {
        int x = (int) Math.floor(Math.random() * 199) + 1;
        System.out.println(x);
        int szazas = x / 100;
        int tizes = x / 10;
        int counter = 0;
        if (tizes > 10) {
            tizes = tizes - 10;
        }
        if (tizes % 2 == 0) {
            counter++;
        }

        int egyes = x - (szazas * 100) - (tizes * 10);
        if (egyes % 2 == 0) {
            counter++;
        }
        if (szazas == 0 && tizes != 0) {
            int jegyosszeg = tizes + egyes;
            System.out.println("A számjegyek összege " + jegyosszeg + " és " + counter + " páros számjegye van");
        }
    }

    //7. feladat
    public static void szamok() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }

    //8. feladat
    public static void parosszamok() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //9. feladat
    public static void paratlanszamok() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    //10. feladat
    public static void multipleofThree() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //11. feladat
    public static void backwards() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }

    //12. feladat
    public static void multipleofFive() {
        int r = (int) Math.floor(Math.random() * 9) + 1;
        System.out.println("Az r értéke: " + r);
        int counter = 0;
        for (int i = 1; i < 55; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
                counter = counter + 1;
            }
            if (counter == r) {
                break;
            }
        }
    }

    //13. feladat
    public static void betweenImplicit() {
        int x = (int) Math.floor(Math.random() * 2) + 1;
        int y = (int) Math.floor(Math.random() * 5) + 5;
        for (int i = x; i < y+1; i++) {
            System.out.println(i);
        }
    }

    //14. feladat
    public static void betweenExplicit() {
        int x = (int) Math.floor(Math.random() * 2) + 1;
        int y = (int) Math.floor(Math.random() * 5) + 5;
        for (int i = x+1; i < y; i++) {
            System.out.println(i);
        }
    }

    //15. feladat

    public static void inBetween () {
        int a = (int) Math.floor(Math.random() * 5) + 5;
        int b = (int) Math.floor(Math.random() * 3) + 1;
        int c = (int) Math.floor(Math.random() * 3) + 10;
        int n= c-b;
        for (int i=a; i>0;i--) {
            int r = (int) Math.floor(Math.random() * n) + b;
            System.out.println(r);
        }
    }

    //16. feladat

    public static void cinemaTicket () {
        int price = (int) Math.floor(Math.random() * 10) + 10;
        price = 100*price;
        int viewer = 5;
        int newprice;
        for (int i=0; i<viewer; i++) {
            int age=(int) Math.floor(Math.random() * 98) + 1;
            if (age<5) {
                newprice = 0;
            } else if (age < 18 || age > 65) {
                newprice = (price/2);
            } else {
                newprice = price;
            }
            System.out.println("Kor: "+ age + " ár: " + newprice);
        }
    }
}

