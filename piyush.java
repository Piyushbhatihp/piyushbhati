import java.util.Scanner;
class SmallestElement{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Size Of The Array");
int n = sc.nextInt();
int a[] = new int[n];
for(int i = 0;i<n;i++){
System.out.println("Enter The Element at Index "+(i+1));
a[i] = sc.nextInt();
}
int smallest = a[0];
for(int i = 0;i<n;i++){
if(smallest>a[i]){
smallest = a[i];
}
}
System.out.println("Smallest Element In The Array Is "+smallest);
sc.close();
}
}
