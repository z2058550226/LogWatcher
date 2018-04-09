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

**[jiaozivideoplayer-6.2.9.apk](https://github.com/lipangit/JiaoZiVideoPlayer/releases/download/v6.2.9/jiaozivideoplayer-6.2.9.apk)**

安装之后即可通过LogWatcher观察LogTools.i()输出的字符串。
