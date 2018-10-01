package sy180925;

public class DlinkTest
{
	// 双向链表操作int数据
    private static void int_test() {
        int[] iarr = {10, 20, 30, 40};

        System.out.println("\n----int_test----");
        // 创建双向链表
        DoubleLink<Integer> dlink = new DoubleLink<Integer>();

        dlink.insert(0, 20);    // 将 20 插入到第一个位置
        dlink.appendLast(10);    // 将 10 追加到链表末尾
        dlink.insertFirst(30);    // 将 30 插入到第一个位置
        dlink.insert(2,40);
        dlink.insert(3,70);
        dlink.insert(2,80);
        // 双向链表是否为空
        System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
        // 双向链表的大小
        System.out.printf("size()=%d\n", dlink.size());

        // 打印出全部的节点
        for (int i=0; i<dlink.size(); i++)
            System.out.println("dlink("+i+")="+ dlink.get(i));
    }
    public static void main(String[] args) {
        int_test();        // 演示向双向链表操作“int数据”。
       
    }

}
