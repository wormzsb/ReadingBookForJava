/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.objectcreateanddestory;

/**
 *
 * @author wormz <br/>
 * 重叠构造器<br/>
 * 层叠包含所有需要的参数<br/>
 * 参数具有优先级，而且不能太多<br/>
 * 参数为final类型，对象较为安全<br/>
 */
public class TelescopingContructor {

    private final int column1;
    private final int column2;
    private final int column3;
    private final int column4;
    private final int column5;
    private final int column6;
    private final int column7;

    public TelescopingContructor(int column1) {
        this(column1, 0);
    }

    public TelescopingContructor(int column1, int column2) {
        this(column1, column2, 0);
    }

    public TelescopingContructor(int column1, int column2, int column3) {
        this(column1, column2, column3, 0);
    }

    public TelescopingContructor(int column1, int column2, int column3, int column4) {
        this(column1, column2, column3, column4, 0);
    }

    public TelescopingContructor(int column1, int column2, int column3, int column4, int column5) {
        this(column1, column2, column3, column4, column5, 0);
    }

    public TelescopingContructor(int column1, int column2, int column3, int column4, int column5, int column6) {
        this(column1, column2, column3, column4, column5, column6, 0);
    }

    public TelescopingContructor(int column1, int column2, int column3, int column4, int column5, int column6, int column7) {
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
        this.column4 = column4;
        this.column5 = column5;
        this.column6 = column6;
        this.column7 = column7;
    }

}
