package liucaihao.creative.Prototype;

import java.util.Date;

public class TestDomain implements Cloneable{
    private TestParam testParam;

    private Date date;

    private int i;

    public TestDomain(Date date, int i , TestParam testParam) {
        this.date = date;
        this.i = i;
        this.testParam = testParam;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public TestParam getTestParam() {
        return testParam;
    }

    public void setTestParam(TestParam testParam) {
        this.testParam = testParam;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        TestDomain newTestDomain = (TestDomain) super.clone();
        //除了主要对象需要克隆，显示指定参数对象也执行clone方法，实现深复制
        newTestDomain.setTestParam((TestParam) this.getTestParam().clone());
        return newTestDomain;
    }
}
