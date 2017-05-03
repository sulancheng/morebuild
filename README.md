# morebuild
关于一个工程中存在多个项目的demo
需在对应项目的build下面进行如下的配置。
```sh
 sourceSets 
        main {
            java.srcDirs = ['src/main', 'src/main/java', 'src/main/java/']

        }
        flavorone {
            java.srcDirs = ['src/flavorone', 'src/flavorone/java', 'src/flavorone/java/']
        }

        flavortwo {
            java.srcDirs = ['src/flavortwo', 'src/flavortwo/java', 'src/flavortwo/java/']
        }
    }

    productFlavors{
        flavorone{
            applicationId "com.flavorone.su.mymorebuild"
            versionCode 1
            versionName "1.0"
        }
        flavortwo{
            applicationId "com.flavortwo.su.mymorebuild"
            versionCode 1
            versionName "1.0"
        }
    }
    //下面的 tools:node="replace"  使得编译时候将main的配置文件覆盖。
     <application
        android:allowBackup="true"
        android:icon="@mipmap/icon_normal"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme"
        tools:node="replace">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".ActivityFlavorOne"></activity>
    </application>
  ```
