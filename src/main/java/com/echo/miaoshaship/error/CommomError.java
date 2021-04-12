package com.echo.miaoshaship.error;

public interface CommomError {
    /*
    该接口中定义errMsg,errCode的方法
     */
    public int getErrCode();

    public String getMsg();

    //自定义错误消息
    //返回的类型是接口，但是接口是不能实例化的，但是接口可以声明一个引用，指向其实现类，也就是说，在实际中返回值都是这个接口的实现类的对象。这点就是面向对象的一大特点
    public CommomError setErrMsg(String errMsg);
}
