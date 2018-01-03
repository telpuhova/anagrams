import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Created by Guest on 1/2/18.
 */
public class App {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Anagrams: Write some words");
            String input = bufferedReader.readLine();
            Anagrams newAnagrans = new Anagrams();
            String output = newAnagrans.multiple(input);
            System.out.println(output);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
