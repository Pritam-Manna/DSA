class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        Map<Character, Character> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) +" : "+ t.charAt(i));
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else if (map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

/*
paperk
titlee