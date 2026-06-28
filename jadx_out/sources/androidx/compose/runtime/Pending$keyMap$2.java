package androidx.compose.runtime;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a>\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0001j\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Landroidx/compose/runtime/KeyInfo;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Pending$keyMap$2 extends n0 implements v3.a<HashMap<Object, LinkedHashSet<KeyInfo>>> {
    final /* synthetic */ Pending this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(Pending pending) {
        super(0);
        this.this$0 = pending;
    }

    @Override // v3.a
    @l
    public final HashMap<Object, LinkedHashSet<KeyInfo>> invoke() {
        HashMap<Object, LinkedHashSet<KeyInfo>> multiMap;
        Object joinedKey;
        multiMap = ComposerKt.multiMap();
        Pending pending = this.this$0;
        int size = pending.getKeyInfos().size();
        for (int i5 = 0; i5 < size; i5++) {
            KeyInfo keyInfo = pending.getKeyInfos().get(i5);
            joinedKey = ComposerKt.getJoinedKey(keyInfo);
            ComposerKt.put(multiMap, joinedKey, keyInfo);
        }
        return multiMap;
    }
}
