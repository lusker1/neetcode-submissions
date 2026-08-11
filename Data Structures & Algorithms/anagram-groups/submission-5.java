class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String , List<String>> map = new HashMap <>(); 

      for(String s : strs) {

        char[] schar = s.toCharArray() ;

        Arrays.sort(schar) ;

        String sortedKey = String.valueOf(schar) ; 

        if(!map.containsKey(sortedKey)){
            map.put(sortedKey , new ArrayList<>()) ; 
        }
        map.get(sortedKey).add(s);
      }
      return new ArrayList<>(map.values()) ;

}
}