public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Hello, Team");
        System.out.println("Hello David. This is IntelliJ application and it is your first JAVA program I believe.");

        int myfirstNumber = 5*2;
        int mysecondNumber = 10 + 5;
        int myTotal = myfirstNumber + mysecondNumber;

        int myRecursion = 2;
        myRecursion = myRecursion + myTotal;

        System.out.println(myfirstNumber);
        System.out.println(mysecondNumber);
        System.out.println(myTotal);

        System.out.println(myRecursion);

        myRecursion = myRecursion + myTotal;
        System.out.println(myRecursion);


    }
}
