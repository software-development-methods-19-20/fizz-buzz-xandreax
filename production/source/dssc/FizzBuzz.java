package dssc;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private int number;
    private static Map<Integer, String> fizzMap;
    static{
        fizzMap = new HashMap<>();
        fizzMap.put(3, "Fizz");
        fizzMap.put(5, "Buzz");
    }

    public FizzBuzz (int number){
        this.number=number;
    }

    public static void main(String[] args) {
        FizzBuzz fizz = new FizzBuzz(30);
        System.out.println(fizz.convertNumberToString());
    }


    public String convertNumberToString() {
        StringBuilder result = new StringBuilder();
        if(isMultiple()){
            for(int value : fizzMap.keySet()){
                if(number%value == 0){
                    result.append(fizzMap.get(value));
                }
            }
            return result.toString();
        }
        else{
            return String.valueOf(number);
        }
    }

    private boolean isMultiple() {
        for(int value : fizzMap.keySet()){
            if(number%value == 0){
                return true;
            }
        }
        return false;
    }
}
