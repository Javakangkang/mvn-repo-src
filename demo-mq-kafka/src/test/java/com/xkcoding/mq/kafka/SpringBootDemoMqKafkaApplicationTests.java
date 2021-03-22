package com.xkcoding.mq.kafka;

import com.xkcoding.mq.kafka.constants.KafkaConsts;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoMqKafkaApplicationTests {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    /**
     * 测试发送消息
     */
    @Test
    public void testSend() {
        kafkaTemplate.send(KafkaConsts.TOPIC_TEST, "hello,kafka...");
    }
    /**
     * 封装，即使不是对象的最关键的特征，也是最关键特征之一。
     * 封装意味着每个对象尽可能少的了解系统的其他部分。如此一来，一旦发生变化，需要了解这一变化得对象就会比较少------这会使变化比较
     * 容易进行。
     *
     *
     * 任何学过对象技术得人都知道；虽然JAVA允许将字段声明为publiic ，但你还是应该隐藏对象得字段，随着经验日渐丰富，你会发现，有更多可以值得封装得东西
     *
     * 如果某个客户先通过服务 对象得字段 得到另一个对象。  然后调用后者得函数
     * 那么客户就必须知晓这一层委托关系。万一委托关系发生变化。 客户也得相应变化。
     * 你可以在服务对象上放置一个简单得委托函数， 将委托关系隐藏起来，从而去除这种依赖。  这么一来，即便将来发生委托关系上的变化，
     * 变化也将被限制在服务对象中，不会波及客户。
     *
     * 对于某些或全部客户，你可能会发现，有必要先使用Extract Class。  一旦你对的所有的客户的都隐藏了委托关系，就不再需要在服务多项的接口中公开被委托
     * 对象了。
     *
     *
     * 做法
     * 对于每一个委托关系中的函数，在服务对象端建立一个简单的委托函数。
     * 调整客户， 令它们调用服务对象提供的函数。
     *
     * -->如果使用者和 服务提供者不在同一个包，考虑修改委托函数的访问权限，让客户得以在包之外调用它。
     *
     * 每次调整后，编译并测试
     *
     * 如果将来不再有任何客户需要取用图7-1的Delegate(受托类)，便可移除服务对象中的相关的访问参数。。
     * 编译，测试
     *
     *
     */



























}

