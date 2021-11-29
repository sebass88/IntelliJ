package Class24Projects;

public class MarksTester {
    public static void main(String[] args) {
        Marks marks=new StudentA(75,85,95);
        marks.getPercentage();

        Marks marks1=new StudentB(75,85,78,98);
        marks1.getPercentage();

        System.out.println("----------------------");

        Marks []marks2={new StudentA(85,50,99),new StudentB(85,75,90,95)};
        for(Marks ave:marks2){
            ave.getPercentage();
        }
    }
}
