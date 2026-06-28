package com.umeng.analytics.pro;

import com.umeng.analytics.pro.br;
import com.umeng.analytics.pro.by;
import java.io.Serializable;

/* loaded from: classes3.dex */
public interface br<T extends br<?, ?>, F extends by> extends Serializable {
    void clear();

    br<T, F> deepCopy();

    F fieldForId(int i5);

    void read(cq cqVar) throws bx;

    void write(cq cqVar) throws bx;
}
