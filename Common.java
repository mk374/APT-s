import java.util.ArrayList;
import java.util.List;

public class Common {
    public int count (String a, String b) {
    		// Lists of unique characters
    		List<String> aList = new ArrayList<>();
    		List<String> bList = new ArrayList<>();
    		for (int i = 0; i < a.length(); i++) {
    			//if(!aList.contains(a.substring(i, i+1))) {
    				aList.add(a.substring(i,i+1));
    			//}
    			//if(!bList.contains(b.substring(i, i+1))) {
    				bList.add(b.substring(i,i+1));
    			//}
    		}
    		
    		int totalCount = 0;
    		for (int k = 0; k < aList.size(); k++) {
    			if(bList.contains(aList.get(k))){
    				totalCount++;
    				bList.remove(aList.get(k));
    			}
    		}
        return totalCount;
    }
    
    public static void main(String[] args) {
    		String a = "sassy";
    		String b= "assay";
    		Common foo = new Common();
    		System.out.print(foo.count(a,b));
    }
}