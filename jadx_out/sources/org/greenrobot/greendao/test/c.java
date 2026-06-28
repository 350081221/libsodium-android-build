package org.greenrobot.greendao.test;

import android.test.AndroidTestCase;
import org.greenrobot.greendao.a;

/* loaded from: classes4.dex */
public abstract class c<D extends org.greenrobot.greendao.a<T, Long>, T> extends d<D, T, Long> {
    public c(Class<D> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.test.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public Long m() {
        return Long.valueOf(this.f21518a.nextLong());
    }

    public void K() {
        if (this.f21512h.d()) {
            T k5 = k(null);
            if (k5 != null) {
                T k6 = k(null);
                this.f21511g.insert(k5);
                this.f21511g.insert(k6);
                Long l5 = (Long) this.f21512h.b(k5);
                AndroidTestCase.assertNotNull(l5);
                Long l6 = (Long) this.f21512h.b(k6);
                AndroidTestCase.assertNotNull(l6);
                AndroidTestCase.assertFalse(l5.equals(l6));
                AndroidTestCase.assertNotNull(this.f21511g.load(l5));
                AndroidTestCase.assertNotNull(this.f21511g.load(l6));
                return;
            }
            org.greenrobot.greendao.e.a("Skipping testAssignPk for " + this.f21510f + " (createEntity returned null for null key)");
            return;
        }
        org.greenrobot.greendao.e.a("Skipping testAssignPk for not updateable " + this.f21510f);
    }
}
