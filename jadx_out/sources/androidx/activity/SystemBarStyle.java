package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.w0;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B5\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u000eR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "", "isDark", "", "getScrim$activity_release", "(Z)I", "getScrim", "getScrimWithEnforcedContrast$activity_release", "getScrimWithEnforcedContrast", "lightScrim", "I", "darkScrim", "getDarkScrim$activity_release", "()I", "nightMode", "getNightMode$activity_release", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "detectDarkMode", "Lv3/l;", "getDetectDarkMode$activity_release", "()Lv3/l;", "<init>", "(IIILv3/l;)V", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SystemBarStyle {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;

    @p4.l
    private final v3.l<Resources, Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0006H\u0007J\u001c\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "()V", w0.f20674c, "Landroidx/activity/SystemBarStyle;", "lightScrim", "", "darkScrim", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "dark", "scrim", "light", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i5, int i6, v3.l lVar, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                lVar = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i5, i6, lVar);
        }

        @p4.l
        @u3.i
        @u3.m
        public final SystemBarStyle auto(@ColorInt int i5, @ColorInt int i6) {
            return auto$default(this, i5, i6, null, 4, null);
        }

        @p4.l
        @u3.i
        @u3.m
        public final SystemBarStyle auto(@ColorInt int i5, @ColorInt int i6, @p4.l v3.l<? super Resources, Boolean> detectDarkMode) {
            l0.p(detectDarkMode, "detectDarkMode");
            return new SystemBarStyle(i5, i6, 0, detectDarkMode, null);
        }

        @p4.l
        @u3.m
        public final SystemBarStyle dark(@ColorInt int i5) {
            return new SystemBarStyle(i5, i5, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        @p4.l
        @u3.m
        public final SystemBarStyle light(@ColorInt int i5, @ColorInt int i6) {
            return new SystemBarStyle(i5, i6, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SystemBarStyle(int i5, int i6, int i7, v3.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i5;
        this.darkScrim = i6;
        this.nightMode = i7;
        this.detectDarkMode = lVar;
    }

    public /* synthetic */ SystemBarStyle(int i5, int i6, int i7, v3.l lVar, kotlin.jvm.internal.w wVar) {
        this(i5, i6, i7, lVar);
    }

    @p4.l
    @u3.i
    @u3.m
    public static final SystemBarStyle auto(@ColorInt int i5, @ColorInt int i6) {
        return Companion.auto(i5, i6);
    }

    @p4.l
    @u3.i
    @u3.m
    public static final SystemBarStyle auto(@ColorInt int i5, @ColorInt int i6, @p4.l v3.l<? super Resources, Boolean> lVar) {
        return Companion.auto(i5, i6, lVar);
    }

    @p4.l
    @u3.m
    public static final SystemBarStyle dark(@ColorInt int i5) {
        return Companion.dark(i5);
    }

    @p4.l
    @u3.m
    public static final SystemBarStyle light(@ColorInt int i5, @ColorInt int i6) {
        return Companion.light(i5, i6);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    @p4.l
    public final v3.l<Resources, Boolean> getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z4) {
        return z4 ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z4) {
        if (this.nightMode == 0) {
            return 0;
        }
        if (z4) {
            return this.darkScrim;
        }
        return this.lightScrim;
    }
}
