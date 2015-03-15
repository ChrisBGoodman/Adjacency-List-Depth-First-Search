package algorithmsproject2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ChrisGoodman
 */
public class fillClasses
{
    private ArrayList<course> x;

    fillClasses()
    {
        x = new ArrayList<course>();
        
                                             //Add every course and its preReqs to the Array List 
        x.add(new course(1390,0,0));
        x.add(new course(1470,1390,0));
        x.add(new course(1480,1470,0));
        x.add(new course(1591,1390,0));
        x.add(new course(2320,1480,0));
        x.add(new course(2330,1591,1470));
        x.add(new course(2440,1480,0));
        x.add(new course(3190,2320,0));
        x.add(new course(3320,2330,0));
        x.add(new course(3330,2320,2330));
        x.add(new course(3335,2320,0));
        x.add(new course(3345,2320,0));
        x.add(new course(3350,2320,0));
        x.add(new course(3360,2320,0));
        x.add(new course(3370,2320,0));
        x.add(new course(3380,2440,0));
        x.add(new course(3381,2320,0));
        x.add(new course(3385,2320,0));
        x.add(new course(4300,2440,3330));
        x.add(new course(4310,2320,1591));
        x.add(new course(4315,3330,0));
        x.add(new course(4320,3370,0));
        x.add(new course(4340,2440,3330));
        x.add(new course(4345,4300,0));
        x.add(new course(4350,2320,3320));
        x.add(new course(4353,3330,0));
        x.add(new course(4355,3335,0));
        x.add(new course(4365,3330,0));
        x.add(new course(4370,3360,0));
        x.add(new course(4390,2320,2330));
        x.add(new course(4490,3381,0));
    }
        /*
MATH 1390 COLLEGE ALGEBRA
MATH 1591 Calculus I (MATH 1390)
MATH 2330 Discrete Mathematics (MATH 1591 and CSCI 1470)
MATH 3320 Linear Algebra (MATH 2330)
CSCI 1470 COMPUTER SCIENCE I (MATH 1390)
CSCI 1480 COMPUTER SCIENCE II (CSCI 1470)
CSCI 2320 DATA STRUCTURES (CSCI 1480)
CSCI 2440 ASSEMBLY LANGUAGE AND COMPUTER ORGANIZATION (CSCI 1480)
CSCI 3190 SOCIAL IMPLICATIONS OF TECHNOLOGY (CSCI 2320)
CSCI 3330 ALGORITHMS (CSCI 2320, MATH 2330)
CSCI 3335 NETWORKING (CSCI 2320)
CSCI 3345 HUMAN-COMPUTER INTERACTION (CSCI 2320)
CSCI 3350 FILE STRUCTURES (CSCI 2320)
CSCI 3360 DATABASE SYSTEMS (CSCI 2320)
CSCI 3370 PRINCIPLES OF PROGRAMMING LANGUAGES (CSCI 2320)
CSCI 3380 COMPUTER ARCHITECTURE (CSCI 2440)
CSCI 3381 OBJECT-ORIENTED SOFTWARE DEVELOPMENT WITH JAVA (CSCI 2320)
CSCI 3385 ARTIFICIAL INTELLIGENCE (CSCI 2320)
CSCI 4300 OPERATING SYSTEMS (CSCI 2440, 3330)
CSCI 4310 INTRODUCTION TO SCIENTIFIC COMPUTING (CSCI 2320, MATH 1591, 3320)
CSCI 4315 INFORMATION SECURITY (CSCI 3330)
CSCI 4320 COMPILER CONSTRUCTION (CSCI 3370)
CSCI 4340 INTRODUCTION TO PARALLEL PROGRAMMING (CSCI 2440, 3330)
CSCI 4345 INTRODUCTION TO REAL-TIME SYSTEM CONCEPTS AND IMPLEMENTATION (CSCI 4300)
CSCI 4350 COMPUTER GRAPHICS (CSCI 2320 and MATH 3320)
CSCI 4353 INTRODUCTION TO MULTIMEDIA COMPUTING (CSCI 3330)
CSCI 4355 DISTRIBUTED OBJECT COMPUTING (CSCI 3335)
CSCI 4365 WEB TECHNOLOGY (CSCI 3330)
CSCI 4370 DATA MINING (CSCI 3360)
CSCI 4390 THEORY OF COMPUTATION (CSCI 2320 and MATH 2330)
CSCI 4490 SOFTWARE ENGINEERING (CSCI 3381)

*/

    
    void showClass()
    {
        for (int i = 0; i < x.size(); i++)
        {
           System.out.println(x.get(i).getClassNum());
        }
    }
    
    void showAllCoures()
    {
        System.out.println("Course - Pre - Post");
        for (int i = 0; i < x.size(); i++)
        {
            System.out.println(x.get(i).classNum + "      " + x.get(i).preVisit + "   " + x.get(i).postVisit);
        }
    }
    
    public ArrayList<course> returnArray()
    {
        return x;
    }

    public int findInList(int num)
    {
        for (int i = 0; i < x.size(); i++)
        {
            if (x.get(i).getClassNum() == num)      //search thru array for location of Course in the list
            {
                System.out.println("Found at location" + i);
                return i;

            }
        }
        return 0;
    }
    
    void sortPostVisit()  //Simple bubble sort
    {
        int length = x.size();

        for (int i = 0; i < x.size(); i++)
        {
            for (int y = 1; y < x.size(); y++)
            {
                if (x.get(y - 1).postVisit < x.get(y).postVisit)
                {
                    Collections.swap(x, (y - 1), y);

                }
            }
        }
    }
}

