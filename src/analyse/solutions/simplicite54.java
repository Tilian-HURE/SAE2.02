package analyse.solutions;

import java.util.ArrayList;

public class simplicite54 {
    public static String erase(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
        char[] temp= str.toCharArray();
		ArrayList<Character> temp1= new ArrayList<Character>();
	
		for(int i=0;i<temp.length;i++) {
			if(i==0&&temp[i]==' '&&temp[i+1]!=' '){}
			else if(i==0&&temp[i]!=' ') {
				temp1.add(temp[i]);
			}
			else if(i==temp.length-1&&temp[i]==' '&&temp[i-1]!=' ') {}
			else if(i!=0&&temp[i]==' ' && temp[i-1]!=' ' && temp[i+1]!=' ') {}
			else {
				temp1.add(temp[i]);
			}
		}
		
		StringBuilder sb= new StringBuilder(temp1.size());
		for(int i=0;i<temp1.size();i++) {
			sb.append(temp1.get(i));
		}
		str=sb.toString();
	    
		return str;
    }
}
