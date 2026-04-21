class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> anagramS = new HashMap<>();
        Map<Character, Integer> anagramT = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            // For s
            char currS = s.charAt(i);
            if (!anagramS.containsKey(currS)){
                anagramS.put(currS, 1);
            } else {
                int instanceS = anagramS.get(currS);
                instanceS++;
                int result = anagramS.replace(currS, instanceS);
            }

            // For t
            char currT = t.charAt(i);
            if (!anagramT.containsKey(currT)){
                anagramT.put(currT, 1);
            } else {
                int instanceT = anagramT.get(currT);
                instanceT++;
                int result = anagramT.replace(currT, instanceT);
            }
        }
        return anagramS.equals(anagramT);
    }
}
