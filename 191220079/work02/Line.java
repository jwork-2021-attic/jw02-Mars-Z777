package work02;

public class Line {
	
	private Position[] positions;
	
	class Position {

        private Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }

    }
	
    public Line(int length) {
        this.positions = new Position[length];
    }

    public void put(Linable linable, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].setLinable(linable);
    }

    public Linable get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].linable;
        }
    }

    /* task 2
    @Override
    public String toString() {
        String lineString = "";
        for (Position p : positions) {
            lineString += p.linable.toString();
        }
        return lineString;
    }
    */
    
    // task 3
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

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i].linable;
        }

        return linables;

    }

}
