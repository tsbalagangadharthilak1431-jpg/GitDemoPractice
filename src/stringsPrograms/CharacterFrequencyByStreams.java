package stringsPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyByStreams {
    public static void main(String[] args) {
        String input = "aabbA";
        Map<Character,Long> frequency = input.toLowerCase().replace(" ","").chars()
                .mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        frequency.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
