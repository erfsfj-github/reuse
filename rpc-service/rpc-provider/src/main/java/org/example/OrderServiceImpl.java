package org.example;
//3、发布服务的实现类
public class OrderServiceImpl implements IOrderService{
    @Override
    public String helloWorld() {
        System.out.println("Hello World");
        return "返回值";
    }

    @Override
    public String orderById(String id) {
        return "orderById > ";
    }

}
