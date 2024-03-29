class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> arr = new ArrayList<>();
        // arr.add(new ArrayList<>());

        // for (int j : nums) {
        //     List<List<Integer>> temp = new ArrayList<>();
        //     for (List<Integer> i : arr) {
        //         List<Integer> subset = new ArrayList<>(i);
        //         System.out.println("subset"+ subset);
        //         subset.add(j);
        //         temp.add(subset);
        //     }
        //     arr.addAll(temp);
        //     System.out.println(arr);
        // }
        // return arr;

        List<List<Integer>> sub= new ArrayList<>();
        sub.add(new ArrayList<>());

        for(int j: nums)
        {
            List<List<Integer>> temp= new ArrayList<>();
            for(List<Integer> i: sub)
            {
                List<Integer> s= new ArrayList(i);
                s.add(j);
                temp.add(s);
            }
            sub.addAll(temp);
            

        }
        return sub;
    }
}