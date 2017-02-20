/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package effectivejava.objectcreateanddestory;

/**
 *
 * @author wormz<br/>
 * 定义必须和非必须的参数分别进行setter操作<br/>
 * 可以单独设定非必要参数并进行异常描述<br/>
 * 对象不可变<br/>
 * 通过builder统一构建对象<br/>
 */
public class BuilderContructor {

    private final int column1;
    private final int column2;
    private final int column3;
    private final int column4;
    private final int column5;
    private final int column6;
    private final int column7;

    public static class Builder {

        private final int column1;
        private final int column2;

        private int column3 = 0;
        private int column4 = 0;
        private int column5 = 0;
        private int column6 = 0;
        private int column7 = 0;

        public Builder(int column1, int column2) {
            this.column1 = column1;
            this.column2 = column2;
        }

        public Builder column3(int value) {
            column3 = value;
            return this;
        }

        public Builder column4(int value) {
            column4 = value;
            return this;
        }

        public Builder column5(int value) {
            column5 = value;
            return this;
        }

        public Builder column6(int value) {
            column6 = value;
            return this;
        }

        public Builder column7(int value) {
            column7 = value;
            return this;
        }

        public BuilderContructor build() {
            return new BuilderContructor(this);
        }

    }

    private BuilderContructor(Builder builder) {
        column1 = builder.column1;
        column2 = builder.column2;
        column3 = builder.column3;
        column4 = builder.column4;
        column5 = builder.column5;
        column6 = builder.column6;
        column7 = builder.column7;

    }
}
