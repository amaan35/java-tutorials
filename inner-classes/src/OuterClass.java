public class OuterClass {
    int num=6;
    public void printNum(){
        System.out.println(num);
        class LocalInnerClass{
            String s = "Inner local class";
            public void printS(){
                System.out.println(s);
            }
        }
        LocalInnerClass lic = new LocalInnerClass();
        lic.printS();
    }
    public static class InnerClass{
        int innerNum = 8;
        public void printInnerNum(){
            System.out.println(innerNum);
        }
    }
}
