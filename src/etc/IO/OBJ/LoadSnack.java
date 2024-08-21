package etc.IO.OBJ;

import etc.IO.FileExample;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {
    public static void main(String[] args) {

        try (FileInputStream fis
                                = new FileInputStream(FileExample.Root_PATH + "/snack.sav")) {

            //객체를 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Snack> snackList = (List<Snack>) ois.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
