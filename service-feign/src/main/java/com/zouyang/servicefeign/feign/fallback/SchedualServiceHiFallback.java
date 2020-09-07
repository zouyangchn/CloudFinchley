package com.zouyang.servicefeign.feign.fallback;

import com.zouyang.servicefeign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author EX_100380990
 */

@Component
public class SchedualServiceHiFallback implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name){
        return "出错了！哈哈哈！！！！！！"+name;
    } ;
}
