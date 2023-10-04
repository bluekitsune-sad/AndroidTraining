// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}
tasks.register("hello") {
    doLast {
        println("Hello, Gradle!")
    }
}
task hello << {
    println 'Hello world!'
}
task hoge << {
    String fuga = 'fuga'
    int count = 9
    println 'hoge' + fuga + 'piyo'
    println count.toString()
}
task count << {
    3.times {
        println it
    }
}% ./gradlew -q count
task unlockDoor << {
    println "I unlock the door"
}
task enterMyRoom(dependsOn: unlockDoor) << {
    println "I'm home"
}
task relax(dependsOn: enterMyRoom) << {
    println "Relax..."
}
task enterMyRoom(dependsOn: unlockDoor) << {
    println "I'm home"
}
task unlockDoor << {
    println "I unlock the door"
}
task unlockDoor << {
    println "I unlock the door"
}
task enterMyRoom << {
    println "I'm home"
}
task relax << {
    println "Relax..."
}

enterMyRoom.dependsOn unlockDoor
        relax.dependsOn unlockDoor, enterMyRoom

task sample << {
    println 'hoge'
}
sample.doFirst {
    println 'hello!'
}
sample.doLast {
    println 'fuga'
}
sample << {
    println 'piyo'
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.1.2'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
    }
}


buildscript {
    repositories {
        jcenter()
        maven {
            url "{TARGET_REPOSITORY_URL}"
        }
    }
    ...

dependencies {
        compile fileTree(dir:'libs', include: '*.jar')
}
apply plugin: 'com.android.application'

    android {
        compileSdkVersion 21
        buildToolsVersion "21.1.2"

        defaultConfig {
            minSdkVersion 15
            targetSdkVersion 21
            versionCode 1
            versionName "1.0"
        }
        buildTypes {
            release {
                minifyEnabled false
                proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
            }
        }
    }

    dependencies {
        compile fileTree(dir: 'libs', include: ['*.jar'])
        compile 'com.android.support:appcompat-v7:21.0.3'
    }