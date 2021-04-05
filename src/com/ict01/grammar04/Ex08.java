package com.ict01.grammar04;
class Ex08{
    public static void main(String[] args){
        esc1:
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
            if (i==2){
                  break esc1;
            }
            System.out.print(((i*10)+(j))+" ");
            }
        }
        System.out.println();
        esc2:
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
            if (i==2){
                  continue esc2;
            }
            System.out.print(((i*10)+(j))+" ");
            }
        }
    }
}
