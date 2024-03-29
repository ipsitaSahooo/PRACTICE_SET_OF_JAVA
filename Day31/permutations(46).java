class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        permutation(nums, 0, list);
        return list;
    }

    public void permutation(int[] arr, int index, List<List<Integer>> list) {
         List<Integer> ans = new ArrayList<>();
        if (arr.length == index) {
            for (int num : arr) {
                ans.add(num);
            }
             // We have generated a full permutation, so print it
            list.add(ans);  
            return;
        }
             // Generate permutations by swapping the current element with each subsequent element
        for (int i = index; i < arr.length; i++) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            permutation(arr, index + 1, list);
            //backtrack to get back the orignal array
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
