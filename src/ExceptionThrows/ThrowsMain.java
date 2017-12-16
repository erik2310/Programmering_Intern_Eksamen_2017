package ExceptionThrows;

public class ThrowsMain {

    public static void main(String[] args) {

        try {

            ThrowsEksempel throwsEksempel = new ThrowsEksempel();

            throwsEksempel.metode(1);

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
