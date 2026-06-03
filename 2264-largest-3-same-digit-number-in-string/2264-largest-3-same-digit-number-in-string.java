class Solution {
    public String largestGoodInteger(String nums) {
        if(nums.contains("999")) return "999";
         if(nums.contains("888")) return "888";
          if(nums.contains("777")) return "777";
           if(nums.contains("666")) return "666";
            if(nums.contains("555")) return "555";
             if(nums.contains("444")) return "444";
              if(nums.contains("333")) return "333";
                if(nums.contains("222")) return "222"; 
                 if(nums.contains("111")) return "111";
                  if(nums.contains("000")) return "000";
                  return "";
    }

    
}