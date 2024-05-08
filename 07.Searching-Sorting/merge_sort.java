
// import java.util.*;
// public class merge_sort{
//   public static void print(int[] arr){
//     //FUNCTION TO PRINT THE ARRAY
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i]+" ");
//     }
//     System.out.println();
//   }
//   public static void merge(int arr[],int s,int e){
//     //BASE CASE
//     if (s>=e)
//     {
//         return;
//     }

//     //FUNCTION TO BREAK THE ARRAY 
//     int mid = s+(e-s)/2;

//     //TO BREAK LEFT
//     //CALLING RECURSION
//     merge(arr, s, mid);

//     //CALLLING RECURSION TO BREAK RIGHT 
//     merge(arr, mid+1, e);

//     join_merge(arr,s,mid,e);
//   }

//   public static  void join_merge(int arr[],int s,int mid,int e)
//   {
//     // AUXILIARY ARRAY
//     int temp[]= new int[e-s+1];
//     //DECLEARE VARIABLES FOR THE CASE
//     int k =0;
//     int j = mid+1;
//     int i =s;
//     // USE WHILE LOOP TO JUSTIFY THE CASE 
//     while (i<=mid && j<= e) {
//         if(arr[i]<arr[j])
//         {
//             temp[k]=arr[i];
//             k++;
//             i++;
//         }
//         else{
//             temp[k]=arr[j];
//             k++;
//             j++;
//         }
//     }
//     //FOR THE LEFTOVER ELEMENTS
//     while (i<=mid) {

//         temp[k]=arr[i];
//             k++;
//             i++;
//     }
//     while (j<=e)
//     {
//         temp[k]=arr[j];
//         k++;
//         j++;   
//     }

//     //FOR COPYING THE LEMENTS BACK IN THE LOOP
//     for(k =0,i =s;k <temp.length;k++,i++)
//     {
//         arr[i]=temp[k];
//     }
//   }

//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     // a is the number of values in the array
//     int[] arr = new int[a];
//     for(int i = 0; i < a; i++){
//       arr[i] = sc.nextInt();
//     }

//     //CALLING THE MERGE FUNCTION
//     merge( arr, 0,arr.length-1);
//      //CALLING THE FUNCTION
//      print(arr);
//   }
// }
