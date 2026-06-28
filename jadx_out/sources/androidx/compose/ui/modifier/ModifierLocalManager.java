package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "Landroidx/compose/ui/Modifier$Node;", "node", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, "", "Landroidx/compose/ui/node/BackwardsCompatNode;", "set", "Lkotlin/r2;", "invalidateConsumersOfNodeForKey", "invalidate", "triggerUpdates", "updatedProvider", "insertedProvider", "removedProvider", "Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/runtime/collection/MutableVector;", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "insertedLocal", "Landroidx/compose/ui/node/LayoutNode;", "removed", "removedLocal", "", "invalidated", "Z", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,122:1\n1208#2:123\n1187#2,2:124\n1208#2:126\n1187#2,2:127\n1208#2:129\n1187#2,2:130\n1208#2:132\n1187#2,2:133\n1208#2:166\n1187#2,2:167\n476#3,7:135\n523#3:142\n483#3,4:143\n476#3,7:147\n523#3:154\n483#3,4:155\n728#3,2:234\n728#3,2:236\n728#3,2:238\n728#3,2:240\n728#3,2:242\n728#3,2:244\n1855#4,2:159\n80#5:161\n289#6:162\n163#6:163\n164#6:165\n165#6,12:169\n290#6:181\n385#6,5:182\n291#6,2:187\n390#6:189\n395#6,2:191\n397#6,17:196\n414#6,8:216\n293#6:224\n177#6,8:225\n294#6:233\n1#7:164\n261#8:190\n234#9,3:193\n237#9,3:213\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:123\n44#1:124,2\n45#1:126\n45#1:127,2\n46#1:129\n46#1:130,2\n47#1:132\n47#1:133,2\n93#1:166\n93#1:167,2\n64#1:135,7\n65#1:142\n64#1:143,4\n77#1:147,7\n78#1:154\n77#1:155,4\n105#1:234,2\n106#1:236,2\n111#1:238,2\n112#1:240,2\n117#1:242,2\n118#1:244,2\n85#1:159,2\n93#1:161\n93#1:162\n93#1:163\n93#1:165\n93#1:169,12\n93#1:181\n93#1:182,5\n93#1:187,2\n93#1:189\n93#1:191,2\n93#1:196,17\n93#1:216,8\n93#1:224\n93#1:225,8\n93#1:233\n93#1:164\n93#1:190\n93#1:193,3\n93#1:213,3\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalManager {
    public static final int $stable = 8;
    private boolean invalidated;

    @l
    private final Owner owner;

    @l
    private final MutableVector<BackwardsCompatNode> inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);

    @l
    private final MutableVector<ModifierLocal<?>> insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    @l
    private final MutableVector<LayoutNode> removed = new MutableVector<>(new LayoutNode[16], 0);

    @l
    private final MutableVector<ModifierLocal<?>> removedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    public ModifierLocalManager(@l Owner owner) {
        this.owner = owner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Set<androidx.compose.ui.node.BackwardsCompatNode>, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> modifierLocal, Set<BackwardsCompatNode> set) {
        boolean z4;
        boolean z5;
        boolean z6;
        int m5204constructorimpl = NodeKind.m5204constructorimpl(32);
        if (node.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = node.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                    for (Modifier.Node node3 = node2; node3 != null; node3 = node3.getChild$ui_release()) {
                        if ((node3.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                            DelegatingNode delegatingNode = node3;
                            MutableVector mutableVector2 = null;
                            while (true) {
                                if (delegatingNode != 0) {
                                    if (delegatingNode instanceof ModifierLocalModifierNode) {
                                        ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                        if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                            BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                            if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                                set.add(modifierLocalModifierNode);
                                            }
                                        }
                                        if (!(!modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal))) {
                                            z4 = false;
                                            break;
                                        }
                                    } else {
                                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i5 = 0;
                                            delegatingNode = delegatingNode;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (mutableVector2 == null) {
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            mutableVector2.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        mutableVector2.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                            }
                                            if (i5 == 1) {
                                            }
                                        }
                                    }
                                    delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                                } else {
                                    z4 = true;
                                    break;
                                }
                            }
                            if (z4) {
                            }
                        }
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    @l
    public final Owner getOwner() {
        return this.owner;
    }

    public final void insertedProvider(@l BackwardsCompatNode backwardsCompatNode, @l ModifierLocal<?> modifierLocal) {
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }

    public final void invalidate() {
        if (!this.invalidated) {
            this.invalidated = true;
            this.owner.registerOnEndApplyChangesListener(new ModifierLocalManager$invalidate$1(this));
        }
    }

    public final void removedProvider(@l BackwardsCompatNode backwardsCompatNode, @l ModifierLocal<?> modifierLocal) {
        this.removed.add(DelegatableNodeKt.requireLayoutNode(backwardsCompatNode));
        this.removedLocal.add(modifierLocal);
        invalidate();
    }

    public final void triggerUpdates() {
        int i5 = 0;
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        MutableVector<LayoutNode> mutableVector = this.removed;
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i6 = 0;
            do {
                LayoutNode layoutNode = content[i6];
                ModifierLocal<?> modifierLocal = this.removedLocal.getContent()[i6];
                if (layoutNode.getNodes$ui_release().getHead$ui_release().isAttached()) {
                    invalidateConsumersOfNodeForKey(layoutNode.getNodes$ui_release().getHead$ui_release(), modifierLocal, hashSet);
                }
                i6++;
            } while (i6 < size);
        }
        this.removed.clear();
        this.removedLocal.clear();
        MutableVector<BackwardsCompatNode> mutableVector2 = this.inserted;
        int size2 = mutableVector2.getSize();
        if (size2 > 0) {
            BackwardsCompatNode[] content2 = mutableVector2.getContent();
            do {
                BackwardsCompatNode backwardsCompatNode = content2[i5];
                ModifierLocal<?> modifierLocal2 = this.insertedLocal.getContent()[i5];
                if (backwardsCompatNode.isAttached()) {
                    invalidateConsumersOfNodeForKey(backwardsCompatNode, modifierLocal2, hashSet);
                }
                i5++;
            } while (i5 < size2);
        }
        this.inserted.clear();
        this.insertedLocal.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(@l BackwardsCompatNode backwardsCompatNode, @l ModifierLocal<?> modifierLocal) {
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }
}
