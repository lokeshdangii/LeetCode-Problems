class Solution {
    public String largestGoodInteger(String num) {
        if(num.contains("999")){
            return "999";
        }else if (num.contains("888")){
            return "888";
        }else if (num.contains("777")){
            return "777";
        }else if(num.contains("666")){
            return "666";
        }else if(num.contains("555")){
            return "555";
        }else if(num.contains("444")){
            return "444";
        }else if(num.contains("333")){
            return "333";
        }else if(num.contains("222")){
            return "222";
        }else if(num.contains("111")){
            return "111";
        }else if(num.contains("000")){
            return "000";
        }else{
            return "";
        }
    }
}


/* String result = "";
        
        int number = 999;
        
        for(int i=0;i<10;i++){
            String str = Integer.toString(number);
            
            
            if(num.contains(str)){
                
                if(str.equals("0")){
                return "000";
            }
                return str;
            }
            
            number -= 111;
        }
        
        return "";  */