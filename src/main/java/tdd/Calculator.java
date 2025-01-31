package tdd;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }



    public int add(String s) {
        // Opretter et array ud fra String parametret = "1,2,3" = ["1","2","3"] er hvordan arrayet ser ud bagefter
        // i parametret(regex?) af split, så splitter den en string op hver gang der opstår et komma. \\s* tager højde for spaces, tror jeg?
        String[] split = s.split(",\\s*");
        int sum = 0;

        //Iterer gennem hele arrayet "split", og for hver string tal bliver summen tilføjet af int-værdien af den string
        //Eksempelvis første gang split itereres gennem, så tilføjes sum konversionen af "1". Dernæst bliver sum tilføjet 2 = 3 osv.
        for(String number : split){
            sum += Integer.parseInt(number);
        }

        //Returnerer til sidst summen af hele det String array som oprettes
        return sum;
    }

    public int add(int[] numbers) {
        int sum = 0;

        //Itererer gennem arrayet "numbers" som er parametret/input. For hvert element i int arrayet, så bliver det tilføjet til sum.
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
