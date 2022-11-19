import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattener {
				
	@SuppressWarnings("unchecked")
	public static List<Object> flatten(List<Object> list) {
		
		return list.stream()
				.flatMap(item -> item instanceof List ? 
				Flattener.flatten((List<Object>) item).stream() : 
					Stream.of(item))
				.filter(item -> item != null)
				.collect(Collectors.toList());
	}
}
