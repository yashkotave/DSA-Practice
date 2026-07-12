class Solution {
    public boolean lemonadeChange(int[] bills) {
       int five = 0;
       int ten =0;
       for (int i : bills){
        if(i==5) five++;  //customer ne 5 pay kra
        else if(i ==  10){
            //customer ne 10 pay krs
            if(five>0){ //agar 5 ki note h toh wo do aur count kam kro
                five--;
                ten++;
            }else return false;
       } 
       else{      //customer ne 20 rupe pay kra toh
          if(five>0 && ten>0) {
            //pehle 5 aur 10 ki note dene ka try kre
            five--;
            ten--;
          }else if(five>2){ //otherwise 5 ki 3 note do
            five = five-3;
          }else return false;
       }
      
    }
      return true;
    }
}