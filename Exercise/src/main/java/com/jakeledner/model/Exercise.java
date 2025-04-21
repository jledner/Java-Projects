package com.jakeledner.model;

import java.time.LocalDate;

public class Exercise implements Comparable<Exercise> {
    private String name;
    private String muscleGroup;
    private int priority;
    private LocalDate scheduledDate;

    // ← Add this
    public Exercise(String name, String muscleGroup, int priority, LocalDate scheduledDate) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.priority = priority;
        this.scheduledDate = scheduledDate;
    }

    public String getName() { return name; }           // ← And this
    public String getMuscleGroup() { return muscleGroup; }
    public int getPriority() { return priority; }       // ← And this
    public LocalDate getScheduledDate() { return scheduledDate; }

    @Override
    public int compareTo(Exercise other) {
    int p = Integer.compare(other.priority, this.priority);
    return (p != 0)
         ? p
         : this.scheduledDate.compareTo(other.scheduledDate);
}

}
