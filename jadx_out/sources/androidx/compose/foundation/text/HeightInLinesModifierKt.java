package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a(\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\"\u0014\u0010\t\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "minLines", "maxLines", "heightInLines", "Lkotlin/r2;", "validateMinMaxLines", "DefaultMinLines", "I", "", "typeface", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:136\n*E\n"})
/* loaded from: classes.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    @l
    public static final Modifier heightInLines(@l Modifier modifier, @l TextStyle textStyle, int i5, int i6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1(i5, i6, textStyle);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new HeightInLinesModifierKt$heightInLines$2(i5, i6, textStyle));
    }

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 1;
        }
        if ((i7 & 4) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i5, i6);
    }

    public static final void validateMinMaxLines(int i5, int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 > 0 && i6 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 > i6) {
                z5 = false;
            }
            if (z5) {
                return;
            }
            throw new IllegalArgumentException(("minLines " + i5 + " must be less than or equal to maxLines " + i6).toString());
        }
        throw new IllegalArgumentException(("both minLines " + i5 + " and maxLines " + i6 + " must be greater than zero").toString());
    }
}
