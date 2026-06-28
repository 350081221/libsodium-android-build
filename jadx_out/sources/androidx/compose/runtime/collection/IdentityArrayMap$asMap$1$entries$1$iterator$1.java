package androidx.compose.runtime.collection;

import java.util.Map;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlin.sequences.o;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;
import w3.a;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
@f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1", f = "IdentityArrayMap.kt", i = {0, 0}, l = {229}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
@i0(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@"}, d2 = {"", "Key", "Value", "Lkotlin/sequences/o;", "", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IdentityArrayMap$asMap$1$entries$1$iterator$1<Key, Value> extends k implements p<o<? super Map.Entry<? extends Key, ? extends Value>>, d<? super r2>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    @i0(d1 = {"\u0000\r\n\u0000\n\u0002\u0010&\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R\u0016\u0010\u0002\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/runtime/collection/IdentityArrayMap$asMap$1$entries$1$iterator$1$1", "", DatabaseFileArchive.COLUMN_KEY, "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", b.f22420d, "getValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 implements Map.Entry<Key, Value>, a {

        @l
        private final Key key;
        private final Value value;

        AnonymousClass1(IdentityArrayMap<Key, Value> identityArrayMap, int i5) {
            Key key = (Key) identityArrayMap.getKeys()[i5];
            l0.n(key, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            this.key = key;
            this.value = (Value) identityArrayMap.getValues()[i5];
        }

        @Override // java.util.Map.Entry
        @l
        public Key getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Value getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public Value setValue(Value value) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityArrayMap$asMap$1$entries$1$iterator$1(IdentityArrayMap<Key, Value> identityArrayMap, d<? super IdentityArrayMap$asMap$1$entries$1$iterator$1> dVar) {
        super(2, dVar);
        this.this$0 = identityArrayMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        IdentityArrayMap$asMap$1$entries$1$iterator$1 identityArrayMap$asMap$1$entries$1$iterator$1 = new IdentityArrayMap$asMap$1$entries$1$iterator$1(this.this$0, dVar);
        identityArrayMap$asMap$1$entries$1$iterator$1.L$0 = obj;
        return identityArrayMap$asMap$1$entries$1$iterator$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l o<? super Map.Entry<? extends Key, ? extends Value>> oVar, @m d<? super r2> dVar) {
        return ((IdentityArrayMap$asMap$1$entries$1$iterator$1) create(oVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            int r1 = r7.I$1
            int r3 = r7.I$0
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.o r4 = (kotlin.sequences.o) r4
            kotlin.e1.n(r8)
            r8 = r7
            goto L48
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.e1.n(r8)
            java.lang.Object r8 = r7.L$0
            kotlin.sequences.o r8 = (kotlin.sequences.o) r8
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r1 = r7.this$0
            int r1 = r1.getSize()
            r3 = 0
            r4 = r8
            r8 = r7
        L30:
            if (r3 >= r1) goto L4a
            androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1$1 r5 = new androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1$1
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r6 = r8.this$0
            r5.<init>(r6, r3)
            r8.L$0 = r4
            r8.I$0 = r3
            r8.I$1 = r1
            r8.label = r2
            java.lang.Object r5 = r4.b(r5, r8)
            if (r5 != r0) goto L48
            return r0
        L48:
            int r3 = r3 + r2
            goto L30
        L4a:
            kotlin.r2 r8 = kotlin.r2.f19517a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
