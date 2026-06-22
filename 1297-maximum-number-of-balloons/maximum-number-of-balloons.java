class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = count('b', text);
        int a = count('a', text);
        int l = count('l', text) / 2;
        int o = count('o', text) / 2;
        int n = count('n', text);

        return Math.min(
                Math.min(b, a),
                Math.min(Math.min(l, o), n)
        );
    }

    public int count(char ch, String text) {
        int cnt = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                cnt++;
            }
        }

        return cnt;
    }
}