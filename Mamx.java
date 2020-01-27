public class Mamx
{
public static void main(String[] args)
{
int m=0;
int arr[][]=new int[3][3];
if(args.length==9)
{
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=Integer.parseInt(args[m]);
m++;
}
}
System.out.println("the given array is");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
int m1=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(arr[i][j]>m1)
{
m1=arr[i][j];
}
}
}
System.out.println("The biggest number in the given array"+m1);
}
else
{
System.out.println("Please enter the 9 numbers");
}
}
}

