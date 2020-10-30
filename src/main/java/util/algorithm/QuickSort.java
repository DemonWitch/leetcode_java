package util.algorithm;

/**
 * @Author Richard Lv
 * @Date 2020/10/27 22:40
 * @Version 1.0
 * @Description 快速排序
 */
public class QuickSort {

    public static int[] quickSort(int[] nums){
        if (nums.length<2) return nums;
        doQuickSort(nums,0,nums.length-1);
        return nums;
    }

    private static void doQuickSort(int[] arr,int left,int right){
        if (left >= right) return ;//当左游标大等于右游标，说明已经当前分块已经分治到最小粒度，即一个元素，返回，完成排序
        int baseNumIndex = resetBaseNum(arr, left, right);//将当前分块的基准元素归位并返回下标
        doQuickSort(arr,left,baseNumIndex-1);//重复排序基准元素左分块
        doQuickSort(arr,baseNumIndex+1,right);//重复排序基准元素右分块
    }

    private static int resetBaseNum(int[] arr,int left,int right){
        int i=left; //创建一个左指针从基准元素后一个元素出发，因为下面做++i操作
        int j=right+1;//创建一个右指针从数组最后的位置出发，因为下面做--j操作，因此先+1
        int baseNum=arr[left];

        while (true){
            while (i<right && arr[++i]<baseNum){}//小于基准元素则继续，直到找到比基准元素大的出循环，左指针小于该分块的右游标既可，因为右指针是从右游标开始的
            while (j>0 && arr[--j]>baseNum){}//大于基准元素则继续，直到找到比基准元素小的出循环，右指针大于0即可，0是基准元素
            if (i>=j){
                break;//1.i与j相遇 2.找到的小于基准元素的下标(j)已经比大于基准元素的下标(i)小，不需要交换
            }else{
                swap(arr,i,j);
            }
        }
        System.out.println("i:"+i+",j:"+j);
        swap(arr,left,j);//将基准元素归位,且归位时无论i是否等于j,始终与j交换归位，因为j下标的元素是比自己小的元素
        return j;//返回基准元素下标
    }

    private static void swap(int[] arr,int i,int j){
        System.out.println("当前交换元素下标："+i+","+j);
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
