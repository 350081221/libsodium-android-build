package com.android.dx;

import com.android.dx.rop.code.BasicBlock;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.code.InsnList;
import com.android.dx.util.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Label {
    Label alternateSuccessor;
    Code code;
    Label primarySuccessor;
    final List<Insn> instructions = new ArrayList();
    boolean marked = false;
    List<Label> catchLabels = Collections.emptyList();
    int id = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void compact() {
        for (int i5 = 0; i5 < this.catchLabels.size(); i5++) {
            while (this.catchLabels.get(i5).isEmpty()) {
                List<Label> list = this.catchLabels;
                list.set(i5, list.get(i5).primarySuccessor);
            }
        }
        while (true) {
            Label label = this.primarySuccessor;
            if (label == null || !label.isEmpty()) {
                break;
            } else {
                this.primarySuccessor = this.primarySuccessor.primarySuccessor;
            }
        }
        while (true) {
            Label label2 = this.alternateSuccessor;
            if (label2 != null && label2.isEmpty()) {
                this.alternateSuccessor = this.alternateSuccessor.primarySuccessor;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEmpty() {
        return this.instructions.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BasicBlock toBasicBlock() {
        int i5;
        InsnList insnList = new InsnList(this.instructions.size());
        for (int i6 = 0; i6 < this.instructions.size(); i6++) {
            insnList.set(i6, this.instructions.get(i6));
        }
        insnList.setImmutable();
        IntList intList = new IntList();
        Iterator<Label> it = this.catchLabels.iterator();
        while (it.hasNext()) {
            intList.add(it.next().id);
        }
        Label label = this.primarySuccessor;
        if (label != null) {
            i5 = label.id;
            intList.add(i5);
        } else {
            i5 = -1;
        }
        Label label2 = this.alternateSuccessor;
        if (label2 != null) {
            intList.add(label2.id);
        }
        intList.setImmutable();
        return new BasicBlock(this.id, insnList, intList, i5);
    }
}
