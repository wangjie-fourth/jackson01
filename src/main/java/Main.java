import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;

public class Main {

    public static void main(String[] args) throws JsonProcessingException, IntrospectionException {
        String data = "{\"aFiled\":10,\"normalFiled\":20}";

        // 原方式
        Domain domain = JSON.parseObject(data, Domain.class);
        System.out.println("domain = " + domain.getAFiled());

        // feign方式
        ObjectMapper mapper = new ObjectMapper();
        Domain domain1 = mapper.readValue(data, Domain.class);
        System.out.println("domain1 = " + domain1.getAFiled());

//        System.out.println(Introspector.decapitalize("aFiled"));
//        System.out.println(Introspector.decapitalize("Afiled"));
//        System.out.println(Introspector.decapitalize("AFiled"));
//        System.out.println(Introspector.decapitalize("Name"));
//        System.out.println(Introspector.decapitalize("mName"));
//        System.out.println(Introspector.decapitalize("NAME"));
//
//        BeanInfo beanInfo = Introspector.getBeanInfo(Domain.class);
//
//        System.out.println("beanInfo = " + beanInfo);

    }
}
