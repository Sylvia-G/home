package reflect.case1;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class caseHandlerOri {

    public static void callCase(String caseFile) throws Exception {
        // 1.读文件
        Properties prop = new Properties();
        prop.load(CaseHandler.class.getClassLoader()
                .getResourceAsStream(caseFile));

        String ifaceClassName = prop.getProperty("iface");
        String ifaceMethodName = prop.getProperty("method");
        Class<?> clazz = Class.forName(ifaceClassName);
        Method[] methods = clazz.getMethods();

        Object ifaceInstance = clazz.newInstance();

        for (Method method : methods) {
            List<Object> paramLists = new ArrayList<>();

            if (method.getName().equals(ifaceMethodName)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                for (Class<?> parameterType : parameterTypes) {
                    Field[] fields = parameterType.getDeclaredFields();
                    Object paramInstance = parameterType.newInstance();
                    for (Field field : fields) {
                        String fieldName = field.getName();
                        String propertyValue = prop.getProperty(fieldName);
                        field.setAccessible(true);
                        field.set(paramInstance, propertyValue);
                    }
                    paramLists.add(paramInstance);
                }

                method.invoke(ifaceInstance, paramLists.toArray());
            }
        }
    }
}
