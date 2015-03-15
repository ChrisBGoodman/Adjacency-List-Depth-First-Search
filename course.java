package algorithmsproject2;

/**
 *
 * @author ChrisGoodman
 */
public class course
{
    int classNum; 
    int preReq;
    int preReq2;
    
    int preVisit;
    int postVisit;
    
    course(int a, int b, int c)
    {
        this.classNum = a;
        this.preReq = b;
        this.preReq2 = c;
        this.preVisit = 0;
        this.postVisit = 0;
    }
    
    int getClassNum()
    {
        return classNum;
    }
    
    int getPreReq()
    {
        return preReq;
    }
    
    int getPreReq2()
    {
        return preReq2;
    }
    
    void setPreVisit(int num)
    {
        this.preVisit = num;
    }
    
    void setPostVisit(int num)
    {
        this.postVisit = num;
    }
    
    int getPreVisit()
    {
        return preVisit;
    }
    
    int getPostVisit()
    {
        return postVisit;
    }
}

