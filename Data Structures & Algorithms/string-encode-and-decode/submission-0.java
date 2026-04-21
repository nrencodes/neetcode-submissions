class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for (String s: strs){
            int len = s.length();
            String curr = len + "|" + s;
            sb.append(curr);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<String>();
        
        String currLength = "";
        String currWord = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '|'){
                int index = ++i + Integer.parseInt(currLength);
                for(int j = i; j < index; j++){
                    currWord = currWord + str.charAt(j);
                    i++;
                }
                i--;
                decoded.add(currWord);
                currWord = "";
                currLength = "";
            } else {
                currLength = currLength + str.charAt(i);    
            }
        }
        return decoded;
    }
}
