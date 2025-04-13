class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        int n = searchWord.length();
        List<List<String>> result = new ArrayList();
        for(int i = 0; i<n; i++)
         result.add(new ArrayList<String>());

        for(String str: products){
            for(int i = 0; i<n; i++){
                if(i < str.length() && str.charAt(i) == searchWord.charAt(i)){
                    if(result.get(i).size() < 3)
                     result.get(i).add(str);
                }
                else
                 break;
            }
        }
        return result; 
    }
}