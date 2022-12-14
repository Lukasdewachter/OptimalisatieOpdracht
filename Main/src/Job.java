public class Job {
    private final int id;
    private final int duration;
    private final int releaseDate;
    private final int dueDate;
    private final float earlinessPenalty;
    private final float rejectionPenalty;

    private long start=0, stop=0;
    public Job(int id, int duration, int releaseDate, int dueDate, float earlinessPenalty, float rejectionPenalty){
        this.id = id;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.dueDate = dueDate;
        this.earlinessPenalty = earlinessPenalty;
        this.rejectionPenalty = rejectionPenalty;
    }

    public int getId() {
        return id;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public long getStart() {
        return start;
    }

    public long getStop() {
        return stop;
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
        double penalty = getDueDate() - getStop();
        return earlinessPenalty*penalty;
    }

    public double getRejectionPenalty() {
        return rejectionPenalty;
    }

    public void print(){
        System.out.println("-------------------------------");
        System.out.println(id+ " "+ duration+" "+releaseDate+" "+dueDate+" "+earlinessPenalty+" "+rejectionPenalty);
    }
}
