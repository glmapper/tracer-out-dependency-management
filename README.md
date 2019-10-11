
## 简介

* 本工程演示如何跳过 SOFABoot 对于 SOFATracer 的版本管控，在 任意 SOFABoot 工程中使用指定版本的 SOFATracer
* 本工程演示如何使用 @Tracer 注解，和使用 FlexibleTracer 在代码中进行自定义埋点

## 获取&运行

1、下载工程
```bash
git clone https://github.com/glmapper/tracer-out-dependency-management.git
```

2、导入并且运行工程

3、curl http://localhost:8080/test

4、在系统根目录下 查看 logs/tracerlog

> 注意：SOFABoot 3.2.0 版本有较大改动，SOFATracer 依赖了 SOFABoot 3.2.0 版本之前的一些 API ，所以工程使用的版本是 SOFABoot 3.1.5 。如果需要使用 3.2.0 版本，请不要使用此方式。
