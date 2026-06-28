package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.config.GlobalInfo;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends AbsRecordLog {

    /* renamed from: a, reason: collision with root package name */
    private String f6606a;

    /* renamed from: b, reason: collision with root package name */
    private String f6607b;

    /* renamed from: c, reason: collision with root package name */
    private String f6608c;

    /* renamed from: d, reason: collision with root package name */
    private String f6609d;

    public b(String str, String str2, String str3) {
        super("wa");
        this.f6606a = str;
        this.f6607b = str2;
        this.f6609d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        com.efs.sdk.base.core.a.a.a();
        this.f6608c = simpleDateFormat.format(new Date(com.efs.sdk.base.core.a.a.b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String generateString = generateString();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            Log.i("efs.base", generateString);
        }
        return generateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lt=event`");
        sb.append("ev_ct=");
        sb.append(this.f6606a);
        sb.append("`");
        sb.append("ev_ac=");
        sb.append(this.f6607b);
        sb.append("`");
        sb.append("tm=");
        sb.append(this.f6608c);
        sb.append("`");
        sb.append("dn=");
        sb.append(this.f6609d);
        sb.append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry.getValue());
            sb.append("`");
        }
        return sb.subSequence(0, sb.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(GlobalInfo globalInfo) {
        this.dataMap.putAll(globalInfo.getGlobalInfoMap());
        this.dataMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
    }
}
