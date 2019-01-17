
# MarkPush
集成友盟推送，包括厂商系统推送。
### 集成方式
###### 一、GitHub远程仓库
    repositories {
          maven { url "https://raw.githubusercontent.com/zfl5232577/maven/master" }
          maven { url 'https://dl.bintray.com/umsdk/release' }
      }
    allprojects {
        repositories {
            maven { url "https://raw.githubusercontent.com/zfl5232577/maven/master" }
            maven { url 'https://dl.bintray.com/umsdk/release' }
        }
    }

    dependencies {
        implementation 'com.mark:markpush-lib:lastversion'
    }

##### 或者

###### 二、Jcenter远程仓库
    repositories {
        maven { url 'https://dl.bintray.com/umsdk/release' }
    }

    allprojects {
            repositories {
                maven { url 'https://dl.bintray.com/umsdk/release' }
            }
        }

    dependencies {
      implementation 'com.mark:markpush-lib:lastversion'
    }

### 使用
    PushHelper.getInstance().init(this,"5af2608cf29d981850000208","mark","8bbf20db1bc770d5df570163e941084d");
    PushHelper.getInstance().register(this);
    PushHelper.getInstance().registerMeizuPush(this,"118261","b4492fd61afc4ff8a9d41150c9096529");
    PushHelper.getInstance().setAlias(this,"test","user");
    PushHelper.getInstance().setLogEnabled(BuildConfig.DEBUG);
    PushHelper.getInstance().setNotificationClickHandler(this,new UmengNotificationClickHandler(){
        @Override
        public void dealWithCustomAction(Context context, UMessage uMessage) {
            Log.e("mark", "dealWithCustomAction: "+ uMessage.extra);
            Toast.makeText(context, uMessage.custom, Toast.LENGTH_SHORT).show();
        }
    });

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


