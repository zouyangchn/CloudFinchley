package com.zouyang.servicefeign.feign;

import com.zouyang.servicefeign.feign.fallback.SchedualServiceHiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author EX_100380990
 */

@FeignClient(value = "service-hi",fallback = SchedualServiceHiFallback.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name) ;
}
