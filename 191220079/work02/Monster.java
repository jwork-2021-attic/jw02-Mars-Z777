package work02;

import work02.Line.Position;
import java.util.ArrayList;

public class Monster implements Linable {

	private final int r, g, b, rank;
	private Position position;
	
	public static ArrayList<Monster> values = new ArrayList<Monster>();
	
	Monster(int r, int g, int b, int rank){
		this.r = r;
		this.g = g;
		this.b = b;
		this.rank = rank;
		values.add(this);
	}
	
	public static Monster getMonsterByRank(int rank) {
		for(Monster m: Monster.values) {
			if(m.rank == rank)
				return m;
		}
		return null;
	}

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + String.format("%4s", this.rank) + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank;
    }

}
