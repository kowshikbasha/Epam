public class Mamx1
{
public static void main(String[] args)
{
int m=0;
int arr[][]=new int[3][3];
if(args.length==4)
{
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
arr[i][j]=Integer.parseInt(args[m]);
m++;
}
}
System.out.println("the given array is");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();
}
System.out.println("The reverse array is ");
for(int i=1;i>=0;i--)
{
for(int j=1;j>=0;j--)
{
System.out.print(arr[i][j]);
}
System.out.println();
}
}
else
{
System.out.println("Please enter the 9 numbers");
}
}
}

