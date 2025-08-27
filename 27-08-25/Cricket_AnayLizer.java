import java.util.*;
public class Cricket_AnayLizer {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number of players: ");
     int n=sc.nextInt();
     int runs[]= new int[n];
     for(int i=0;i<n;i++){
     runs[i]=sc.nextInt();
     }
     int max=Integer.MIN_VALUE;
     double total=0;
     for(int i=0;i<n;i++){
    if(runs[i]>max){
        max=runs[i];
    }
    total+=runs[i];
}
int min=max;
 for(int i=0;i<n;i++){
    if(runs[i]<min){
        min=runs[i];
    }
}
System.out.println("Maximum Scored by a player: "+max);
System.out.println("Minimum Scored by a player: "+min);
System.out.println("Averaged Scored by a player: "+(total/n));
if(total>=100){
    System.out.println("Century Over");
}
    }
}
