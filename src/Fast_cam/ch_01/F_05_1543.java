package Fast_cam.ch_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_05_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();
        int count = 0;

        for (int i = 0; i < doc.length(); i++) {
            boolean isMatch = true;
            for (int j = 0; j < word.length(); j++) {
                if(i + j >= doc.length() ||
                        doc.charAt(i + j) != word.charAt(j)){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                count++;
                i += word.length() - 1;
            }
        }
        System.out.println(count);
    }
}
