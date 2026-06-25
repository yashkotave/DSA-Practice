class Solution {
    public char repeatedCharacter(String s) {

        Queue<Character> q = new LinkedList<>();

        for(char ch : s.toCharArray()) {

            if(q.contains(ch)) {
                return ch;
            }

            q.offer(ch);
        }

        return ' ';
    }
}