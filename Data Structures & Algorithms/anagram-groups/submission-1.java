class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>(); 

        for (String s : strs) {

            char[] sChar = s.toCharArray() ;
            Arrays.sort(sChar) ; 

            String sortedKey = String.valueOf(sChar) ; 

            if(!map.containsKey(sortedKey)) {
                map.put(sortedKey , new ArrayList<>()) ;
            }
            map.get(sortedKey).add(s); 
        }
        return new ArrayList<>(map.values()); 
}
}