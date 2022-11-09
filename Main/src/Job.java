public class Job {
    private final long id;
    private final long duration;
    private final long releaseDate;
    private final long dueDate;
    private final double earlinessPenalty;
    private final double rejectionPenalty;
    public Job(long id, long duration, long releaseDate, long dueDate, double earlinessPenalty, double rejectionPenalty){
        this.id = id;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.dueDate = dueDate;
        this.earlinessPenalty = earlinessPenalty;
        this.rejectionPenalty = rejectionPenalty;
    }
    public long getDuration() {
        return duration;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public long getDueDate() {
        return dueDate;
    }

    public double getEarlinessPenalty() {
        return earlinessPenalty;
    }

    public double getRejectionPenalty() {
        return rejectionPenalty;
    }

    public void print(){
        System.out.println("-------------------------------");
        System.out.println(id+ " "+ duration+" "+releaseDate+" "+dueDate+" "+earlinessPenalty+" "+rejectionPenalty);
    }
}
