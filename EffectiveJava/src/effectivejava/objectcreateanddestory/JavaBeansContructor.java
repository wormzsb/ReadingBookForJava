/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.objectcreateanddestory;

/**
 *
 * @author wormz <br/>
 * JavaBean构造器灵活构造所有参数<br/>
 * 线程不安全，对象可变<br/>
 */
public class JavaBeansContructor {

    private int column1;
    private int column2;
    private int column3;
    private int column4;
    private int column5;
    private int column6;

    public void setColumn1(int column1) {
        this.column1 = column1;
    }

    public void setColumn2(int column2) {
        this.column2 = column2;
    }

    public void setColumn3(int column3) {
        this.column3 = column3;
    }

    public void setColumn4(int column4) {
        this.column4 = column4;
    }

    public void setColumn5(int column5) {
        this.column5 = column5;
    }

    public void setColumn6(int column6) {
        this.column6 = column6;
    }

}
