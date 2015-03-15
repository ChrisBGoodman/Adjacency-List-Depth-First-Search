package algorithmsproject2;

import java.util.ArrayList;

/**
 *
 * @author ChrisGoodman
 */
public class buildMatrix
{
    
    int [][] adjMatrix;
    boolean visited[];        
    int visitCount = 0;       //for setting pre/post visit nums

    
    void createMatrix(ArrayList<course> c)
    {
        adjMatrix = new int[c.size()][c.size()];
    }
    
    void fillMatrix(ArrayList<course> c)
    {
        int temp;
        for (int row = 0; row < c.size(); row++)
        {
            if (c.get(row).getPreReq() != 0)                        //if it has a preReq
                {
                    temp = findInList(c.get(row).getPreReq(), c);   //store index location of prereq
                    adjMatrix[row][temp] = 1; 
                    
                    if(c.get(row).getPreReq2() != 0)
                    {
                        temp = findInList(c.get(row).getPreReq2(), c);
                        adjMatrix[row][temp] = 1;
                    }
                }
        }
    }
    
    int findInList(int num, ArrayList<course> c)        //return index location of a course 
    {
        for (int i = 0; i < c.size(); i++)
        {
            if (c.get(i).getClassNum() == num)
            {
                return i;
            }
        }
        return 0;
    }
    
    void displayMatrix()
    {
        for (int row = 0; row < adjMatrix.length; row++)
        {
            for (int col = 0; col < adjMatrix.length; col++)
            {
                System.out.print(adjMatrix[row][col]);
            }
            System.out.println();
        }
    }
    
    void flipMatrix()        //Inverse the matrix to complete adj matrix and connect vertices
    {
        for (int row = 0; row < adjMatrix.length; row++)
        {
            for (int col = 0; col < adjMatrix.length; col++)
            {
                if (adjMatrix[row][col] == 1)
                {
                    adjMatrix[col][row] = 1;
                }
            }
        }
    }
    
    
    /**
     * @param r is row to start DFS from
     * @param c is column to start DFS from 
     * Track which nodes have been visited by column
     * Start from location [0][0]
     */
    void matrixDFS(ArrayList<course> arr,int r, int c ) 
    {
        visitCount++;
        arr.get(r).setPreVisit(visitCount);
        
        visited[r] = true;
        
        for (int col = 0; col < adjMatrix.length; col++ )
        {
            if (adjMatrix[r][col] == 1 && visited[col] == false)
            {
                matrixDFS(arr, col, r);
                
            }      
        } 
        visitCount++;
        arr.get(r).setPostVisit(visitCount);
    }
//------------------------------------------------------------------------------
    void setUnvisited()
    {
        visited = new boolean[adjMatrix.length];
        
        for (int x = 0; x < visited.length; x++)
            visited[x] = false;
    }
    
    void displayVisited()
    {
        for (int i = 0; i < adjMatrix.length; i ++)
        {
            System.out.println(i + " = " + visited[i]);
        }
    } 
}

