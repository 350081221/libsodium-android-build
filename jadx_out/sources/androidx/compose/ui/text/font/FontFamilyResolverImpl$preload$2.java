package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/TypefaceResult;", "typeRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$preload$2 extends n0 implements l<TypefaceRequest, TypefaceResult> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/font/TypefaceResult$Immutable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<TypefaceResult.Immutable, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TypefaceResult.Immutable immutable) {
            invoke2(immutable);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l TypefaceResult.Immutable immutable) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/font/TypefaceResult$Immutable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<TypefaceResult.Immutable, r2> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TypefaceResult.Immutable immutable) {
            invoke2(immutable);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l TypefaceResult.Immutable immutable) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    @Override // v3.l
    @p4.l
    public final TypefaceResult invoke(@p4.l TypefaceRequest typefaceRequest) {
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
        l<? super TypefaceRequest, ? extends Object> lVar;
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
        l<? super TypefaceRequest, ? extends Object> lVar2;
        fontListFontFamilyTypefaceAdapter = this.this$0.fontListFontFamilyTypefaceAdapter;
        PlatformFontLoader platformFontLoader$ui_text_release = this.this$0.getPlatformFontLoader$ui_text_release();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        lVar = this.this$0.createDefaultTypeface;
        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release, anonymousClass1, lVar);
        if (resolve == null) {
            platformFontFamilyTypefaceAdapter = this.this$0.platformFamilyTypefaceAdapter;
            PlatformFontLoader platformFontLoader$ui_text_release2 = this.this$0.getPlatformFontLoader$ui_text_release();
            AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
            lVar2 = this.this$0.createDefaultTypeface;
            resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest, platformFontLoader$ui_text_release2, anonymousClass2, lVar2);
            if (resolve == null) {
                throw new IllegalStateException("Could not load font");
            }
        }
        return resolve;
    }
}
