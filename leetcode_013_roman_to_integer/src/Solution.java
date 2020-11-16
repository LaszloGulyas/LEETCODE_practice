public class Solution {

    public int romanToInt(String s) {

        int length = s.length();
        int numbArray[] = new int[length];
        int finalValue = 0;

        for(int i=0; i<length; i++) {

            numbArray[i] = letterToInt(s.charAt(i));
        }

        int temp = 0;
        int i = 0;
        while(i < length-1) {

            if(numbArray[i] >= numbArray[i+1]) {
                temp += numbArray[i];
            } else {
                temp -= numbArray[i];
            }
            i++;
        }
        temp += numbArray[length-1];
        return temp;
    }



    public int letterToInt(char c) {

        switch (c) {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default: return -10000;
        }
    }
}