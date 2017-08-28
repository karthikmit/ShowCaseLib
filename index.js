import { NativeModules } from 'react-native';

const { RNShowCaseLib } = NativeModules;

// Return an object which contains essential APIs to access the native module.
export default {

    show: (options) => {
        return new Promise((resolve, reject) => {
            RNShowCaseLib.show(options, resolve, reject);
        });
    }
};
