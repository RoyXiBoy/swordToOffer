
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

 /**
  * 二维数组初始化
  * [][] 行列
  * 左下角的值 往上是小 往右是大
  */
public class Offer1{

    public static boolean findArray1(int[][] array,Object target){
       
        int row = 0;
        int col = array.length-1;

        if( null != target){
            for(; row < array[0].length || col >= 0; ){
                if((int)target > array[col][row]){
                    row++; 
                }
                if((int)target < array[col][row]){
                    col--;
                }
                if((int)target == array[col][row]){
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean findArray2(int[][] array,Object target) {
        
        int col = 0;

        if( null != target){
            for( ;col < array[col].length; col++){
                int start = 1;
                int end =  array[col].length;
                int mid = (start + end) / 2;
                while(start < end){
                    if((int)target > array[col][mid]){
                        start = mid + 1;
                    }
                    if((int)target < array[col][mid]){
                        end = mid - 1;
                    }
                    if((int)target == array[col][mid]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

   public static void main(String[] args) {
        int[][] array = {{1,2}, {4,5}, {7,8}};

        //时间复杂度 n^2
        System.out.println(findArray1(array,5));

        //时间复杂度 nlogn
        System.out.println(findArray2(array,6));
   }
}