Assignment Report for 1.3
------

以下に、課題の回答を記入してください。

署名済みアプリの作成
======

3. 作成した apk ファイルの中にあるファイル・ディレクトリを列挙してください。

4. 上記で列挙したファイル・ディレクトリについて、どのような役割を持っているか説明してください。



answer:

Project configuration

The Android application project has the following structure.
The project configuration is based on the Gradle build system.

studio-project-structure
Module (app in the above diagram)

Modules are units of functionality that can be run, tested, and debugged individually.
It corresponds to one application, library, etc.
Module / java

Contains source code written in Java.
Module / res

Contains various resources such as layout files, fixed phrases, and images. Naming rules are determined for each resource to be stored. It is also possible to divide directories according to the specifications of the terminal being used.
Module / manifests / AndroidManifest.xml

This is the place to make various declarations regarding the app. This is also where you declare the device features (camera, external storage, etc.) used by the app, as well as permissions.
Module / assets

assets is a storage location for files that can be read and written by the app. You can save simple html and open it with WebView. Assets are not prepared when the project is generated, so you must create them yourself if you need them. If necessary, src / main / in the Finder or in the Project Files tab described below and store the files there. in an assets directory create
Gradle Scripts

Contains various settings for building apps and libraries, such as build.gradle.

by default Also, the Android tab is selected Project Files . , but you can also see the actual file tree by selecting

studio-project-structure
.idea directory

Contains project configuration files.
src / module name.iml (app.iml in the above figure)

Contains module configuration information. 