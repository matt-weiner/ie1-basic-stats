import java.util.ArrayList;
import java.util.Collections;

public class MinMaxCalculation {
private Numbers numbers;

public MinMaxCalculation(
Numbers numbers
){
this.numbers = numbers;
}

public Double minimum(){
ArrayList<Double>  numList = numbers.getData();
return Collections.min(numList);
}

public Double maximum(){
ArrayList<Double> numList = numbers.getData();
return Collections.max(numList);
}
}
