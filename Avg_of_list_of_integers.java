import java.util.*;
import java.util.stream.IntStream;
 
class avgoflist {
 
    public static void main(String[] args)
    {
        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8,10);  
        OptionalDouble object = stream.average();
        if (object.isPresent()) {
            System.out.println(object.getAsDouble());
        }
        else {
            System.out.println("-1");
        }
    }
}
