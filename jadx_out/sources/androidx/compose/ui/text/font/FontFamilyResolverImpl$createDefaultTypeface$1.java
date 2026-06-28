package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$createDefaultTypeface$1 extends n0 implements l<TypefaceRequest, Object> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // v3.l
    @p4.l
    public final Object invoke(@p4.l TypefaceRequest typefaceRequest) {
        State resolve;
        resolve = this.this$0.resolve(TypefaceRequest.m5695copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null));
        return resolve.getValue();
    }
}
