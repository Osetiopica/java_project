package com.ict01.grammar04;
class Ex04
{
    public static void main(String[] args) 
    {
        while(true){
            int i = 0;
            if(i%2==1){
                System.out.print(i+" ");
            }
            if(i>=10){
                break;
            }
            i++;
        }
        while(true){
            int i = 0;
            if(i%2==0){
                System.out.print(i+" ");
            }
            if(i>=10){
                break;
            }
            i++;
        }
    }
}