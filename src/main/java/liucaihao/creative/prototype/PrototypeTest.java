package liucaihao.creative.prototype;

import java.util.Date;

public class PrototypeTest {
    public static void main(String[] args) {
        TestParam testParam = new TestParam();
        testParam.setJ(10);
        TestDomain testDomain1 = new TestDomain(new Date() , 2 , testParam);
        TestDomain testDomain2 = null;
        try {
            testDomain2 = (TestDomain) testDomain1.clone();
            Thread.sleep(1000);
            testDomain2.setDate(new Date());
            testDomain2.getTestParam().setJ(9);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(testDomain1);
        System.out.println(testDomain2);
        System.out.println(testDomain1.getDate());
        System.out.println(testDomain1.getI());
        System.out.println(testDomain1.getTestParam());
        System.out.println(testDomain1.getTestParam().getJ());
        System.out.println(testDomain2.getDate());
        System.out.println(testDomain2.getI());
        System.out.println(testDomain2.getTestParam());
        System.out.println(testDomain2.getTestParam().getJ());
    }
}
