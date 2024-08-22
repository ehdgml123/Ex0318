package Ex05;

public class MathArratUtils {

	
	
  static int sum(int[] values) {
		int total =0;
		for(int value : values) {
			total +=value;
		}
		
		return total;
	}
  
  static double average(int[] values) {
	  return (double) sum(values) / values.length;
  }
  
  static int min(int[] values) {
	  int minValue = values[0];
	  for(int value : values) {
		  if(value < minValue) {
			  minValue = value;
		  }
	  }
	  return minValue;
  }
  
  static int max(int[] values) {
	  int mxnValue = values[0];
	  for(int value : values) {
		  if(value > mxnValue) {
			  mxnValue = value;
		  }
	  }
	  
	  return mxnValue;
  }
  
}

  