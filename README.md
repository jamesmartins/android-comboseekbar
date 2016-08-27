# ComboBox + SeekBar

[![Build Status](https://travis-ci.org/sswierczek/android-comboseekbar.svg?branch=master)](https://travis-ci.org/sswierczek/android-comboseekbar)

![Screenshot](https://github.com/sswierczek/android-comboseekbar/blob/master/screenshot.png)

My fork of ComboSeekBar with Gradle and some modifications.

## Original repository

https://github.com/karabaralex/android-comboseekbar

## Sample usage

To use **my version** download aar from [releases](https://github.com/sswierczek/android-comboseekbar/releases)
and check out sample project.


Example usage of **original library**:

 1. Open your project **build.gradle (root  folder)** and add:

        allprojects {
            repositories {
                maven { url "http://dl.bintray.com/arnoult-antoine/maven/" }
                ...
            }
        }

 2. In app main module (probably "app" directory) **build.gradle** add:

        dependencies {
            ...
            compile 'com.aat:android-comboseekbar:1.0.2@aar'
        }

 3. Go to your **XML layout** file and put:

        <com.infteh.comboseekbar.ComboSeekBar
            xmlns:cbs="http://schemas.android.com/apk/res-auto"
            android:id="@+id/comboseekbar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            cbs:myColor="@android:color/black"
            cbs:textSize="16sp" />

 4. Init it with for example this code:

        ComboSeekBar comboSeekBar = (ComboSeekBar) findViewById(R.id.comboseekbar);
        List<String> points = new ArrayList<>();
        points.add("Point 1");
        points.add("Point 2");
        points.add("Point 3");
        points.add("Point 4");
        comboSeekBar.setAdapter(points);

 5. Enjoy your ComboSeekBar!