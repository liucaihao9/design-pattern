package liucaihao.behavioral.template;

public class AllStep {
    /**
     * 该方法定义了算法执行的骨架，具体实现由StepA以及StepB的实现类进行实现
     * @param stepA
     * @param stepB
     */
    public static final void doAllStep(StepA stepA , StepB stepB){
        stepA.stepADoSomething();
        stepB.stepBDoSomething();
    }
}
