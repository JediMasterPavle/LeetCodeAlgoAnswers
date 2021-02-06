class Solution {
    public int romanToInt(String s) {
        
        int total=0;
        int i = 0;
        int len=s.length();
        while(i<len){
            
          
            
                if(s.charAt(i)=='C' && i<len){
                    if(i+1<len){
                        if(s.charAt(i+1)=='D'){total+=400; i+=2;continue;}
                        else if(s.charAt(i+1)=='M'){total+=900; i+=2;continue;}
                        else{total+=100;i+=1;continue;}
                        

                    }
                }
            


                if(s.charAt(i)=='X' && i<len){
                    if(i+1<len){
                        if(s.charAt(i+1)=='L'){total+=40; i+=2;continue;}
                        else if(s.charAt(i+1)=='C'){total+=90; i+=2;continue;}
                        else{total+=10;i+=1;}

                    }
                }
                
            
                if(s.charAt(i)=='I' && i<len){
                    if(i+1<len){
                        
                        if(s.charAt(i+1)=='V'){total+=4; i+=2;continue;}
                        else if(s.charAt(i+1)=='X'){total+=9; i+=2;continue;}
                        
                        else{total+=1;i+=1;System.out.println(i); continue;}
                        
                    }
                }   
                
           
                if(s.charAt(i)=='M'){total+=1000;i+=1;continue;}
            
                if(s.charAt(i)=='D'){total+=500;i+=1;continue;}
            
                if(s.charAt(i)=='C'){total+=100;i+=1;continue;}
                
                if(s.charAt(i)=='L'){total+=50;i+=1;continue;}
            
                if(s.charAt(i)=='X'){total+=10;i+=1;continue;}
                
                if(s.charAt(i)=='V'){total+=5;i+=1;continue;}
            
                if(s.charAt(i)=='I'){total+=1;i+=1;continue;}
                
                //System.out.println(total); 
                }
        return total;
    }
}