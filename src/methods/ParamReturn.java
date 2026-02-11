package methods;

public class ParamReturn {

    public static String voteEligibility(int age){
        if(age < 18){
            return "Ineligible";
        }
        return "Eligible";
    }

    static void main() {
        String isEligible = voteEligibility(18);
        System.out.println(isEligible);
    }
}
