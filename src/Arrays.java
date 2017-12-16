public class Arrays {

    public static void main(String[] args) {

        // Deklarer og laver arrayet
        int[] array = new int[10];

        // Initialiserer arrayet
        array[0] = 0;
        array[1] = 10;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40;
        array[5] = 50;
        array[6] = 60;
        array[7] = 70;
        array[8] = 80;
        array[9] = 90;

        // Gennemløb af arrayet
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
