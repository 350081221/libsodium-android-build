package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan$shaderState$1\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,56:1\n159#2:57\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan$shaderState$1\n*L\n44#1:57\n*E\n"})
/* loaded from: classes.dex */
final class ShaderBrushSpan$shaderState$1 extends n0 implements a<Shader> {
    final /* synthetic */ ShaderBrushSpan this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShaderBrushSpan$shaderState$1(ShaderBrushSpan shaderBrushSpan) {
        super(0);
        this.this$0 = shaderBrushSpan;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @m
    public final Shader invoke() {
        if ((this.this$0.m5818getSizeNHjbRc() == Size.Companion.m3570getUnspecifiedNHjbRc()) || Size.m3564isEmptyimpl(this.this$0.m5818getSizeNHjbRc())) {
            return null;
        }
        return this.this$0.getShaderBrush().mo3703createShaderuvyYCjk(this.this$0.m5818getSizeNHjbRc());
    }
}
