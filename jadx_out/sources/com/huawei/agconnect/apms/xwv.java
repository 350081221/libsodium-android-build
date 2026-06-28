package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.util.Session;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class xwv implements u1 {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public JSONArray bcd = new JSONArray();
    public fed abc = null;

    public void abc(fed fedVar) {
        if (fedVar.bcd == null) {
            cde.error("cannot start network trace, because the url is null.");
            return;
        }
        fed fedVar2 = this.abc;
        if (fedVar2 != null) {
            cde.error(String.format(Locale.ENGLISH, "Network Trace '%s' has already started, should not start again.", fedVar2.bcd));
            return;
        }
        this.abc = fedVar;
        fedVar.abc = 1;
        Session session = v1.jkl().abc;
        v1.jkl().abc(this);
        this.bcd.put(session.asJsonArray());
        if (session.isSampled()) {
            e1.cde().abc();
        }
    }

    @Override // com.huawei.agconnect.apms.u1
    public void addNewSession(Session session) {
        fed fedVar = this.abc;
        if (fedVar != null && session != null && fedVar.mno() && !this.abc.ijk()) {
            this.bcd.put(session.asJsonArray());
        }
    }
}
