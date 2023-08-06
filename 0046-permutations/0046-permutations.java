class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        printPermute(res,new ArrayList(),nums);
        return res;
        
    }
    
  void   printPermute(List<List<Integer>> res,List<Integer> temp,int nums[]){
      if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp)); // Add a copy of temp to the result
            return;
        }
        for (int number : nums) {
            if (!temp.contains(number)) { // Check if the number is not already in temp
                temp.add(number);
                printPermute(res, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
       
}
}