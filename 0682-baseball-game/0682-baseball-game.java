class Solution {
    public int calPoints(String[] operations) {
       List<Integer> list = new ArrayList<>();

       for(String oper : operations){
        if(oper.equals("C")){
            list.remove(list.size()-1);
        }
       else if(oper.equals("D")){
        int a = list.get(list.size()-1);
             list.add(a*2);
         }
         else if (oper.equals("+")){
            int a = list.get(list.size()-1);
            int b = list.get(list.size()-2);
            int c = a+b;
            list.add(c);
         }
         else{
            list.add(Integer.parseInt(oper));
         }
       }
       int sum = 0;
       for(int x : list){
        sum += x;
       }
       return sum;
    }
}