
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
    	  		
    	  		int[] arr = new int[strands.length];
    	  		for (int i = 0; i < strands.length; i++) {
    	  			int nucCount = 0;
    	  			
    	  			for (int j = 0; j < strands[i].length(); j++) {
    	  				if(strands[i].substring(j, j+ 1).equals(nuc)) {
    	  					nucCount++;
    	  				}
    	  			}
    	  			arr[i] = nucCount;
    	  		}
    	  		
    	  		int x = getMaxValue(arr);
    	  		if (x == 0) {
    	  			return "";
    	  		}
    	  		List<String> maxes = new ArrayList<>();
    	  		
    	  		for (int k = 0; k < arr.length; k++) {
    	  			if (arr[k] == x) {
    	  				maxes.add(strands[k]);
    	  			}
    	  		}
    	  		
    	  		int longestStr = maxes.get(0).length();
    	  		
    	  		String longest = maxes.get(0);
    	  		for (String s: maxes) {
    	  			if (s.length() > longestStr) {
    	  				longestStr = s.length();
    	  				longest = s;
    	  			}
    	  		}
    	  		return longest;
    	  		
      }
      
      private int getMaxValue(int[] arr) {
    	  		int max = arr[0];
    	  		for(int i = 1; i < arr.length; i++) {
    	  			int y = arr[i];
    	  			if(y > max) {
    	  				max = y;
    	  			}
    	  		}
		return max;
	}

	public static void main(String[] args) {
    	  		String[] strands = {"g", "gg", "ggg", "gggg"};
    	  		String nuc = "c";
    	  		DNAMaxNucleotide asdf= new DNAMaxNucleotide();
    	  		System.out.print(asdf.max(strands, nuc));
      }
   }