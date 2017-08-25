
# react-native-show-case-lib

## Getting started

`$ npm install react-native-show-case-lib --save`

### Mostly automatic installation

`$ react-native link react-native-show-case-lib`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-show-case-lib` and add `RNShowCaseLib.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNShowCaseLib.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNShowCaseLibPackage;` to the imports at the top of the file
  - Add `new RNShowCaseLibPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-show-case-lib'
  	project(':react-native-show-case-lib').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-show-case-lib/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-show-case-lib')
  	```

## Usage
```javascript
import RNShowCaseLib from 'react-native-show-case-lib';

// TODO: What to do with the module?
RNShowCaseLib;
```
  