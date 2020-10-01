import { NativeModules } from 'react-native';

type RawbtBridgeType = {
  print(textToPrint: string): Promise<boolean>;
};

const { RawbtBridge } = NativeModules;

export default RawbtBridge as RawbtBridgeType;
