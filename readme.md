:heartpulse:Klog:heartpulse:

 一款针对Android平台下基于[Klog](https://github.com/ZhaoKaiQiang/KLog)的日志工具,修改kotlin无法跳转代码行的问题<br>

[![Jitpack](https://jitpack.io/v/peihua8858/KLog.svg)](https://github.com/peihua8858)
[![PRs Welcome](https://img.shields.io/badge/PRs-Welcome-brightgreen.svg)](https://github.com/peihua8858)
[![Star](https://img.shields.io/github/stars/peihua8858/KLog.svg)](https://github.com/peihua8858/KLog)


## 目录
-[最新版本](https://github.com/peihua8858/KLog/releases/tag/1.0.11)<br>
-[如何引用](#如何引用)<br>
-[进阶使用](#进阶使用)<br>
-[演示效果](https://github.com/ZhaoKaiQiang/KLog#readme#Sample_Usage)<br>
-[如何提Issues](https://github.com/peihua8858/KLog/wiki/%E5%A6%82%E4%BD%95%E6%8F%90Issues%3F)<br>
-[License](#License)<br>

## 如何引用
* 把 `maven { url 'https://jitpack.io' }` 加入到 repositories 中
* 添加如下依赖，末尾的「latestVersion」指的是ViewPager2 [![Download](https://jitpack.io/v/peihua8858/KLog.svg)](https://jitpack.io/#peihua8858/KLog) 里的版本名称，请自行替换。
使用Gradle
```sh
repositories {
  google()
  maven { url 'https://jitpack.io' }
}

dependencies {
  // KLog
  implementation 'com.github.peihua8858:KLog:${latestVersion}'
}
```

或者Maven:

```xml
<dependency>
  <groupId>com.github.peihua8858</groupId>
  <artifactId>KLog</artifactId>
  <version>${latestVersion}</version>
</dependency>
```

## 进阶使用

简单用例如下所示:

[[查看](https://github.com/ZhaoKaiQiang/KLog#readme)]

## License
```sh
Copyright 2023 peihua

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```



