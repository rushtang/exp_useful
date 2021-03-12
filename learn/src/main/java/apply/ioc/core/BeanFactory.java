package apply.ioc.core;
import apply.ioc.annotation.Inject;
import apply.ioc.annotation.Value;

import java.lang.reflect.Field;

/**
 * @author tangmaoheng
 * @createTime 2019年12月12日 17:40:00
 */
public class BeanFactory {

        static public <T> T getBean(Class<T> cls){
            T obj=null;
            try {
                obj = cls.newInstance();
            Field[] fields = cls.getDeclaredFields();
            for (Field field:fields){
                field.setAccessible(true);
                Value value_annotation = field.getAnnotation(Value.class);
                Inject inject = field.getAnnotation(Inject.class);
                if (value_annotation != null) {
                    Object property = field.get(obj);
                    if (field.getType().newInstance() instanceof String){
                        field.set(obj,value_annotation.str());
                    }else if (field.getType().newInstance() instanceof Integer){
                        field.set(obj,value_annotation.int_());
                    }else {
                    }
                }
                if (inject != null) {
                    Object object =getBean(field.getType());
                    if (!field.isAccessible()){
                        field.setAccessible(true);
                    }
                    field.set(obj,object);
                }
            }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return obj;
        }


}
