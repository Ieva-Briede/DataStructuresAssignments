import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {

    public static void main(String[] args) {

        String[] values = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};
        ArrayList<String> newArrayList = new ArrayList<String>();
        Collections.addAll(newArrayList, values);
        System.out.println("Converted Array List: " + newArrayList);
        System.out.println("There are " + valuesStartingWithC(newArrayList) + " values which starts with letter C");
        System.out.println("There are " + valuesEndsWithE(newArrayList) + " value(s) which end with letter e");
        System.out.println("There are " + valuesWithLength5(newArrayList) + " value(s) which length is 5 letters");
        System.out.println("There are " + valuesContaingE(newArrayList) + " values which contains letter e");
        System.out.println("There are " + substringTe(newArrayList) + " elements which consist of substring te");
        //histogram(newArrayList);

        Collections.sort(newArrayList);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList "
                + "in Ascending order : "
                + newArrayList);
    }

    public static int valuesStartingWithC(ArrayList<String> arrayList) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).charAt(0) == 'C') {
                counter++;
            }
        }
        return counter;
    }

    public static int valuesEndsWithE(ArrayList<String> arrayList) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((arrayList.get(i).charAt(arrayList.get(i).length() - 1)) == 'e') {
                counter++;
            }
        }
        return counter;
    }

    public static int valuesWithLength5(ArrayList<String> arrayLists) {
        int counter = 0;
        for (int i = 0; i < arrayLists.size(); i++) {
            if ((arrayLists.get(i).length()) == 5) {
                counter++;
            }
        }
        return counter;
    }


    public static int valuesContaingE(ArrayList<String> arrayList) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Pattern pattern = Pattern.compile("([eE])");
            Matcher matcher = pattern.matcher(arrayList.get(i));
            if (matcher.find()) {
                counter++;
            }
        }
        return counter;
    }

    public static int substringTe(ArrayList<String> arrayList) {
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Pattern pattern = Pattern.compile("te", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(arrayList.get(i));
            if (matcher.find()) {
                counter++;
            }
        }
        return counter;
    }
}
//    public static void histogram(String[] values){
//        System.out.println("Histogram: \n");
//        int [] emptyArr = new int[14];
//        for(int i = 0; i < emptyArr.length; i++){
//            int counter = 0;
//            for (String value : values) {
//                if (i == value.length()){
//                    counter++;
//                }
//            }
//            emptyArr[i] = counter;
//            if (counter != 0) {
//                System.out.println(i + " values contain " + emptyArr[i] + " elements.");
//            }
//        }
//    }
//
//}