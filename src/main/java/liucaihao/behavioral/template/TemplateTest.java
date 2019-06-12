package liucaihao.behavioral.template;

public class TemplateTest {
    public static void main(String[] args) {
        StepA stepA = new StepAImpl();
        StepB stepB = new StepBImpl();
        AllStep.doAllStep(stepA , stepB);
    }
}
