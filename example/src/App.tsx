import * as React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import RawbtBridge from 'react-native-rawbt-bridge';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();

  React.useEffect(() => {
    RawbtBridge.print('test').then(console.log);
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
