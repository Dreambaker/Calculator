package com.galaxy.calculator.beans;

public class romanNum {
    private String alias;
    private String roman;
    private int arabic;
    
    public romanNum(String alias,String roman){
        this.alias =alias;
        this.roman = roman;
        this.arabic = toarabic();
    }
    public romanNum(String roman) {
        this.roman = roman;
        this.arabic = toarabic();
    }

    public int getarabic() {
        return arabic;
    }
    
    public String getAlias(){
        return alias;
    }

    private int toarabic(){
        int sum=0,i;
        char chs[]=this.roman.toCharArray();
        for(i=0;i<chs.length;i++)
        {
            if(chs[i]=='I') sum+=1;
            if(chs[i]=='V')
            {
                if(i!=0 && chs[i-1]=='I') sum+=4-1;//还要把上次累加上的减去
                else sum+=5;
            }
            if(chs[i]=='X')
            {
                if(i!=0 && chs[i-1]=='I') sum+=9-1;
                else sum+=10;
            }
            if(chs[i]=='L')
            {
                if(i!=0 &&chs[i-1]=='X') sum+=40-10;
                else sum+=50;
            }
            if(chs[i]=='C')
            {
                if(i!=0 && chs[i-1]=='X') sum+=90-10;
                else sum+=100;
            }
            if(chs[i]=='D')
            {
                if(i!=0 && chs[i-1]=='C') sum+=400-100;
                else sum+=500;
            }
            if(chs[i]=='M')
            {
                if(i!=0 && chs[i-1]=='C') sum+=900-100;
                else sum+=1000;
            }
        }
        return sum;
    }
}
