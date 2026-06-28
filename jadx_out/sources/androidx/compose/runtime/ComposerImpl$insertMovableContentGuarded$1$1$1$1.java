package androidx.compose.runtime;

import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.collection.IntMap;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n+ 2 ComposerChangeListWriter.kt\nandroidx/compose/runtime/changelist/ComposerChangeListWriter\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,4197:1\n180#2,4:4198\n190#2,8:4210\n185#2,3:4221\n3157#3,8:4202\n3166#3,3:4218\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$insertMovableContentGuarded$1$1$1$1\n*L\n3066#1:4198,4\n3068#1:4210,8\n3066#1:4221,3\n3067#1:4202,8\n3067#1:4218,3\n*E\n"})
/* loaded from: classes.dex */
public final class ComposerImpl$insertMovableContentGuarded$1$1$1$1 extends n0 implements v3.a<r2> {
    final /* synthetic */ ChangeList $offsetChanges;
    final /* synthetic */ SlotReader $reader;
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerImpl$insertMovableContentGuarded$1$1$1$1(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.this$0 = composerImpl;
        this.$offsetChanges = changeList;
        this.$reader = slotReader;
        this.$to = movableContentStateReference;
    }

    @Override // v3.a
    public /* bridge */ /* synthetic */ r2 invoke() {
        invoke2();
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerChangeListWriter composerChangeListWriter;
        ComposerChangeListWriter composerChangeListWriter2;
        composerChangeListWriter = this.this$0.changeListWriter;
        ChangeList changeList = this.$offsetChanges;
        ComposerImpl composerImpl = this.this$0;
        SlotReader slotReader = this.$reader;
        MovableContentStateReference movableContentStateReference = this.$to;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader reader$runtime_release = composerImpl.getReader$runtime_release();
            int[] iArr = composerImpl.nodeCountOverrides;
            IntMap intMap = composerImpl.providerUpdates;
            composerImpl.nodeCountOverrides = null;
            composerImpl.providerUpdates = null;
            try {
                composerImpl.setReader$runtime_release(slotReader);
                composerChangeListWriter2 = composerImpl.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    r2 r2Var = r2.f19517a;
                } catch (Throwable th) {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    throw th;
                }
            } finally {
                composerImpl.setReader$runtime_release(reader$runtime_release);
                composerImpl.nodeCountOverrides = iArr;
                composerImpl.providerUpdates = intMap;
            }
        } finally {
            composerChangeListWriter.setChangeList(changeList2);
        }
    }
}
