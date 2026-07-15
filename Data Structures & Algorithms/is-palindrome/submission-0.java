class Solution {
    public boolean isPalindrome(String s) {
        String updatedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < updatedString.length()/2; i++){
                if (updatedString.charAt(i) != updatedString.charAt(updatedString.length()-1-i)){
                    return false;
                }
        }
        return true;
    }
}
