package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\u0012\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u001a\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 ²\u0006\f\u0010\u001e\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Lkotlin/r2;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Divider", "height", "Indicator-9IZ8Weo", "Indicator", "Landroidx/compose/material/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "", "DividerOpacity", "F", "DividerThickness", "getDividerThickness-D9Ej5fM", "()F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "<init>", "()V", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,521:1\n74#2:522\n74#2:523\n135#3:524\n154#4:525\n154#4:526\n154#4:527\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n371#1:522\n388#1:523\n408#1:524\n435#1:525\n440#1:526\n445#1:527\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;

    @l
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m6044constructorimpl(1);
    private static final float IndicatorHeight = Dp.m6044constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m6044constructorimpl(52);

    private TabRowDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1478Divider9IZ8Weo(@m Modifier modifier, float f5, long j5, @m Composer composer, int i5, int i6) {
        Modifier modifier2;
        int i7;
        int i8;
        float f6;
        long j6;
        int i9;
        Modifier modifier3;
        float f7;
        long j7;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        int i12 = i6 & 1;
        if (i12 != 0) {
            i7 = i5 | 6;
            modifier2 = modifier;
        } else if ((i5 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            modifier2 = modifier;
            i7 = i5;
        }
        if ((i5 & 112) == 0) {
            if ((i6 & 2) == 0) {
                f6 = f5;
                if (startRestartGroup.changed(f6)) {
                    i11 = 32;
                    i7 |= i11;
                }
            } else {
                f6 = f5;
            }
            i11 = 16;
            i7 |= i11;
        } else {
            f6 = f5;
        }
        if ((i5 & 896) == 0) {
            if ((i6 & 4) == 0) {
                j6 = j5;
                if (startRestartGroup.changed(j6)) {
                    i10 = 256;
                    i7 |= i10;
                }
            } else {
                j6 = j5;
            }
            i10 = 128;
            i7 |= i10;
        } else {
            j6 = j5;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(this)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i7 |= i9;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            f7 = f6;
            j7 = j6;
        } else {
            startRestartGroup.startDefaults();
            if ((i5 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i6 & 2) != 0) {
                    i7 &= -113;
                }
                if ((i6 & 4) != 0) {
                    i7 &= -897;
                }
                modifier3 = modifier2;
                f7 = f6;
            } else {
                if (i12 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i6 & 2) != 0) {
                    f7 = DividerThickness;
                    i7 &= -113;
                } else {
                    f7 = f6;
                }
                if ((i6 & 4) != 0) {
                    j6 = Color.m3733copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i7 &= -897;
                }
            }
            long j8 = j6;
            int i13 = i7;
            j7 = j8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910934799, i13, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:371)");
            }
            DividerKt.m1316DivideroMI9zvI(modifier3, j7, f7, 0.0f, startRestartGroup, (i13 & 14) | ((i13 >> 3) & 112) | ((i13 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabRowDefaults$Divider$1(this, modifier3, f7, j7, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1479Indicator9IZ8Weo(@p4.m androidx.compose.ui.Modifier r17, float r18, long r19, @p4.m androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.m1479Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m1480getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1481getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1482getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    @l
    public final Modifier tabIndicatorOffset(@l Modifier modifier, @l TabPosition tabPosition) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }
}
