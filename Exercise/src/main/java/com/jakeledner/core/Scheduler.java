package com.jakeledner.core;
import java.time.LocalDate;
import java.util.List;
import java.util.PriorityQueue;
import com.jakeledner.model.Exercise;
import java.time.LocalDate;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Scheduler {
    private PriorityQueue<Exercise> queue = new PriorityQueue<>();
    public void add(Exercise e)      { queue.offer(e); }
    public Exercise next()           { return queue.peek(); }
    public Exercise completeNext()   { return queue.poll(); }
    public List<Exercise> allToday(LocalDate day) {
        return null;
        // filter without removing; e.g. stream().filter(e -> e.date == day)
    }
    // load/save methods…
}
