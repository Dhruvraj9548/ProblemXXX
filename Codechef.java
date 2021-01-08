import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws Exception
    {
        BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferReader.readLine());

        while(n--!=0){
            int size=Integer.parseInt(bufferReader.readLine());
            String inputString=bufferReader.readLine();
            String stringPartition="";
            String outputString="";

            for(int i=0;i<size;i=i+4){

                if((i+4)==size)
                    stringPartition=inputString.substring(i);
                else
                    stringPartition=inputString.substring(i,i+4);

                int start=0;
                int middle=0;
                String patternStack="abcdefghijklmnop";
                int last=patternStack.length();
                String outputLetter="";

                for(int j=0;j<stringPartition.length();j++){

                    if(stringPartition.charAt(j)=='0'){
                        middle=(start+last)/2;
                        outputLetter=patternStack.substring(start,middle);
                        last=middle;
                    }
                    else{
                        middle=(start+last)/2;
                        if(last==16)
                            outputLetter=patternStack.substring(middle);
                        else
                            outputLetter=patternStack.substring(middle,last);
                        start=middle;
                    }
                }

                outputString=outputString+outputLetter;
            }

            System.out.println(outputString);

        }
    }
}
