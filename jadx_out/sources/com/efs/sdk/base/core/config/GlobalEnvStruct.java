package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class GlobalEnvStruct {

    /* renamed from: a, reason: collision with root package name */
    private String f6532a;

    /* renamed from: b, reason: collision with root package name */
    private String f6533b;

    /* renamed from: h, reason: collision with root package name */
    private String f6539h;

    /* renamed from: m, reason: collision with root package name */
    private ILogEncryptAction f6544m;
    public Context mAppContext;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6534c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6535d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6536e = false;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f6537f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6538g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6540i = false;
    public long configRefreshDelayMills = 5000;

    /* renamed from: j, reason: collision with root package name */
    private long f6541j = 10000;

    /* renamed from: k, reason: collision with root package name */
    private long f6542k = 10000;

    /* renamed from: l, reason: collision with root package name */
    private Map<String, String> f6543l = new HashMap(5);

    /* renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f6545n = new ConcurrentHashMap<>();

    /* renamed from: o, reason: collision with root package name */
    private List<IEfsReporterObserver> f6546o = new ArrayList(5);

    public void addConfigObserver(IEfsReporterObserver iEfsReporterObserver) {
        if (!this.f6546o.contains(iEfsReporterObserver)) {
            this.f6546o.add(iEfsReporterObserver);
        }
    }

    public void addPublicParams(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            HashMap hashMap = new HashMap(this.f6543l);
            hashMap.putAll(map);
            this.f6543l = hashMap;
        }
    }

    public String getAppid() {
        return this.f6532a;
    }

    public List<ValueCallback<Pair<Message, Message>>> getCallback(int i5) {
        if (this.f6545n.containsKey(Integer.valueOf(i5)) && this.f6545n.get(Integer.valueOf(i5)) != null) {
            return this.f6545n.get(Integer.valueOf(i5));
        }
        return Collections.emptyList();
    }

    public List<IEfsReporterObserver> getEfsReporterObservers() {
        return this.f6546o;
    }

    public ILogEncryptAction getLogEncryptAction() {
        return this.f6544m;
    }

    public long getLogSendDelayMills() {
        return this.f6541j;
    }

    public long getLogSendIntervalMills() {
        return this.f6542k;
    }

    public Map<String, String> getPublicParamMap() {
        Map<String, String> map = this.f6543l;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    public String getSecret() {
        return this.f6533b;
    }

    public String getUid() {
        return this.f6539h;
    }

    public boolean isDebug() {
        return this.f6536e;
    }

    public boolean isEnableSendLog() {
        return this.f6535d;
    }

    public boolean isEnableWaStat() {
        return this.f6534c;
    }

    public boolean isIntl() {
        return this.f6540i;
    }

    public boolean isPrintLogDetail() {
        return this.f6538g;
    }

    public void registerCallback(int i5, ValueCallback<Pair<Message, Message>> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        List<ValueCallback<Pair<Message, Message>>> list = this.f6545n.get(Integer.valueOf(i5));
        if (list == null) {
            list = new LinkedList<>();
            this.f6545n.putIfAbsent(Integer.valueOf(i5), list);
        }
        list.add(valueCallback);
    }

    public void setAppid(String str) {
        this.f6532a = str;
    }

    public void setDebug(boolean z4) {
        this.f6536e = z4;
    }

    public void setEnableSendLog(boolean z4) {
        this.f6535d = z4;
    }

    public void setEnableWaStat(boolean z4) {
        this.f6534c = z4;
    }

    public void setIsIntl(boolean z4) {
        this.f6540i = z4;
    }

    public void setLogEncryptAction(ILogEncryptAction iLogEncryptAction) {
        this.f6544m = iLogEncryptAction;
    }

    public void setPrintLogDetail(boolean z4) {
        this.f6538g = z4;
    }

    public void setSecret(String str) {
        this.f6533b = str;
    }

    public void setUid(String str) {
        this.f6539h = str;
    }
}
