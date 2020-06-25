import java.util.stream.Stream;
 
class filterstrings {
 
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("cap", "ace", "cattle", "box");
        stream.filter(s -> s.startsWith("a") && s.length()==3)
        .forEach(System.out::println);
    }
} 
