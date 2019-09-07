import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_Arr = br.readLine().split(" ");
            int[] Arr = new int[N];
            //LinkedList<Integer> a=new LinkedList<Integer>();
            for(int i_Arr=0; i_Arr<arr_Arr.length; i_Arr++)
            {
            	Arr[i]=Integer.parseInt(arr_Arr[i_Arr]));
            }

            int out_ = min_diff(Arr);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
     static int min_diff(int[] a){
        // Write your code here
        //int min=250000;
       /* for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]%2==0&&a[j]%2!=0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(a[i]-a[j]*2),Math.abs(((int)a[i]/2)-a[j]*2))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(a[i]-a[j]*2),Math.abs(((int)a[i]/2)-a[j]*2)));
                
                }
                else if(a[i]%2==0&&a[j]%2==0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(((int)a[i]/2)-((int)a[j]/2)),Math.abs(a[i]-((int)a[j]/2)))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(((int)a[i]/2)-((int)a[j]/2)),Math.abs(a[i]-((int)a[j]/2))));
                
                }
                else if(a[j]%2==0&&a[i]%2!=0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]-((int)a[j]/2))),Math.min(Math.abs(a[i]*2-a[j]),Math.abs(a[i]*2-((int)a[j]/2)))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]-((int)a[j]/2))),Math.min(Math.abs(a[i]*2-a[j]),Math.abs(a[i]*2-((int)a[j]/2))));
                
                }
                else if(a[i]%2!=0&&a[j]%2!=0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]*2-a[j])),Math.min(Math.abs(a[i]*2-a[j]*2),Math.abs(a[i]-a[j]*2))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]*2-a[j])),Math.min(Math.abs(a[i]*2-a[j]*2),Math.abs(a[i]-a[j]*2)));
                
                }
                
            }
            
        }*/
       /*for(int i=0;i<a.size()-1;i++)
        {
            if((a.get(i)*2==a.get(i+1))||(a.get(i)==a.get(i+1)*2))
            return 0;
            
            else if((((int)a.get(i)/2)==a.get(i+1))||(a.get(i)==((int)a.get(i+1)/2)))
            return 0;
            
        }
        int temp=0;
        for(int i=0;i<a.size()-1;i++)
        {
            for(int j=i+1;j<a.size();j++)
            {
                temp=a.get(i);
                a.add(i)=a.get(j);
                a.add(j)=temp;
            }
        }
        int min=250000;
        for(int i=0;i<a.size()/2;i++)
        {
            if(Math.abs(a.get(i)-a.get(i+1))>
            Math.abs(a.get(i+a.length/2)-a.get(i+1+a.length/2)))
            {
                if(min>Math.abs(a.get(i)-a.get(i+1)))
                min=Math.abs(a.get(i)-a.get(i+1));
                a.remove(i);
                i--;
            }
            else
            {
                if(min>Math.abs(a.get(i+a.length/2)-a.get(i+1+a.length/2)))
                min=Math.abs(a.get(i+a.length/2)-a.get(i+1+a.length/2));
                a.remove(i+a.length/2);
                i--;
            }
        }
        return min;*/
        
        
        /*for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]%2==0&&a[j]%2!=0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(a[i]-a[j]*2),Math.abs(((int)a[i]/2)-a[j]*2))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(a[i]-a[j]*2),Math.abs(((int)a[i]/2)-a[j]*2)));
                
                }
                else if(a[i]%2==0&&a[j]%2==0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(((int)a[i]/2)-((int)a[j]/2)),Math.abs(a[i]-((int)a[j]/2)))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(((int)a[i]/2)-a[j])),Math.min(Math.abs(((int)a[i]/2)-((int)a[j]/2)),Math.abs(a[i]-((int)a[j]/2))));
                
                }
                else if(a[j]%2==0&&a[i]%2!=0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]-((int)a[j]/2))),Math.min(Math.abs(a[i]*2-a[j]),Math.abs(a[i]*2-((int)a[j]/2)))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]-((int)a[j]/2))),Math.min(Math.abs(a[i]*2-a[j]),Math.abs(a[i]*2-((int)a[j]/2))));
                
                }
                else if(a[i]%2!=0&&a[j]%2!=0)
                {
                if(min==0)
                return min;
                if(min>Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]*2-a[j])),Math.min(Math.abs(a[i]*2-a[j]*2),Math.abs(a[i]-a[j]*2))))
                min=Math.min(Math.min(Math.abs(a[i]-a[j]),Math.abs(a[i]*2-a[j])),Math.min(Math.abs(a[i]*2-a[j]*2),Math.abs(a[i]-a[j]*2)));
                
                }
                
            }
            
        }*/
        //return min;
        int temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        for(int i=0;i<a.length-1;i++)
        {
             if((a[i]*2==a[i+1])||(a[i]==a[i+1]*2))
            return 0;
            
            else if((((int)a[i]/2)==a[i+1])||(a[i]==((int)a[i+1]/2)))
            return 0;
            
        }
        LinkedList<Integer> m=new LinkedList<Integer>();
        int m=250000;
        int t=-1;
        if(a.length%2==0)
        {
            int s[]=new int[a.length/2];
        for(int i=0;i<a.length/2;i++)
        {
            if(Math.abs(a[i]-a[i+1])<Math.abs(a[i+(a.length/2)]-a[i+1+(a.length/2)]))
            {
                 if(m>Math.abs(a[i]-a[i+1]))
                 m=Math.abs(a[i]-a[i+1]);
            t=1;
            }
            else
            {
            if(m>Math.abs(a[i+(a.length/2)]-a[i+1+(a.length/2)]))
            m=Math.abs(a[i+(a.length/2)]-a[i+1+(a.length/2)]);
            t=0;
            }
        }
        if(t==1)
        {
            for(int i=0;i<a.length/2;i++)
            {
                s[i]=a[i];
            }
            min_diff(s);
        }
        else if(t==0)
        {
            for(int i=a.length/2;i<a.length;i++)
            {
                s[i]=a[i];
            }
            min_diff(s);
        }
        }
    }
}