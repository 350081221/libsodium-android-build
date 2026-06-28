package com.android.dx.ssa;

import com.android.dx.util.IntSet;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class DomFront {
    private static final boolean DEBUG = false;
    private final DomInfo[] domInfos;
    private final SsaMethod meth;
    private final ArrayList<SsaBasicBlock> nodes;

    /* loaded from: classes2.dex */
    public static class DomInfo {
        public IntSet dominanceFrontiers;
        public int idom = -1;
    }

    public DomFront(SsaMethod ssaMethod) {
        this.meth = ssaMethod;
        ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
        this.nodes = blocks;
        int size = blocks.size();
        this.domInfos = new DomInfo[size];
        for (int i5 = 0; i5 < size; i5++) {
            this.domInfos[i5] = new DomInfo();
        }
    }

    private void buildDomTree() {
        int size = this.nodes.size();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.domInfos[i5].idom;
            if (i6 != -1) {
                this.nodes.get(i6).addDomChild(this.nodes.get(i5));
            }
        }
    }

    private void calcDomFronts() {
        int size = this.nodes.size();
        for (int i5 = 0; i5 < size; i5++) {
            SsaBasicBlock ssaBasicBlock = this.nodes.get(i5);
            DomInfo domInfo = this.domInfos[i5];
            BitSet predecessors = ssaBasicBlock.getPredecessors();
            if (predecessors.cardinality() > 1) {
                for (int nextSetBit = predecessors.nextSetBit(0); nextSetBit >= 0; nextSetBit = predecessors.nextSetBit(nextSetBit + 1)) {
                    int i6 = nextSetBit;
                    while (i6 != domInfo.idom && i6 != -1) {
                        DomInfo domInfo2 = this.domInfos[i6];
                        if (domInfo2.dominanceFrontiers.has(i5)) {
                            break;
                        }
                        domInfo2.dominanceFrontiers.add(i5);
                        i6 = domInfo2.idom;
                    }
                }
            }
        }
    }

    private void debugPrintDomChildren() {
        int size = this.nodes.size();
        for (int i5 = 0; i5 < size; i5++) {
            SsaBasicBlock ssaBasicBlock = this.nodes.get(i5);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('{');
            Iterator<SsaBasicBlock> it = ssaBasicBlock.getDomChildren().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                SsaBasicBlock next = it.next();
                if (z4) {
                    stringBuffer.append(',');
                }
                stringBuffer.append(next);
                z4 = true;
            }
            stringBuffer.append('}');
            System.out.println("domChildren[" + ssaBasicBlock + "]: " + ((Object) stringBuffer));
        }
    }

    public DomInfo[] run() {
        int size = this.nodes.size();
        Dominators.make(this.meth, this.domInfos, false);
        buildDomTree();
        for (int i5 = 0; i5 < size; i5++) {
            this.domInfos[i5].dominanceFrontiers = SetFactory.makeDomFrontSet(size);
        }
        calcDomFronts();
        return this.domInfos;
    }
}
