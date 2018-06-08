package io.pivotal.boot.clientauth;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Stanislav_Zaluzhskii on 6/8/2018.
 */
@FeignClient(url = "https://localhost:8080", name="hello")
public interface HelloFeign {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

}
