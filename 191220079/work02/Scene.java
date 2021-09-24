package work02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {

	public static void main(String[] args) throws IOException {
	
		int n = 64;
		Line line = new Line(n);
		Color c = new Color("work02/c256.png");
		int colors[] = c.formColorTable();
		int index[] = new int[n];
		for(int i = 0; i < n; i++) index[i] = i;
		int rIndex[] = RandomArray.randomArray(index);
		//System.out.println(Arrays.toString(rIndex));
		for(int i = 0; i < n; i++) {
			int r = (colors[i] >> 16) & 0xff;
			int g = (colors[i] >> 8) & 0xff;
			int b = colors[i] & 0xff;
			Monster m = new Monster(r, g, b, i + 1);
			line.put(m, rIndex[i]);
		}
		
		
		Snake theSnake = Snake.getSnake();
		Sorter sorter = new QuickSorter(); // or ChooseSorter
		theSnake.getSorter(sorter);
		
		String log = theSnake.lineUp(line);
		BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
	}

}
