import java.util.*;
public class Search{
    public static boolean debugging = false;
    public static void main(String[] args){
        ArrayList<String> haystack = new ArrayList<String>();
        int needleIndex = 27;
        for(int i = 0; i <= 27; i++){
            if(i == needleIndex){
                haystack.add("needle");
            } else {
                haystack.add("hay");
            }
        }

        if(debugging){
            System.out.println(haystack);
        }

        System.out.println(search(haystack, "needle"));
        if(debugging){
            System.out.println(search(haystack,"needle"));
        }

        System.out.println(binarySearch(haystack, "needle"));
    }

    public static int search(ArrayList<String> haystack, String needle){
        int i = 0;
        for(String str: haystack){
            if(debugging){
                System.out.println(i);
                System.out.println(str);
            }
            if(str.equals(needle)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int binarySearch(ArrayList<String> haystack, String needle){
        boolean searching = true;
        int half = haystack.size() / 2;
        for(int i = 0; i < 10; i ++){
            if(debugging){
                System.out.println(half);
            }
            if(haystack.get(half).compareTo(needle) == 0){
                searching = false;
                return half ;
            } else if(haystack.get(half).compareTo(needle) < 0){
                half = (half / 2) + (haystack.size() / 2);
            } else {
                half = half / 2;
            }
        }
        return -1;
    }
}