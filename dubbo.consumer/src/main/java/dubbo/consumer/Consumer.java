package dubbo.consumer;

import dubbo.api.SharedService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        System.out.println("consumer start");
        SharedService sharedService = context.getBean(SharedService.class);
        System.out.println("consumer");
        System.out.println(sharedService.sayHello("xieyupeng"));
    }
}
