package androidx.compose.runtime.collection;

import com.android.dx.io.Opcodes;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.r2;
import kotlin.sequences.o;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [Key] */
@f(c = "androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1$iterator$1", f = "IdentityArrayMap.kt", i = {0, 0}, l = {Opcodes.INVOKE_POLYMORPHIC_RANGE}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
@i0(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, d2 = {"", "Key", "Value", "Lkotlin/sequences/o;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class IdentityArrayMap$asMap$1$keys$1$iterator$1<Key> extends k implements p<o<? super Key>, d<? super r2>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IdentityArrayMap<Key, Value> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityArrayMap$asMap$1$keys$1$iterator$1(IdentityArrayMap<Key, Value> identityArrayMap, d<? super IdentityArrayMap$asMap$1$keys$1$iterator$1> dVar) {
        super(2, dVar);
        this.this$0 = identityArrayMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        IdentityArrayMap$asMap$1$keys$1$iterator$1 identityArrayMap$asMap$1$keys$1$iterator$1 = new IdentityArrayMap$asMap$1$keys$1$iterator$1(this.this$0, dVar);
        identityArrayMap$asMap$1$keys$1$iterator$1.L$0 = obj;
        return identityArrayMap$asMap$1$keys$1$iterator$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l o<? super Key> oVar, @m d<? super r2> dVar) {
        return ((IdentityArrayMap$asMap$1$keys$1$iterator$1) create(oVar, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x004b -> B:5:0x004e). Please report as a decompilation issue!!! */
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
            goto L4e
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
            if (r3 >= r1) goto L50
            androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> r5 = r8.this$0
            java.lang.Object[] r5 = r5.getKeys()
            r5 = r5[r3]
            java.lang.String r6 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            kotlin.jvm.internal.l0.n(r5, r6)
            r8.L$0 = r4
            r8.I$0 = r3
            r8.I$1 = r1
            r8.label = r2
            java.lang.Object r5 = r4.b(r5, r8)
            if (r5 != r0) goto L4e
            return r0
        L4e:
            int r3 = r3 + r2
            goto L30
        L50:
            kotlin.r2 r8 = kotlin.r2.f19517a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
