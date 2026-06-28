package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u0007H\u0082\u0010\"\u0017\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroid/view/Window;", "window", "Lcom/google/accompanist/systemuicontroller/c;", "e", "(Landroid/view/Window;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/systemuicontroller/c;", "d", "(Landroidx/compose/runtime/Composer;I)Landroid/view/Window;", "Landroid/content/Context;", "c", "Landroidx/compose/ui/graphics/Color;", bi.ay, "J", "BlackScrim", "Lkotlin/Function1;", "b", "Lv3/l;", "BlackScrimmed", "systemuicontroller_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final long f7299a = ColorKt.Color$default(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final v3.l<Color, Color> f7300b = a.INSTANCE;

    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "original", "invoke-l2rxGTc", "(J)J"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.l<Color, Color> {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Color invoke(Color color) {
            return Color.m3724boximpl(m6429invokel2rxGTc(color.m3744unboximpl()));
        }

        /* renamed from: invoke-l2rxGTc, reason: not valid java name */
        public final long m6429invokel2rxGTc(long j5) {
            return ColorKt.m3779compositeOverOWjLjI(d.f7299a, j5);
        }
    }

    private static final Window c(Context baseContext) {
        while (!(baseContext instanceof Activity)) {
            if (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                l0.o(baseContext, "baseContext");
            } else {
                return null;
            }
        }
        return ((Activity) baseContext).getWindow();
    }

    @Composable
    private static final Window d(Composer composer, int i5) {
        DialogWindowProvider dialogWindowProvider;
        composer.startReplaceableGroup(1009281237);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009281237, i5, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:191)");
        }
        ViewParent parent = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getParent();
        Window window = null;
        if (parent instanceof DialogWindowProvider) {
            dialogWindowProvider = (DialogWindowProvider) parent;
        } else {
            dialogWindowProvider = null;
        }
        if (dialogWindowProvider != null) {
            window = dialogWindowProvider.getWindow();
        }
        if (window == null) {
            Context context = ((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView())).getContext();
            l0.o(context, "LocalView.current.context");
            window = c(context);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return window;
    }

    @l
    @Composable
    public static final c e(@m Window window, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-715745933);
        if ((i6 & 1) != 0) {
            window = d(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-715745933, i5, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:183)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(view) | composer.changed(window);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new b(view, window);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        b bVar = (b) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bVar;
    }
}
