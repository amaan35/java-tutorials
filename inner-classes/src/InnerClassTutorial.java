public class InnerClassTutorial {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.printNum();

//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.printInnerNum();

        OuterClass.InnerClass inner2 = new OuterClass.InnerClass();
        inner2.printInnerNum();
    }
}
