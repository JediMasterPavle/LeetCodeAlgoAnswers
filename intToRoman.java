class Solution {
    public String intToRoman(int num) {
        StringBuilder fin = new StringBuilder();
        
        while(num>0){
            
            if(num>=1000){
                int total=0;
                total=num/1000;
                for(int i=0;i<total; i++){
                    fin.append("M");
                }
                num-=total*1000;               
            }
            
            if(num>=900){
                fin.append("CM");
                num-=900;
            }
            
            if(num>=500){
                fin.append("D");
                num-=500;
            }
            
            if(num>=400){
                fin.append("CD");
                num-=400;
            }
            
            if(num>=100){
                int total=0;
                total=num/100;
                for(int i=0;i<total; i++){
                    fin.append("C");
                }
                num-=total*100;
            }
            
            if(num>=90){
                fin.append("XC");
                num-=90;
            }
            
            if(num>=50){
                fin.append("L");
                num-=50;
            }
            
            if(num>=40){
                fin.append("XL");
                num-=40;
            }
            
            if(num>=10){
                int total=0;
                total=num/10;
                for(int i=0;i<total; i++){
                    fin.append("X");
                }
                num-=total*10;
            }
            
            if(num>=9){
                fin.append("IX");
                num-=9;
            }
            
            if(num>=5){
                fin.append("V");
                num-=5;
            }
            
            if(num>=4){
                fin.append("IV");
                num-=4;
            }
            
            if(num>=1){
                int total=0;
                total=num/1;
                for(int i=0;i<total; i++){
                    fin.append("I");
                }
                num-=total;
            } 
        }
        return fin.toString();
    }
}