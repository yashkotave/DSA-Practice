class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String str : operations){
           // int a= stack.push();
           
            if(str.equals("C")){
                //stack.peek()
                stack.pop();
            }
            else if(str.equals("D")){
                stack.push(2*stack.peek());

            }
            else if(str.equals("+")){    
                int a = stack.pop();
                int b = stack.peek();
                
                 int score = a+b;
                 // a ko wapas bharo
                 stack.push(a);
                 stack.push(score);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }

        int sum = 0;

        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        
        return sum;
    }
}