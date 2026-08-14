class MaxlengthSubstring {
    public static int maximumLengthSubstring(String s) {

        int maxlength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            int[] count = new int[26];

            for (int j = i; j < n; j++) {

                int index = s.charAt(j) - 'a';
                count[index]++;

                
                if (count[index] > 2) {
                    break;
                }

                maxlength = Math.max(maxlength, j - i + 1);
            }
        }

        return maxlength;
    }
    public static void main(String[]args){
        String a="aaaa";
        System.out.print(maximumLengthSubstring(a));

    }
}