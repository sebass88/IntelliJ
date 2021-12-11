package Class26Hw02;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {

        ArrayList<Insurance>insurances=new ArrayList<>();
        insurances.add(new Car("Tesla","Geico"));
        insurances.add(new Pet("Cat","wagmo"));
        insurances.add(new Health("Aetna"));

        for(int i=0; i<insurances.size();i++){
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }

        for(Insurance ins:insurances){
            ins.getQuote();
            ins.cancelInsurance();
        }



    }
}
