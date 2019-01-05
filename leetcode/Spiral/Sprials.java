import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  private boolean right = true;
  private boolean down = false;
  private boolean left = false;
  private boolean up = false;


  public void spiral(int r, int c){

    // r = 4
    // c =6

    int[][] array = new int[r][c];

    int row = 0;
    int col = 0;

    int rightLimit =0;
    int downLimit = 0;
    int leftLimit = 0;

    while(true){

      if(right){



        while( col < c - rightLimit )
        {
          array[row][col] = 1;

          System.out.print(array[row][col]);

          col++;
        }

        right = false;
        rightLimit++;
        down = true;
        col--;
      }

      if(down){

         System.out.println();

        while( row < r - downLimit )
        {
          // System.out.println("r - downLimit" + (r - downLimit));
          // System.out.println("row" + (row));


          array[row][c - rightLimit] = 1;

          System.out.print(array[row][c - rightLimit]);

          row++;
        }

        down = false;
        downLimit++;
        left = true;
        //row = 0;

      }

      if( left ) {

        System.out.println();

        // System.out.println("col" + col);
        // col =5
        // 6 - 0 = 6
        // 5..0
        /*
          |                              |
          0                              c                             c
        */
        while( col > 0 )
        {
          array[row - 1 ][col] = 1;

          System.out.print(array[row - 1 ][col]);

          col--;
        }

        left = false;
        leftLimit++;
        up  = true;

      }

//       if(up){


//         while( row < c - leftLimit )
//         {
//           array[ ][ col -1 ] = 1;

//           System.out.print(array[row][col]);

//           col++;
//         }

//         left = false;
//         leftLimit++;
//         up  = true;


//       }

      break;

    }
  } // sprial

  public static void main(String[] args) {

    Solution sol = new Solution();

    sol.spiral(4,6);

  }
}


/*
Your previous Plain Text content is preserved below:

We want to generate a path through a grid of r rows and c columns such that we visit every grid cell exactly once, in a clockwise spiral pattern starting at the upper-left cell (0,0).  As motivating examples, we might be controlling agricultural robots to weed fields, draw lines on a graphics display, or computer numerical control milling machines.  To make it concrete, below is a 4x6 grid, and the cells are labeled with the order in which the grid cell is visited:

-------------------------------
| 1  | 2  | 3  | 4  | 5  | 6  |
-------------------------------
| 16 | 17 | 18 | 19 | 20 | 7  |
-------------------------------
| 15 | 24 | 23 | 22 | 21 | 8  |
-------------------------------
| 14 | 13 | 12 | 11 | 10 | 9  |
-------------------------------

So grid cell (0,0) is the first to be visited, and (0,1) is the second, and so forth, with cell (2,1) being the last visited.

Design the API and write code that can be used by others to generate these paths for the control purposes above.  The code is first given the grid size (4 x 6), and then it should tell its callers to visit cell (0,0), then (0,1), then (0,2), etc, stopping after (2,1).

The users of the code may need to create a large number of path traversals, with different, possibly large grid sizes, to run simultaneously, so try to avoid using O(r * c) memory in your solution.

We care a lot about security, so testing, correctness arguments, etc, will be a concern.
 */
