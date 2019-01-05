package blend;

// Problem statement
// You are given two integers, width and height. Using width and height, draw a spiral to the screen.

// e.g. 10 by 10
// 1111111111
// 1
// 1 11111111
// 1 1      1
// 1 1 1111 1
// 1 1 1  1 1
// 1 1    1 1
// 1 111111 1
// 1        1
// 1111111111

//3X3
//
//111
//1
//111

//2x2
//
//11
//1

//5x10
//
//  01234
//0 11111
//1 1
//2 1 111
//3 1 1 1
//4 1 1 1
//5 1 1 1
//6 1 1 1
//7 1 1 1
//8 1   1
//9 11111

public class Spiral {


	private static void createSpiral(int w, int h) {

		char[][] array = new char[w][h];

		// populate array with spaces
		for(int r = 0; r < h; r++){
		      for(int c= 0; c < w; c++){
		      array[c][r] = ' ';
		    }
		}

	    boolean left = true;
	    boolean down = false;
	    boolean right = false;
	    boolean up = false;

	    // width
	    int col = 0;
	    int cc = col;

	    // height
	    int row = 0;
	    int rr = row;

	    int decH = 0;



	    while(true) {

	      if (left){

	      }

	      if(down) {

	      }

	      if(right) {


	      }

	      if(up) {

	      }



	 } //while

	   printSpiral(w,h, array);
	   System.out.println();
	   printDetailSpiralValues(w, h, array);

	}

	private static void printSpiral(int w, int h, char[][] array) {

	    // print spiral
		for(int r = 0; r < h; r++){

		      for(int c= 0; c < w; c++){

		    	System.out.print(array[c][r]);

		    }

		      System.out.println();
		}
	}

	private static void printDetailSpiralValues(int w, int h, char[][] array) {

	    // print spiral
		for(int r = 0; r < h; r++){

		      for(int c= 0; c < w; c++){


		    	System.out.print("c" + c);
		    	System.out.print("r" + r + "=");
		    	System.out.print(array[c][r] + " ");

		    }

		      System.out.println();
		}
	}


	public static void main(String[] args) {

//		if (args.length != 2) {
//
//			System.out.println("Usage: java Spiral.class <w> <h>");
//		} else {
//
//			// Width, Height
//			Spiral.createSpiral(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
//
//		}


		Spiral.createSpiral(5,10);

//		Spiral.printDetailSpiralValues(w, h, array);
	}

}
