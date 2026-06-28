package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R1\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "Lkotlin/r2;", "updateDrawState", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "", "alpha", "F", "getAlpha", "()F", "Landroidx/compose/ui/geometry/Size;", "<set-?>", "size$delegate", "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "size", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "shaderState", "Landroidx/compose/runtime/State;", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,56:1\n81#2:57\n107#2,2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:57\n41#1:58,2\n*E\n"})
/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 0;
    private final float alpha;

    @l
    private final ShaderBrush shaderBrush;

    @l
    private final State<Shader> shaderState;

    @l
    private final MutableState size$delegate;

    public ShaderBrushSpan(@l ShaderBrush shaderBrush, float f5) {
        MutableState mutableStateOf$default;
        this.shaderBrush = shaderBrush;
        this.alpha = f5;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3550boximpl(Size.Companion.m3570getUnspecifiedNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        this.shaderState = SnapshotStateKt.derivedStateOf(new ShaderBrushSpan$shaderState$1(this));
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @l
    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m5818getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m3567unboximpl();
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m5819setSizeuvyYCjk(long j5) {
        this.size$delegate.setValue(Size.m3550boximpl(j5));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
