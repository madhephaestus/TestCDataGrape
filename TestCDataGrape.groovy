@Grab(group='com.neuronrobotics', module='cdata-java', version='0.0.8')

import com.cdata.CData;
String schema = "{\"value1\": \"FLOAT\", \"value2\": \"INT\"}";
CData data = new CData(schema, "shared_memory_file", 100000000, true);
// Set values
data.setValueFloatByKey("value1", 3.14f);
data.setValueIntByKey("value2", 42);
data.setData();

data.setValueFloatById(0, 6.28f);
data.setValueIntById(1, 84);
data.setData();

data.setValueFloatById(0, 9.56f);
data.setValueIntById(1, 168);
data.setData();

// Read values
data.trigger();
data.updateData();
System.out.println("value1: " + data.getValueFloatByKey("value1"));
System.out.println("value2: " + data.getValueIntByKey("value2"));

data.trigger();
data.updateData();
System.out.println("value1: " + data.getValueFloatByKey("value1"));
System.out.println("value2: " + data.getValueIntByKey("value2"));

data.trigger();
data.updateData();
System.out.println("value1: " + data.getValueFloatByKey("value1"));
System.out.println("value2: " + data.getValueIntByKey("value2"));
