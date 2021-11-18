package Class18HW;

public class Task3 {
   // Write a Java program called Teacher.
   // Identify features and behaviour of that Class.
           // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    //that would have it their own features and behaviour. Test all 4 classes

    public static void main(String[] args) {

        MathTeacher math=new MathTeacher();
        math.name="Joe";
        math.TeachMath();

        ChemistryTeacher chem=new ChemistryTeacher();
        chem.name="Buck";
        chem.Teachchemistry();
    }


}

class Teacher{
    String name;
    void teach(){
        System.out.println("Teachers teach subjects");
    }
}
class MathTeacher extends Teacher{

    void TeachMath(){
        System.out.println(name+" Teaches math");
    }
}
class ChemistryTeacher extends Teacher{

    void Teachchemistry(){
        System.out.println("Teaches chemistry");
    }
}
class PianoTeacher extends Teacher{

    void teachesPiano(){
        System.out.println("Teaches piano lessons");
    }
}
