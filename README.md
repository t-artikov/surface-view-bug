# surface-view-bug

This is a demonstration of an Android 8 (Oreo) SurfaceView bug:<br>
When you leave an Activity with SurfaceView and quickly go back, the previous content of SurfaceView doesn't disappear and is displayed under the new one.

Steps to reproduce:
1. Run the application on the **Android 8** device or emulator - a rotating triangle should be displayed. 
2. Tap the screen - another Activity will be launched and finished automatically.

**Result**: The SurfaceView content is doubled.<br>
**Expected result**: Single rotated triangle is displayed.

![screenshot](https://github.com/t-artikov/surface-view-bug/blob/master/screenshots/surface-view-bug.png)
