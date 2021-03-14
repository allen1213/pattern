package com.example.template;

public abstract class PM {

    protected abstract void analyze();//需求分析
    protected abstract void design();//设计
    protected abstract void develop();//开发
    protected abstract boolean test();//测试
    protected abstract void release();//发布

    protected final void kickoff(){
        analyze();
        design();
        do {
            develop();
        }while (!test());
        release();
    }
}
