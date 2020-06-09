package Appearanceseries;

import java.util.Scanner;

public class newSolution {
    public void input(){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        String b=Solution(s);
        System.out.println(b);
    }
    public String Solution(int s){

        String result = null;
        String previous="1";
        if (s>1){
            for (int i=0;i<(s-1);i++)
            {
                result=outlook(previous);
                previous=result;
            }
        }
        else {
            result=previous;
        }
        return result;
    }
    private String outlook(String previous){
        char ss[] = previous.toCharArray();
        char element = ss[0];
        int index=1;
        int count=1;
        StringBuilder answer=new StringBuilder();
        for(;index<previous.length();index++){
            if (ss[index]==element){
                count+=1;
            }
            else {
                answer.append(count);
                answer.append(element);

                element=ss[index];
                count=1;
            }
        }
        answer.append(count);
        answer.append(element);

        return String.valueOf(answer.toString());
    }

}
