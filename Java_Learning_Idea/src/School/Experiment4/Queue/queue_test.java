package School.Experiment4.Queue;

public class queue_test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        // 添加1到20的数字到队列
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        // 移除并显示队列中的数字
        System.out.println("\nRemoving elements from queue:");
        while (!queue.empty()) {
            int value = queue.dequeue();
            System.out.println("Removed: " + value);
        }
        //System.out.println("\nFinal queue size: " + queue.getSize());
    }
}


