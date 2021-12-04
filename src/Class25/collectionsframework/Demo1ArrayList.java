package Class25.collectionsframework;

import java.util.ArrayList;

public class Demo1ArrayList {

    // Limitation of arrays
    // 1) Arrays are fixed in size
    public static void main(String[] args) {
        String name="Hasim";
        String name2="Ahmet";
        String[]names={"Maryam","Amran"};
        // name[2]="Mohammad";// can't add more than 2 elements

        java.util.ArrayList<String> listofNames=new java.util.ArrayList<>();
        System.out.println("size of listofnames "+listofNames.size());
        listofNames.add("Mustafa");
        listofNames.add("Aysha");
        listofNames.add("Tamanna");
        System.out.println("size of listofnames "+listofNames.size());
        listofNames.remove("Tamanna");
        System.out.println("size of listofnames "+listofNames.size());



    }


}
