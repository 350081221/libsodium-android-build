package androidx.compose.ui.text.font;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Lkotlin/r2;", "onAsyncCompletion", "invoke", "(Lv3/l;)Landroidx/compose/ui/text/font/TypefaceResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$resolve$result$1 extends n0 implements l<l<? super TypefaceResult, ? extends r2>, TypefaceResult> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ TypefaceResult invoke(l<? super TypefaceResult, ? extends r2> lVar) {
        return invoke2((l<? super TypefaceResult, r2>) lVar);
    }

    @p4.l
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final TypefaceResult invoke2(@p4.l l<? super TypefaceResult, r2> lVar) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        l<? super TypefaceRequest, ? extends Object> lVar2;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        l<? super TypefaceRequest, ? extends Object> lVar3;
        fontListFontFamilyTypefaceAdapter = this.this$0.fontListFontFamilyTypefaceAdapter;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        PlatformFontLoader platformFontLoader$ui_text_release = this.this$0.getPlatformFontLoader$ui_text_release();
        lVar2 = this.this$0.createDefaultTypeface;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release, lVar, lVar2);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.platformFamilyTypefaceAdapter;
            TypefaceRequest typefaceRequest2 = this.$typefaceRequest;
            PlatformFontLoader platformFontLoader$ui_text_release2 = this.this$0.getPlatformFontLoader$ui_text_release();
            lVar3 = this.this$0.createDefaultTypeface;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader$ui_text_release2, lVar, lVar3);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }
}
