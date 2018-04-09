# LogWatcher
LogWatcher Demo and source code

使用方式：

````gradle
implementation 'com.suika:LogWatcher:1.0.0'
````
java调用：

```java
//Application的onCreate中：
LogTools.init(this);

//发送Log到LogWatcher
LogTools.i("test log");
```
LogWatcher Apk安装包：

**[LogWatcher.apk](https://raw.githubusercontent.com/z2058550226/LogWatcher/master/LogWatcher.apk)**

安装之后即可通过LogWatcher观察LogTools.i()输出的字符串。
