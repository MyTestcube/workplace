package Appearanceseries;

public class Solution {
    public String countAndSay(int n){
        if( n == 1)
            return "1";
        String result = "1";
        for(int i = 1; i < n; i++){
            result = getString(result);
        }
        return result;
    }



    private String getString(String result) {
        // TODO Auto-generated method stub
        int flag = 1;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< result.length(); ){
            if(i +1 < result.length() && result.charAt(i) == result.charAt(i+1)){
                flag++;
                i++;
            }
            else{
                sb.append(flag).append(result.charAt(i));
                flag = 1;
                i += flag;
            }


        }
        System.out.println(sb);
        return sb.toString();
    }
}
