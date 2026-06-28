package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.bi;
import kotlin.r2;
import kotlinx.coroutines.channels.p;

@kotlin.i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\r\u0010\t\u001a^\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001a^\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u000b0\u0002H\u0086\bø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000f\u0010\t\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u001a\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/channels/p;", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "exception", "onFailure", "e", "(Ljava/lang/Object;Lv3/l;)Ljava/lang/Object;", t0.b.f22420d, "Lkotlin/r2;", "action", bi.aJ, socket.g.f22386a, "f", "E", "", "capacity", "Lkotlinx/coroutines/channels/i;", "onBufferOverflow", "onUndeliveredElement", "Lkotlinx/coroutines/channels/l;", "b", bi.ay, "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class o {
    @p4.l
    public static final <E> l<E> b(int i5, @p4.l i iVar, @p4.m v3.l<? super E, r2> lVar) {
        l<E> zVar;
        if (i5 != -2) {
            boolean z4 = false;
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != Integer.MAX_VALUE) {
                        if (iVar == i.SUSPEND) {
                            return new j(i5, lVar);
                        }
                        return new z(i5, iVar, lVar);
                    }
                    return new j(Integer.MAX_VALUE, lVar);
                }
                if (iVar == i.SUSPEND) {
                    zVar = new j<>(0, lVar);
                } else {
                    zVar = new z<>(1, iVar, lVar);
                }
            } else {
                if (iVar == i.SUSPEND) {
                    z4 = true;
                }
                if (z4) {
                    return new z(1, i.DROP_OLDEST, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (iVar == i.SUSPEND) {
            zVar = new j<>(l.V.a(), lVar);
        } else {
            zVar = new z<>(1, iVar, lVar);
        }
        return zVar;
    }

    public static /* synthetic */ l c(int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return d(i5, null, null, 6, null);
    }

    public static /* synthetic */ l d(int i5, i iVar, v3.l lVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        if ((i6 & 2) != 0) {
            iVar = i.SUSPEND;
        }
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        return b(i5, iVar, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(@p4.l Object obj, @p4.l v3.l<? super Throwable, ? extends T> lVar) {
        return obj instanceof p.c ? lVar.invoke(p.f(obj)) : obj;
    }

    @p4.l
    public static final <T> Object f(@p4.l Object obj, @p4.l v3.l<? super Throwable, r2> lVar) {
        if (obj instanceof p.a) {
            lVar.invoke(p.f(obj));
        }
        return obj;
    }

    @p4.l
    public static final <T> Object g(@p4.l Object obj, @p4.l v3.l<? super Throwable, r2> lVar) {
        if (obj instanceof p.c) {
            lVar.invoke(p.f(obj));
        }
        return obj;
    }

    @p4.l
    public static final <T> Object h(@p4.l Object obj, @p4.l v3.l<? super T, r2> lVar) {
        if (!(obj instanceof p.c)) {
            lVar.invoke(obj);
        }
        return obj;
    }
}
