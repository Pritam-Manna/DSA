    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String [] sArr = s.split(" ");
            int sArrLen = sArr.length;
            int patternLen = pattern.length();
            HashMap <Character, String> sMap = new HashMap <Character, String>();

            if(sArrLen != patternLen){
                return false;
            }else{
                int i = 0;
                for(String str : sArr){
                    if(sMap.containsKey(pattern.charAt(i))){
                        if(!sMap.get(pattern.charAt(i)).equals(str)){
                            //System.out.println(sMap.get(pattern.charAt(i))  +"["+ pattern.charAt(i) +"] : "+ str);
                            return false;
                        }
                    }else{
                        if(!sMap.containsValue(str)){
                            sMap.put(pattern.charAt(i), str);
                        }else{
                            return false;
                           
                        }
                    }
                    i++;
                }
                return true;
            }
        }
    }