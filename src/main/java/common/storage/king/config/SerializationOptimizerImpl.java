package common.storage.king.config;

import common.storage.king.entity.Log;
import common.storage.king.entity.User;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    public Collection<Class<?>> getSerializableClasses() {
        List<Class<?>> classes = new LinkedList<>();
        classes.add(Log.class);
        classes.add(User.class);
        return classes;
    }
}