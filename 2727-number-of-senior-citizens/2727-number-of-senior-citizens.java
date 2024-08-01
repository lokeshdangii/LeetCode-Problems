class Solution {
    public int countSeniors(String[] details) {
        
        int result = 0;
         for (String str : details) {
            // Extract the age part
            String ageString = str.substring(11, 13);
            // Convert the ageString to an integer
            int age = Integer.parseInt(ageString);
            // Check if the age is greater than 60
            if (age > 60) {
                result++;
            }
        }
        return result;
    }
}





            // char arr[] = str.toCharArray();
            // if(int (str(arr[11] + arr[12]))){}