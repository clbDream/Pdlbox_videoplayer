# 潘多拉-视频播放器

轻量视频播放器,该项目是从https://github.com/getActivity/AndroidProject-Kotlin中抽离出的一个视频播放器,没有单独设置项目,所以为了方便使用,单独剥离出来,可以单独在项目中使用

[![](https://jitpack.io/v/com.gitee.clbDream/pdl-box_dimens.svg)](https://jitpack.io/#com.gitee.clbDream/pdl-box_dimens)

![](images/banner.png)

## 简介

这是一个Android开发工具库系列开源项目,不包含任何隐私信息的搜集,完全可以通过国内应用市场隐私合规的检测,现在开源,供广大Android开发程序员同胞使用,欢迎大家一起来进行维护

我也是个萌新程序员,项目有什么地方不足,请多多指教,哈哈

#### 作者的其他开源项目

* 多功能记录项目<事迹>
  ：[RecordThings-Android](https://github.com/clbDream/RecordThings-Android) ![](https://img.shields.io/github/stars/clbDream/RecordThings-Android.svg) ![](https://img.shields.io/github/forks/clbDream/RecordThings-Android.svg)
* 常用第三方库集合<库多多>
  ：[Pdlbox_Library](https://github.com/clbDream/Pdlbox_Library) ![](https://img.shields.io/github/stars/clbDream/Pdlbox_Library.svg) ![](https://img.shields.io/github/forks/clbDream/Pdlbox_Library.svg)
* 常用工具库集合<Tools>
  ：[Pdlbox_Tools](https://github.com/clbDream/Pdlbox_Tools) ![](https://img.shields.io/github/stars/clbDream/Pdlbox_Tools.svg) ![](https://img.shields.io/github/forks/clbDream/Pdlbox_Tools.svg)
* 尺寸库<Dimens>
  ：[Pdlbox_Dimens](https://github.com/clbDream/Pdlbox_Dimens) ![](https://img.shields.io/github/stars/clbDream/Pdlbox_Dimens.svg) ![](https://img.shields.io/github/forks/clbDream/Pdlbox_Dimens.svg)

## 如何使用(可参考内置页面VideoPlayActivity的使用)

1. Add the JitPack repository to your build file

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2. Add the dependency(版本信息查看上面的标签里面)

```
dependencies {
	        implementation 'com.gitee.clbDream:pdl-box_dimens:$version'
	}
```

3. 在XML布局文件中使用

```
<?xml version="1.0" encoding="utf-8"?>
<com.pdlbox.videoplayer.widget.PlayerView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/pv_video_play_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:keepScreenOn="true"
    android:orientation="vertical" />
```

4. 在Activity中设置监听

```
        playerView?.setLifecycleOwner(this)
        playerView?.setOnPlayListener(this)
```

5. 功能方法汇总

```
setLifecycleOwner                     : 设置播放器生命管控（自动回调生命周期方法）
onStateChanged                        : 生命周期状态监听
setVideoTitle                         : 设置视频标题
setVideoSource                        : 设置视频源
start                                 : 开始播放
pause                                 : 暂停播放
lock                                  : 锁定控制面板
unlock                                : 解锁控制面板
isPlaying                             : 是否正在播放
setProgress                           : 设置视频播放进度
getProgress                           : 获取视频播放进度
getDuration                           : 获取视频的总时长
setGestureEnabled                     : 设置手势开关
setOnPlayListener                     : 设置返回监听
showController                        : 显示面板
hideController                        : 隐藏面板
onClickBack                           : 点击了返回按钮（可在此处处理返回事件）
onClickLock                           : 点击了锁定按钮
onClickPlay                           : 点击了播放按钮
onPlayStart                           : 播放开始（可在此处设置播放进度）
onPlayProgress                        : 播放进度发生改变
onPlayEnd                             : 播放结束（可在此处结束播放或者循环播放）
```
