[Android]: https://developer.android.com/studio

[Compose]: https://developer.android.com/jetpack/compose

[Fleet]: https://jetbrains.com/fleet/

[Gradle]: https://gradle.org/

[IDEA]: https://jetbrains.com/idea/

[KMP]: https://kotlinlang.org/docs/multiplatform.html

[Kotlin]: https://kotlinlang.org/

[Maven]: https://maven.apache.org/index.html

[Rice]: https://rice.edu

[Stax]: https://openstax.org

<a href="https://github.com/HyaenaTechnologies/CalculateEngineAndroid">
  <h1>
    <picture>
      <img src="https://github.com/HyaenaTechnologies/CalculateEngineAndroid/blob/main/app/src/main/res/drawable/hce_markdown.png" alt="">
    </picture>
  </h1>
</a>

[![Android Workflow](https://github.com/HyaenaTechnologies/calculate_engine_android/actions/workflows/android.yml/badge.svg)](https://github.com/HyaenaTechnologies/calculate_engine_android/actions/workflows/android.yml)

# Calculate Engine Android

Calculate Engine is an Open Source Mathematics Engine. The function is to provide Calculators,
Steps and promote [OpenStax][Stax], [Rice University][Rice].

Calculate Engine Android is the Android Implementation of the Calculate Engine

## Build

- [Android Studio][Android]
- [Gradle Build][Gradle]
- [IntelliJ IDEA][IDEA]
- [Kotlin Language][Kotlin]
- [Kotlin Multiplatform][KMP]
- [JetBrains Fleet][Fleet]
- [Jetpack Compose][Compose]
- [Maven Package Manager][Maven]

```shell
git clone

gradle build

adb devices -l

adb -s device-serial-number install ./app/build/outputs/apk/debug/app-debug.apk

adb shell am

adb shell cmd

adb shell dpm

adb shell pm

adb shell screencap /path/filename.png

adb shell screenrecord /path/filename.mp4
```