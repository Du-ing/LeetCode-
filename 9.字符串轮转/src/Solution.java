/**
 * https://leetcode-cn.com/problems/string-rotation-lcci/
 */
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        String S = s2 + s2;
        return S.contains(s1);
    }
}