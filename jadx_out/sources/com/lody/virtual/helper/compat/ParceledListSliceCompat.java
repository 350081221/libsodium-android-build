package com.lody.virtual.helper.compat;

import android.os.Parcelable;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import mirror.RefConstructor;
import mirror.android.content.pm.ParceledListSlice;
import mirror.android.content.pm.ParceledListSliceJBMR2;

/* loaded from: classes3.dex */
public class ParceledListSliceCompat {
    public static Object create(List list) {
        RefConstructor<Parcelable> refConstructor = ParceledListSliceJBMR2.ctor;
        if (refConstructor != null) {
            return refConstructor.newInstance(list);
        }
        Parcelable newInstance = ParceledListSlice.ctor.newInstance();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParceledListSlice.append.call(newInstance, it.next());
        }
        ParceledListSlice.setLastSlice.call(newInstance, Boolean.TRUE);
        return newInstance;
    }

    public static boolean isReturnParceledListSlice(Method method) {
        return method != null && method.getReturnType() == ParceledListSlice.TYPE;
    }
}
