[ ![Download](https://api.bintray.com/packages/kayako-support/kayako-devkits/kayako/images/download.svg) ](https://bintray.com/kayako-support/kayako-devkits/kayako/_latestVersion)

# Overview

This SDK contains wrapper code used to call the Kayako Developer API from Java applications.

For Android-specific code and samples, see the [SDK for Android](https://github.com/kayako/Kayako-Android-SDK)

# Getting Started

In order to use the code in this SDK, you need to add the following to your _build.gradle_ file. 

```java
    //...
    dependencies {
        compile 'com.squareup.okhttp3:okhttp:3.4.1'
        compile 'com.squareup.okio:okio:1.9.0'
        compile 'com.google.code.gson:gson:2.4'
        compile 'org.threeten:threetenbp:1.3.3' // added in v1.0.0
        compile 'com.kayako:kayako:1.0.+'
    }
```

For a more detailed documentation, head over to [Kayako's Developer Portal](https://developer.kayako.com/sdk/java/integration_guide/).
