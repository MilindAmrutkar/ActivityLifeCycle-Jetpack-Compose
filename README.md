# ActivityLifeCycle-Jetpack-Compose


# Jetpack Compose Activity Lifecycle Demonstration

This application showcases the Android Activity Lifecycle via Jetpack Compose with two main Activities: `MainActivity` and `SecondActivity`. The sequences of lifecycle method invocations in various scenarios are as follows:

**`MainActivity` Start:**
- `onCreate()`, `onStart()`, `onResume()`

**`MainActivity` Rotation (Portrait to Landscape & vice versa):**
- `onPause()`, `onStop()`, `onSaveInstanceState()`, `onDestroy()`
- `onCreate()`, `onStart()`, `onRestoreInstanceState()`, `onResume()`

**Transition from `MainActivity` to `SecondActivity`:**
- `MainActivity`: `onPause()` 
- `SecondActivity`: `onCreate()`, `onStart()`, `onResume()`
- `MainActivity`: `onStop()`, `onSaveInstanceState()`

**`SecondActivity` Rotation (Portrait to Landscape & vice versa):**
- `onPause()`, `onStop()`, `onSaveInstanceState()`, `onDestroy()`
- `onCreate()`, `onStart()`, `onRestoreInstanceState()`, `onResume()`

**Navigating back from `SecondActivity` to `MainActivity`:**
- `SecondActivity`: `onPause()` 
- `MainActivity`: `onRestart()`, `onStart()`, `onResume()`
- `SecondActivity`: `onStop()`, `onDestroy()`

Through this application, you can gain a better understanding of Android's Activity Lifecycle, and how various events trigger different lifecycle methods. Enjoy exploring!

