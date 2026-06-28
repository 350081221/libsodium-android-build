package org.jdeferred.impl;

import org.jdeferred.p;

/* loaded from: classes4.dex */
public class d<D, F, P> extends b<D, F, P> implements org.jdeferred.b<D, F, P> {
    @Override // org.jdeferred.b
    public p<D, F, P> c() {
        return this;
    }

    @Override // org.jdeferred.b
    public org.jdeferred.b<D, F, P> g(D d5) {
        synchronized (this) {
            if (w()) {
                this.f21566b = p.a.RESOLVED;
                this.f21571g = d5;
                try {
                    z(d5);
                } finally {
                    y(this.f21566b, d5, null);
                }
            } else {
                throw new IllegalStateException("Deferred object already finished, cannot resolve again");
            }
        }
        return this;
    }

    @Override // org.jdeferred.b
    public org.jdeferred.b<D, F, P> h(F f5) {
        synchronized (this) {
            if (w()) {
                this.f21566b = p.a.REJECTED;
                this.f21572h = f5;
                try {
                    B(f5);
                } finally {
                    y(this.f21566b, null, f5);
                }
            } else {
                throw new IllegalStateException("Deferred object already finished, cannot reject again");
            }
        }
        return this;
    }

    @Override // org.jdeferred.b
    public org.jdeferred.b<D, F, P> q(P p5) {
        synchronized (this) {
            if (w()) {
                D(p5);
            } else {
                throw new IllegalStateException("Deferred object already finished, cannot notify progress");
            }
        }
        return this;
    }
}
