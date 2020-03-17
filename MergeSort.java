import java.util.ArrayList;

class MergeSort {
    public MergeSort(ArrayList<Integer> list){

    }
    private ArrayList<Integer> sorter(ArrayList<Integer> list){
        
    }
    private ArrayList<Integer> merger(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        int totalLenght = list1.size() + list2.size();
        while (newlist.size() < totalLenght){
            if (list1.size() == 0){
                newlist.add(list2.get(0));
                list2.remove(0);
            } else if (list2.size() == 0){
                newlist.add(list1.get(0));
                list2.remove(0);
            } else {
                if (list1.get(0)<list2.get(0)){
                    newlist.add(list1.get(0));
                    list1.remove(0);
                } else {
                    newlist.add(list2.get(0));
                    list2.remove(0);
                }
            }
        }
        return newlist;
    }
}