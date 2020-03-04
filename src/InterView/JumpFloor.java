package InterView;

/*
    f(n-1)+f(n-2)
    一只青蛙一次可以跳上1级台阶，也可以跳上2级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）

    变态跳楼梯
 */
public class JumpFloor {
    public int JumpFloorTest(int target) {
        int sum=0;
        if (target == 0) return 1;
        if (target == 1) return 1;
        return 2 * JumpFloorTest(target-1);
    }
}
