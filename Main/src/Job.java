public class Job {
    private int id;
    private int duration;
    private int releaseDate;
    private int dueDate;
    private int earlinessPenalty;
    private int rejectionPenalty;
    //
    public Job(int id, int duration, int releaseDate, int dueDate, int earlinessPenalty, int rejectionPenalty){
        this.id = id;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.dueDate = dueDate;
        this.earlinessPenalty = earlinessPenalty;
        this.rejectionPenalty = rejectionPenalty;
    }
}
