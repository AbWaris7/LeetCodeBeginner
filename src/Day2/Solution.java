package Day2;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Loop through each customer by index
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;

            // Calculate the wealth of the current customer by summing their accounts
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }

            // Update maxWealth if the current wealth is greater
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] richPerson= {{1,2,3},{50,2,1}, {7,8,1}};
        System.out.println(solution.maximumWealth(richPerson));
    }
}


