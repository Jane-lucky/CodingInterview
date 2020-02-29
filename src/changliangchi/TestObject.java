package changliangchi;

public class TestObject {
    public static void main(String[] args) {
        ObjectTool<String> objectTool = new ObjectTool<>();
        objectTool.setObj(new String("你好"));
        System.out.println(objectTool.getObj());
    }
}
