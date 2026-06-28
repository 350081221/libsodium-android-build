package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b(\u0010)J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/runtime/State;", "", "resolve", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Lkotlin/r2;", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Lkotlin/Function1;", "createDefaultTypeface", "Lv3/l;", "<init>", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,256:1\n151#2,3:257\n33#2,4:260\n154#2,2:264\n38#2:266\n156#2:267\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:257,3\n47#1:260,4\n47#1:264,2\n47#1:266\n47#1:267\n*E\n"})
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 8;

    @l
    private final v3.l<TypefaceRequest, Object> createDefaultTypeface;

    @l
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;

    @l
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;

    @l
    private final PlatformFontLoader platformFontLoader;

    @l
    private final PlatformResolveInterceptor platformResolveInterceptor;

    @l
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(@l PlatformFontLoader platformFontLoader, @l PlatformResolveInterceptor platformResolveInterceptor, @l TypefaceRequestCache typefaceRequestCache, @l FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @l PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State<Object> resolve(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest));
    }

    @l
    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c A[LOOP:0: B:11:0x006a->B:12:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preload(@p4.l androidx.compose.ui.text.font.FontFamily r14, @p4.l kotlin.coroutines.d<? super kotlin.r2> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r14 = r0.L$1
            androidx.compose.ui.text.font.FontFamily r14 = (androidx.compose.ui.text.font.FontFamily) r14
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r0
            kotlin.e1.n(r15)
            goto L55
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            kotlin.e1.n(r15)
            boolean r15 = r14 instanceof androidx.compose.ui.text.font.FontListFontFamily
            if (r15 != 0) goto L43
            kotlin.r2 r14 = kotlin.r2.f19517a
            return r14
        L43:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r15 = r13.fontListFontFamilyTypefaceAdapter
            androidx.compose.ui.text.font.PlatformFontLoader r2 = r13.platformFontLoader
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r15 = r15.preload(r14, r2, r0)
            if (r15 != r1) goto L54
            return r1
        L54:
            r0 = r13
        L55:
            r15 = r14
            androidx.compose.ui.text.font.FontListFontFamily r15 = (androidx.compose.ui.text.font.FontListFontFamily) r15
            java.util.List r15 = r15.getFonts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            int r2 = r15.size()
            r3 = 0
        L6a:
            if (r3 >= r2) goto La5
            java.lang.Object r4 = r15.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            androidx.compose.ui.text.font.TypefaceRequest r12 = new androidx.compose.ui.text.font.TypefaceRequest
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontFamily r6 = r5.interceptFontFamily(r14)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontWeight r7 = r4.getWeight()
            androidx.compose.ui.text.font.FontWeight r7 = r5.interceptFontWeight(r7)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.platformResolveInterceptor
            int r4 = r4.mo5609getStyle_LCdwA()
            int r8 = r5.m5679interceptFontStyleT2F_aPo(r4)
            androidx.compose.ui.text.font.FontSynthesis$Companion r4 = androidx.compose.ui.text.font.FontSynthesis.Companion
            int r9 = r4.m5671getAllGVVA2EU()
            androidx.compose.ui.text.font.PlatformFontLoader r4 = r0.platformFontLoader
            java.lang.Object r10 = r4.getCacheKey()
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L6a
        La5:
            androidx.compose.ui.text.font.TypefaceRequestCache r14 = r0.typefaceRequestCache
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r15 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r15.<init>(r0)
            r14.preWarmCache(r1, r15)
            kotlin.r2 r14 = kotlin.r2.f19517a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.preload(androidx.compose.ui.text.font.FontFamily, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    @l
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo5629resolveDPcqOEQ(@m FontFamily fontFamily, @l FontWeight fontWeight, int i5, int i6) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m5679interceptFontStyleT2F_aPo(i5), this.platformResolveInterceptor.m5680interceptFontSynthesisMscr08Y(i6), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i5, w wVar) {
        this(platformFontLoader, (i5 & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (i5 & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i5 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i5 & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
