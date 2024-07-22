class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> str = new Stack<>();
        String[] temp = path.split("/");

        for(String ch: temp){
            if(ch.equals(".") || ch.isEmpty()){
                continue;
            }else if(ch.equals("..")){
                if(!str.isEmpty()){
                    str.pop();
                }
            }else{
                str.push(ch);
            }
        }


        String abspath = "/"+String.join("/", str);

        return abspath;
    }
}