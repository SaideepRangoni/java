public class Main1{
    public static void main(String[] args){
        int[] array ={11,10,3,2,1};
        int target=190;
        int ans=agnosticbinarySearch(array,target);
        System.out.println(ans);
        
        }
        static int agnosticbinarySearch(int[] arr,int target){
            int low=0;
            int high=arr.length-1;
              boolean isao=arr[low]<arr[high];
              while(low<=high){
                int mid=low+(high-low)/2;
            if (arr[mid]==target){
                return mid;
            }  
            if(isao){
               
                if(target<arr[mid]){
                    high=mid-1;
                
                }
                else{
                    low=mid+1;
                }
                
              
            }
             
            
            else{
                
                if(target>arr[mid]){
                    high=mid-1;
                
                }
                else{
                    low=mid+1;
                }
                
              
            }
            
              }
             return -1;
        }
}
             
            
           
       
    
