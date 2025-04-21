public class Exercise implements Comparable<Exercise> {
    private String name;
    private String muscleGroup;
    private int priority;       // 1 (low) … 10 (high)
    private LocalDate scheduledDate;
    // constructors, getters/setters omitted

    @Override
    public int compareTo(Exercise other) {
        // highest priority first; for equal priority, earliest date first
        int pCmp = Integer.compare(other.priority, this.priority);
        return (pCmp != 0) ? pCmp
             : this.scheduledDate.compareTo(other.scheduledDate);
    }
}
