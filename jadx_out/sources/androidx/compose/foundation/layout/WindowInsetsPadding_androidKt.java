package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0002\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u000b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\f\u001a\u00020\u0000*\u00020\u0000\u001aC\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0019\b\b\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u00102\u0019\b\u0004\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\r¢\u0006\u0002\b\u0010H\u0083\b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "safeDrawingPadding", "safeGesturesPadding", "safeContentPadding", "systemBarsPadding", "displayCutoutPadding", "statusBarsPadding", "imePadding", "navigationBarsPadding", "captionBarPadding", "waterfallPadding", "systemGesturesPadding", "mandatorySystemGesturesPadding", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "Lkotlin/u;", "inspectorInfo", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/WindowInsets;", "insetsCalculation", "windowInsetsPadding", "foundation-layout_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,256:1\n249#1,7:258\n249#1,7:266\n249#1,7:274\n249#1,7:282\n249#1,7:290\n249#1,7:298\n249#1,7:306\n249#1,7:314\n249#1,7:322\n249#1,7:330\n249#1,7:338\n249#1,7:346\n135#2:257\n135#2:265\n135#2:273\n135#2:281\n135#2:289\n135#2:297\n135#2:305\n135#2:313\n135#2:321\n135#2:329\n135#2:337\n135#2:345\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:258,7\n59#1:266,7\n77#1:274,7\n95#1:282,7\n113#1:290,7\n131#1:298,7\n149#1:306,7\n167#1:314,7\n185#1:322,7\n203#1:330,7\n221#1:338,7\n240#1:346,7\n41#1:257\n59#1:265\n77#1:273\n95#1:281\n113#1:289\n131#1:297\n149#1:305\n167#1:313\n185#1:321\n203#1:329\n221#1:337\n240#1:345\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    @l
    public static final Modifier captionBarPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier displayCutoutPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier imePadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier mandatorySystemGesturesPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier navigationBarsPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier safeContentPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier safeDrawingPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier safeGesturesPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier statusBarsPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier systemBarsPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier systemGesturesPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1());
    }

    @l
    public static final Modifier waterfallPadding(@l Modifier modifier) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1());
    }

    @Stable
    private static final Modifier windowInsetsPadding(Modifier modifier, v3.l<? super InspectorInfo, r2> lVar, v3.l<? super WindowInsetsHolder, ? extends WindowInsets> lVar2) {
        return ComposedModifierKt.composed(modifier, lVar, new WindowInsetsPadding_androidKt$windowInsetsPadding$1(lVar2));
    }
}
