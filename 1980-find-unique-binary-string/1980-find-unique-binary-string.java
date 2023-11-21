class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String ans = "";


        for (int i=0; i<nums.length;i++){
            char currChar = nums[i].charAt(i);
            char oppositeChar;

        //     if (currChar == '0'){
        //         oppositeChar = '1';
        //     }
        //     else{
        //         oppositeChar = '0';
        //     }
        oppositeChar = (currChar == '0' ) ? '1' : '0' ;
        ans += oppositeChar;
    }
        return ans;
    }
}