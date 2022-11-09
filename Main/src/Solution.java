import java.util.*;

public class Solution {
    int numberOfJobs;
    int Horizon;
    LinkedList<Job> solution = new LinkedList<>();
    ArrayList<Job> jobs= new ArrayList<>();
    double cost;

    // heuristic
    LinkedList<Job> bestSolution = new LinkedList<>();
    double bestCost;

    Solution(ArrayList<Job> jobs){
        this.jobs=jobs;
        numberOfJobs = jobs.size();
    }

}
