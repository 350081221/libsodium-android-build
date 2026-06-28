package org.greenrobot.greendao.test;

import org.greenrobot.greendao.a;

/* loaded from: classes4.dex */
public abstract class e<D extends org.greenrobot.greendao.a<T, String>, T> extends d<D, T, String> {
    public e(Class<D> cls) {
        super(cls);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.test.d
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public String m() {
        int nextInt = this.f21518a.nextInt(30) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < nextInt; i5++) {
            sb.append((char) (this.f21518a.nextInt(25) + 97));
        }
        return sb.toString();
    }
}
