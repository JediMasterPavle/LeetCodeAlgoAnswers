class Solution {
    public String convert(String s, int numRows) {
        if (s.length()==0 || s.length()==1){return s.length()==0 ? "" : s;}
        if (numRows<2){return s;}
        List<StringBuilder> Listfin = new ArrayList<>();
        for(int i=0;i<numRows;i++)
            Listfin.add(new StringBuilder());     
        System.out.println(Listfin.size());
        
        int row = 0;
        boolean reverse = false;
        for(int i=0;i<s.length();i++){
            Listfin.get(row).append(s.charAt(i));
            if (row == 0 || row == numRows - 1) reverse = !reverse;
            row += reverse ? 1 : -1;
        }
        
        
        StringBuilder ret = new StringBuilder();
        for (StringBuilder r : Listfin) ret.append(r);
        return ret.toString();
            
        }
}