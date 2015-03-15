
package algorithmsproject2;

import java.util.ArrayList;

/**
 * @since 3/9/15
 * @author ChrisGoodman
 * This program fills an ArrayList with course data provided (Number, and Prerequisites). It will then build a 
 * adjacency matrix from the data in the list and Depth First Search the matrix assigning pre and post visit numbers 
 * to each element. After DFS finishes a simple bubble sort implementation sorts the post visit numbers in 
 * descending order to then be outputted.
 */
public class AlgorithmsProject2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        fillClasses fc = new fillClasses();         //class to fill ArrayList with all classes
        buildMatrix bm = new buildMatrix();         //class used to create, build, and read adjacency matrix

        ArrayList<course> list = new ArrayList();   // New list to copy the list filled with courses
        list = fc.returnArray();
        
        bm.createMatrix(list);                      //Initialize matrix  
        bm.fillMatrix(list);                        //Fill a 2d matrix with data from the list of courses
        //bm.displayMatrix(list);                   //output of matrix 
        
        System.out.println();
        
        System.out.println("The Adjacency Matrix created from course data");
        bm.flipMatrix(); //Invert the data[row][col] = [col][row] in the matrix to draw vertxes to and from each node 
        bm.displayMatrix(); 
        
        bm.setUnvisited();                          //set all nodes unvisited, tracked by row
        bm.matrixDFS(list,0,0);                     //Do DFS on the adjacency matrix 
        //bm.displayVisited();
        //fc.showAllCoures();
        
        fc.sortPostVisit();                         //Sort the courses by descending PostVisit 
        System.out.println();
        fc.showAllCoures();                         //Display of all
        
    }
    
}

