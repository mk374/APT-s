import java.util.ArrayList;
import java.util.List;

public class Anonymous {
	public int howMany(String[] headlines, String[] messages) {
		List<String> totalChar = new ArrayList<String>();
        for (int i = 0; i < headlines.length; i++) {
        		for (int j = 0; j < headlines[i].length(); j++) {
        			if(!headlines[i].substring(j, j+1).equals(" ")) {
        				totalChar.add(headlines[i].substring(j, j+1).toLowerCase());
        			}	
        		}
        }
        int totalAvaiMessages = 0;
        for (int i = 0; i< messages.length; i++) {
        		List<String> copyChar = new ArrayList<String>(totalChar);
        		
        		List<String> msgComp = new ArrayList<String>();
        		for(int j = 0; j< messages[i].length(); j++) {
        			if(!messages[i].substring(j, j+1).equals(" ")) {
        				msgComp.add(messages[i].substring(j, j+1).toLowerCase());
        			}
        		}
        		boolean boolCheck = true;
        		for (int k = 0; k < msgComp.size(); k++) {
        			if (boolCheck == true && copyChar.contains(msgComp.get(k))) {
        				copyChar.remove(msgComp.get(k));
        			}
        			else {
        				boolCheck = false;
        			}
        			if(boolCheck == false) {
        				
        				break;
        			}
        		}
        		if (boolCheck == true) {
        			totalAvaiMessages ++;
        		}
        		
        }
        
        return totalAvaiMessages;
	}
	public static void main(String[] args) {
		String[] headlines ={"Earthquake in San Francisco","Burglary at musuem in Sweden", "Poverty"};
		String [] messages =

			{"Give me my money back",
			 "I am the best coder",
			 "TOPCODER"};
		Anonymous x = new Anonymous();
		System.out.print(x.howMany(headlines, messages));
		
		
	}

}
