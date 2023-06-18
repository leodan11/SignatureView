# SignatureView

[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

SignatureView is an open source Android library which allow developers to produce pen and paper like effect for creating signatures on Android

# Credits

This is just an updated version of [SignatureView](https://github.com/zahid-ali-shah/SignatureView) and applying some of the active pull requests in it. 
Credits go completely to its creator and the people who has contributed with those pull requests.

# Setup

* Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
    }
}
```

* Step 2. Add the dependency

```gradle
dependencies {
       ...
       implementation 'com.github.leodan11:MoneyTextView:Tag'
}
```

## Attributes

SignatureView offers several attributes for a deeper view configuration, the following table shows all these options and their default value.

|           Name          |                                                             Description                                                             |        Values        |   Default  |
|:-----------------------:|:-----------------------------------------------------------------------------------------------------------------------------------:|:--------------------:|:----------:|
| signature_view_toBackgroundColor                  | Set background color       | color               | Color.WHITE |
| signature_view_toEnable                  | Enable/disable drawing signature on view                                                                                                                  | boolean                | true          |
| signature_view_toPenColor            | Set pen stroke color                            | color                   | Color.BLACK       |
| signature_view_toPenSize           | Set pen stroke size                                          | dimension                | 3dp    |


## Usage

* Include SignatureView in a layout xml file:

~~~xml                                            

<com.github.leodan11.view.SignatureView
        android:id="@+id/signature_view"
       android:layout_width="match_parent"
       android:layout_height="wrap_content" />

~~~

#### More settings example

~~~xml
<com.github.leodan11.view.SignatureView
        android:id="@+id/signature_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:signature_view_toBackgroundColor="?attr/backgroundColor"
        app:signature_view_toEnable="true"
        app:signature_view_toPenColor="?attr/colorPrimary"
        app:signature_view_toPenSize="3dp" />
~~~

## Code

* Include SignatureView:

```kotlin
    val signatureView: SignatureView = findViewById(R.id.signature_view);
    .
    .
    .
 ```


* Clear screen

```kotlin
    signatureView.clearCanvas()
```

* Is Bitmap Empty

```kotlin
//Kotlin
    signatureView.isBitmapEmpty
```

```java
//Java
    signatureView.isBitmapEmpty()
```

* Get SignatureView as bitmap

```kotlin
//Kotlin
    val bitmap: Bitmap = signatureView.signatureBitmap
```

```java
//Java
    Bitmap bitmap = signatureView.getSignatureBitmap();
```