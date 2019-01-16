
# MarkPush
集成友盟推送，包括厂商系统推送。

### 混淆规则
    -dontwarn com.umeng.**
    -dontwarn com.taobao.**
    -dontwarn anet.channel.**
    -dontwarn anetwork.channel.**
    -dontwarn org.android.**
    -dontwarn org.apache.thrift.**
    -dontwarn com.xiaomi.**
    -dontwarn com.huawei.**
    -dontwarn com.meizu.**

    -keepattributes *Annotation*

    -keep class com.taobao.** {*;}
    -keep class org.android.** {*;}
    -keep class anet.channel.** {*;}
    -keep class com.umeng.** {*;}
    -keep class com.xiaomi.** {*;}
    -keep class com.huawei.** {*;}
    -keep class com.meizu.** {*;}
    -keep class org.apache.thrift.** {*;}

    -keep class com.alibaba.sdk.android.**{*;}
    -keep class com.ut.**{*;}
    -keep class com.ta.**{*;}

    -keep public class **.R$*{
       public static final int *;
    }

## Umeng Link
:star: Thanks for [Umeng Link](https://developer.umeng.com/docs/66632/detail/98589)'s guidance during development.

## License

    The MVVM-Rhine: Apache License

    Copyright (c) 2018 qingmei2

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


