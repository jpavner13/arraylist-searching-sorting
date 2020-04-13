import java.util.*;
public class Sort{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("g");
        list.add("h");
        list.add("q");
        list.add("m");
        list.add("t");
        list.add("p");
        list.add("z");

        //selectionSort(list);
        //insertionsSort(list);
        bubbleSort(list);
        System.out.println(list);
    }


   public static void selectionSort(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            String smallest = list.get(i);
            int smallIndex = i;
            for(int j = i; j < list.size(); j++){
                if(list.get(j).compareToIgnoreCase(smallest) < 0){
                    smallest = list.get(j);
                    smallIndex = j;
                }
            }
            list.set(smallIndex, list.get(i));
            list.set(i, smallest);
        }
    }

    public static void insertionsSort(ArrayList<String> list){
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareToIgnoreCase(list.get(i-1)) < 0){
                String temp = list.get(i);
                list.set(i, list.get(i-1));
                list.set(i-1, temp);
                for(int j = i-1; j > 0; j--){
                    if(list.get(j).compareToIgnoreCase(list.get(j-1)) < 0){
                        String temp2 = list.get(j);
                        list.set(j, list.get(j-1));
                        list.set(j-1, temp2);
                    }
                    else{
                        break;
                    }
                }
            }
        }
    }

    public static void bubbleSort(ArrayList<String> list){
        boolean noSwaps = false;
        while(!noSwaps){
            noSwaps = true;
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i+1).compareToIgnoreCase(list.get(i)) < 0){
                    String temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    noSwaps = false;
                }
            }

        }
    }
}