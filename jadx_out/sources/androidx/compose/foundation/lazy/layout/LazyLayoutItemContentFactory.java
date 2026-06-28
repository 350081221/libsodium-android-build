package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J2\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0015R\u00020\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", DatabaseFileArchive.COLUMN_KEY, "getContentType", "", "index", "contentType", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;Ljava/lang/Object;)Lv3/p;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Lv3/a;", "getItemProvider", "()Lv3/a;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "lambdasCache", "Ljava/util/Map;", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lv3/a;)V", "CachedItemContent", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    public static final int $stable = 8;

    @l
    private final a<LazyLayoutItemProvider> itemProvider;

    @l
    private final Map<Object, CachedItemContent> lambdasCache = new LinkedHashMap();

    @l
    private final SaveableStateHolder saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR$\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent;", "", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "createContentLambda", "()Lv3/p;", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "contentType", "getContentType", "", "<set-?>", "index", "I", "getIndex", "()I", "_content", "Lv3/p;", "getContent", "content", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;ILjava/lang/Object;Ljava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    /* loaded from: classes.dex */
    public final class CachedItemContent {

        @m
        private p<? super Composer, ? super Integer, r2> _content;

        @m
        private final Object contentType;
        private int index;

        @l
        private final Object key;

        public CachedItemContent(int i5, @l Object obj, @m Object obj2) {
            this.key = obj;
            this.contentType = obj2;
            this.index = i5;
        }

        private final p<Composer, Integer, r2> createContentLambda() {
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory.this, this));
        }

        @l
        public final p<Composer, Integer, r2> getContent() {
            p pVar = this._content;
            if (pVar != null) {
                return pVar;
            }
            p<Composer, Integer, r2> createContentLambda = createContentLambda();
            this._content = createContentLambda;
            return createContentLambda;
        }

        @m
        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        @l
        public final Object getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@l SaveableStateHolder saveableStateHolder, @l a<? extends LazyLayoutItemProvider> aVar) {
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = aVar;
    }

    @l
    public final p<Composer, Integer, r2> getContent(int i5, @l Object obj, @m Object obj2) {
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i5 && l0.g(cachedItemContent.getContentType(), obj2)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i5, obj, obj2);
        this.lambdasCache.put(obj, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    @m
    public final Object getContentType(@m Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider invoke = this.itemProvider.invoke();
        int index = invoke.getIndex(obj);
        if (index == -1) {
            return null;
        }
        return invoke.getContentType(index);
    }

    @l
    public final a<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }
}
