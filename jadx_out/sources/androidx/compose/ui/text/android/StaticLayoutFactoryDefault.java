package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.i0;
import kotlin.jvm.internal.w;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private static boolean isInitialized;

    @p4.m
    private static Constructor<StaticLayout> staticLayoutConstructor;

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion;", "", "()V", "isInitialized", "", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "getStaticLayoutConstructor", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (StaticLayoutFactoryDefault.isInitialized) {
                return StaticLayoutFactoryDefault.staticLayoutConstructor;
            }
            StaticLayoutFactoryDefault.isInitialized = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                StaticLayoutFactoryDefault.staticLayoutConstructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryDefault.staticLayoutConstructor;
        }
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @p4.l
    @DoNotInline
    public StaticLayout create(@p4.l StaticLayoutParams staticLayoutParams) {
        Constructor staticLayoutConstructor2 = Companion.getStaticLayoutConstructor();
        StaticLayout staticLayout = null;
        if (staticLayoutConstructor2 != null) {
            try {
                staticLayout = (StaticLayout) staticLayoutConstructor2.newInstance(staticLayoutParams.getText(), Integer.valueOf(staticLayoutParams.getStart()), Integer.valueOf(staticLayoutParams.getEnd()), staticLayoutParams.getPaint(), Integer.valueOf(staticLayoutParams.getWidth()), staticLayoutParams.getAlignment(), staticLayoutParams.getTextDir(), Float.valueOf(staticLayoutParams.getLineSpacingMultiplier()), Float.valueOf(staticLayoutParams.getLineSpacingExtra()), Boolean.valueOf(staticLayoutParams.getIncludePadding()), staticLayoutParams.getEllipsize(), Integer.valueOf(staticLayoutParams.getEllipsizedWidth()), Integer.valueOf(staticLayoutParams.getMaxLines()));
            } catch (IllegalAccessException unused) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth(), staticLayoutParams.getAlignment(), staticLayoutParams.getLineSpacingMultiplier(), staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getIncludePadding(), staticLayoutParams.getEllipsize(), staticLayoutParams.getEllipsizedWidth());
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(@p4.l StaticLayout staticLayout, boolean z4) {
        return false;
    }
}
