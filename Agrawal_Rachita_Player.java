class Agrawal_Rachita_Player extends Player {

    // Variable declaration
    int cooperation1 = 0;
    int cooperation2 = 0;

    int selectAction(int n, int[] myHistory, int[] oppHistory1, int[] oppHistory2) {
        // Rule 1
        // Nice Player: Start with cooperation
        if (n==0) return 0;

        // Rule 2
        // Nasty Player: End with defection since we cannot retaliate
        if (n>=99) return 1;
    
        // Opponent's cooperation count
        cooperation1 += oppHistory1[n-1]==0?1:0;
        cooperation2 += oppHistory2[n-1]==0?1:0;
    
        // Calculate cooperate probabilities for each opponent
        double coop_probability1 = (double)cooperation1/oppHistory1.length;
        double coop_probability2 = (double)cooperation2/oppHistory2.length;
    
        // Rule 3
        // Hard Tit for Tat Player: Check if opponent has defected on any of the previous 2 moves, if true defect
        if ((n>1) && (oppHistory1[n - 1] == 1 || oppHistory1[n - 2] == 1 ||
                oppHistory2[n - 1] == 1 || oppHistory2[n - 2] == 1 )) {
            return 1;
        }

        // Rule 4
        // Tolerant Player: If both are inclined to cooperate, and if cooperation probability is greater than 75% then cooperate
        if ((oppHistory1[n - 1] == 0 && oppHistory2[n - 1] == 0) && (coop_probability1>0.75 && coop_probability2>0.75)) {
            return 0;
        }

        // Rule 5
        // Defect by default
        return 1;
    }
}

