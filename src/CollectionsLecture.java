//
//import java.util.ArrayList;
//
//public class CollectionsLecture {
//    public static void main(String[] args) {
//        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = ArrayList<>();
//
//        //add first element
//        stringArr.add("Chris");
//        System.out.printf("Current ArrayList size; %s", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(System.identityHashCode(stringArr));
//        System.out.println(stringArr.hashCode());
//        System.out.println("\n");
//
//        //add second element
//        stringArr.add("Raul");
//        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
//        System.out.println("\n");
//
//        //remove second element
////        stringArr.remove(1);
////        System.out.println(System.identityHashCode(stringArr));
//
//
//        System.out.println("Array list copy: ");
//        System.out.println(stringArrCopy);
//        System.out.println("Copied list hashcode: ");
//        System.out.println(System.identityHashCode(stringArr));
//        System.out.println("\n");
//
//        System.out.println("The array lists are equal: " + stringArr.equals(stringArrCopy) );
//
//
//    }
//}
