package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u00012\u00020\u0002J+\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "Landroidx/compose/ui/node/DelegatableNode;", "T", "Landroidx/compose/ui/modifier/ModifierLocal;", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "Lkotlin/r2;", "provide", "(Landroidx/compose/ui/modifier/ModifierLocal;Ljava/lang/Object;)V", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "getCurrent", "(Landroidx/compose/ui/modifier/ModifierLocal;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,209:1\n1#2:210\n1#2:218\n80#3:211\n230#4,5:212\n58#4:217\n59#4,8:219\n385#4,6:227\n395#4,2:234\n397#4,8:239\n405#4,9:250\n414#4,8:262\n68#4,7:270\n261#5:233\n234#6,3:236\n237#6,3:259\n1208#7:247\n1187#7,2:248\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNode\n*L\n164#1:218\n164#1:211\n164#1:212,5\n164#1:217\n164#1:219,8\n164#1:227,6\n164#1:234,2\n164#1:239,8\n164#1:250,9\n164#1:262,8\n164#1:270,7\n164#1:233\n164#1:236,3\n164#1:259,3\n164#1:247\n164#1:248,2\n*E\n"})
/* loaded from: classes.dex */
public interface ModifierLocalModifierNode extends ModifierLocalReadScope, DelegatableNode {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
    default <T> T getCurrent(@l ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        boolean z4;
        boolean z5;
        if (getNode().isAttached()) {
            int m5204constructorimpl = NodeKind.m5204constructorimpl(32);
            if (getNode().isAttached()) {
                Modifier.Node parent$ui_release = getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
                while (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m5204constructorimpl) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                DelegatingNode delegatingNode = parent$ui_release;
                                ?? r5 = 0;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof ModifierLocalModifierNode) {
                                        ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) delegatingNode;
                                        if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                            return (T) modifierLocalModifierNode.getProvidedValues().get$ui_release(modifierLocal);
                                        }
                                    } else {
                                        if ((delegatingNode.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4 && (delegatingNode instanceof DelegatingNode)) {
                                            Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                            int i5 = 0;
                                            delegatingNode = delegatingNode;
                                            r5 = r5;
                                            while (delegate$ui_release != null) {
                                                if ((delegate$ui_release.getKindSet$ui_release() & m5204constructorimpl) != 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    i5++;
                                                    r5 = r5;
                                                    if (i5 == 1) {
                                                        delegatingNode = delegate$ui_release;
                                                    } else {
                                                        if (r5 == 0) {
                                                            r5 = new MutableVector(new Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode != 0) {
                                                            r5.add(delegatingNode);
                                                            delegatingNode = 0;
                                                        }
                                                        r5.add(delegate$ui_release);
                                                    }
                                                }
                                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                                delegatingNode = delegatingNode;
                                                r5 = r5;
                                            }
                                            if (i5 == 1) {
                                            }
                                        }
                                    }
                                    delegatingNode = DelegatableNodeKt.pop(r5);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui_release();
                    if (requireLayoutNode != null && (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) != null) {
                        parent$ui_release = nodes$ui_release.getTail$ui_release();
                    } else {
                        parent$ui_release = null;
                    }
                }
                return modifierLocal.getDefaultFactory$ui_release().invoke();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        throw new IllegalArgumentException("ModifierLocal accessed from an unattached node".toString());
    }

    @l
    default ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    default <T> void provide(@l ModifierLocal<T> modifierLocal, T t5) {
        boolean z4;
        if (getProvidedValues() != EmptyMap.INSTANCE) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (getProvidedValues().contains$ui_release(modifierLocal)) {
                getProvidedValues().mo5085set$ui_release(modifierLocal, t5);
                return;
            }
            throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.").toString());
        }
        throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
    }
}
