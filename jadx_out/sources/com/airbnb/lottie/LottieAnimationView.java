package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.color.utilities.Contrast;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: o, reason: collision with root package name */
    private static final String f831o = "LottieAnimationView";

    /* renamed from: p, reason: collision with root package name */
    private static final z0<Throwable> f832p = new z0() { // from class: com.airbnb.lottie.i
        @Override // com.airbnb.lottie.z0
        public final void onResult(Object obj) {
            LottieAnimationView.D((Throwable) obj);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final z0<k> f833a;

    /* renamed from: b, reason: collision with root package name */
    private final z0<Throwable> f834b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private z0<Throwable> f835c;

    /* renamed from: d, reason: collision with root package name */
    @DrawableRes
    private int f836d;

    /* renamed from: e, reason: collision with root package name */
    private final x0 f837e;

    /* renamed from: f, reason: collision with root package name */
    private String f838f;

    /* renamed from: g, reason: collision with root package name */
    @RawRes
    private int f839g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f840h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f841i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f842j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<b> f843k;

    /* renamed from: l, reason: collision with root package name */
    private final Set<b1> f844l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private f1<k> f845m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private k f846n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f847a;

        /* renamed from: b, reason: collision with root package name */
        int f848b;

        /* renamed from: c, reason: collision with root package name */
        float f849c;

        /* renamed from: d, reason: collision with root package name */
        boolean f850d;

        /* renamed from: e, reason: collision with root package name */
        String f851e;

        /* renamed from: f, reason: collision with root package name */
        int f852f;

        /* renamed from: g, reason: collision with root package name */
        int f853g;

        /* loaded from: classes2.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeString(this.f847a);
            parcel.writeFloat(this.f849c);
            parcel.writeInt(this.f850d ? 1 : 0);
            parcel.writeString(this.f851e);
            parcel.writeInt(this.f852f);
            parcel.writeInt(this.f853g);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f847a = parcel.readString();
            this.f849c = parcel.readFloat();
            this.f850d = parcel.readInt() == 1;
            this.f851e = parcel.readString();
            this.f852f = parcel.readInt();
            this.f853g = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f854d;

        a(com.airbnb.lottie.value.l lVar) {
            this.f854d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f854d.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* loaded from: classes2.dex */
    private static class c implements z0<Throwable> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f856a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f856a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.z0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            z0 z0Var;
            LottieAnimationView lottieAnimationView = this.f856a.get();
            if (lottieAnimationView == null) {
                return;
            }
            if (lottieAnimationView.f836d != 0) {
                lottieAnimationView.setImageResource(lottieAnimationView.f836d);
            }
            if (lottieAnimationView.f835c == null) {
                z0Var = LottieAnimationView.f832p;
            } else {
                z0Var = lottieAnimationView.f835c;
            }
            z0Var.onResult(th);
        }
    }

    /* loaded from: classes2.dex */
    private static class d implements z0<k> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<LottieAnimationView> f857a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f857a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.z0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(k kVar) {
            LottieAnimationView lottieAnimationView = this.f857a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(kVar);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f833a = new d(this);
        this.f834b = new c(this);
        this.f836d = 0;
        this.f837e = new x0();
        this.f840h = false;
        this.f841i = false;
        this.f842j = true;
        this.f843k = new HashSet();
        this.f844l = new HashSet();
        y(null, R.attr.f858a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d1 B(String str) throws Exception {
        if (this.f842j) {
            return d0.w(getContext(), str);
        }
        return d0.x(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d1 C(int i5) throws Exception {
        if (this.f842j) {
            return d0.M(getContext(), i5);
        }
        return d0.N(getContext(), i5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(Throwable th) {
        if (com.airbnb.lottie.utils.l.k(th)) {
            com.airbnb.lottie.utils.f.f("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    private void R() {
        boolean z4 = z();
        setImageDrawable(null);
        setImageDrawable(this.f837e);
        if (z4) {
            this.f837e.U0();
        }
    }

    private void S(@FloatRange(from = 0.0d, to = 1.0d) float f5, boolean z4) {
        if (z4) {
            this.f843k.add(b.SET_PROGRESS);
        }
        this.f837e.w1(f5);
    }

    private void p() {
        f1<k> f1Var = this.f845m;
        if (f1Var != null) {
            f1Var.k(this.f833a);
            this.f845m.j(this.f834b);
        }
    }

    private void q() {
        this.f846n = null;
        this.f837e.A();
    }

    private void setCompositionTask(f1<k> f1Var) {
        d1<k> e5 = f1Var.e();
        if (e5 != null && e5.b() == this.f846n) {
            return;
        }
        this.f843k.add(b.SET_ANIMATION);
        q();
        p();
        this.f845m = f1Var.d(this.f833a).c(this.f834b);
    }

    private f1<k> u(final String str) {
        if (isInEditMode()) {
            return new f1<>(new Callable() { // from class: com.airbnb.lottie.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    d1 B;
                    B = LottieAnimationView.this.B(str);
                    return B;
                }
            }, true);
        }
        if (this.f842j) {
            return d0.u(getContext(), str);
        }
        return d0.v(getContext(), str, null);
    }

    private f1<k> v(@RawRes final int i5) {
        if (isInEditMode()) {
            return new f1<>(new Callable() { // from class: com.airbnb.lottie.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    d1 C;
                    C = LottieAnimationView.this.C(i5);
                    return C;
                }
            }, true);
        }
        if (this.f842j) {
            return d0.K(getContext(), i5);
        }
        return d0.L(getContext(), i5, null);
    }

    private void y(@Nullable AttributeSet attributeSet, @AttrRes int i5) {
        String string;
        boolean z4 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f888a, i5, 0);
        this.f842j = obtainStyledAttributes.getBoolean(R.styleable.f891d, true);
        int i6 = R.styleable.f903p;
        boolean hasValue = obtainStyledAttributes.hasValue(i6);
        int i7 = R.styleable.f898k;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i7);
        int i8 = R.styleable.f908u;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i8);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i6, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i7);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i8)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R.styleable.f897j, 0));
        if (obtainStyledAttributes.getBoolean(R.styleable.f890c, false)) {
            this.f841i = true;
        }
        if (obtainStyledAttributes.getBoolean(R.styleable.f901n, false)) {
            this.f837e.y1(-1);
        }
        int i9 = R.styleable.f906s;
        if (obtainStyledAttributes.hasValue(i9)) {
            setRepeatMode(obtainStyledAttributes.getInt(i9, 1));
        }
        int i10 = R.styleable.f905r;
        if (obtainStyledAttributes.hasValue(i10)) {
            setRepeatCount(obtainStyledAttributes.getInt(i10, -1));
        }
        int i11 = R.styleable.f907t;
        if (obtainStyledAttributes.hasValue(i11)) {
            setSpeed(obtainStyledAttributes.getFloat(i11, 1.0f));
        }
        int i12 = R.styleable.f893f;
        if (obtainStyledAttributes.hasValue(i12)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i12, true));
        }
        int i13 = R.styleable.f892e;
        if (obtainStyledAttributes.hasValue(i13)) {
            setClipTextToBoundingBox(obtainStyledAttributes.getBoolean(i13, false));
        }
        int i14 = R.styleable.f895h;
        if (obtainStyledAttributes.hasValue(i14)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(i14));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R.styleable.f900m));
        int i15 = R.styleable.f902o;
        S(obtainStyledAttributes.getFloat(i15, 0.0f), obtainStyledAttributes.hasValue(i15));
        t(obtainStyledAttributes.getBoolean(R.styleable.f896i, false));
        int i16 = R.styleable.f894g;
        if (obtainStyledAttributes.hasValue(i16)) {
            m(new com.airbnb.lottie.model.e("**"), c1.K, new com.airbnb.lottie.value.j(new k1(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i16, -1)).getDefaultColor())));
        }
        int i17 = R.styleable.f904q;
        if (obtainStyledAttributes.hasValue(i17)) {
            j1 j1Var = j1.AUTOMATIC;
            int i18 = obtainStyledAttributes.getInt(i17, j1Var.ordinal());
            if (i18 >= j1.values().length) {
                i18 = j1Var.ordinal();
            }
            setRenderMode(j1.values()[i18]);
        }
        int i19 = R.styleable.f889b;
        if (obtainStyledAttributes.hasValue(i19)) {
            com.airbnb.lottie.a aVar = com.airbnb.lottie.a.AUTOMATIC;
            int i20 = obtainStyledAttributes.getInt(i19, aVar.ordinal());
            if (i20 >= j1.values().length) {
                i20 = aVar.ordinal();
            }
            setAsyncUpdates(com.airbnb.lottie.a.values()[i20]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R.styleable.f899l, false));
        int i21 = R.styleable.f909v;
        if (obtainStyledAttributes.hasValue(i21)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(i21, false));
        }
        obtainStyledAttributes.recycle();
        x0 x0Var = this.f837e;
        if (com.airbnb.lottie.utils.l.f(getContext()) != 0.0f) {
            z4 = true;
        }
        x0Var.C1(Boolean.valueOf(z4));
    }

    public boolean A() {
        return this.f837e.r0();
    }

    @Deprecated
    public void E(boolean z4) {
        this.f837e.y1(z4 ? -1 : 0);
    }

    @MainThread
    public void F() {
        this.f841i = false;
        this.f837e.L0();
    }

    @MainThread
    public void G() {
        this.f843k.add(b.PLAY_OPTION);
        this.f837e.M0();
    }

    public void H() {
        this.f837e.N0();
    }

    public void I() {
        this.f844l.clear();
    }

    public void J() {
        this.f837e.O0();
    }

    public void K(Animator.AnimatorListener animatorListener) {
        this.f837e.P0(animatorListener);
    }

    @RequiresApi(api = 19)
    public void L(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f837e.Q0(animatorPauseListener);
    }

    public boolean M(@NonNull b1 b1Var) {
        return this.f844l.remove(b1Var);
    }

    public void N(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f837e.R0(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.e> O(com.airbnb.lottie.model.e eVar) {
        return this.f837e.T0(eVar);
    }

    @MainThread
    public void P() {
        this.f843k.add(b.PLAY_OPTION);
        this.f837e.U0();
    }

    public void Q() {
        this.f837e.V0();
    }

    @Nullable
    public Bitmap T(String str, @Nullable Bitmap bitmap) {
        return this.f837e.G1(str, bitmap);
    }

    public com.airbnb.lottie.a getAsyncUpdates() {
        return this.f837e.M();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f837e.N();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f837e.P();
    }

    public boolean getClipToCompositionBounds() {
        return this.f837e.Q();
    }

    @Nullable
    public k getComposition() {
        return this.f846n;
    }

    public long getDuration() {
        if (this.f846n != null) {
            return r0.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f837e.U();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f837e.X();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f837e.Z();
    }

    public float getMaxFrame() {
        return this.f837e.a0();
    }

    public float getMinFrame() {
        return this.f837e.b0();
    }

    @Nullable
    public i1 getPerformanceTracker() {
        return this.f837e.c0();
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getProgress() {
        return this.f837e.d0();
    }

    public j1 getRenderMode() {
        return this.f837e.e0();
    }

    public int getRepeatCount() {
        return this.f837e.f0();
    }

    public int getRepeatMode() {
        return this.f837e.g0();
    }

    public float getSpeed() {
        return this.f837e.h0();
    }

    public void i(Animator.AnimatorListener animatorListener) {
        this.f837e.s(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof x0) && ((x0) drawable).e0() == j1.SOFTWARE) {
            this.f837e.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        x0 x0Var = this.f837e;
        if (drawable2 == x0Var) {
            super.invalidateDrawable(x0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @RequiresApi(api = 19)
    public void j(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f837e.t(animatorPauseListener);
    }

    public void k(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f837e.u(animatorUpdateListener);
    }

    public boolean l(@NonNull b1 b1Var) {
        k kVar = this.f846n;
        if (kVar != null) {
            b1Var.a(kVar);
        }
        return this.f844l.add(b1Var);
    }

    public <T> void m(com.airbnb.lottie.model.e eVar, T t5, com.airbnb.lottie.value.j<T> jVar) {
        this.f837e.v(eVar, t5, jVar);
    }

    public <T> void n(com.airbnb.lottie.model.e eVar, T t5, com.airbnb.lottie.value.l<T> lVar) {
        this.f837e.v(eVar, t5, new a(lVar));
    }

    @MainThread
    public void o() {
        this.f843k.add(b.PLAY_OPTION);
        this.f837e.z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f841i) {
            this.f837e.M0();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i5;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f838f = savedState.f847a;
        Set<b> set = this.f843k;
        b bVar = b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f838f)) {
            setAnimation(this.f838f);
        }
        this.f839g = savedState.f848b;
        if (!this.f843k.contains(bVar) && (i5 = this.f839g) != 0) {
            setAnimation(i5);
        }
        if (!this.f843k.contains(b.SET_PROGRESS)) {
            S(savedState.f849c, false);
        }
        if (!this.f843k.contains(b.PLAY_OPTION) && savedState.f850d) {
            G();
        }
        if (!this.f843k.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f851e);
        }
        if (!this.f843k.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f852f);
        }
        if (!this.f843k.contains(b.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.f853g);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f847a = this.f838f;
        savedState.f848b = this.f839g;
        savedState.f849c = this.f837e.d0();
        savedState.f850d = this.f837e.o0();
        savedState.f851e = this.f837e.X();
        savedState.f852f = this.f837e.g0();
        savedState.f853g = this.f837e.f0();
        return savedState;
    }

    public <T> void r(com.airbnb.lottie.model.e eVar, T t5) {
        this.f837e.v(eVar, t5, null);
    }

    @Deprecated
    public void s() {
        this.f837e.E();
    }

    public void setAnimation(@RawRes int i5) {
        this.f839g = i5;
        this.f838f = null;
        setCompositionTask(v(i5));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f842j ? d0.O(getContext(), str) : d0.P(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z4) {
        this.f837e.X0(z4);
    }

    public void setAsyncUpdates(com.airbnb.lottie.a aVar) {
        this.f837e.Y0(aVar);
    }

    public void setCacheComposition(boolean z4) {
        this.f842j = z4;
    }

    public void setClipTextToBoundingBox(boolean z4) {
        this.f837e.Z0(z4);
    }

    public void setClipToCompositionBounds(boolean z4) {
        this.f837e.a1(z4);
    }

    public void setComposition(@NonNull k kVar) {
        if (f.f1281a) {
            Log.v(f831o, "Set Composition \n" + kVar);
        }
        this.f837e.setCallback(this);
        this.f846n = kVar;
        this.f840h = true;
        boolean b12 = this.f837e.b1(kVar);
        this.f840h = false;
        if (getDrawable() == this.f837e && !b12) {
            return;
        }
        if (!b12) {
            R();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<b1> it = this.f844l.iterator();
        while (it.hasNext()) {
            it.next().a(kVar);
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f837e.c1(str);
    }

    public void setFailureListener(@Nullable z0<Throwable> z0Var) {
        this.f835c = z0Var;
    }

    public void setFallbackResource(@DrawableRes int i5) {
        this.f836d = i5;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.c cVar) {
        this.f837e.d1(cVar);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f837e.e1(map);
    }

    public void setFrame(int i5) {
        this.f837e.f1(i5);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z4) {
        this.f837e.g1(z4);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.d dVar) {
        this.f837e.h1(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f837e.i1(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        p();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i5) {
        p();
        super.setImageResource(i5);
    }

    public void setMaintainOriginalImageBounds(boolean z4) {
        this.f837e.j1(z4);
    }

    public void setMaxFrame(int i5) {
        this.f837e.k1(i5);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        this.f837e.m1(f5);
    }

    public void setMinAndMaxFrame(String str) {
        this.f837e.o1(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f837e.q1(f5, f6);
    }

    public void setMinFrame(int i5) {
        this.f837e.r1(i5);
    }

    public void setMinProgress(float f5) {
        this.f837e.t1(f5);
    }

    public void setOutlineMasksAndMattes(boolean z4) {
        this.f837e.u1(z4);
    }

    public void setPerformanceTrackingEnabled(boolean z4) {
        this.f837e.v1(z4);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        S(f5, true);
    }

    public void setRenderMode(j1 j1Var) {
        this.f837e.x1(j1Var);
    }

    public void setRepeatCount(int i5) {
        this.f843k.add(b.SET_REPEAT_COUNT);
        this.f837e.y1(i5);
    }

    public void setRepeatMode(int i5) {
        this.f843k.add(b.SET_REPEAT_MODE);
        this.f837e.z1(i5);
    }

    public void setSafeMode(boolean z4) {
        this.f837e.A1(z4);
    }

    public void setSpeed(float f5) {
        this.f837e.B1(f5);
    }

    public void setTextDelegate(l1 l1Var) {
        this.f837e.D1(l1Var);
    }

    public void setUseCompositionFrameRate(boolean z4) {
        this.f837e.E1(z4);
    }

    public void t(boolean z4) {
        this.f837e.H(z4);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        x0 x0Var;
        if (!this.f840h && drawable == (x0Var = this.f837e) && x0Var.n0()) {
            F();
        } else if (!this.f840h && (drawable instanceof x0)) {
            x0 x0Var2 = (x0) drawable;
            if (x0Var2.n0()) {
                x0Var2.L0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public boolean w() {
        return this.f837e.k0();
    }

    public boolean x() {
        return this.f837e.l0();
    }

    public boolean z() {
        return this.f837e.n0();
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f837e.l1(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z4) {
        this.f837e.p1(str, str2, z4);
    }

    public void setMinFrame(String str) {
        this.f837e.s1(str);
    }

    public void setMinAndMaxFrame(int i5, int i6) {
        this.f837e.n1(i5, i6);
    }

    public void setAnimation(String str) {
        this.f838f = str;
        this.f839g = 0;
        setCompositionTask(u(str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(d0.P(getContext(), str, str2));
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(d0.z(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, @Nullable String str) {
        setCompositionTask(d0.U(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f833a = new d(this);
        this.f834b = new c(this);
        this.f836d = 0;
        this.f837e = new x0();
        this.f840h = false;
        this.f841i = false;
        this.f842j = true;
        this.f843k = new HashSet();
        this.f844l = new HashSet();
        y(attributeSet, R.attr.f858a);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f833a = new d(this);
        this.f834b = new c(this);
        this.f836d = 0;
        this.f837e = new x0();
        this.f840h = false;
        this.f841i = false;
        this.f842j = true;
        this.f843k = new HashSet();
        this.f844l = new HashSet();
        y(attributeSet, i5);
    }
}
