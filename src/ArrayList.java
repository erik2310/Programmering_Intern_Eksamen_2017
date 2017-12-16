public class ArrayList {

    public static void main(String[] args) {

        // Oprettelse af en ArrayList som kan gemme Integers
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();

        // Gemmer nogen tal i ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Gennemløb af arrayet
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

}
