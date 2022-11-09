public class Job {
    private long id;
    private long duration;
    private long releaseDate;
    private long dueDate;
    private double earlinessPenalty;
    private double rejectionPenalty;
    //
    public Job(long id, long duration, long releaseDate, long dueDate, double earlinessPenalty, double rejectionPenalty){
        this.id = id;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.dueDate = dueDate;
        this.earlinessPenalty = earlinessPenalty;
        this.rejectionPenalty = rejectionPenalty;
    }
    public void print(){
        System.out.println("-------------------------------");
        System.out.println(id+ " "+ duration+" "+releaseDate+" "+dueDate+" "+earlinessPenalty+" "+rejectionPenalty);
    }
}
