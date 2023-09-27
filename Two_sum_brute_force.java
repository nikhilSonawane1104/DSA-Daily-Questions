public class Solution {
    public static String read(int n, int []book, int target){
       int sum=0;
       for(int i=0;i<book.length;i++)
       {
           for(int j=i+1;j<book.length;j++)
           {
               sum=book[i]+book[j];
               if(sum==target)
               {
                   return "YES";
               }
           }
       }

       return "NO";
      
    }
}
