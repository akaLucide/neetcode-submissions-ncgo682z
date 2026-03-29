class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sLettersMap = new HashMap<>();
        Map<Character, Integer> tLettersMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (sLettersMap.containsKey(s.charAt(i))) {
                sLettersMap.put(s.charAt(i), (sLettersMap.get(s.charAt(i)) + 1));
            } 
            else {
               sLettersMap.put(s.charAt(i), 1); 
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (tLettersMap.containsKey(t.charAt(i))) {
                tLettersMap.put(t.charAt(i), (tLettersMap.get(t.charAt(i)) + 1));
            } 
            else {
               tLettersMap.put(t.charAt(i), 1); 
            }
        }

        for (char key : sLettersMap.keySet()) {
            if (sLettersMap.get(key).equals(tLettersMap.get(key))) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
