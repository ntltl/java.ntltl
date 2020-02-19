package com.github.ntltl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class Container<T> {

    protected final Type type;

    protected Container() {

        Type t = getClass().getGenericSuperclass();
        if (t instanceof Class<?>) {
            throw new IllegalArgumentException("Wow");
        }

        type = ((ParameterizedType) t).getActualTypeArguments()[0];
    }

    public Type getType() {
        return type;
    }
}
