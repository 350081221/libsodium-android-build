package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class q implements kotlin.reflect.c, Serializable {

    @kotlin.g1(version = "1.1")
    public static final Object NO_RECEIVER = a.INSTANCE;

    @kotlin.g1(version = "1.4")
    private final boolean isTopLevel;

    @kotlin.g1(version = "1.4")
    private final String name;

    @kotlin.g1(version = "1.4")
    private final Class owner;

    @kotlin.g1(version = "1.1")
    protected final Object receiver;
    private transient kotlin.reflect.c reflected;

    @kotlin.g1(version = "1.4")
    private final String signature;

    @kotlin.g1(version = "1.2")
    /* loaded from: classes4.dex */
    private static class a implements Serializable {
        private static final a INSTANCE = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public q() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @kotlin.g1(version = "1.1")
    public kotlin.reflect.c compute() {
        kotlin.reflect.c cVar = this.reflected;
        if (cVar == null) {
            kotlin.reflect.c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return cVar;
    }

    protected abstract kotlin.reflect.c computeReflected();

    @Override // kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @kotlin.g1(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.name;
    }

    public kotlin.reflect.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return l1.g(cls);
        }
        return l1.d(cls);
    }

    @Override // kotlin.reflect.c
    public List<kotlin.reflect.n> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @kotlin.g1(version = "1.1")
    public kotlin.reflect.c getReflected() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new u3.q();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.s getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.c
    @kotlin.g1(version = "1.1")
    public List<kotlin.reflect.t> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.c
    @kotlin.g1(version = "1.1")
    public kotlin.reflect.w getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.c
    @kotlin.g1(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.c
    @kotlin.g1(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.c
    @kotlin.g1(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    @kotlin.g1(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @kotlin.g1(version = "1.1")
    public q(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @kotlin.g1(version = "1.4")
    public q(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }
}
