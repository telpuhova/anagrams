/**
 * Created by Guest on 1/2/18.
 */
public class Anagrams {
    public Boolean anagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else {
            Boolean result = false;
            String[] word1Arr = word1.split("");
            String[] word2Arr = word2.split("");
            for (String value : word1Arr) {
                for (String value2 : word2Arr) {
                    if (value2.equals(value)) {
                        result = true;
                        break;
                    } else {
                        result = false;
                    }
                }
                if (!result) {
                    break;
                }
            }

//            for (String value2 : word2Arr) {
//                for (String value : word1Arr) {
//                    if (value.equals(value2)) {
//                        result = true;
//                        break;
//                    } else {
//                        result = false;
//                    }
//                }
//            }

            return result;
        }
    }
    public String multiple(String word) {
        String stringResult = "";
        String [] wordArr = word.split(" ");
        for (String value : wordArr) {
            for (String nextValue : wordArr) {
                if (value.equals(nextValue)) {
                    continue;
                }
                if (anagrams(value, nextValue)) {
                    if (!(stringResult.contains(value))) {
                        stringResult += value + " ";
                    }
                    if (!(stringResult).contains(nextValue)) {
                        stringResult += nextValue + " ";
                    }

                }
            }
//            stringResult += " | ";
            //break;
        }
        return stringResult.trim();
    }
}
