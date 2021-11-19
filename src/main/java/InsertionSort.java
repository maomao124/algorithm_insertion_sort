/**
 * Project name(项目名称)：算法_插入排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): InsertionSort
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/20
 * Time(创建时间)： 0:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class InsertionSort
{
    public static void sort(int[] arr)
    {
        System.out.println("排序前：");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("排序开始：");
        int temp, j;
        for (int i = 1; i < arr.length; i++)
        {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--)
            {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
            print(arr);
        }
    }

    private static void print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
