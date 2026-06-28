package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.m3;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\fH\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamily;", "family", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "resourceLoader", "Lkotlin/r2;", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Lkotlinx/coroutines/s0;", "asyncLoadScope", "Lkotlinx/coroutines/s0;", "Lkotlin/coroutines/g;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/g;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,432:1\n235#2,3:433\n33#2,4:436\n238#2,2:440\n38#2:442\n240#2:443\n151#2,3:444\n33#2,4:447\n154#2,2:451\n38#2:453\n156#2:454\n461#2,4:455\n33#2,4:459\n465#2,3:463\n38#2:466\n468#2:467\n33#2,6:468\n48#3,4:474\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n72#1:433,3\n72#1:436,4\n72#1:440,2\n72#1:442\n72#1:443\n73#1:444,3\n73#1:447,4\n73#1:451,2\n73#1:453\n73#1:454\n74#1:455,4\n74#1:459,4\n74#1:463,3\n74#1:466\n74#1:467\n78#1:468,6\n159#1:474,4\n*E\n"})
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    @l
    private s0 asyncLoadScope;

    @l
    private final AsyncTypefaceCache asyncTypefaceCache;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final FontMatcher fontMatcher = new FontMatcher();

    @l
    private static final o0 DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(o0.T);

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "Lkotlinx/coroutines/o0;", "DropExceptionHandler", "Lkotlinx/coroutines/o0;", "getDropExceptionHandler", "()Lkotlinx/coroutines/o0;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final o0 getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        @l
        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public FontListFontFamilyTypefaceAdapter(@l AsyncTypefaceCache asyncTypefaceCache, @l g gVar) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = t0.a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(gVar).plus(m3.a((l2) gVar.get(l2.U))));
    }

    @m
    public final Object preload(@l FontFamily fontFamily, @l PlatformFontLoader platformFontLoader, @l d<? super r2> dVar) {
        Object l5;
        Object y22;
        if (!(fontFamily instanceof FontListFontFamily)) {
            return r2.f19517a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i5 = 0; i5 < size; i5++) {
            Font font = fonts2.get(i5);
            if (FontLoadingStrategy.m5641equalsimpl0(font.mo5601getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m5645getAsyncPKNRLFQ())) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Font font2 = (Font) arrayList.get(i6);
            arrayList2.add(q1.a(font2.getWeight(), FontStyle.m5651boximpl(font2.mo5609getStyle_LCdwA())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Object obj = arrayList2.get(i7);
            if (hashSet.add((u0) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i8 = 0; i8 < size4; i8++) {
            u0 u0Var = (u0) arrayList3.get(i8);
            FontWeight fontWeight = (FontWeight) u0Var.component1();
            int m5657unboximpl = ((FontStyle) u0Var.component2()).m5657unboximpl();
            List list = (List) FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m5650matchFontRetOiIg(fonts, fontWeight, m5657unboximpl), new TypefaceRequest(fontFamily, fontWeight, m5657unboximpl, FontSynthesis.Companion.m5671getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, FontListFontFamilyTypefaceAdapter$preload$2$1.INSTANCE).component1();
            if (list != null) {
                y22 = e0.y2(list);
                arrayList4.add(y22);
            }
        }
        Object g5 = t0.g(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, platformFontLoader, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (g5 == l5) {
            return g5;
        }
        return r2.f19517a;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @m
    public TypefaceResult resolve(@l TypefaceRequest typefaceRequest, @l PlatformFontLoader platformFontLoader, @l v3.l<? super TypefaceResult.Immutable, r2> lVar, @l v3.l<? super TypefaceRequest, ? extends Object> lVar2) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        u0 access$firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(fontMatcher.m5650matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m5699getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, lVar2);
        List list = (List) access$firstImmediatelyAvailable.component1();
        Object component2 = access$firstImmediatelyAvailable.component2();
        if (list == null) {
            return new TypefaceResult.Immutable(component2, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, component2, typefaceRequest, this.asyncTypefaceCache, lVar, platformFontLoader);
        k.f(this.asyncLoadScope, null, kotlinx.coroutines.u0.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, g gVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i5 & 2) != 0 ? i.INSTANCE : gVar);
    }
}
