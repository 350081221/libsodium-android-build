package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f19456a;

    public s1(int i5) {
        this.f19456a = new ArrayList<>(i5);
    }

    public void a(Object obj) {
        this.f19456a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f19456a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f19456a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f19456a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f19456a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f19456a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f19456a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f19456a.toArray(objArr);
    }
}
