import java.util.Random; /*imports the random class*/
import java.util.Arrays; /*imports extra utilites for arrays*/

public class ChristmasDraw {
	public static void main(String[] args) {
		String buyFor[] = {"x1", "x2", "x3", "x4", "x5", "y1", "y2", "y3", "y4", "y5"}; /*array of buyers*/
		String buyForDis[] = {"filler","filler","filler","filler","filler","filler","filler","filler","filler","filler"}; /*empty (filler strings) array for people who have already bought something to go into (disallow one person buying multiple gifts). 10 spaces for 10 people.*/
		String buyTo[] = {"x1", "x2", "x3", "x4", "x5", "y1", "y2", "y3", "y4", "y5"}; /*array of gift receivers*/
		String buyToDis[] = {"filler","filler","filler","filler","filler","filler","filler","filler","filler","filler"}; /*empty (filler strings) array for people who have already received something to go into (disallow one person receiving multiple gifts)*/
		String disallowed[][] = {{"x1","y1"},{"x2","y2"},{"x3","y3"},{"x4","y4"},{"x5","y5"},{"y1","x1"},{"y2","x2"},{"y3","x3"},{"y4","x4"},{"y5","x5"},{"y1","y1"},{"y2","y2"},{"y3","y3"},{"y4","y4"},{"y5","y5"},{"x1","x1"},{"x2","x2"},{"x3","x3"},{"x4","x4"},{"x5","x5"},{"y4","y2"},{"x3","y5"},{"y5","x1"},{"x2","x3"},{"y3","y1"},{"y2","x4"},{"x4","y3"},{"x5","x2"},{"y1","x5"},{"x1","y4"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"},{"filler","filler"}}; /*2D array with disallowed pairings, empty (filler strings) entries for future disallowed pairings to be inserted into. 10 spaces as there will be no more than 10 iterations.*/
		Random numgen = new Random(); 
		int x = 30; /*30 index to start the variable at the filler strings in disallowed array*/
		int ft = 0; /*first index to start the variable at the beginning of the filler entries in buyForDis and buyToDis*/
		for (int i = 0; i < 10; i++) { /*10 iterations, as there are 10 people*/
			String buyingfor = buyFor[numgen.nextInt(buyFor.length)]; /*generates random index number within array length for a buyer*/
			String buyingto = buyTo[numgen.nextInt(buyTo.length)]; /*generates random index number within array length for a receiver*/
			while ((Arrays.asList(buyForDis).contains(buyingfor) || Arrays.asList(buyToDis).contains(buyingto)) || (Arrays.asList(disallowed).contains(buyingfor) && Arrays.asList(disallowed).contains(buyingto))) { /*if the buyer/receiver has already been generated, or the pairing is disallowed, generate new numbers*/
				buyingfor = buyFor[numgen.nextInt(buyFor.length)];
				buyingto = buyTo[numgen.nextInt(buyTo.length)];
			} 
			disallowed[x][0] = buyingfor; /*adds buyer to first slot in disallowed filler entry*/
			disallowed[x][1] = buyingto; /*adds receiver to second slot in disallowed filler entry, making a pair*/
			buyForDis[ft] = buyingfor; /*adds buyer to buyForDis array*/
			buyToDis[ft] = buyingto; /*adds receiver to buyToDis array*/
			ft = ft+1; /*moves to next filler entry in buyForDis and buyToDis arrays*/
			x = x+1; /*moves to next filler entry in disallowed array*/
			System.out.println(buyingfor + " is buying for " + buyingto);
		}
	}
}