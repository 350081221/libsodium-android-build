package com.lody.virtual.helper.utils;

import mirror.RefObject;
import mirror.RefStaticObject;

/* loaded from: classes3.dex */
public class RefObjUtil {
    public static <T> T getRefObjectValue(RefObject refObject, Object obj) {
        if (refObject == null) {
            return null;
        }
        return (T) refObject.get(obj);
    }

    public static <T> void setRefObjectValue(RefObject refObject, Object obj, T t5) {
        if (refObject == null) {
            return;
        }
        refObject.set(obj, t5);
    }

    public static <T> T getRefObjectValue(RefStaticObject refStaticObject) {
        if (refStaticObject == null) {
            return null;
        }
        return (T) refStaticObject.get();
    }
}
