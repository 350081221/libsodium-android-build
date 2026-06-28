package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import u3.f;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\"\u0010#J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007J%\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJJ\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u001e\u0010\u0011\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086\bR\u001a\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "", "Landroidx/compose/ui/text/font/Font;", "font", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "result", "", "forever", "Lkotlin/r2;", "put", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get-1ASDuI8", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;)Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "get", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "runCached", "(Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/PlatformFontLoader;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "runCachedBlocking", "PermanentFailure", "Ljava/lang/Object;", "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "resultCache", "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/caches/SimpleArrayMap;", "permanentCache", "Landroidx/compose/ui/text/caches/SimpleArrayMap;", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "cacheLock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "<init>", "()V", "AsyncTypefaceResult", "Key", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,432:1\n26#2:433\n26#2:434\n26#2:435\n26#2:436\n26#2:437\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n369#1:433\n380#1:434\n392#1:435\n399#1:436\n420#1:437\n*E\n"})
/* loaded from: classes.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;

    @l
    private final Object PermanentFailure = AsyncTypefaceResult.m5612constructorimpl(null);

    @l
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);

    @l
    private final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap<>(0, 1, null);

    @l
    private final SynchronizedObject cacheLock = Synchronization_jvmKt.createSynchronizedObject();

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0088\u0001\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$AsyncTypefaceResult;", "", "result", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isPermanentFailure", "", "isPermanentFailure-impl", "(Ljava/lang/Object;)Z", "getResult", "()Ljava/lang/Object;", "equals", "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/Object;)I", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @f
    /* loaded from: classes.dex */
    public static final class AsyncTypefaceResult {

        @m
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m5611boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        @l
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Object m5612constructorimpl(@m Object obj) {
            return obj;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5613equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && l0.g(obj, ((AsyncTypefaceResult) obj2).m5618unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5614equalsimpl0(Object obj, Object obj2) {
            return l0.g(obj, obj2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5615hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m5616isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5617toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m5613equalsimpl(this.result, obj);
        }

        @m
        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m5615hashCodeimpl(this.result);
        }

        public String toString() {
            return m5617toStringimpl(this.result);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m5618unboximpl() {
            return this.result;
        }
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/AsyncTypefaceCache$Key;", "", "font", "Landroidx/compose/ui/text/font/Font;", "loaderKey", "(Landroidx/compose/ui/text/font/Font;Ljava/lang/Object;)V", "getFont", "()Landroidx/compose/ui/text/font/Font;", "getLoaderKey", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Key {
        public static final int $stable = 8;

        @l
        private final Font font;

        @m
        private final Object loaderKey;

        public Key(@l Font font, @m Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i5, Object obj2) {
            if ((i5 & 1) != 0) {
                font = key.font;
            }
            if ((i5 & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        @l
        public final Font component1() {
            return this.font;
        }

        @m
        public final Object component2() {
            return this.loaderKey;
        }

        @l
        public final Key copy(@l Font font, @m Object obj) {
            return new Key(font, obj);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return l0.g(this.font, key.font) && l0.g(this.loaderKey, key.loaderKey);
        }

        @l
        public final Font getFont() {
            return this.font;
        }

        @m
        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int hashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        @l
        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z4, int i5, Object obj2) {
        if ((i5 & 8) != 0) {
            z4 = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z4);
    }

    @m
    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m5610get1ASDuI8(@l Font font, @l PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(@l Font font, @l PlatformFontLoader platformFontLoader, @m Object obj, boolean z4) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m5611boximpl(this.PermanentFailure));
                } else if (z4) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m5611boximpl(AsyncTypefaceResult.m5612constructorimpl(obj)));
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m5611boximpl(AsyncTypefaceResult.m5612constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runCached(@p4.l androidx.compose.ui.text.font.Font r6, @p4.l androidx.compose.ui.text.font.PlatformFontLoader r7, boolean r8, @p4.l v3.l<? super kotlin.coroutines.d<java.lang.Object>, ? extends java.lang.Object> r9, @p4.l kotlin.coroutines.d<java.lang.Object> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r7
            kotlin.e1.n(r10)
            goto L7a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.e1.n(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.cacheLock
            monitor-enter(r6)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.resultCache     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> Lb0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto L5c
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.permanentCache     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> Lb0
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> Lb0
        L5c:
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.m5618unboximpl()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            return r7
        L64:
            kotlin.r2 r7 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L76
            return r1
        L76:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7a:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L8d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r8 = r7.permanentCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r7 = r7.PermanentFailure     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m5611boximpl(r7)     // Catch: java.lang.Throwable -> L8b
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L8b:
            r6 = move-exception
            goto Lae
        L8d:
            if (r8 == 0) goto L9d
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.permanentCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m5612constructorimpl(r10)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m5611boximpl(r8)     // Catch: java.lang.Throwable -> L8b
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8b
            goto Laa
        L9d:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.resultCache     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m5612constructorimpl(r10)     // Catch: java.lang.Throwable -> L8b
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m5611boximpl(r8)     // Catch: java.lang.Throwable -> L8b
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8b
        Laa:
            kotlin.r2 r6 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r9)
            return r10
        Lae:
            monitor-exit(r9)
            throw r6
        Lb0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public final Object runCachedBlocking(@l Font font, @l PlatformFontLoader platformFontLoader, @l v3.a<? extends Object> aVar) {
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object m5618unboximpl = asyncTypefaceResult.m5618unboximpl();
                    kotlin.jvm.internal.i0.d(2);
                    kotlin.jvm.internal.i0.c(2);
                    return m5618unboximpl;
                }
                r2 r2Var = r2.f19517a;
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                Object invoke = aVar.invoke();
                put$default(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
    }
}
