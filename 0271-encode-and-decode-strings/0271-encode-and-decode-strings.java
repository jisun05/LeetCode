public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        
        StringBuilder encoded = new StringBuilder();
        for(String s : strs){
            encoded.append(s.length()).append("#").append(s);
        }
        
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        List<String> decoded = new ArrayList<>();
        //"5#Hello5#World"
        int start =0;
        
        while(start < s.length()){

            int last = start;
            while(s.charAt(last) !='#'){
                last++;
            }
            int length = Integer.parseInt(s.substring(start,last));

            int count = last+1;
            int end = count+ length;
            decoded.add(s.substring(count,end));
            start = end;

        }

        return decoded;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));