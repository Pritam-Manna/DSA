class Solution {
    public String simplifyPath(String path) {
        String [] paths = path.split("/");
        ArrayList <String> myArray = new ArrayList <String> ();

        int total_elem = -1;

        for (String p : paths){
            if(p.equals("..")){
                if(total_elem != -1){
                    myArray.remove(total_elem);
                    total_elem --;
                }
            }else if(!p.equals(".") && !p.equals("")){
                myArray.add(p);
                total_elem ++;
            }
        }

        if(total_elem == -1){
            return "/";
        }

        String res = "";
        for(int i=0; i<=total_elem; i++){
            res = res + "/" + myArray.get(i);
        }

        return res;


    }
}