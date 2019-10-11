package com.glmapper.bridge.boot.controller;

import com.alipay.common.tracer.core.tags.SpanTags;
import com.alipay.sofa.tracer.plugin.flexible.FlexibleTracer;
import com.alipay.sofa.tracer.plugin.flexible.annotations.Tracer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/10/11 7:24 PM
 * @since:
 **/
@RestController
public class TestController {

    @Autowired
    io.opentracing.Tracer tracer;

    @Tracer
    @RequestMapping("test")
    public String test(){
        // 自定义 tag
        SpanTags.putTags("key","val");

        ((FlexibleTracer)tracer).beforeInvoke("custom");
        SpanTags.putTags("key-inner","val-inner");
        ((FlexibleTracer)tracer).afterInvoke();
        return "test";
    }
}
