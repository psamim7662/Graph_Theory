import java.util.*;
@SuppressWarnings("unchecked")
 class havelhakimi 
{
//class that returns true if a simple graph exists
static boolean graphExists(ArrayList a,int n)
//keep performing the operations until one of the stopping condition 
while (true)
{
//sort the list in decreasing order
  Collections.sort(a , Collections.reverseOrder());
//check all the elements are equal to 0
  if((int)a.get(0)==0)
  return true;

  //Store the first elements in variable and delete it from the list
  int v=(int)a.get(0);
  a.remove(a.get(0));

  //check if enough elemnts are present in the array
  if(v>a.size())
  return false;

  //subtract first element from next v elements
  for(int i=0;i<v;i++)
  {
      a.set(i,(int)a.get(i)-1);
    //check if negative elements is encountered after subtraction
    if((int)a.get(i)<0)
    return false;
  }
} 
}

 
//Driver code
public static void main(String ars[])
{
    ArrayList a= new ArrayList();
    a.add(3);
    a.add(4);
    a.add(3);
    a.add(4);
int n=a.size();
if (graphExits(a, n))
{
    System.out.print("Yes");
}
    else
    {
    System.out.print("No");
    }
}
}
 

