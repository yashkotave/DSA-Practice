class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
          List<String> list = new ArrayList<>();
        for(int h=0; h<=11; h++){
            for(int m=0 ; m<=59; m++ ){
                 int ch = Integer.bitCount(h);
                 int cm = Integer.bitCount(m);

                 if(ch+cm==turnedOn){
                    String time;
                    if(m<10){
                        time = h + ":0" + m;
                    }
                    else{
                        time = h + ":" +m;
                    }
                    list.add(time);
                    
                 }
            }
        }
        return list;
    }
}