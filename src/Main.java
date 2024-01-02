public class Main {
    public static void main ( String[] args ) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++ ) {
            sum = sum + arr[i];
        }
        System.out.println ("Сумма трат за месяц составила " + sum + " рублей" );
        }

    public static void task2() {
        int[] arr = generateRandomArray();
        int maxSpend = 0;
        int minSpend = 200001;
        for (int i = 0; i < arr.length; i++ ) {
            if ( arr[i] > maxSpend  ) {
                maxSpend = arr[i];}
            }
        for (int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < minSpend  ) {
                minSpend = arr[i];}
        }
        System.out.println ( "Минимальная сумма трат за день составила " + minSpend + " рублей. Максимальная сумма трат за день составила " + maxSpend + " рублей"  );
        }

        public static void task3() {
        int[] arr = generateRandomArray();
        float sum = 0;
        float everage = 0;
            for (int i = 0; i < arr.length; i++ ) {
                sum = sum + arr[i];}
            everage = sum / 30;
            System.out.println ( "Средняя сумма трат за месяц составила " + everage + " рублей"  );}

       public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
           for (int i = 10; i > -1; i-- )
               System.out.print (reverseFullName[i]);
       }

}