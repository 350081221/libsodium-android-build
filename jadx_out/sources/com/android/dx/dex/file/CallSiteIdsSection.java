package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstCallSite;
import com.android.dx.rop.cst.CstCallSiteRef;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class CallSiteIdsSection extends UniformItemSection {
    private final TreeMap<CstCallSiteRef, CallSiteIdItem> callSiteIds;
    private final TreeMap<CstCallSite, CallSiteItem> callSites;

    public CallSiteIdsSection(DexFile dexFile) {
        super("call_site_ids", dexFile, 4);
        this.callSiteIds = new TreeMap<>();
        this.callSites = new TreeMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCallSiteItem(CstCallSite cstCallSite, CallSiteItem callSiteItem) {
        if (cstCallSite != null) {
            if (callSiteItem != null) {
                this.callSites.put(cstCallSite, callSiteItem);
                return;
            }
            throw new NullPointerException("callSiteItem == null");
        }
        throw new NullPointerException("callSite == null");
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public IndexedItem get(Constant constant) {
        if (constant != null) {
            throwIfNotPrepared();
            CallSiteIdItem callSiteIdItem = this.callSiteIds.get((CstCallSiteRef) constant);
            if (callSiteIdItem != null) {
                return callSiteIdItem;
            }
            throw new IllegalArgumentException("not found");
        }
        throw new NullPointerException("cst == null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallSiteItem getCallSiteItem(CstCallSite cstCallSite) {
        if (cstCallSite != null) {
            return this.callSites.get(cstCallSite);
        }
        throw new NullPointerException("callSite == null");
    }

    public synchronized void intern(CstCallSiteRef cstCallSiteRef) {
        if (cstCallSiteRef != null) {
            throwIfPrepared();
            if (this.callSiteIds.get(cstCallSiteRef) == null) {
                this.callSiteIds.put(cstCallSiteRef, new CallSiteIdItem(cstCallSiteRef));
            }
        } else {
            throw new NullPointerException("cstRef");
        }
    }

    @Override // com.android.dx.dex.file.Section
    public Collection<? extends Item> items() {
        return this.callSiteIds.values();
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    protected void orderItems() {
        Iterator<CallSiteIdItem> it = this.callSiteIds.values().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            it.next().setIndex(i5);
            i5++;
        }
    }
}
