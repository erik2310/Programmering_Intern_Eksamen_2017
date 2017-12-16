package ExceptionThrows;

import java.io.IOException;

public class ThrowsEksempel {

    void metode(int num) throws IOException, ClassNotFoundException {

        if(num==1) {
            throw new IOException("IOException Occurred");
        }
        else {
            throw new ClassNotFoundException("ClassNotFoundException");
        }

    }

}
