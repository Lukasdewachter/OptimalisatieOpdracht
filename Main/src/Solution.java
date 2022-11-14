import java.util.*;

public class Solution {
    int numberOfJobs;
    LinkedList<Job> solution = new LinkedList<>();
    LinkedList<Job> notScheduledJobs = new LinkedList<>();
    ArrayList<Job> jobs= new ArrayList<>();
    double bestCost;

    Solution(ArrayList<Job> jobs){
        this.jobs=jobs;
        numberOfJobs = jobs.size();
    }

    // Function to schedule the jobs take 2 arguments
    // arraylist and no of jobs to schedule
    void printJobScheduling(ArrayList<Job> jobs)
    {
        // Length of array
        int n = jobs.size();

        // Sort all jobs according to due date
        jobs.sort(Comparator.comparing(a -> a.getDueDate()));


        // To keep track of free time slots
        boolean result[] = new boolean[];

        // To store result (Sequence of jobs)
        char job[] = new char[t];

        // Iterate through all given jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (Note that we
            // start from the last possible slot)
            for (int j = (int) Math.min(t - 1, jobs.get(i).getReleaseDate() - 1); j >= 0; j--) {
                // Free slot found
                if (result[j] == false) {
                    result[j] = true;
                    job[j] = (char) jobs.get(i).getId();
                    break;
                }
            }
        }

        // Print the sequence
        for (char jb : job)
            System.out.print(jb + " ");
        System.out.println();
    }
    boolean isScheduled(Job job){
        if (solution.contains(job)){
            return true;
        } else return false;
    }
    //Weighted schedule duration + earliness penalty + penalty of rejected jobs
    double evaluate(LinkedList<Job> solution, LinkedList<Job> notScheduledJobs){
        double sum =0;

        for(int i=0; i< notScheduledJobs.size();i++){
            sum+=notScheduledJobs.get(i).getRejectionPenalty();
        }
        return sum;
    }

}
