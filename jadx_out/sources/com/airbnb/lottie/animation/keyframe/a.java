package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.color.utilities.Contrast;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f1071c;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    protected com.airbnb.lottie.value.j<A> f1073e;

    /* renamed from: a, reason: collision with root package name */
    final List<b> f1069a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f1070b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f1072d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private A f1074f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f1075g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f1076h = -1.0f;

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f5) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f5) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface d<T> {
        boolean a(float f5);

        com.airbnb.lottie.value.a<T> b();

        boolean c(float f5);

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float d();

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.value.a<T>> f1077a;

        /* renamed from: c, reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f1079c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f1080d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private com.airbnb.lottie.value.a<T> f1078b = f(0.0f);

        e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f1077a = list;
        }

        private com.airbnb.lottie.value.a<T> f(float f5) {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f1077a;
            com.airbnb.lottie.value.a<T> aVar = list.get(list.size() - 1);
            if (f5 >= aVar.f()) {
                return aVar;
            }
            for (int size = this.f1077a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = this.f1077a.get(size);
                if (this.f1078b != aVar2 && aVar2.a(f5)) {
                    return aVar2;
                }
            }
            return this.f1077a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f5) {
            com.airbnb.lottie.value.a<T> aVar = this.f1079c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f1078b;
            if (aVar == aVar2 && this.f1080d == f5) {
                return true;
            }
            this.f1079c = aVar2;
            this.f1080d = f5;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @NonNull
        public com.airbnb.lottie.value.a<T> b() {
            return this.f1078b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f5) {
            if (this.f1078b.a(f5)) {
                return !this.f1078b.i();
            }
            this.f1078b = f(f5);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f1077a.get(0).f();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f1077a.get(r0.size() - 1).c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final com.airbnb.lottie.value.a<T> f1081a;

        /* renamed from: b, reason: collision with root package name */
        private float f1082b = -1.0f;

        f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f1081a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f5) {
            if (this.f1082b == f5) {
                return true;
            }
            this.f1082b = f5;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            return this.f1081a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f5) {
            return !this.f1081a.i();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f1081a.f();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f1081a.c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.f1071c = p(list);
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float g() {
        if (this.f1075g == -1.0f) {
            this.f1075g = this.f1071c.d();
        }
        return this.f1075g;
    }

    private static <T> d<T> p(List<? extends com.airbnb.lottie.value.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f1069a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.airbnb.lottie.value.a<K> b() {
        com.airbnb.lottie.f.b("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a<K> b5 = this.f1071c.b();
        com.airbnb.lottie.f.c("BaseKeyframeAnimation#getCurrentKeyframe");
        return b5;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    float c() {
        if (this.f1076h == -1.0f) {
            this.f1076h = this.f1071c.e();
        }
        return this.f1076h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        com.airbnb.lottie.value.a<K> b5 = b();
        if (b5 != null && !b5.i()) {
            return b5.f1784d.getInterpolation(e());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.f1070b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> b5 = b();
        if (b5.i()) {
            return 0.0f;
        }
        return (this.f1072d - b5.f()) / (b5.c() - b5.f());
    }

    public float f() {
        return this.f1072d;
    }

    public A h() {
        A i5;
        float e5 = e();
        if (this.f1073e == null && this.f1071c.a(e5)) {
            return this.f1074f;
        }
        com.airbnb.lottie.value.a<K> b5 = b();
        Interpolator interpolator = b5.f1785e;
        if (interpolator != null && b5.f1786f != null) {
            i5 = j(b5, e5, interpolator.getInterpolation(e5), b5.f1786f.getInterpolation(e5));
        } else {
            i5 = i(b5, d());
        }
        this.f1074f = i5;
        return i5;
    }

    abstract A i(com.airbnb.lottie.value.a<K> aVar, float f5);

    protected A j(com.airbnb.lottie.value.a<K> aVar, float f5, float f6, float f7) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f1073e != null;
    }

    public void l() {
        com.airbnb.lottie.f.b("BaseKeyframeAnimation#notifyListeners");
        for (int i5 = 0; i5 < this.f1069a.size(); i5++) {
            this.f1069a.get(i5).a();
        }
        com.airbnb.lottie.f.c("BaseKeyframeAnimation#notifyListeners");
    }

    public void m() {
        this.f1070b = true;
    }

    public void n(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        com.airbnb.lottie.f.b("BaseKeyframeAnimation#setProgress");
        if (this.f1071c.isEmpty()) {
            com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        if (f5 < g()) {
            f5 = g();
        } else if (f5 > c()) {
            f5 = c();
        }
        if (f5 == this.f1072d) {
            com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
            return;
        }
        this.f1072d = f5;
        if (this.f1071c.c(f5)) {
            l();
        }
        com.airbnb.lottie.f.c("BaseKeyframeAnimation#setProgress");
    }

    public void o(@Nullable com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f1073e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f1073e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
