package entities;

public class Notas {
	
	float n1,n2,n3;
	
	public static double mediaNota(double n1, double n2, double n3) {
		
		double media = 0;
				
		media = (n1 + n2 + n3)/3;
		return media;
	}
	
	public static double maxNota(double n1, double n2, double n3) {
		double max = 0;
		double max2 = 0;
		
		max = Math.max(n1, n2);
		max2 = Math.max(n1, n3);		
		
		if(max > max2) {
			return max;
		}else {
			return max2;
		}
				
	}
	
	public static double minNota(double n1, double n2, double n3) {
		double max = 0;
		double max2 = 0;
		
		max = Math.min(n1, n2);
		max2 = Math.min(n1, n3);
		
		if(max < max2) {
			return max;
		}else {
			return max2;
		}
		
	}
	
	public static double mediaMax(double n1, double n2, double n3) {
		
		double medMax = 0;
		
		double max = Math.max(n1, n2);
		double max2 = Math.max(n1, n3);
		
		medMax =  (max + max2) / 2;
		return medMax;
		
	}
	public static double mediaMaxMin(double n1, double n2, double n3) {
			
		double max = Notas.maxNota(n1, n2, n3);
		double min = Notas.minNota(n1, n2, n3);
		
		return (max + min) /2;
	}

}
