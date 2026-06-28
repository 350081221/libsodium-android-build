package kotlin;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.lody.virtual.server.content.SyncStorageEngine;
import java.io.Serializable;

@g1(version = "1.3")
@u3.f
@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\"#B\u0016\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u0087\b¢\u0006\u0004\b\u0019\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", t0.b.f22420d, "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "getValue$annotations", "()V", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d1<T> implements Serializable {

    @p4.l
    public static final a Companion = new a(null);

    @p4.m
    private final Object value;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\n\u001a\u0002H\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/Result$Companion;", "", "()V", "failure", "Lkotlin/Result;", "T", "exception", "", "(Ljava/lang/Throwable;)Ljava/lang/Object;", SyncStorageEngine.MESG_SUCCESS, t0.b.f22420d, "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @u3.h(name = "failure")
        @kotlin.internal.f
        private final <T> Object a(Throwable exception) {
            kotlin.jvm.internal.l0.p(exception, "exception");
            return d1.m6444constructorimpl(e1.a(exception));
        }

        @u3.h(name = SyncStorageEngine.MESG_SUCCESS)
        @kotlin.internal.f
        private final <T> Object b(T t5) {
            return d1.m6444constructorimpl(t5);
        }
    }

    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "exception", "", "(Ljava/lang/Throwable;)V", "equals", "", "other", "", TTDownloadField.TT_HASHCODE, "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {

        @p4.l
        @u3.e
        public final Throwable exception;

        public b(@p4.l Throwable exception) {
            kotlin.jvm.internal.l0.p(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(@p4.m Object obj) {
            return (obj instanceof b) && kotlin.jvm.internal.l0.g(this.exception, ((b) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @p4.l
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }

    @a1
    private /* synthetic */ d1(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ d1 m6443boximpl(Object obj) {
        return new d1(obj);
    }

    @p4.l
    @a1
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m6444constructorimpl(@p4.m Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6445equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof d1) && kotlin.jvm.internal.l0.g(obj, ((d1) obj2).m6453unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6446equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.l0.g(obj, obj2);
    }

    @p4.m
    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m6447exceptionOrNullimpl(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).exception;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.internal.f
    /* renamed from: getOrNull-impl, reason: not valid java name */
    private static final T m6448getOrNullimpl(Object obj) {
        if (m6450isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    @a1
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6449hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m6450isFailureimpl(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m6451isSuccessimpl(Object obj) {
        return !(obj instanceof b);
    }

    @p4.l
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6452toStringimpl(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m6445equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6449hashCodeimpl(this.value);
    }

    @p4.l
    public String toString() {
        return m6452toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m6453unboximpl() {
        return this.value;
    }
}
