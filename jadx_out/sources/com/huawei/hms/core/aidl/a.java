package com.huawei.hms.core.aidl;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends MessageCodec {
    @Override // com.huawei.hms.core.aidl.MessageCodec
    protected List<Object> readList(Type type, Bundle bundle) throws InstantiationException, IllegalAccessException {
        int i5 = bundle.getInt("_list_size_");
        ArrayList arrayList = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = bundle.get("_list_item_" + i6);
            if (!obj.getClass().isPrimitive() && !(obj instanceof String) && !(obj instanceof Serializable)) {
                if (obj instanceof Bundle) {
                    Bundle bundle2 = (Bundle) obj;
                    int i7 = bundle2.getInt("_val_type_", -1);
                    if (i7 != 1) {
                        if (i7 == 0) {
                            arrayList.add(decode(bundle2, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
                        } else {
                            throw new InstantiationException("Unknown type can not be supported");
                        }
                    } else {
                        throw new InstantiationException("Nested List can not be supported");
                    }
                } else {
                    continue;
                }
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.core.aidl.MessageCodec
    protected void writeList(String str, List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("_val_type_", 1);
        bundle2.putInt("_list_size_", list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            writeValue("_list_item_" + i5, list.get(i5), bundle2);
        }
        bundle.putBundle(str, bundle2);
    }
}
