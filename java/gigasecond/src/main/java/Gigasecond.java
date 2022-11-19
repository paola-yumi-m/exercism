import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Gigasecond {
	
	private LocalDateTime moment;
	
    public Gigasecond(LocalDate moment) {
    	this.moment = LocalDateTime.of(moment, LocalTime.of(0, 0));
    }

    public Gigasecond(LocalDateTime moment) {
    	this.moment = moment;
    }

    public LocalDateTime getDateTime() {
    	long gigasecond = 1000000000l;
    	return moment.plusSeconds(gigasecond);
    }
}
