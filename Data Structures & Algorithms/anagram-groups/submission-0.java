class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> wordsMap = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] words = strs[i].toCharArray();
            Arrays.sort(words);
            String sortedKey = new String(words);

            if (!wordsMap.containsKey(sortedKey)) {
                wordsMap.put(sortedKey, new ArrayList<>());
            }

            wordsMap.get(sortedKey).add(strs[i]);

        }
        return new ArrayList<>(wordsMap.values());
    }
}
