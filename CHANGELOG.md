# 新版本1.7.4
* LiveData observe 优化

# 新版本1.7.3
* 重新发布

# 新版本1.7.2
* rxjava 3.0.8
* 解决 DialogFragment 显示报错： Can not perform this action after onSaveInstanceState 问题

# 新版本1.7.1
* kotlin 1.4.20
* gson 2.8.6
* 页面销毁时，binding = null

# 新版本1.7.0
* LiveDataExt 扩展优化

# 新版本1.6.9
* 文件断点下载优化

# 新版本1.6.8
* dagger 2.30.1
* 文件下载支持断点下载

# 新版本1.6.7
* navigation 优化

# 新版本1.6.6
* utilcode 1.30.5
* EventLiveData 优化

# 新版本1.6.5
* navigateUp 优化

# 新版本1.6.4
* utilcode 1.30.4

# 新版本1.6.3
* Glide 加载图片高斯模糊修复
* 支持 Glide 加载部分圆角图片

# 新版本1.5.9
* 点击防抖 isValid 优化

# 新版本1.5.7
* utilcode 1.30.0 → 1.30.1

# 新版本1.5.6
* utilcode 1.29.0 → 1.30.0
* ClipboardUtils 工具类调整

# 新版本1.5.5
* rxjava3 3.0.6 → 3.0.7
* corektx 1.3.1 → 1.3.2
* navigation 2.3.0 → 2.3.1

# 新版本1.5.3
* NavController 跳转优化

# 新版本1.5.2
* Glide 清除缓存优化

# 新版本1.5.1
* kotlin 1.4.0 → 1.4.10
* okhttp 4.8.1 → 4.9.0
* dagger 2.29 → 2.29.1

# 新版本1.5.0
* 修复 FragmentNavigator 数值越界 BUG

# 新版本1.4.9
* 重新发布

# 新版本1.4.8
* rxjava3 3.0.5 → 3.0.6
* androidx_appcompat 1.1.0 → 1.2.0
* constraintlayout 1.1.3 → 2.0.0
* glide 加载调试

# 新版本1.4.7
* okhttp3 4.8.0 → 4.8.1

# 新版本1.4.6
* fly-http：文件下载优化

# 新版本1.4.5
* rxjava3 3.0.4 → 3.0.5
* fly-http：文件下载BUG修复

# 新版本1.4.4
* visible 生命周期优化
* EventLiveData 优化

# 新版本1.4.3
* 注意：Retrofit Map注解：设置(encoded = true)，交由外层自行处理

# 新版本1.4.2
* 移除 Http 输出打印
* createUrlFromParams 函数优化

# 新版本1.4.1
* fly-http：增加 addParamsToUrl 函数，默认为 true，调用 upXxx() 相关函数，并且有传入 urlParams 时，把 urlParams 拼接到 url 上
* EventLiveData 优化

# 新版本1.4.0
* 修复 popUpToInclusive 属性设置 BUG 问题

# 新版本1.3.9
* EventLiveData 添加 isAllowToClear 是否允许自动清理，默认 true
* dagger2 2.28.2 → 2.28.3
* 添加 ViewPager2 动态刷新示例

# 新版本1.3.8
* dagger2 2.28.1 → 2.28.2
* 添加 onCreateInit 函数，可用于初始化前做相关处理，应用被杀死时重启应用改为用户自行处理

# 新版本1.3.7
* 支持应用被杀死时重启应用，重写 isRelaunchApp() 为 true 即可

# 新版本1.3.6
* visible 生命周期优化
* EventLiveData 优化

# 新版本1.3.5
* okhttp3 4.7.2 → 4.8.0
* 修复 Navigation 使用 popUpTo 报错问题

# 新版本1.3.4
* 修复短时间内多次快速跳转 Fragment 出现的 bug

# 新版本1.3.3
* EventLiveData 优化
* navigation 2.2.2 → 2.3.0

# 新版本1.3.2
* dagger2 2.28 → 2.28.1
* kotlin_ktx 1.2.0 → 1.3.0

# 新版本1.3.1
* 移除isInitialized()

# 新版本1.3.0（大改动）
* dagger2 2.27 → 2.28
* utilcode 1.28.6 → 1.29.0
* 依赖调整
* 移除 LiveDataBus，用全局 SharedViewModel.kt 替代
* 添加 EventLiveData.kt 用于替代 UnPeekLiveData 和 SingleLiveEvent，用于解决 LiveData “数据倒灌”问题

# 新版本1.2.6
* 点击防抖优化

# 新版本1.2.5（注意）
* DialogFragment 内存泄漏优化
* 注意：onFlyLazyInitView() 调至 createObserver() 后面比较合理

# 新版本1.2.4
* 点击防抖优化
* Visible 生命周期函数调整优化

# 新版本1.2.3
* utilcode → 1.28.5 → 1.28.6
* 添加全局配置：是否进行全局错误统一处理

# 新版本1.2.2 （大改动）
* RxJava2 → RxJava3
* retrofit2 2.8.1 → 2.9.0
* okhttp3 4.6.0 → 4.7.2
* utilcode 1.28.4 → 1.28.5

# 新版本1.2.1
* BaseFlyDialogFragment 抽象类改为 open

# 新版本1.2.0（大改动）
* 新增 BaseFlyVmDbActivity、BaseFlyVmDbFragment，支持 dataBinding；想使用 dataBinding 时，请在 app 的 build.gradle 中进行开启
```gradle
android {
    buildFeatures {
        dataBinding = true
    }
}
```

* 添加一些扩展函数
* 注意：此版本改动了一些包结构，需要注意下引用路劲

# 新版本1.1.3
* 支持 dataBinding
* 添加一些扩展函数
* 添加 createObserver() 函数，用于创建观察者

# 新版本1.1.2
* 修复 fragment 返回监听处理失效问题。

# 新版本1.1.1
* ViewPager2 懒加载适配
* 以下几个函数重命名：
onLazyInitView() → onFlyLazyInitView()
onSupportVisible() → onFlySupportVisible()
onSupportInvisible() → onFlySupportInvisible()
isSupportVisible(): Boolean → isFlySupportVisible(): Boolean

# 新版本1.1.0
* 类文件冲突处理：androidx.navigation.fragment.NavHostFragment → com.tiamosu.fly.navigation.NavHostFragment

# 新版本1.0.9
* 新增各类服务获取
* 未提供 BaseUrl 时，默认使用 https://api.github.com/

# 新版本1.0.8
* utilcode 1.28.3 → 1.28.4
* 混淆配置优化
* 添加声明：
  android:hasFragileUserData="true"，Android Q 前提下，应用卸载时会提示用户是否保留 App-specific 目录下的数据。
  android:requestLegacyExternalStorage="true"，请求使用旧的存储模式

# 新版本1.0.7
* utilcode 1.28.0 → 1.28.3
* okhttp3 4.5.0 → 4.6.0
* Navigation 扩展优化

# 新版本1.0.6（大改版）
* 添加 SingleLiveEvent 
* DialogFragment 优化
* 移除 fragmentation 框架，改用 navigation 实现 Fragment 页面导航
* 添加 Navigation 扩展
* 移除 initAny，新增 initParameters、initView、initEvent
* 对 Fragment 显示隐藏逻辑进行优化，支持 fragment 返回监听处理事件

# 新版本1.0.5
* okhttp3 4.4.1 → 4.5.0
* utilcode 1.27.2 → 1.27.6
* fragment 依赖配置

# 新版本1.0.4
* fragmentation 1.1.7 → 1.1.8
* utilcode 1.27.7 → 1.27.2

# 新版本1.0.3
* okhttp 3.12.10 → 4.4.1
* retrofit 2.6.4 → 2.8.1 
* fragmentation 1.1.6 → 1.1.7 
* utilcode 1.26.0 → 1.27.0
* BaseFlyDialogFragment 优化
* createOrExistsDir(file) 改为 createDir(file)

## Requirements
适用于 Android 5.0 + (21 + API级别) 和 Java 8 +。 

# 新版本1.0.2
* rxjava2 2.2.18 → 2.2.19
* 移除 initData()、initView()、initEvent() 方法，由用户自定义处理
* 添加 dataBinding 示例

# 新版本1.0.1
* fragmentation 1.1.5 → 1.1.6
* 添加 fly-livedata-bus 扩展库 `implementation 'me.tiamosu:fly-livedata-bus:1.0.1'`

# 新版本1.0.0
* 第一个版本提交，具体使用请参照 [Wiki](https://github.com/tiamosu/X-MVVMFly/wiki)
