package work02;

public class Matrix extends Line {
	
	Matrix(int length){
		super(length);
	}
	
	@Override
    public String toString() {
        String lineString = "";
        int i = 0;
        for (Position p : positions) {
            lineString += p.linable.toString();
            i++;
            if(i % 8 == 0)
            	lineString += "\n";
        }
        return lineString;
    }
	
}
