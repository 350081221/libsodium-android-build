package com.huawei.agconnect.apms;

import android.os.Bundle;
import com.huawei.agconnect.apms.anr.NativeHandler;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.collect.model.CollectData;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class zyx {
    public static final AgentLog ijk = AgentLogManager.getAgentLog();
    public boolean bcd;
    public efg cde;
    public CollectData efg;
    public mno ghi;
    public mno hij;
    public int abc = 1;
    public wxy def = wxy.cde();
    public final Collection<xyz> fgh = new ArrayList();

    /* loaded from: classes3.dex */
    public class abc implements mno {
        public abc() {
        }

        @Override // com.huawei.agconnect.apms.mno
        public void abc() {
            zyx.this.bcd();
        }
    }

    /* loaded from: classes3.dex */
    public class bcd implements mno {
        public bcd() {
        }

        @Override // com.huawei.agconnect.apms.mno
        public void abc() {
            zyx.this.bcd();
        }
    }

    public final void abc() {
        if (Agent.isDisabled()) {
            ijk.info("Collector: APMS has been disabled, skipping data collection.");
        } else {
            AgentLog agentLog = ijk;
            StringBuilder abc2 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc2.append(this.efg.getAppStartEvents().count());
            abc2.append("] AppStart events.");
            agentLog.debug(abc2.toString());
            StringBuilder abc3 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc3.append(this.efg.getActivityLoadEvents().count());
            abc3.append("] ActivityLoad events.");
            agentLog.debug(abc3.toString());
            StringBuilder abc4 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc4.append(this.efg.getPageLoadEvents().count());
            abc4.append("] PageLoadEvent events.");
            agentLog.debug(abc4.toString());
            StringBuilder abc5 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc5.append(this.efg.getCpuMemoryEvents().count());
            abc5.append("] CpuMemory events.");
            agentLog.debug(abc5.toString());
            StringBuilder abc6 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc6.append(this.efg.getActivityRenderEvents().count());
            abc6.append("] ActivityRender events.");
            agentLog.debug(abc6.toString());
            StringBuilder abc7 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc7.append(this.efg.getHttpEvents().count());
            abc7.append("] Http events.");
            agentLog.debug(abc7.toString());
            StringBuilder abc8 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc8.append(this.efg.getForeAndBackgroundEvents().count());
            abc8.append("] ForeAndBackground events.");
            agentLog.debug(abc8.toString());
            StringBuilder abc9 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc9.append(this.efg.getCustomEvents().count());
            abc9.append("] Custom trace events.");
            agentLog.debug(abc9.toString());
            StringBuilder abc10 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc10.append(this.efg.getCustomHttpEvents().count());
            abc10.append("] Custom http events.");
            agentLog.debug(abc10.toString());
            StringBuilder abc11 = com.huawei.agconnect.apms.abc.abc("Collector: sending [");
            abc11.append(this.efg.getCpuMemoryEvents().count());
            abc11.append("] CpuMemory events.");
            agentLog.debug(abc11.toString());
            if (this.efg.getEventCount() > 0) {
                Bundle bundle = new Bundle();
                bundle.putString(HeaderType.AGENT_VERSION, Agent.getVersion());
                bundle.putString(HeaderType.USER_IDENTIFIER, Agent.getUserIdentifier());
                if (this.efg.getDeviceInformation() != null) {
                    bundle.putString("device", this.efg.getDeviceInformation().asJsonArray().toString());
                }
                if (this.efg.getPlatformInformation() != null) {
                    bundle.putString(EventType.PLATFORM, this.efg.getPlatformInformation().asJsonArray().toString());
                }
                if (this.efg.getUserSettingsInformation() != null) {
                    bundle.putString(EventType.USER_SETTINGS, this.efg.getUserSettingsInformation().asJsonArray().toString());
                }
                if (this.efg.getApplicationInformation() != null) {
                    bundle.putString("app", this.efg.getApplicationInformation().asJsonArray().toString());
                }
                bundle.putString(EventType.APP_START, this.efg.getAppStartEvents().asJsonArray().toString());
                bundle.putString(EventType.ACTIVITY_LOAD, this.efg.getActivityLoadEvents().asJsonArray().toString());
                bundle.putString(EventType.ACTIVITY_INTERACTION, this.efg.getPageLoadEvents().asJsonArray().toString());
                bundle.putString(EventType.ACTIVITY_RENDER, this.efg.getActivityRenderEvents().asJsonArray().toString());
                bundle.putString(EventType.NATIVE_HTTP, this.efg.getHttpEvents().asJsonArray().toString());
                bundle.putString(EventType.FORE_BACKGROUND, this.efg.getForeAndBackgroundEvents().asJsonArray().toString());
                bundle.putString(EventType.CUSTOM_TRACE, this.efg.getCustomEvents().asJsonArray().toString());
                bundle.putString(EventType.CUSTOM_HTTP, this.efg.getCustomHttpEvents().asJsonArray().toString());
                bundle.putString(EventType.CPU_MEMORY, this.efg.getCpuMemoryEvents().asJsonArray().toString());
                HiAnalyticsManager.getInstance().onEvent("APMS", bundle);
            }
        }
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                it.next().bcd();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectComplete: "), ijk);
        }
        this.efg.reset();
    }

    public void bcd() {
        this.bcd = false;
        try {
            int i5 = this.abc;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            uvw.efg();
                            ghi();
                            return;
                        }
                        throw new IllegalStateException();
                    }
                    try {
                        yza.bcd.submit(yza.efg).get();
                    } catch (Throwable th) {
                        yza.abc.error("exception occurred when synchronous events: " + th.toString());
                    }
                    efg();
                    def();
                    hij();
                    abc();
                    return;
                }
                efg();
                if (this.def == null) {
                    wxy cde = wxy.cde();
                    this.def = cde;
                    uvw.abc(cde);
                }
                if (this.efg.isValid()) {
                    fgh();
                    abc(3);
                    bcd();
                    return;
                } else {
                    this.efg.setValid(true);
                    fgh();
                    abc(3);
                    return;
                }
            }
            if (this.cde == null) {
                ijk.error("APMS configuration is unavailable.");
            } else {
                abc(2);
                bcd();
            }
        } catch (Throwable th2) {
            com.huawei.agconnect.apms.abc.abc(th2, com.huawei.agconnect.apms.abc.abc("exception occurred while collecting: "), ijk);
        }
    }

    public final Collection<xyz> cde() {
        return new ArrayList(this.fgh);
    }

    public final void def() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).cde();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollect: "), ijk);
        }
    }

    public final void efg() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).def();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectBefore: "), ijk);
        }
    }

    public final void fgh() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).efg();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectConnected: "), ijk);
        }
    }

    public final void ghi() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).fgh();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectDisabled: "), ijk);
        }
    }

    public final void hij() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).ghi();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectFinalize: "), ijk);
        }
    }

    public void ijk() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).hij();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectStart: "), ijk);
        }
        mno mnoVar = this.ghi;
        if (this.hij == null) {
            this.hij = new bcd();
            NativeHandler.bcd().abc(this.hij);
        }
    }

    public void jkl() {
        try {
            Iterator<xyz> it = cde().iterator();
            while (it.hasNext()) {
                ((vwx) it.next()).ijk();
            }
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectStop: "), ijk);
        }
        mno mnoVar = this.ghi;
        if (this.hij != null) {
            NativeHandler.bcd().bcd(this.hij);
            this.hij = null;
        }
    }

    public final void abc(int i5) {
        int i6;
        if (this.bcd || (i6 = this.abc) == i5) {
            return;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalStateException();
                }
                if (!abc(i5, 2, 4)) {
                    throw new IllegalStateException();
                }
            } else if (!abc(i5, 1, 3, 4)) {
                throw new IllegalStateException();
            }
        } else if (!abc(i5, 2, i5, 3, 4)) {
            throw new IllegalStateException();
        }
        if (this.abc == 3) {
            if (i5 == 2) {
                try {
                    Iterator<xyz> it = cde().iterator();
                    while (it.hasNext()) {
                        it.next().abc();
                    }
                } catch (Throwable th) {
                    com.huawei.agconnect.apms.abc.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while notifying onCollectDisconnected: "), ijk);
                }
            } else if (i5 == 4) {
                ghi();
            }
        }
        this.abc = i5;
        this.bcd = true;
    }

    public final boolean abc(int i5, int... iArr) {
        for (int i6 : iArr) {
            if (i5 == i6) {
                return true;
            }
        }
        return false;
    }

    public void abc(xyz xyzVar) {
        if (xyzVar == null) {
            return;
        }
        synchronized (this.fgh) {
            if (this.fgh.contains(xyzVar)) {
                return;
            }
            this.fgh.add(xyzVar);
        }
    }

    public void abc(wxy wxyVar) {
        this.def = wxyVar;
    }
}
