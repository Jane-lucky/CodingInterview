package InterView;

/*
请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。

若队列为空，pop_front 和 max_value 需要返回 -1
示例 1：

输入:
["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
[[],[1],[2],[],[],[]]
输出: [null,null,null,2,1,2]
 */
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxQueue {
    private Deque<Integer> queue;
    private Deque<Integer> help;
    //创建队列
    public MaxQueue() {
        queue = new ArrayDeque<>();
        help = new ArrayDeque<>();
    }
//查找最大值
    public int max_value() {
        return queue.isEmpty()?-1:help.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!help.isEmpty()&&value>help.peekLast()){
            help.pollLast();
        }
        help.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return  -1;
        }
        int val = queue.pop();
        if (help.peek() == val) {
            help.pop();
        }
        return val;
    }
}
//# Your MaxQueue object will be instantiated and called as such:
//        # obj = MaxQueue()
//        # param_1 = obj.max_value()
//        # obj.push_back(value)
//        # param_3 = obj.pop_front()
