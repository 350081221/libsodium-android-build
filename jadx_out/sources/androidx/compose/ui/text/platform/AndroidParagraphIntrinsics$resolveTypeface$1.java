package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "invoke-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends n0 implements r<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> {
    final /* synthetic */ AndroidParagraphIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.this$0 = androidParagraphIntrinsics;
    }

    @Override // v3.r
    public /* bridge */ /* synthetic */ Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
        return m5791invokeDPcqOEQ(fontFamily, fontWeight, fontStyle.m5657unboximpl(), fontSynthesis.m5670unboximpl());
    }

    @l
    /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
    public final Typeface m5791invokeDPcqOEQ(@m FontFamily fontFamily, @l FontWeight fontWeight, int i5, int i6) {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        State<Object> mo5629resolveDPcqOEQ = this.this$0.getFontFamilyResolver().mo5629resolveDPcqOEQ(fontFamily, fontWeight, i5, i6);
        if (!(mo5629resolveDPcqOEQ instanceof TypefaceResult.Immutable)) {
            typefaceDirtyTrackerLinkedList = this.this$0.resolvedTypefaces;
            TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new TypefaceDirtyTrackerLinkedList(mo5629resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
            this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
            return typefaceDirtyTrackerLinkedList2.getTypeface();
        }
        Object value = mo5629resolveDPcqOEQ.getValue();
        l0.n(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }
}
