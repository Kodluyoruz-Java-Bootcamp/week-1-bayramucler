package h1_s1;

public class Palindromic {
    private static void palindromicChallange(){
        int[][] numsXPalChains = new int[91][2];
        int num=0;
        int maxChainCount=0;
        int maxChainNumber=0;

        for(int i=0; i<numsXPalChains.length; i++){
            numsXPalChains[i][0]=i+10;
            numsXPalChains[i][1]=doPalindromic(i+10);
        }

        for(int i =0; i<numsXPalChains.length; i++ )
            System.out.println(numsXPalChains[i][0]+" sayısının zincir sayısı: " +numsXPalChains[i][1]);

        for(int i =0; i<numsXPalChains.length; i++ )
        {
            if(numsXPalChains[i][1]>maxChainCount) {
                maxChainCount = numsXPalChains[i][1];
                maxChainNumber = numsXPalChains[i][0];
            }
        }

        System.out.println(maxChainCount + ":" + maxChainNumber);

        doPalindromic(maxChainNumber, true);

    }
    private static int doPalindromic(long num, boolean print){
        int counter=0;
        long sum=0;
        long reversedNum=0;
        do
        {
            if(counter>0)
                num=sum;

            reversedNum=reverseNum(num);
            sum = num + reversedNum;

            if(print)
                System.out.println("Counter: " + counter + " - " + num + "+" + reversedNum + "=" +sum );
            counter++;
        }while(!isPalindromic(sum));

        return counter;
    }

    private static int doPalindromic(long num){
        return doPalindromic(num, false);
    }

    private static boolean isPalindromic(long num){
        return reverseNum(num)==num;
    }

    private static long reverseNum(long num){
        String numStr = String.valueOf(num);
        String reversedNumStr="";
        char ch;

        for(int i=0; i<numStr.length();i++){
            ch = numStr.charAt(i);
            reversedNumStr = ch + reversedNumStr;
        }
        return Long.parseLong(reversedNumStr);
    }

    public static void main(String[] args) {
        palindromicChallange();
    }
}