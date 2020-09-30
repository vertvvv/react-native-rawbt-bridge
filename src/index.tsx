import { NativeModules } from 'react-native';

type RawbtBridgeType = {
  multiply(a: number, b: number): Promise<number>;
};

const { RawbtBridge } = NativeModules;

export default RawbtBridge as RawbtBridgeType;
