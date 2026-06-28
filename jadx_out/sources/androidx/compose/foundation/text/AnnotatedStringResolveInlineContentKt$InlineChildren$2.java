package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt$InlineChildren$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<AnnotatedString.Range<q<String, Composer, Integer, r2>>> $inlineContents;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotatedStringResolveInlineContentKt$InlineChildren$2(AnnotatedString annotatedString, List<AnnotatedString.Range<q<String, Composer, Integer, r2>>> list, int i5) {
        super(2);
        this.$text = annotatedString;
        this.$inlineContents = list;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AnnotatedStringResolveInlineContentKt.InlineChildren(this.$text, this.$inlineContents, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
