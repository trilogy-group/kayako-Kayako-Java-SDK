
# Overview

This SDK contains wrapper code used to call the Evernote Cloud API from Java applications.

For Android-specific code and samples, see the [SDK for Android] (#)

# Getting Started

In order to use the code in this SDK, you need to add the following dependencies. 

```
 dependencies {
    compile 'com.kayako.android.k5.sdk:android-sdk:1.0.0'
    compile 'com.squareup.okhttp3:okhttp:3.4.1'
    compile 'com.squareup.okio:okio:1.9.0'
    compile 'com.google.code.gson:gson:2.4'
 }
```

# Sample Usage

A simple example to retrieve the list of categories of a help center.

```
 KayakoHelpCenter kayakoHC = KayakoHelpCenter.getInstance("https://support.kayako.com", new Locale("en", "US"));
 List<Category> categories = kayakoHC.getCategories();
 
```
