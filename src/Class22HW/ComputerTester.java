package Class22HW;

public class ComputerTester {
    public static void main(String[] args) {

        Computer []computers={new Apple("Apple"),new Lenovo("Lenovo"),new HP("HP"),new Dell("Dell")};

        for (Computer computer2:computers){
            computer2.operatingSystem();

            if (computer2 instanceof Apple){
                ((Apple)computer2).cost();
            }
            if (computer2 instanceof Lenovo){
                ((Lenovo)computer2).laptops();
            }
            if (computer2 instanceof HP){
                ((HP)computer2).brand();
            }
            if (computer2 instanceof Dell){
                ((Dell)computer2).services();
            }
        }

    }
}
