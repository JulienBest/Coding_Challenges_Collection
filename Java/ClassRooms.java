
public class ClassRooms {

	public static void main(String[] args) {


		TimeDuration[] durations = new TimeDuration[] {
			new TimeDuration(30, 70),
			new TimeDuration(0,  50),
			new TimeDuration(60,150)
		};

		int roomCounter = 0;

		for (int i = 1; i < durations.length; i++) {
			if (durations[0].isOverlapping(durations[i])) {
				roomCounter++;
			}
		}
		System.out.println(roomCounter);
	}
}

class TimeDuration {
	int start;
	int end;

	public TimeDuration (int start, int end) {
		this.start = start;
		this.end = end;
	}

	public boolean isOverlapping(TimeDuration duration2) {
		if (this.start > duration2.start && this.end < duration2.end ||
			this.start < duration2.start && this.end > duration2.end) {
			return true;
		}
		if (this.start > duration2.start && this.end > duration2.end ||
			this.start < duration2.start && this.end < duration2.end) {
			return true;
		}
		return false;
	}
	public boolean isEqual(TimeDuration duration) {
		if (this.start == duration.start && this.end == duration.end) {
			return true;
		}
		return false;
	}
}
