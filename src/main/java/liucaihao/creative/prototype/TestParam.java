package liucaihao.creative.prototype;

/**
 * 要实现复杂对象深复制需要复杂对象也实现Cloneable接口
 */
public class TestParam implements Cloneable{

    private int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
