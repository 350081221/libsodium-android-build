package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0080@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "Lkotlin/r2;", "load", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font;", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "", "fontList", "Ljava/util/List;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "onCompletion", "Lv3/l;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", t0.b.f22420d, "", "cacheable", "Z", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "initialType", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lv3/l;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n81#2:433\n107#2,2:434\n33#3,6:436\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n256#1:433\n256#1:434,2\n263#1:436,6\n*E\n"})
/* loaded from: classes.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;

    @l
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;

    @l
    private final List<Font> fontList;

    @l
    private final v3.l<TypefaceResult.Immutable, r2> onCompletion;

    @l
    private final PlatformFontLoader platformFontLoader;

    @l
    private final TypefaceRequest typefaceRequest;

    @l
    private final MutableState value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@l List<? extends Font> list, @l Object obj, @l TypefaceRequest typefaceRequest, @l AsyncTypefaceCache asyncTypefaceCache, @l v3.l<? super TypefaceResult.Immutable, r2> lVar, @l PlatformFontLoader platformFontLoader) {
        MutableState mutableStateOf$default;
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = lVar;
        this.platformFontLoader = platformFontLoader;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    @l
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:20:0x0075, B:22:0x008c, B:27:0x00bb, B:31:0x00ef), top: B:19:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:20:0x0075, B:22:0x008c, B:27:0x00bb, B:31:0x00ef), top: B:19:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0102 -> B:13:0x0103). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x010a -> B:14:0x010c). Please report as a decompilation issue!!! */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(@p4.l kotlin.coroutines.d<? super kotlin.r2> r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(@p4.l androidx.compose.ui.text.font.Font r7, @p4.l kotlin.coroutines.d<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            kotlin.e1.n(r8)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            goto L4b
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.e1.n(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.L$0 = r7     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r0.label = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = kotlinx.coroutines.v3.e(r2, r8, r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L7a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r4 = r8
            goto L85
        L4d:
            r8 = move-exception
            kotlin.coroutines.g r1 = r0.getContext()
            kotlinx.coroutines.o0$b r2 = kotlinx.coroutines.o0.T
            kotlin.coroutines.g$b r1 = r1.get(r2)
            kotlinx.coroutines.o0 r1 = (kotlinx.coroutines.o0) r1
            if (r1 == 0) goto L85
            kotlin.coroutines.g r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L85
        L7a:
            r7 = move-exception
            kotlin.coroutines.g r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.p2.C(r8)
            if (r8 == 0) goto L86
        L85:
            return r4
        L86:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, kotlin.coroutines.d):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z4) {
        this.cacheable = z4;
    }
}
