package com.efs.sdk.pa;

import android.content.Context;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.pa.config.ConfigManager;
import com.efs.sdk.pa.config.IEfsReporter;
import com.efs.sdk.pa.config.PackageLevel;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class PAFactory {
    private static final long DEFAULT_TIME_OUT_TIME = 2000;
    private static final long INVALID_TIME_OUT_TIME = 0;
    private static final long MAX_TIME_OUT_TIME = 4000;
    private static final String TAG = "pafactory";
    static final ThreadLocal<PA> sThreadLocal = new ThreadLocal<>();
    private ConfigManager mConfigManager;
    private Context mContext;
    private HashMap<String, String> mExtend;
    private IPaClient mPaClient;
    private EfsReporter mReporter;
    private IEfsReporter mReporterFactory;
    private String mSerial;
    private String mSver;
    private long mTimeOutTime;
    private PATraceListener mTraceListener;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private PackageLevel f6837a;

        /* renamed from: b, reason: collision with root package name */
        private IEfsReporter f6838b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f6839c;

        /* renamed from: d, reason: collision with root package name */
        private Context f6840d;

        /* renamed from: e, reason: collision with root package name */
        private String f6841e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap<String, String> f6842f;

        /* renamed from: g, reason: collision with root package name */
        private String f6843g;

        /* renamed from: h, reason: collision with root package name */
        private long f6844h = PAFactory.DEFAULT_TIME_OUT_TIME;

        /* renamed from: i, reason: collision with root package name */
        private PATraceListener f6845i;

        /* renamed from: j, reason: collision with root package name */
        private IPaClient f6846j;

        public Builder(Context context, IEfsReporter iEfsReporter) {
            if (context != null) {
                if (iEfsReporter != null) {
                    this.f6838b = iEfsReporter;
                    this.f6840d = context;
                    return;
                }
                throw new RuntimeException("reporter Should Not Empty");
            }
            throw new RuntimeException("context Should Not null");
        }

        public PAFactory build() {
            if (this.f6837a != null) {
                return new PAFactory(this.f6840d, this.f6837a, this.f6838b, this.f6839c, this.f6841e, this.f6842f, this.f6843g, this.f6844h, this.f6845i, this.f6846j);
            }
            throw new RuntimeException(String.format("%s Should Not Null", ""));
        }

        public Builder extendLogInfo(HashMap<String, String> hashMap) {
            this.f6842f = hashMap;
            return this;
        }

        public Builder isNewInstall(boolean z4) {
            this.f6839c = z4;
            return this;
        }

        public Builder packageLevel(PackageLevel packageLevel) {
            this.f6837a = packageLevel;
            return this;
        }

        public Builder serial(String str) {
            this.f6841e = str;
            return this;
        }

        public Builder setPaClient(IPaClient iPaClient) {
            this.f6846j = iPaClient;
            return this;
        }

        public Builder sver(String str) {
            this.f6843g = str;
            return this;
        }

        public Builder timeoutTime(long j5) {
            if (j5 <= 0) {
                Log.w(PAFactory.TAG, "Timeout time is invalid, and the default value 2s will be used");
                this.f6844h = PAFactory.DEFAULT_TIME_OUT_TIME;
            } else {
                if (j5 > PAFactory.MAX_TIME_OUT_TIME) {
                    Log.w(PAFactory.TAG, "Timeout time over 4s is not recommended, and the default value 2s will be used");
                    this.f6844h = PAFactory.DEFAULT_TIME_OUT_TIME;
                    return this;
                }
                this.f6844h = j5;
            }
            return this;
        }

        public Builder traceListener(PATraceListener pATraceListener) {
            this.f6845i = pATraceListener;
            return this;
        }
    }

    public ConfigManager getConfigManager() {
        return this.mConfigManager;
    }

    public Context getContext() {
        return this.mContext;
    }

    public HashMap<String, String> getExtend() {
        return this.mExtend;
    }

    public IPaClient getPaClient() {
        return this.mPaClient;
    }

    public synchronized PA getPaInstance() {
        PA pa;
        ThreadLocal<PA> threadLocal = sThreadLocal;
        pa = threadLocal.get();
        if (pa == null) {
            pa = new com.efs.sdk.pa.a.c(this.mConfigManager.enableTracer());
            pa.registerPAANRListener(this.mContext, new a(this), this.mTimeOutTime);
            threadLocal.set(pa);
        }
        return pa;
    }

    public EfsReporter getReporter() {
        EfsReporter efsReporter;
        if (this.mReporter == null) {
            IEfsReporter iEfsReporter = this.mReporterFactory;
            if (iEfsReporter != null) {
                efsReporter = iEfsReporter.getReporter();
            } else {
                efsReporter = null;
            }
            this.mReporter = efsReporter;
        }
        return this.mReporter;
    }

    public String getSerial() {
        return this.mSerial;
    }

    public String getSver() {
        return this.mSver;
    }

    public PATraceListener getTraceListener() {
        return this.mTraceListener;
    }

    private PAFactory(Context context, PackageLevel packageLevel, IEfsReporter iEfsReporter, boolean z4, String str, HashMap<String, String> hashMap, String str2, long j5, PATraceListener pATraceListener, IPaClient iPaClient) {
        this.mReporterFactory = iEfsReporter;
        this.mSerial = str;
        this.mExtend = hashMap;
        this.mSver = str2;
        this.mContext = context;
        this.mTraceListener = pATraceListener;
        this.mPaClient = iPaClient;
        this.mTimeOutTime = j5;
        this.mConfigManager = new ConfigManager(context, packageLevel, iEfsReporter, z4);
    }
}
