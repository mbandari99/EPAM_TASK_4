import java.util.*;
 
class SparseArrays {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String strings[]=new String[n];
        for(int i=0;i<n;i++)
            strings[i]=sc.next();
        int m =sc.nextInt();
        String queries[]=new String[m];
        for(int i=0;i<m;i++)
            queries[i]=sc.next();
        Check(strings,queries);
    }
    static void Check(String strings[],String queries[])
    {
        int count[]=new int[queries.length];
        for(int i=0;i<strings.length;i++)
        {
            for(int j=0;j<queries.length;j++)
            {
                if(queries[j].equals(strings[i]))
                {
                    count[j]++;
                    
                }
            }
        }
        for(int i=0;i<queries.length;i++)
        {
            System.out.println(count[i]);
        }
    }
}
