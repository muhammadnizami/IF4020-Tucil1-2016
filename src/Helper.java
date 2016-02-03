
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nim_13512501
 */
public class Helper {
    public static String readStream(InputStream is) {
    StringBuilder sb = new StringBuilder(512);
    try {
        Reader r = new InputStreamReader(is, "UTF-8");
        int c = 0;
        while ((c = r.read()) != -1) {
            sb.append((char) c);
        }
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    return sb.toString();
}

}
