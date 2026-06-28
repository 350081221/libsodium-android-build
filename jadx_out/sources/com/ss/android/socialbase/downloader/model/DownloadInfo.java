package com.ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.net.http.Headers;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.depend.ai;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.i.f;
import com.umeng.analytics.pro.bm;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DownloadInfo implements Parcelable {
    public static final Parcelable.Creator<DownloadInfo> CREATOR = new Parcelable.Creator<DownloadInfo>() { // from class: com.ss.android.socialbase.downloader.model.DownloadInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadInfo createFromParcel(Parcel parcel) {
            return new DownloadInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadInfo[] newArray(int i5) {
            return new DownloadInfo[i5];
        }
    };
    private static final int DEFAULT_MAX_PROCESS_POST_COUNT = 100;
    private static final long DEFAULT_MIN_BYTES_INTERVAL = 1048576;
    private static final int RESERVE_STATUS_NEVER = 0;
    private static final int RESERVE_STATUS_NOW = 2;
    private static final int RESERVE_STATUS_ONCE = 1;
    private static final String TAG = "DownloadInfo";
    private boolean addListenerToSameTask;
    private AtomicLong allConnectTime;
    private int appVersionCode;
    private com.ss.android.socialbase.downloader.constants.a asyncHandleStatus;
    private boolean autoResumed;
    private int backUpUrlRetryCount;
    private boolean backUpUrlUsed;
    private List<String> backUpUrls;
    private String backUpUrlsStr;
    private int bindValueCount;
    private com.ss.android.socialbase.downloader.constants.b byteInvalidRetryStatus;
    private int chunkCount;
    private boolean chunkDowngradeRetryUsed;
    private int curBackUpUrlIndex;
    private AtomicLong curBytes;
    private int curRetryTime;
    private JSONObject dbJsonData;
    private String dbJsonDataString;
    private boolean deleteCacheIfCheckFailed;
    private boolean distinctDirectory;
    private long downloadTime;
    private String eTag;
    private EnqueueType enqueueType;
    private StringBuffer errorBytesLog;
    private boolean expiredRedownload;
    private String extra;
    private List<c> extraHeaders;
    private int[] extraMonitorStatus;
    private BaseException failedException;
    private String filePackageName;
    private List<String> forbiddenBackupUrls;
    private boolean force;
    private boolean forceIgnoreRecommendSize;
    private boolean headConnectionAvailable;
    private String headConnectionException;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean httpsToHttpRetryUsed;
    private String iconUrl;
    private int id;
    private boolean ignoreDataVerify;
    private Boolean isAutoInstallWithoutNotification;
    private boolean isFirstDownload;
    private boolean isFirstSuccess;
    private boolean isForbiddenRetryed;
    private volatile boolean isSaveTempFile;
    private AtomicLong lastNotifyProgressTime;
    private boolean mDownloadFromReserveWifi;
    private int maxBytes;
    private int maxProgressCount;
    private String md5;
    private String mimeType;
    private int minProgressTimeMsInterval;
    private String monitorScene;
    private String name;
    private boolean needChunkDowngradeRetry;
    private boolean needDefaultHttpServiceBackUp;
    private boolean needHttpsToHttpRetry;
    private boolean needIndependentProcess;
    private boolean needPostProgress;
    private boolean needRetryDelay;
    private boolean needReuseChunkRunnable;
    private boolean needReuseFirstConnection;
    private boolean needSDKMonitor;
    private String networkQuality;
    private int notificationVisibility;
    private boolean onlyWifi;
    private boolean openLimitSpeed;
    private String[] outIp;
    private int[] outSize;
    private SoftReference<PackageInfo> packageInfoRef;
    private String packageName;
    private long realDownloadTime;
    private long realStartDownloadTime;
    private int retryCount;
    private g retryDelayStatus;
    private String retryDelayTimeArray;

    @Deprecated
    private int retryScheduleMinutes;
    private String savePath;
    private boolean showNotification;
    private boolean showNotificationForAutoResumed;
    private boolean showNotificationForNetworkResumed;
    private JSONObject spData;
    private long startDownloadTime;
    private AtomicInteger status;
    private int statusAtDbInit;
    private boolean successByCache;
    private boolean supportPartial;
    private String taskId;
    private ConcurrentHashMap<String, Object> tempCacheData;
    private volatile List<ai> tempFileSaveCompleteCallbacks;
    private String tempPath;
    private long throttleNetSpeed;
    private String title;
    private long totalBytes;
    private long ttnetProtectTimeout;
    private String url;

    /* loaded from: classes3.dex */
    public static class a {
        private String A;
        private String B;
        private long C;
        private boolean D;
        private String E;
        private boolean F;
        private boolean G;
        private boolean I;
        private boolean J;
        private boolean K;
        private String L;
        private long M;
        private boolean N;
        private boolean O;
        private JSONObject P;
        private String R;
        private int[] S;
        private int T;
        private boolean U;
        private boolean V;
        private long W;
        private boolean X;
        private String Y;

        /* renamed from: a, reason: collision with root package name */
        private String f11073a;

        /* renamed from: b, reason: collision with root package name */
        private String f11074b;

        /* renamed from: c, reason: collision with root package name */
        private String f11075c;

        /* renamed from: d, reason: collision with root package name */
        private String f11076d;

        /* renamed from: e, reason: collision with root package name */
        private String f11077e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f11078f;

        /* renamed from: g, reason: collision with root package name */
        private String f11079g;

        /* renamed from: h, reason: collision with root package name */
        private List<c> f11080h;

        /* renamed from: i, reason: collision with root package name */
        private int f11081i;

        /* renamed from: j, reason: collision with root package name */
        private String[] f11082j;

        /* renamed from: k, reason: collision with root package name */
        private int[] f11083k;

        /* renamed from: l, reason: collision with root package name */
        private int f11084l;

        /* renamed from: m, reason: collision with root package name */
        private int f11085m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f11086n;

        /* renamed from: p, reason: collision with root package name */
        private int f11088p;

        /* renamed from: q, reason: collision with root package name */
        private int f11089q;

        /* renamed from: r, reason: collision with root package name */
        private List<String> f11090r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f11091s;

        /* renamed from: u, reason: collision with root package name */
        private String f11093u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f11094v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f11095w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f11096x;

        /* renamed from: z, reason: collision with root package name */
        private boolean f11098z;

        /* renamed from: o, reason: collision with root package name */
        private boolean f11087o = true;

        /* renamed from: t, reason: collision with root package name */
        private boolean f11092t = true;

        /* renamed from: y, reason: collision with root package name */
        private boolean f11097y = true;
        private EnqueueType H = EnqueueType.ENQUEUE_NONE;
        private boolean Q = true;

        public a() {
        }

        public a a(String str) {
            this.f11073a = str;
            return this;
        }

        public a b(String str) {
            this.f11074b = str;
            return this;
        }

        public a c(String str) {
            this.f11075c = str;
            return this;
        }

        public a d(String str) {
            this.Y = str;
            return this;
        }

        public a e(String str) {
            this.f11076d = str;
            return this;
        }

        public a f(String str) {
            this.f11077e = str;
            return this;
        }

        public a g(String str) {
            this.f11079g = str;
            return this;
        }

        public a h(String str) {
            this.f11093u = str;
            return this;
        }

        public a i(boolean z4) {
            this.f11098z = z4;
            return this;
        }

        public a j(String str) {
            this.B = str;
            return this;
        }

        public a k(String str) {
            this.E = str;
            return this;
        }

        public a l(boolean z4) {
            this.G = z4;
            return this;
        }

        public a m(boolean z4) {
            this.I = z4;
            return this;
        }

        public a n(boolean z4) {
            this.J = z4;
            return this;
        }

        public a o(boolean z4) {
            this.K = z4;
            return this;
        }

        public a p(boolean z4) {
            this.O = z4;
            return this;
        }

        public a q(boolean z4) {
            this.Q = z4;
            return this;
        }

        public a r(boolean z4) {
            this.N = z4;
            return this;
        }

        public a s(boolean z4) {
            this.U = z4;
            return this;
        }

        public a t(boolean z4) {
            this.V = z4;
            return this;
        }

        public a u(boolean z4) {
            this.X = z4;
            return this;
        }

        public a v(boolean z4) {
            this.f11092t = z4;
            return this;
        }

        public a a(boolean z4) {
            this.f11078f = z4;
            return this;
        }

        public a b(int i5) {
            this.f11084l = i5;
            return this;
        }

        public a c(int i5) {
            this.f11085m = i5;
            return this;
        }

        public a d(int i5) {
            this.f11088p = i5;
            return this;
        }

        public a e(int i5) {
            this.f11089q = i5;
            return this;
        }

        public a f(boolean z4) {
            this.f11095w = z4;
            return this;
        }

        public a g(boolean z4) {
            this.f11096x = z4;
            return this;
        }

        public a h(boolean z4) {
            this.f11097y = z4;
            return this;
        }

        public a i(String str) {
            this.A = str;
            return this;
        }

        public a j(boolean z4) {
            this.D = z4;
            return this;
        }

        public a k(boolean z4) {
            this.F = z4;
            return this;
        }

        public a l(String str) {
            this.R = str;
            return this;
        }

        public a m(String str) {
            this.L = str;
            return this;
        }

        public a a(List<c> list) {
            this.f11080h = list;
            return this;
        }

        public a b(boolean z4) {
            this.f11086n = z4;
            return this;
        }

        public a c(boolean z4) {
            this.f11087o = z4;
            return this;
        }

        public a d(boolean z4) {
            this.f11094v = z4;
            return this;
        }

        public a e(boolean z4) {
            this.f11091s = z4;
            return this;
        }

        public a f(int i5) {
            this.T = i5;
            return this;
        }

        public a a(int i5) {
            this.f11081i = i5;
            return this;
        }

        public a b(List<String> list) {
            this.f11090r = list;
            return this;
        }

        public a c(long j5) {
            this.W = j5;
            return this;
        }

        public a a(String[] strArr) {
            this.f11082j = strArr;
            return this;
        }

        public a b(int[] iArr) {
            this.S = iArr;
            return this;
        }

        public a(String str) {
            this.f11075c = str;
        }

        public a a(int[] iArr) {
            this.f11083k = iArr;
            return this;
        }

        public a b(long j5) {
            this.M = j5;
            return this;
        }

        public a a(long j5) {
            this.C = j5;
            return this;
        }

        public a a(EnqueueType enqueueType) {
            this.H = enqueueType;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.P = jSONObject;
            return this;
        }

        public DownloadInfo a() {
            return new DownloadInfo(this);
        }
    }

    private void convertEnqueueType(int i5) {
        EnqueueType enqueueType = EnqueueType.ENQUEUE_HEAD;
        if (i5 == enqueueType.ordinal()) {
            this.enqueueType = enqueueType;
            return;
        }
        EnqueueType enqueueType2 = EnqueueType.ENQUEUE_TAIL;
        if (i5 == enqueueType2.ordinal()) {
            this.enqueueType = enqueueType2;
        } else {
            this.enqueueType = EnqueueType.ENQUEUE_NONE;
        }
    }

    private void convertRetryDelayStatus(int i5) {
        g gVar = g.DELAY_RETRY_WAITING;
        if (i5 == gVar.ordinal()) {
            this.retryDelayStatus = gVar;
            return;
        }
        g gVar2 = g.DELAY_RETRY_DOWNLOADING;
        if (i5 == gVar2.ordinal()) {
            this.retryDelayStatus = gVar2;
            return;
        }
        g gVar3 = g.DELAY_RETRY_DOWNLOADED;
        if (i5 == gVar3.ordinal()) {
            this.retryDelayStatus = gVar3;
        } else {
            this.retryDelayStatus = g.DELAY_RETRY_NONE;
        }
    }

    private JSONObject convertStrToJson(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return new JSONObject(str);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void ensureDBJsonData() {
        if (this.dbJsonData == null) {
            synchronized (this) {
                if (this.dbJsonData == null) {
                    try {
                        if (!TextUtils.isEmpty(this.dbJsonDataString)) {
                            this.dbJsonData = new JSONObject(this.dbJsonDataString);
                            this.dbJsonDataString = null;
                        } else {
                            this.dbJsonData = new JSONObject();
                        }
                    } catch (Throwable unused) {
                        this.dbJsonData = new JSONObject();
                    }
                }
            }
        }
    }

    private void ensureSpData() {
        if (this.spData == null) {
            Context O = com.ss.android.socialbase.downloader.downloader.c.O();
            if (O != null) {
                String string = O.getSharedPreferences("sp_download_info", 0).getString(Long.toString(getId()), "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        this.spData = new JSONObject(string);
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            if (this.spData == null) {
                this.spData = new JSONObject();
            }
        }
    }

    private void ensureTempCacheData() {
        if (this.tempCacheData == null) {
            synchronized (this) {
                if (this.tempCacheData == null) {
                    this.tempCacheData = new ConcurrentHashMap<>();
                }
            }
        }
    }

    private String getBackUpUrlsStr() {
        List<String> list;
        if (this.backUpUrlsStr == null && (list = this.backUpUrls) != null && !list.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.backUpUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        jSONArray.put(str);
                    }
                }
                this.backUpUrlsStr = jSONArray.toString();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (this.backUpUrlsStr == null) {
            this.backUpUrlsStr = "";
        }
        return this.backUpUrlsStr;
    }

    private String getDBJsonDataString() {
        String jSONObject;
        String str = this.dbJsonDataString;
        if (str != null) {
            return str;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            jSONObject = this.dbJsonData.toString();
            this.dbJsonDataString = jSONObject;
        }
        return jSONObject;
    }

    private int getReserveWifiStatus() {
        ensureSpData();
        try {
            return this.spData.optInt("pause_reserve_on_wifi", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    private void mergeAuxiliaryJSONObject(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (!this.dbJsonData.has(next) && opt != null) {
                        this.dbJsonData.put(next, opt);
                    }
                }
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
        parseMonitorSetting();
    }

    private void parseMonitorSetting() {
        ensureDBJsonData();
        this.needSDKMonitor = this.dbJsonData.optBoolean("need_sdk_monitor", false);
        this.monitorScene = this.dbJsonData.optString("monitor_scene", "");
        JSONArray optJSONArray = this.dbJsonData.optJSONArray("extra_monitor_status");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.extraMonitorStatus = new int[optJSONArray.length()];
            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                this.extraMonitorStatus[i5] = optJSONArray.optInt(i5);
            }
        }
    }

    private void putMonitorSetting() {
        safePutToDBJsonData("need_sdk_monitor", Boolean.valueOf(this.needSDKMonitor));
        safePutToDBJsonData("monitor_scene", this.monitorScene);
        try {
            JSONArray jSONArray = new JSONArray();
            int[] iArr = this.extraMonitorStatus;
            if (iArr != null && iArr.length > 0) {
                int i5 = 0;
                while (true) {
                    int[] iArr2 = this.extraMonitorStatus;
                    if (i5 >= iArr2.length) {
                        break;
                    }
                    jSONArray.put(iArr2[i5]);
                    i5++;
                }
            }
            safePutToDBJsonData("extra_monitor_status", jSONArray);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void refreshBackupUrls(boolean z4) {
        List<String> list = this.forbiddenBackupUrls;
        if (list != null && list.size() > z4) {
            List<String> list2 = this.backUpUrls;
            if (list2 == null) {
                this.backUpUrls = new ArrayList();
            } else {
                list2.clear();
            }
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            for (int i5 = z4; i5 < this.forbiddenBackupUrls.size(); i5++) {
                this.backUpUrls.add(this.forbiddenBackupUrls.get(i5));
            }
        }
    }

    private void setBackUpUrlsStr(String str) {
        if (!TextUtils.isEmpty(str) && getStatus() != -3) {
            this.backUpUrlsStr = str;
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        String optString = jSONArray.optString(i5);
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                    this.backUpUrls = arrayList;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void addErrorBytesLog(long j5, int i5, String str) {
        try {
            if (com.ss.android.socialbase.downloader.c.a.a()) {
                if (this.errorBytesLog == null) {
                    this.errorBytesLog = new StringBuffer();
                }
                if (this.errorBytesLog.length() != 0) {
                    this.errorBytesLog.append(",");
                }
                StringBuffer stringBuffer = this.errorBytesLog;
                stringBuffer.append("[type:");
                stringBuffer.append(i5);
                stringBuffer.append(",bytes:");
                stringBuffer.append(j5);
                stringBuffer.append(",method:");
                stringBuffer.append(str);
                stringBuffer.append("]");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void bindValue(SQLiteStatement sQLiteStatement) {
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        if (sQLiteStatement == null) {
            return;
        }
        this.bindValueCount = 0;
        sQLiteStatement.clearBindings();
        int i5 = this.bindValueCount + 1;
        this.bindValueCount = i5;
        sQLiteStatement.bindLong(i5, this.id);
        int i6 = this.bindValueCount + 1;
        this.bindValueCount = i6;
        String str = this.url;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        sQLiteStatement.bindString(i6, str);
        int i7 = this.bindValueCount + 1;
        this.bindValueCount = i7;
        String str3 = this.savePath;
        if (str3 == null) {
            str3 = "";
        }
        sQLiteStatement.bindString(i7, str3);
        int i8 = this.bindValueCount + 1;
        this.bindValueCount = i8;
        String str4 = this.tempPath;
        if (str4 == null) {
            str4 = "";
        }
        sQLiteStatement.bindString(i8, str4);
        int i9 = this.bindValueCount + 1;
        this.bindValueCount = i9;
        String str5 = this.name;
        if (str5 == null) {
            str5 = "";
        }
        sQLiteStatement.bindString(i9, str5);
        int i10 = this.bindValueCount + 1;
        this.bindValueCount = i10;
        sQLiteStatement.bindLong(i10, this.chunkCount);
        int i11 = this.bindValueCount + 1;
        this.bindValueCount = i11;
        sQLiteStatement.bindLong(i11, getStatus());
        int i12 = this.bindValueCount + 1;
        this.bindValueCount = i12;
        sQLiteStatement.bindLong(i12, getCurBytes());
        int i13 = this.bindValueCount + 1;
        this.bindValueCount = i13;
        sQLiteStatement.bindLong(i13, this.totalBytes);
        int i14 = this.bindValueCount + 1;
        this.bindValueCount = i14;
        String str6 = this.eTag;
        if (str6 == null) {
            str6 = "";
        }
        sQLiteStatement.bindString(i14, str6);
        int i15 = this.bindValueCount + 1;
        this.bindValueCount = i15;
        long j15 = 1;
        if (this.onlyWifi) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        sQLiteStatement.bindLong(i15, j5);
        int i16 = this.bindValueCount + 1;
        this.bindValueCount = i16;
        if (this.force) {
            j6 = 1;
        } else {
            j6 = 0;
        }
        sQLiteStatement.bindLong(i16, j6);
        int i17 = this.bindValueCount + 1;
        this.bindValueCount = i17;
        sQLiteStatement.bindLong(i17, this.retryCount);
        int i18 = this.bindValueCount + 1;
        this.bindValueCount = i18;
        String str7 = this.extra;
        if (str7 == null) {
            str7 = "";
        }
        sQLiteStatement.bindString(i18, str7);
        int i19 = this.bindValueCount + 1;
        this.bindValueCount = i19;
        String str8 = this.mimeType;
        if (str8 == null) {
            str8 = "";
        }
        sQLiteStatement.bindString(i19, str8);
        int i20 = this.bindValueCount + 1;
        this.bindValueCount = i20;
        String str9 = this.title;
        if (str9 == null) {
            str9 = "";
        }
        sQLiteStatement.bindString(i20, str9);
        int i21 = this.bindValueCount + 1;
        this.bindValueCount = i21;
        if (this.showNotification) {
            j7 = 1;
        } else {
            j7 = 0;
        }
        sQLiteStatement.bindLong(i21, j7);
        int i22 = this.bindValueCount + 1;
        this.bindValueCount = i22;
        sQLiteStatement.bindLong(i22, this.notificationVisibility);
        int i23 = this.bindValueCount + 1;
        this.bindValueCount = i23;
        if (this.isFirstDownload) {
            j8 = 1;
        } else {
            j8 = 0;
        }
        sQLiteStatement.bindLong(i23, j8);
        int i24 = this.bindValueCount + 1;
        this.bindValueCount = i24;
        if (this.isFirstSuccess) {
            j9 = 1;
        } else {
            j9 = 0;
        }
        sQLiteStatement.bindLong(i24, j9);
        int i25 = this.bindValueCount + 1;
        this.bindValueCount = i25;
        if (this.needHttpsToHttpRetry) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        sQLiteStatement.bindLong(i25, j10);
        int i26 = this.bindValueCount + 1;
        this.bindValueCount = i26;
        sQLiteStatement.bindLong(i26, this.downloadTime);
        int i27 = this.bindValueCount + 1;
        this.bindValueCount = i27;
        String str10 = this.packageName;
        if (str10 == null) {
            str10 = "";
        }
        sQLiteStatement.bindString(i27, str10);
        int i28 = this.bindValueCount + 1;
        this.bindValueCount = i28;
        String str11 = this.md5;
        if (str11 == null) {
            str11 = "";
        }
        sQLiteStatement.bindString(i28, str11);
        int i29 = this.bindValueCount + 1;
        this.bindValueCount = i29;
        if (this.needRetryDelay) {
            j11 = 1;
        } else {
            j11 = 0;
        }
        sQLiteStatement.bindLong(i29, j11);
        int i30 = this.bindValueCount + 1;
        this.bindValueCount = i30;
        sQLiteStatement.bindLong(i30, this.curRetryTime);
        int i31 = this.bindValueCount + 1;
        this.bindValueCount = i31;
        sQLiteStatement.bindLong(i31, this.retryDelayStatus.ordinal());
        int i32 = this.bindValueCount + 1;
        this.bindValueCount = i32;
        if (this.needDefaultHttpServiceBackUp) {
            j12 = 1;
        } else {
            j12 = 0;
        }
        sQLiteStatement.bindLong(i32, j12);
        int i33 = this.bindValueCount + 1;
        this.bindValueCount = i33;
        if (this.needReuseChunkRunnable) {
            j13 = 1;
        } else {
            j13 = 0;
        }
        sQLiteStatement.bindLong(i33, j13);
        int i34 = this.bindValueCount + 1;
        this.bindValueCount = i34;
        String str12 = this.retryDelayTimeArray;
        if (str12 == null) {
            str12 = "";
        }
        sQLiteStatement.bindString(i34, str12);
        int i35 = this.bindValueCount + 1;
        this.bindValueCount = i35;
        if (this.needChunkDowngradeRetry) {
            j14 = 1;
        } else {
            j14 = 0;
        }
        sQLiteStatement.bindLong(i35, j14);
        int i36 = this.bindValueCount + 1;
        this.bindValueCount = i36;
        sQLiteStatement.bindString(i36, getBackUpUrlsStr());
        int i37 = this.bindValueCount + 1;
        this.bindValueCount = i37;
        sQLiteStatement.bindLong(i37, this.backUpUrlRetryCount);
        int i38 = this.bindValueCount + 1;
        this.bindValueCount = i38;
        sQLiteStatement.bindLong(i38, this.realDownloadTime);
        int i39 = this.bindValueCount + 1;
        this.bindValueCount = i39;
        sQLiteStatement.bindLong(i39, this.retryScheduleMinutes);
        int i40 = this.bindValueCount + 1;
        this.bindValueCount = i40;
        if (!this.needIndependentProcess) {
            j15 = 0;
        }
        sQLiteStatement.bindLong(i40, j15);
        int i41 = this.bindValueCount + 1;
        this.bindValueCount = i41;
        sQLiteStatement.bindString(i41, getDBJsonDataString());
        int i42 = this.bindValueCount + 1;
        this.bindValueCount = i42;
        String str13 = this.iconUrl;
        if (str13 == null) {
            str13 = "";
        }
        sQLiteStatement.bindString(i42, str13);
        int i43 = this.bindValueCount + 1;
        this.bindValueCount = i43;
        sQLiteStatement.bindLong(i43, this.appVersionCode);
        int i44 = this.bindValueCount + 1;
        this.bindValueCount = i44;
        String str14 = this.taskId;
        if (str14 != null) {
            str2 = str14;
        }
        sQLiteStatement.bindString(i44, str2);
    }

    public boolean cacheExpierd() {
        if (!isDownloaded()) {
            return true;
        }
        return f.d(this);
    }

    public boolean canNotifyProgress() {
        long j5 = this.lastNotifyProgressTime.get();
        if (j5 != 0 && SystemClock.uptimeMillis() - j5 <= 20) {
            return false;
        }
        return true;
    }

    public boolean canReStartAsyncTask() {
        return getStatus() != -3 && this.asyncHandleStatus == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING;
    }

    public boolean canReplaceHttpForRetry() {
        return !TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && !this.httpsToHttpRetryUsed;
    }

    public boolean canShowNotification() {
        boolean z4 = this.autoResumed;
        return (!z4 && this.showNotification) || (z4 && (this.showNotificationForAutoResumed || this.showNotificationForNetworkResumed));
    }

    public boolean canSkipStatusHandler() {
        com.ss.android.socialbase.downloader.constants.a aVar;
        int status = getStatus();
        if (status != 7 && this.retryDelayStatus != g.DELAY_RETRY_WAITING && status != 8 && (aVar = this.asyncHandleStatus) != com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING && aVar != com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_RESTART && this.byteInvalidRetryStatus != com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_RESTART) {
            return false;
        }
        return true;
    }

    public boolean canStartRetryDelayTask() {
        return isNeedRetryDelay() && getStatus() != -3 && this.retryDelayStatus == g.DELAY_RETRY_WAITING;
    }

    public void changeSkipStatus() {
        com.ss.android.socialbase.downloader.constants.a aVar;
        int status = getStatus();
        if (status == 7 || this.retryDelayStatus == g.DELAY_RETRY_WAITING) {
            setRetryDelayStatus(g.DELAY_RETRY_DOWNLOADING);
        }
        if (status == 8 || (aVar = this.asyncHandleStatus) == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_WAITING || aVar == com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_RESTART) {
            setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_DOWNLOADING);
        }
        if (this.byteInvalidRetryStatus == com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_RESTART) {
            setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING);
        }
    }

    public int checkMd5Status() {
        return f.b(getSavePath(), getName(), this.md5);
    }

    public boolean checkMd5Valid() {
        return f.c(getSavePath(), getName(), this.md5);
    }

    public void clearSpData() {
        Context O = com.ss.android.socialbase.downloader.downloader.c.O();
        if (O != null) {
            try {
                O.getSharedPreferences("sp_download_info", 0).edit().remove(Integer.toString(getId())).apply();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void copyFromCacheData(DownloadInfo downloadInfo, boolean z4) {
        if (downloadInfo == null) {
            return;
        }
        setChunkCount(downloadInfo.getChunkCount());
        setTotalBytes(downloadInfo.getTotalBytes());
        setCurBytes(downloadInfo.getCurBytes(), true);
        this.realDownloadTime = downloadInfo.realDownloadTime;
        if (!downloadInfo.canSkipStatusHandler() && !canSkipStatusHandler()) {
            this.curRetryTime = 0;
            this.isForbiddenRetryed = false;
            this.backUpUrlUsed = false;
            this.curBackUpUrlIndex = 0;
            this.httpsToHttpRetryUsed = false;
        } else {
            this.curRetryTime = downloadInfo.getCurRetryTime();
        }
        seteTag(downloadInfo.geteTag());
        if (z4) {
            setStatus(downloadInfo.getStatus());
        }
        this.isFirstDownload = downloadInfo.getIsFirstDownload();
        this.isFirstSuccess = downloadInfo.isFirstSuccess();
        this.retryDelayStatus = downloadInfo.getRetryDelayStatus();
        mergeAuxiliaryJSONObject(downloadInfo.dbJsonData);
    }

    public void copyTaskIdFromCacheData(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        this.taskId = downloadInfo.getTaskId();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equalsTask(DownloadInfo downloadInfo) {
        String str;
        String str2;
        return (downloadInfo == null || (str = this.url) == null || !str.equals(downloadInfo.getUrl()) || (str2 = this.savePath) == null || !str2.equals(downloadInfo.getSavePath())) ? false : true;
    }

    public void erase() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
        this.curRetryTime = 0;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.backUpUrlUsed = false;
        this.httpsToHttpRetryUsed = false;
        this.eTag = null;
        this.failedException = null;
        this.tempCacheData = null;
        this.packageInfoRef = null;
    }

    public void generateTaskId() {
        this.taskId = UUID.randomUUID().toString();
    }

    public long getAllConnectTime() {
        ensureDBJsonData();
        if (this.allConnectTime == null) {
            this.allConnectTime = new AtomicLong(this.dbJsonData.optLong("dbjson_key_all_connect_time"));
        }
        return this.allConnectTime.get();
    }

    public int getAntiHijackErrorCode(int i5) {
        ensureDBJsonData();
        return this.dbJsonData.optInt("anti_hijack_error_code", i5);
    }

    public int getAppVersionCode() {
        return this.appVersionCode;
    }

    public com.ss.android.socialbase.downloader.constants.a getAsyncHandleStatus() {
        return this.asyncHandleStatus;
    }

    public String getBackUpUrl() {
        List<String> list;
        int i5;
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i5 = this.curBackUpUrlIndex) >= 0 && i5 < this.backUpUrls.size()) {
            String str = this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "";
    }

    public int getBackUpUrlRetryCount() {
        return this.backUpUrlRetryCount;
    }

    public List<String> getBackUpUrls() {
        return this.backUpUrls;
    }

    public int getBindValueCount() {
        return this.bindValueCount;
    }

    public com.ss.android.socialbase.downloader.constants.b getByteInvalidRetryStatus() {
        return this.byteInvalidRetryStatus;
    }

    public String getCacheControl() {
        ensureSpData();
        try {
            return this.spData.optString(Headers.CACHE_CONTROL, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getCacheExpiredTime() {
        ensureSpData();
        try {
            return this.spData.optLong("cache-control/expired_time", -1L);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public int getChunkCount() {
        return this.chunkCount;
    }

    public String getConnectionUrl() {
        List<String> list;
        int i5;
        List<String> list2;
        String str = this.url;
        if (getStatus() == 8 && (list2 = this.forbiddenBackupUrls) != null && !list2.isEmpty() && !this.backUpUrlUsed) {
            return this.forbiddenBackupUrls.get(0);
        }
        if (this.backUpUrlUsed && (list = this.backUpUrls) != null && list.size() > 0 && (i5 = this.curBackUpUrlIndex) >= 0 && i5 < this.backUpUrls.size()) {
            String str2 = this.backUpUrls.get(this.curBackUpUrlIndex);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return str;
        }
        if (!TextUtils.isEmpty(this.url) && this.url.startsWith("https") && this.needHttpsToHttpRetry && this.httpsToHttpRetryUsed) {
            return this.url.replaceFirst("https", "http");
        }
        return str;
    }

    public int getCurBackUpUrlIndex() {
        return this.curBackUpUrlIndex;
    }

    public long getCurBytes() {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public int getCurRetryTime() {
        return this.curRetryTime;
    }

    public int getCurRetryTimeInTotal() {
        int i5 = this.curRetryTime;
        if (this.backUpUrlUsed) {
            int i6 = i5 + this.retryCount;
            int i7 = this.curBackUpUrlIndex;
            if (i7 > 0) {
                return i6 + (i7 * this.backUpUrlRetryCount);
            }
            return i6;
        }
        return i5;
    }

    public int getDBJsonInt(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optInt(str);
    }

    public String getDBJsonString(String str) {
        ensureDBJsonData();
        return this.dbJsonData.optString(str);
    }

    public long getDownloadPrepareTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_download_prepare_time");
    }

    public int getDownloadProcess() {
        if (this.totalBytes <= 0) {
            return 0;
        }
        if (getCurBytes() > this.totalBytes) {
            return 100;
        }
        return (int) ((getCurBytes() * 100) / this.totalBytes);
    }

    public String getDownloadSettingString() {
        ensureDBJsonData();
        return this.dbJsonData.optString("download_setting");
    }

    public double getDownloadSpeed() {
        double curBytes = getCurBytes() / 1048576.0d;
        double realDownloadTime = getRealDownloadTime() / 1000.0d;
        if (curBytes > 0.0d && realDownloadTime > 0.0d) {
            return curBytes / realDownloadTime;
        }
        return -1.0d;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public EnqueueType getEnqueueType() {
        return this.enqueueType;
    }

    public String getErrorBytesLog() {
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer != null && stringBuffer.length() != 0) {
            return this.errorBytesLog.toString();
        }
        return "";
    }

    public int getExecutorGroup() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("executor_group", 2);
    }

    public long getExpectFileLength() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_expect_file_length");
    }

    public String getExtra() {
        return this.extra;
    }

    public List<c> getExtraHeaders() {
        return this.extraHeaders;
    }

    public int[] getExtraMonitorStatus() {
        return this.extraMonitorStatus;
    }

    public BaseException getFailedException() {
        return this.failedException;
    }

    public int getFailedResumeCount() {
        ensureSpData();
        return this.spData.optInt("failed_resume_count", 0);
    }

    public String getFilePackageName() {
        return this.filePackageName;
    }

    public long getFirstSpeedTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_key_first_speed_time");
    }

    public List<String> getForbiddenBackupUrls() {
        return this.forbiddenBackupUrls;
    }

    public String getHeadConnectionException() {
        return this.headConnectionException;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public String getHttpStatusMessage() {
        return this.httpStatusMessage;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getId() {
        if (this.id == 0) {
            this.id = com.ss.android.socialbase.downloader.downloader.c.a(this);
        }
        return this.id;
    }

    public boolean getIsFirstDownload() {
        return this.isFirstDownload;
    }

    public long getLastDownloadTime() {
        ensureDBJsonData();
        return this.dbJsonData.optLong("dbjson_last_start_download_time", 0L);
    }

    public long getLastFailedResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_failed_resume_time", 0L);
    }

    public String getLastModified() {
        ensureSpData();
        try {
            return this.spData.optString(Headers.LAST_MODIFIED, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public long getLastUninstallResumeTime() {
        ensureSpData();
        return this.spData.optLong("last_unins_resume_time", 0L);
    }

    public int getLinkMode() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("link_mode");
    }

    public int getMaxBytes() {
        return this.maxBytes;
    }

    public int getMaxProgressCount() {
        return this.maxProgressCount;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public long getMinByteIntervalForPostToMainThread(long j5) {
        int i5 = this.maxProgressCount;
        if (i5 <= 0) {
            i5 = 100;
        }
        long j6 = j5 / (i5 + 1);
        if (j6 <= 0) {
            return 1048576L;
        }
        return j6;
    }

    public int getMinProgressTimeMsInterval() {
        int i5 = this.minProgressTimeMsInterval;
        if (i5 < 1000) {
            return 1000;
        }
        return i5;
    }

    public String getMonitorScene() {
        return this.monitorScene;
    }

    public String getName() {
        return this.name;
    }

    public String getNetworkQuality() {
        return this.networkQuality;
    }

    public int getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public boolean getOpenLimitSpeed() {
        return this.openLimitSpeed;
    }

    public String[] getOutIp() {
        return this.outIp;
    }

    public int[] getOutSize() {
        return this.outSize;
    }

    public PackageInfo getPackageInfo() {
        SoftReference<PackageInfo> softReference = this.packageInfoRef;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPausedResumeCount() {
        ensureSpData();
        return this.spData.optInt("paused_resume_count", 0);
    }

    public int getPreconnectLevel() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("dbjson_key_preconnect_level", 0);
    }

    public long getRealDownloadTime() {
        return TimeUnit.NANOSECONDS.toMillis(this.realDownloadTime);
    }

    public int getRealStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return 0;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public g getRetryDelayStatus() {
        return this.retryDelayStatus;
    }

    public String getRetryDelayTimeArray() {
        return this.retryDelayTimeArray;
    }

    public int getRetryScheduleCount() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("retry_schedule_count", 0);
    }

    public String getSavePath() {
        return this.savePath;
    }

    public int getSpIntVal(String str) {
        ensureSpData();
        return this.spData.optInt(str, 0);
    }

    public long getSpLongVal(String str) {
        ensureSpData();
        return this.spData.optLong(str, 0L);
    }

    public String getSpStringVal(String str) {
        ensureSpData();
        return this.spData.optString(str, null);
    }

    public int getStatus() {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            int i5 = atomicInteger.get();
            if (i5 == -5) {
                return -2;
            }
            return i5;
        }
        return 0;
    }

    public int getStatusAtDbInit() {
        return this.statusAtDbInit;
    }

    public int getTTMd5CheckStatus() {
        ensureDBJsonData();
        return this.dbJsonData.optInt("ttmd5_check_status", -1);
    }

    public String getTargetFilePath() {
        return f.a(this.savePath, this.name);
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getTaskKey() {
        ensureDBJsonData();
        return this.dbJsonData.optString("task_key");
    }

    public ConcurrentHashMap<String, Object> getTempCacheData() {
        ensureTempCacheData();
        return this.tempCacheData;
    }

    public String getTempFilePath() {
        return f.a(this.savePath, this.tempPath, this.name);
    }

    public String getTempName() {
        return f.c(this.name);
    }

    public String getTempPath() {
        return f.b(this.savePath, this.tempPath);
    }

    public long getThrottleNetSpeed() {
        return this.throttleNetSpeed;
    }

    public String getTitle() {
        if (TextUtils.isEmpty(this.title)) {
            return this.name;
        }
        return this.title;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int getTotalRetryCount() {
        int i5 = this.retryCount;
        List<String> list = this.backUpUrls;
        if (list != null && !list.isEmpty()) {
            return i5 + (this.backUpUrlRetryCount * this.backUpUrls.size());
        }
        return i5;
    }

    public long getTtnetProtectTimeout() {
        return this.ttnetProtectTimeout;
    }

    public int getUninstallResumeCount() {
        ensureSpData();
        return this.spData.optInt("unins_resume_count", 0);
    }

    public String getUrl() {
        return this.url;
    }

    public String geteTag() {
        return this.eTag;
    }

    public synchronized void handleTempSaveCallback(boolean z4, BaseException baseException) {
        this.isSaveTempFile = false;
        if (this.tempFileSaveCompleteCallbacks == null) {
            return;
        }
        com.ss.android.socialbase.downloader.c.a.b(TAG, "handleTempSaveCallback isSuccess " + z4 + " callback size:" + this.tempFileSaveCompleteCallbacks.size());
        for (ai aiVar : this.tempFileSaveCompleteCallbacks) {
            if (aiVar != null) {
                if (z4) {
                    aiVar.a();
                } else {
                    aiVar.a(baseException);
                }
            }
        }
    }

    public boolean hasNextBackupUrl() {
        List<String> list = this.backUpUrls;
        if (list != null && list.size() > 0) {
            if (!this.backUpUrlUsed) {
                return true;
            }
            int i5 = this.curBackUpUrlIndex;
            if (i5 >= 0 && i5 < this.backUpUrls.size() - 1) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPauseReservedOnWifi() {
        return (getReserveWifiStatus() & 1) > 0;
    }

    public void increaseAllConnectTime(long j5) {
        if (j5 > 0) {
            getAllConnectTime();
            safePutToDBJsonData("dbjson_key_all_connect_time", Long.valueOf(this.allConnectTime.addAndGet(j5)));
        }
    }

    public void increaseCurBytes(long j5) {
        this.curBytes.addAndGet(j5);
    }

    public void increaseDownloadPrepareTime(long j5) {
        if (j5 > 0) {
            safePutToDBJsonData("dbjson_key_download_prepare_time", Long.valueOf(getDownloadPrepareTime() + j5));
        }
    }

    public boolean isAddListenerToSameTask() {
        return this.addListenerToSameTask;
    }

    public boolean isAutoInstall() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("auto_install", 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean isAutoInstallWithoutNotification() {
        if (this.isAutoInstallWithoutNotification == null) {
            if (!TextUtils.isEmpty(this.extra)) {
                try {
                    this.isAutoInstallWithoutNotification = Boolean.valueOf(new JSONObject(this.extra).optBoolean("auto_install_without_notification", false));
                } catch (JSONException unused) {
                    this.isAutoInstallWithoutNotification = Boolean.FALSE;
                }
            } else {
                this.isAutoInstallWithoutNotification = Boolean.FALSE;
            }
        }
        return this.isAutoInstallWithoutNotification.booleanValue();
    }

    public boolean isAutoResumed() {
        return this.autoResumed;
    }

    public boolean isBackUpUrlUsed() {
        return this.backUpUrlUsed;
    }

    public boolean isBreakpointAvailable() {
        if (!isFileDataValid()) {
            return false;
        }
        return isChunkBreakpointAvailable();
    }

    public boolean isCanResumeFromBreakPointStatus() {
        int status = getStatus();
        if (status == 4 || status == 3 || status == -1 || status == 5 || status == 8) {
            return true;
        }
        if ((status == 1 || status == 2) && getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    public boolean isChunkBreakpointAvailable() {
        j y4;
        if (this.chunkCount > 1 && (y4 = com.ss.android.socialbase.downloader.downloader.c.y()) != null) {
            List<b> c5 = y4.c(getId());
            if (c5 != null && c5.size() == this.chunkCount) {
                long j5 = 0;
                for (b bVar : c5) {
                    if (bVar != null) {
                        j5 += bVar.o();
                    }
                }
                if (j5 != getCurBytes()) {
                    setCurBytes(j5);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isChunkDowngradeRetryUsed() {
        return this.chunkDowngradeRetryUsed;
    }

    public boolean isChunked() {
        return f.b(this.totalBytes);
    }

    public boolean isDeleteCacheIfCheckFailed() {
        return this.deleteCacheIfCheckFailed;
    }

    public boolean isDownloadFromReserveWifi() {
        return this.mDownloadFromReserveWifi;
    }

    public boolean isDownloadOverStatus() {
        return DownloadStatus.isDownloadOver(getStatus());
    }

    public boolean isDownloadWithWifiValid() {
        return !isOnlyWifi() || f.b(com.ss.android.socialbase.downloader.downloader.c.O());
    }

    public boolean isDownloaded() {
        return f.c(this);
    }

    public boolean isDownloadingStatus() {
        return DownloadStatus.isDownloading(getStatus());
    }

    public boolean isEntityInvalid() {
        return TextUtils.isEmpty(this.url) || TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.savePath);
    }

    public boolean isExpiredRedownload() {
        if (com.ss.android.socialbase.downloader.g.a.c().a("force_close_download_cache_check", 0) == 1) {
            com.ss.android.socialbase.downloader.c.a.c("isExpiredRedownload force to false, reason(global setting) id=" + getId() + " name=" + getName());
            return false;
        }
        return this.expiredRedownload;
    }

    public boolean isFileDataExists() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (!exists || isDirectory) {
            return false;
        }
        return true;
    }

    public boolean isFileDataValid() {
        if (isEntityInvalid()) {
            return false;
        }
        File file = new File(getTempPath(), getTempName());
        boolean exists = file.exists();
        boolean isDirectory = file.isDirectory();
        if (exists && !isDirectory) {
            long length = file.length();
            long curBytes = getCurBytes();
            if (com.ss.android.socialbase.downloader.g.a.c().a("fix_file_data_valid")) {
                if (curBytes > 0) {
                    long j5 = this.totalBytes;
                    if (j5 > 0 && this.chunkCount > 0 && length >= curBytes && length <= j5) {
                        return true;
                    }
                }
                com.ss.android.socialbase.downloader.c.a.d(TAG, "isFileDataValid: cur = " + curBytes + ",totalBytes =" + this.totalBytes + ",fileLength=" + length);
                return false;
            }
            if (length > 0 && curBytes > 0) {
                long j6 = this.totalBytes;
                if (j6 > 0 && this.chunkCount > 0 && length >= curBytes && length <= j6 && curBytes < j6) {
                    return true;
                }
            }
            com.ss.android.socialbase.downloader.c.a.d(TAG, "isFileDataValid: cur = " + curBytes + ",totalBytes =" + this.totalBytes + ",fileLength=" + length);
        }
        return false;
    }

    public boolean isFirstDownload() {
        if (!this.isFirstDownload || TextUtils.isEmpty(getTempPath()) || TextUtils.isEmpty(getTempName())) {
            return false;
        }
        return !new File(getTempPath(), getTempName()).exists();
    }

    public boolean isFirstSuccess() {
        return this.isFirstSuccess;
    }

    public boolean isForbiddenRetryed() {
        return this.isForbiddenRetryed;
    }

    public boolean isForce() {
        return this.force;
    }

    public boolean isForceIgnoreRecommendSize() {
        return this.forceIgnoreRecommendSize;
    }

    public boolean isHeadConnectionAvailable() {
        return this.headConnectionAvailable;
    }

    public boolean isHttpsToHttpRetryUsed() {
        return this.httpsToHttpRetryUsed;
    }

    public boolean isIgnoreDataVerify() {
        return this.ignoreDataVerify;
    }

    public boolean isNeedChunkDowngradeRetry() {
        return this.needChunkDowngradeRetry;
    }

    public boolean isNeedDefaultHttpServiceBackUp() {
        return this.needDefaultHttpServiceBackUp;
    }

    public boolean isNeedHttpsToHttpRetry() {
        return this.needHttpsToHttpRetry;
    }

    public boolean isNeedIndependentProcess() {
        return this.needIndependentProcess;
    }

    public boolean isNeedPostProgress() {
        return this.needPostProgress;
    }

    public boolean isNeedRetryDelay() {
        return false;
    }

    public boolean isNeedReuseChunkRunnable() {
        return this.needReuseChunkRunnable;
    }

    public boolean isNeedReuseFirstConnection() {
        return this.needReuseFirstConnection;
    }

    public boolean isNeedSDKMonitor() {
        return this.needSDKMonitor;
    }

    public boolean isNewTask() {
        return getStatus() == 0;
    }

    public boolean isOnlyWifi() {
        return this.onlyWifi;
    }

    public boolean isPauseReserveOnWifi() {
        return (getReserveWifiStatus() & 2) > 0;
    }

    public boolean isPauseReserveWithWifiValid() {
        if (!this.mDownloadFromReserveWifi) {
            return true;
        }
        if (isPauseReserveOnWifi() && f.b(com.ss.android.socialbase.downloader.downloader.c.O())) {
            return true;
        }
        return false;
    }

    public boolean isRwConcurrent() {
        ensureDBJsonData();
        if (this.dbJsonData.optInt("rw_concurrent", 0) != 1) {
            return false;
        }
        return true;
    }

    public boolean isSavePathRedirected() {
        ensureDBJsonData();
        return this.dbJsonData.optBoolean("is_save_path_redirected", false);
    }

    public synchronized boolean isSaveTempFile() {
        return this.isSaveTempFile;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public boolean isShowNotificationForAutoResumed() {
        return this.showNotificationForAutoResumed;
    }

    public boolean isShowNotificationForNetworkResumed() {
        return this.showNotificationForNetworkResumed;
    }

    public boolean isSuccessByCache() {
        return this.successByCache;
    }

    public boolean isSupportPartial() {
        return this.supportPartial;
    }

    public boolean isWaitingWifiStatus() {
        BaseException baseException = this.failedException;
        return baseException != null && baseException.getErrorCode() == 1013;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.title = parcel.readString();
        this.url = parcel.readString();
        this.savePath = parcel.readString();
        this.tempPath = parcel.readString();
        boolean z29 = true;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.onlyWifi = z4;
        this.extra = parcel.readString();
        this.extraHeaders = parcel.createTypedArrayList(c.CREATOR);
        this.maxBytes = parcel.readInt();
        this.outIp = parcel.createStringArray();
        this.outSize = parcel.createIntArray();
        this.retryCount = parcel.readInt();
        this.backUpUrlRetryCount = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.force = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.needPostProgress = z6;
        this.maxProgressCount = parcel.readInt();
        this.minProgressTimeMsInterval = parcel.readInt();
        this.backUpUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.showNotification = z7;
        this.mimeType = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.needHttpsToHttpRetry = z8;
        this.packageName = parcel.readString();
        this.md5 = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.needRetryDelay = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.needDefaultHttpServiceBackUp = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.needReuseChunkRunnable = z11;
        this.retryDelayTimeArray = parcel.readString();
        this.eTag = parcel.readString();
        this.curRetryTime = parcel.readInt();
        convertRetryDelayStatus(parcel.readInt());
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.needReuseFirstConnection = z12;
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.forceIgnoreRecommendSize = z13;
        this.networkQuality = parcel.readString();
        this.curBackUpUrlIndex = parcel.readInt();
        this.notificationVisibility = parcel.readInt();
        this.chunkCount = parcel.readInt();
        setCurBytes(parcel.readLong());
        this.totalBytes = parcel.readLong();
        setStatus(parcel.readInt());
        this.downloadTime = parcel.readLong();
        this.realDownloadTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.backUpUrlUsed = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.httpsToHttpRetryUsed = z15;
        try {
            StringBuffer stringBuffer = this.errorBytesLog;
            if (stringBuffer == null) {
                this.errorBytesLog = new StringBuffer(parcel.readString());
            } else {
                stringBuffer.delete(0, stringBuffer.length()).append(parcel.readString());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.autoResumed = z16;
        if (parcel.readByte() != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.showNotificationForAutoResumed = z17;
        if (parcel.readByte() != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.showNotificationForNetworkResumed = z18;
        this.forbiddenBackupUrls = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.needIndependentProcess = z19;
        convertEnqueueType(parcel.readInt());
        if (parcel.readByte() != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        this.headConnectionAvailable = z20;
        this.httpStatusCode = parcel.readInt();
        this.httpStatusMessage = parcel.readString();
        if (parcel.readByte() != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        this.isSaveTempFile = z21;
        if (parcel.readByte() != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        this.isForbiddenRetryed = z22;
        if (parcel.readByte() != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        this.addListenerToSameTask = z23;
        if (parcel.readByte() != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        this.needChunkDowngradeRetry = z24;
        if (parcel.readByte() != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        this.chunkDowngradeRetryUsed = z25;
        this.failedException = (BaseException) parcel.readParcelable(BaseException.class.getClassLoader());
        this.retryScheduleMinutes = parcel.readInt();
        this.dbJsonDataString = parcel.readString();
        if (parcel.readByte() != 0) {
            z26 = true;
        } else {
            z26 = false;
        }
        this.supportPartial = z26;
        this.iconUrl = parcel.readString();
        this.appVersionCode = parcel.readInt();
        this.taskId = parcel.readString();
        if (parcel.readByte() != 0) {
            z27 = true;
        } else {
            z27 = false;
        }
        this.expiredRedownload = z27;
        if (parcel.readByte() != 0) {
            z28 = true;
        } else {
            z28 = false;
        }
        this.deleteCacheIfCheckFailed = z28;
        if (parcel.readByte() == 0) {
            z29 = false;
        }
        this.successByCache = z29;
        parseMonitorSetting();
    }

    public synchronized void registerTempFileSaveCallback(ai aiVar) {
        if (aiVar == null) {
            return;
        }
        try {
            com.ss.android.socialbase.downloader.c.a.b(TAG, "registerTempFileSaveCallback");
            if (this.tempFileSaveCompleteCallbacks == null) {
                this.tempFileSaveCompleteCallbacks = new ArrayList();
            }
            if (!this.tempFileSaveCompleteCallbacks.contains(aiVar)) {
                this.tempFileSaveCompleteCallbacks.add(aiVar);
            }
        } finally {
        }
    }

    public void reset() {
        setCurBytes(0L, true);
        this.totalBytes = 0L;
        this.chunkCount = 1;
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void resetDataForEtagEndure(String str) {
        setCurBytes(0L, true);
        setTotalBytes(0L);
        seteTag(str);
        setChunkCount(1);
        this.downloadTime = 0L;
        this.realStartDownloadTime = 0L;
        this.realDownloadTime = 0L;
    }

    public void resetRealStartDownloadTime() {
        this.realStartDownloadTime = 0L;
    }

    public void safePutToDBJsonData(String str, Object obj) {
        ensureDBJsonData();
        synchronized (this.dbJsonData) {
            try {
                this.dbJsonData.put(str, obj);
            } catch (Exception unused) {
            }
            this.dbJsonDataString = null;
        }
    }

    public void setAddListenerToSameTask(boolean z4) {
        this.addListenerToSameTask = z4;
    }

    public void setAntiHijackErrorCode(int i5) {
        safePutToDBJsonData("anti_hijack_error_code", Integer.valueOf(i5));
    }

    public void setAppVersionCode(int i5) {
        this.appVersionCode = i5;
    }

    public void setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a aVar) {
        this.asyncHandleStatus = aVar;
    }

    public void setAutoResumed(boolean z4) {
        this.autoResumed = z4;
    }

    public void setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b bVar) {
        this.byteInvalidRetryStatus = bVar;
    }

    public void setCacheControl(String str) {
        ensureSpData();
        try {
            this.spData.put(Headers.CACHE_CONTROL, str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setCacheExpiredTime(long j5) {
        ensureSpData();
        try {
            this.spData.put("cache-control/expired_time", j5);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setChunkCount(int i5) {
        this.chunkCount = i5;
    }

    public void setChunkDowngradeRetryUsed(boolean z4) {
        this.chunkDowngradeRetryUsed = z4;
    }

    public void setCurBytes(long j5) {
        AtomicLong atomicLong = this.curBytes;
        if (atomicLong != null) {
            atomicLong.set(j5);
        } else {
            this.curBytes = new AtomicLong(j5);
        }
    }

    public void setDeleteCacheIfCheckFailed() {
        this.deleteCacheIfCheckFailed = true;
    }

    public void setDownloadFromReserveWifi(boolean z4) {
        this.mDownloadFromReserveWifi = z4;
    }

    public void setDownloadTime(long j5) {
        if (j5 >= 0) {
            this.downloadTime = j5;
        }
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFailedException(BaseException baseException) {
        this.failedException = baseException;
    }

    public void setFailedResumeCount(int i5) {
        ensureSpData();
        try {
            this.spData.put("failed_resume_count", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setFilePackageName(String str) {
        this.filePackageName = str;
    }

    public void setFirstDownload(boolean z4) {
        this.isFirstDownload = z4;
    }

    public void setFirstSpeedTime(long j5) {
        safePutToDBJsonData("dbjson_key_first_speed_time", Long.valueOf(j5));
    }

    public void setFirstSuccess(boolean z4) {
        this.isFirstSuccess = z4;
    }

    public void setForbiddenBackupUrls(List<String> list, boolean z4) {
        this.forbiddenBackupUrls = list;
        refreshBackupUrls(z4);
    }

    public void setForbiddenRetryed() {
        this.isForbiddenRetryed = true;
    }

    public void setForceIgnoreRecommendSize(boolean z4) {
        this.forceIgnoreRecommendSize = z4;
    }

    public void setHeadConnectionException(String str) {
        this.headConnectionException = str;
    }

    public void setHttpStatusCode(int i5) {
        this.httpStatusCode = i5;
    }

    public void setHttpStatusMessage(String str) {
        this.httpStatusMessage = str;
    }

    public void setHttpsToHttpRetryUsed(boolean z4) {
        this.httpsToHttpRetryUsed = z4;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setIsRwConcurrent(boolean z4) {
        safePutToDBJsonData("rw_concurrent", Integer.valueOf(z4 ? 1 : 0));
    }

    public synchronized void setIsSaveTempFile(boolean z4) {
        this.isSaveTempFile = z4;
    }

    public void setLastFailedResumeTime(long j5) {
        ensureSpData();
        try {
            this.spData.put("last_failed_resume_time", j5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setLastModified(String str) {
        ensureSpData();
        try {
            this.spData.put(Headers.LAST_MODIFIED, str);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public void setLastNotifyProgressTime() {
        this.lastNotifyProgressTime.set(SystemClock.uptimeMillis());
    }

    public void setLastUninstallResumeTime(long j5) {
        ensureSpData();
        try {
            this.spData.put("last_unins_resume_time", j5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setLinkMode(int i5) {
        safePutToDBJsonData("link_mode", Integer.valueOf(i5));
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNetworkQuality(String str) {
        this.networkQuality = str;
    }

    public void setNotificationVisibility(int i5) {
        this.notificationVisibility = i5;
    }

    public void setOnlyWifi(boolean z4) {
        this.onlyWifi = z4;
    }

    public void setOpenLimitSpeed(boolean z4) {
        this.openLimitSpeed = z4;
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfoRef = new SoftReference<>(packageInfo);
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPausedResumeCount(int i5) {
        ensureSpData();
        try {
            this.spData.put("paused_resume_count", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setPreconnectLevel(int i5) {
        ensureDBJsonData();
        safePutToDBJsonData("dbjson_key_preconnect_level", Integer.valueOf(i5));
    }

    public void setRetryDelayStatus(g gVar) {
        this.retryDelayStatus = gVar;
    }

    public void setRetryScheduleCount(int i5) {
        safePutToDBJsonData("retry_schedule_count", Integer.valueOf(i5));
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    public void setSavePathRedirected(boolean z4) {
        safePutToDBJsonData("is_save_path_redirected", Boolean.valueOf(z4));
    }

    public void setShowNotification(boolean z4) {
        this.showNotification = z4;
    }

    public void setShowNotificationForAutoResumed(boolean z4) {
        this.showNotificationForAutoResumed = z4;
    }

    public void setShowNotificationForNetworkResumed(boolean z4) {
        this.showNotificationForNetworkResumed = z4;
    }

    public void setSpValue(String str, String str2) {
        ensureSpData();
        try {
            this.spData.put(str, str2);
            updateSpData();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setStatus(int i5) {
        AtomicInteger atomicInteger = this.status;
        if (atomicInteger != null) {
            atomicInteger.set(i5);
        } else {
            this.status = new AtomicInteger(i5);
        }
    }

    public void setStatusAtDbInit(int i5) {
        this.statusAtDbInit = i5;
    }

    public void setSuccessByCache(boolean z4) {
        this.successByCache = z4;
    }

    public void setSupportPartial(boolean z4) {
        this.supportPartial = z4;
    }

    public void setTTMd5CheckStatus(int i5) {
        safePutToDBJsonData("ttmd5_check_status", Integer.valueOf(i5));
    }

    public void setThrottleNetSpeed(long j5) {
        this.throttleNetSpeed = j5;
    }

    public void setTotalBytes(long j5) {
        this.totalBytes = j5;
    }

    public void setUninstallResumeCount(int i5) {
        ensureSpData();
        try {
            this.spData.put("unins_resume_count", i5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void seteTag(String str) {
        this.eTag = str;
    }

    public void startPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 3);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public boolean statusInPause() {
        if (getRealStatus() != -2 && getRealStatus() != -5) {
            return false;
        }
        return true;
    }

    public void stopPauseReserveOnWifi() {
        ensureSpData();
        try {
            this.spData.put("pause_reserve_on_wifi", 1);
            updateSpData();
        } catch (Exception unused) {
        }
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(bm.f12336d, Integer.valueOf(this.id));
        contentValues.put("url", this.url);
        contentValues.put("savePath", this.savePath);
        contentValues.put("tempPath", this.tempPath);
        contentValues.put("name", this.name);
        contentValues.put("chunkCount", Integer.valueOf(this.chunkCount));
        contentValues.put("status", Integer.valueOf(getStatus()));
        contentValues.put("curBytes", Long.valueOf(getCurBytes()));
        contentValues.put("totalBytes", Long.valueOf(this.totalBytes));
        contentValues.put("eTag", this.eTag);
        contentValues.put("onlyWifi", Integer.valueOf(this.onlyWifi ? 1 : 0));
        contentValues.put(TTDownloadField.TT_FORCE, Integer.valueOf(this.force ? 1 : 0));
        contentValues.put("retryCount", Integer.valueOf(this.retryCount));
        contentValues.put("extra", this.extra);
        contentValues.put(TTDownloadField.TT_MIME_TYPE, this.mimeType);
        contentValues.put(com.alipay.sdk.m.x.d.f3030v, this.title);
        contentValues.put("notificationEnable", Integer.valueOf(this.showNotification ? 1 : 0));
        contentValues.put("notificationVisibility", Integer.valueOf(this.notificationVisibility));
        contentValues.put("isFirstDownload", Integer.valueOf(this.isFirstDownload ? 1 : 0));
        contentValues.put("isFirstSuccess", Integer.valueOf(this.isFirstSuccess ? 1 : 0));
        contentValues.put("needHttpsToHttpRetry", Integer.valueOf(this.needHttpsToHttpRetry ? 1 : 0));
        contentValues.put("downloadTime", Long.valueOf(this.downloadTime));
        contentValues.put(TTDownloadField.TT_PACKAGE_NAME, this.packageName);
        contentValues.put(TTDownloadField.TT_MD5, this.md5);
        contentValues.put("retryDelay", Integer.valueOf(this.needRetryDelay ? 1 : 0));
        contentValues.put("curRetryTime", Integer.valueOf(this.curRetryTime));
        contentValues.put("retryDelayStatus", Integer.valueOf(this.retryDelayStatus.ordinal()));
        contentValues.put("defaultHttpServiceBackUp", Integer.valueOf(this.needDefaultHttpServiceBackUp ? 1 : 0));
        contentValues.put("chunkRunnableReuse", Integer.valueOf(this.needReuseChunkRunnable ? 1 : 0));
        contentValues.put("retryDelayTimeArray", this.retryDelayTimeArray);
        contentValues.put("chunkDowngradeRetry", Integer.valueOf(this.needChunkDowngradeRetry ? 1 : 0));
        contentValues.put("backUpUrlsStr", getBackUpUrlsStr());
        contentValues.put("backUpUrlRetryCount", Integer.valueOf(this.backUpUrlRetryCount));
        contentValues.put("realDownloadTime", Long.valueOf(this.realDownloadTime));
        contentValues.put("retryScheduleMinutes", Integer.valueOf(this.retryScheduleMinutes));
        contentValues.put("independentProcess", Integer.valueOf(this.needIndependentProcess ? 1 : 0));
        contentValues.put("auxiliaryJsonobjectString", getDBJsonDataString());
        contentValues.put("iconUrl", this.iconUrl);
        contentValues.put("appVersionCode", Integer.valueOf(this.appVersionCode));
        contentValues.put("taskId", this.taskId);
        return contentValues;
    }

    public String toString() {
        return "DownloadInfo{id=" + this.id + ", name='" + this.name + "', title='" + this.title + "', url='" + this.url + "', savePath='" + this.savePath + "'}";
    }

    public boolean trySwitchToNextBackupUrl() {
        if (this.backUpUrlUsed) {
            this.curBackUpUrlIndex++;
        }
        List<String> list = this.backUpUrls;
        if (list != null && list.size() != 0 && this.curBackUpUrlIndex >= 0) {
            while (this.curBackUpUrlIndex < this.backUpUrls.size()) {
                if (!TextUtils.isEmpty(this.backUpUrls.get(this.curBackUpUrlIndex))) {
                    this.backUpUrlUsed = true;
                    return true;
                }
                this.curBackUpUrlIndex++;
            }
        }
        return false;
    }

    public void updateCurRetryTime(int i5) {
        int i6;
        if (this.backUpUrlUsed) {
            i6 = this.backUpUrlRetryCount;
        } else {
            i6 = this.retryCount;
        }
        int i7 = i6 - i5;
        this.curRetryTime = i7;
        if (i7 < 0) {
            this.curRetryTime = 0;
        }
    }

    public void updateDownloadTime() {
        if (this.startDownloadTime == 0) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.startDownloadTime;
        if (this.downloadTime < 0) {
            this.downloadTime = 0L;
        }
        if (uptimeMillis > 0) {
            this.downloadTime = uptimeMillis;
        }
    }

    public void updateRealDownloadTime(boolean z4) {
        long nanoTime = System.nanoTime();
        long j5 = this.realStartDownloadTime;
        if (j5 <= 0) {
            if (z4) {
                this.realStartDownloadTime = nanoTime;
                return;
            }
            return;
        }
        long j6 = nanoTime - j5;
        if (z4) {
            this.realStartDownloadTime = nanoTime;
        } else {
            this.realStartDownloadTime = 0L;
        }
        if (j6 > 0) {
            this.realDownloadTime += j6;
        }
    }

    public void updateRealStartDownloadTime() {
        if (this.realStartDownloadTime == 0) {
            this.realStartDownloadTime = System.nanoTime();
        }
    }

    public void updateSpData() {
        Context O;
        if (this.spData != null && (O = com.ss.android.socialbase.downloader.downloader.c.O()) != null) {
            O.getSharedPreferences("sp_download_info", 0).edit().putString(Integer.toString(getId()), this.spData.toString()).apply();
        }
    }

    public void updateStartDownloadTime() {
        this.startDownloadTime = SystemClock.uptimeMillis();
        safePutToDBJsonData("dbjson_last_start_download_time", Long.valueOf(System.currentTimeMillis()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        String str;
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.savePath);
        parcel.writeString(this.tempPath);
        parcel.writeByte(this.onlyWifi ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeTypedList(this.extraHeaders);
        parcel.writeInt(this.maxBytes);
        parcel.writeStringArray(this.outIp);
        parcel.writeIntArray(this.outSize);
        parcel.writeInt(this.retryCount);
        parcel.writeInt(this.backUpUrlRetryCount);
        parcel.writeByte(this.force ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needPostProgress ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxProgressCount);
        parcel.writeInt(this.minProgressTimeMsInterval);
        parcel.writeStringList(this.backUpUrls);
        parcel.writeByte(this.showNotification ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mimeType);
        parcel.writeByte(this.needHttpsToHttpRetry ? (byte) 1 : (byte) 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.md5);
        parcel.writeByte(this.needRetryDelay ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needDefaultHttpServiceBackUp ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needReuseChunkRunnable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.retryDelayTimeArray);
        parcel.writeString(this.eTag);
        parcel.writeInt(this.curRetryTime);
        parcel.writeInt(this.retryDelayStatus.ordinal());
        parcel.writeByte(this.needReuseFirstConnection ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.forceIgnoreRecommendSize ? (byte) 1 : (byte) 0);
        parcel.writeString(this.networkQuality);
        parcel.writeInt(this.curBackUpUrlIndex);
        parcel.writeInt(this.notificationVisibility);
        parcel.writeInt(this.chunkCount);
        parcel.writeLong(getCurBytes());
        parcel.writeLong(this.totalBytes);
        parcel.writeInt(getRealStatus());
        parcel.writeLong(this.downloadTime);
        parcel.writeLong(this.realDownloadTime);
        parcel.writeByte(this.backUpUrlUsed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.httpsToHttpRetryUsed ? (byte) 1 : (byte) 0);
        StringBuffer stringBuffer = this.errorBytesLog;
        if (stringBuffer != null) {
            str = stringBuffer.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeByte(this.autoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForAutoResumed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showNotificationForNetworkResumed ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.forbiddenBackupUrls);
        parcel.writeByte(this.needIndependentProcess ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.enqueueType.ordinal());
        parcel.writeByte(this.headConnectionAvailable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.httpStatusCode);
        parcel.writeString(this.httpStatusMessage);
        parcel.writeByte(this.isSaveTempFile ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isForbiddenRetryed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.addListenerToSameTask ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needChunkDowngradeRetry ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.chunkDowngradeRetryUsed ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.failedException, i5);
        parcel.writeInt(this.retryScheduleMinutes);
        parcel.writeString(getDBJsonDataString());
        parcel.writeByte(this.supportPartial ? (byte) 1 : (byte) 0);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.appVersionCode);
        parcel.writeString(this.taskId);
        parcel.writeByte(this.expiredRedownload ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.deleteCacheIfCheckFailed ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.successByCache ? (byte) 1 : (byte) 0);
    }

    public DownloadInfo() {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = g.DELAY_RETRY_NONE;
        this.needReuseFirstConnection = false;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
    }

    public void setCurBytes(long j5, boolean z4) {
        if (z4) {
            setCurBytes(j5);
        } else if (j5 > getCurBytes()) {
            setCurBytes(j5);
        }
    }

    private DownloadInfo(a aVar) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = g.DELAY_RETRY_NONE;
        this.needReuseFirstConnection = false;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        if (aVar == null) {
            return;
        }
        this.name = aVar.f11073a;
        this.title = aVar.f11074b;
        this.url = aVar.f11075c;
        String str = aVar.f11076d;
        if (TextUtils.isEmpty(str)) {
            try {
                str = f.e();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.savePath = str;
        String str2 = aVar.f11077e;
        this.tempPath = str2;
        if (TextUtils.isEmpty(str2) && !f.h(str)) {
            this.tempPath = f.f();
        }
        safePutToDBJsonData("task_key", aVar.Y);
        if (aVar.X) {
            if (com.ss.android.socialbase.downloader.downloader.c.y().b(getId()) == null) {
                this.savePath = f.e(this.savePath, this.url);
                this.tempPath = f.e(this.tempPath, this.url);
            }
        } else {
            com.ss.android.socialbase.downloader.c.a.e(TAG, "The distinct directory option is not set, which may cause 1005 problems and file downloads being covered");
        }
        this.status = new AtomicInteger(0);
        this.curBytes = new AtomicLong(0L);
        this.extra = aVar.f11079g;
        this.onlyWifi = aVar.f11078f;
        this.extraHeaders = aVar.f11080h;
        this.maxBytes = aVar.f11081i;
        this.retryCount = aVar.f11084l;
        this.backUpUrlRetryCount = aVar.f11085m;
        this.force = aVar.f11086n;
        this.outIp = aVar.f11082j;
        this.outSize = aVar.f11083k;
        this.needPostProgress = aVar.f11087o;
        this.maxProgressCount = aVar.f11088p;
        this.minProgressTimeMsInterval = aVar.f11089q;
        this.backUpUrls = aVar.f11090r;
        this.showNotification = aVar.f11091s;
        this.mimeType = aVar.f11093u;
        this.needHttpsToHttpRetry = aVar.f11094v;
        this.needRetryDelay = aVar.D;
        this.retryDelayTimeArray = aVar.E;
        this.autoResumed = aVar.f11095w;
        this.showNotificationForAutoResumed = aVar.f11096x;
        this.needDefaultHttpServiceBackUp = aVar.f11097y;
        this.needReuseChunkRunnable = aVar.f11098z;
        this.packageName = aVar.A;
        this.md5 = aVar.B;
        this.needReuseFirstConnection = aVar.F;
        this.needIndependentProcess = aVar.G;
        this.enqueueType = aVar.H;
        this.headConnectionAvailable = aVar.I;
        this.ignoreDataVerify = aVar.J;
        this.addListenerToSameTask = aVar.O;
        this.needChunkDowngradeRetry = aVar.K;
        this.iconUrl = aVar.L;
        this.throttleNetSpeed = aVar.M;
        this.openLimitSpeed = aVar.N;
        JSONObject jSONObject = aVar.P;
        if (jSONObject != null) {
            safePutToDBJsonData("download_setting", jSONObject.toString());
        }
        safePutToDBJsonData("dbjson_key_expect_file_length", Long.valueOf(aVar.C));
        safePutToDBJsonData("executor_group", Integer.valueOf(aVar.T));
        safePutToDBJsonData("auto_install", Integer.valueOf(aVar.f11092t ? 1 : 0));
        this.needSDKMonitor = aVar.Q;
        this.monitorScene = aVar.R;
        this.extraMonitorStatus = aVar.S;
        this.expiredRedownload = aVar.U;
        this.deleteCacheIfCheckFailed = aVar.V;
        this.ttnetProtectTimeout = aVar.W;
        this.distinctDirectory = aVar.X;
        if (this.expiredRedownload && this.retryCount <= 0) {
            this.retryCount = 1;
        }
        putMonitorSetting();
    }

    protected DownloadInfo(Parcel parcel) {
        this.needDefaultHttpServiceBackUp = true;
        this.retryDelayStatus = g.DELAY_RETRY_NONE;
        this.needReuseFirstConnection = false;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        readFromParcel(parcel);
    }

    public DownloadInfo(Cursor cursor) {
        boolean z4 = true;
        this.needDefaultHttpServiceBackUp = true;
        g gVar = g.DELAY_RETRY_NONE;
        this.retryDelayStatus = gVar;
        this.needReuseFirstConnection = false;
        this.asyncHandleStatus = com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_NONE;
        this.supportPartial = true;
        this.needSDKMonitor = true;
        this.expiredRedownload = false;
        this.deleteCacheIfCheckFailed = false;
        this.successByCache = false;
        this.chunkCount = 1;
        this.isFirstDownload = true;
        this.isFirstSuccess = true;
        this.byteInvalidRetryStatus = com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_NONE;
        this.enqueueType = EnqueueType.ENQUEUE_NONE;
        this.lastNotifyProgressTime = new AtomicLong(0L);
        this.isAutoInstallWithoutNotification = null;
        if (cursor == null) {
            return;
        }
        try {
            int columnIndex = cursor.getColumnIndex(bm.f12336d);
            if (columnIndex != -1) {
                this.id = cursor.getInt(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("name");
            if (columnIndex2 != -1) {
                this.name = cursor.getString(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex(com.alipay.sdk.m.x.d.f3030v);
            if (columnIndex3 != -1) {
                this.title = cursor.getString(columnIndex3);
            }
            int columnIndex4 = cursor.getColumnIndex("url");
            if (columnIndex4 != -1) {
                this.url = cursor.getString(columnIndex4);
            }
            int columnIndex5 = cursor.getColumnIndex("savePath");
            if (columnIndex5 != -1) {
                this.savePath = cursor.getString(columnIndex5);
            }
            int columnIndex6 = cursor.getColumnIndex("tempPath");
            if (columnIndex6 != -1) {
                this.tempPath = cursor.getString(columnIndex6);
            }
            int columnIndex7 = cursor.getColumnIndex("chunkCount");
            if (columnIndex7 != -1) {
                this.chunkCount = cursor.getInt(columnIndex7);
            }
            int columnIndex8 = cursor.getColumnIndex("status");
            if (columnIndex8 != -1) {
                this.status = new AtomicInteger(cursor.getInt(columnIndex8));
            } else {
                this.status = new AtomicInteger(0);
            }
            int columnIndex9 = cursor.getColumnIndex("curBytes");
            if (columnIndex9 != -1) {
                this.curBytes = new AtomicLong(cursor.getLong(columnIndex9));
            } else {
                this.curBytes = new AtomicLong(0L);
            }
            int columnIndex10 = cursor.getColumnIndex("totalBytes");
            if (columnIndex10 != -1) {
                this.totalBytes = cursor.getLong(columnIndex10);
            }
            int columnIndex11 = cursor.getColumnIndex("eTag");
            if (columnIndex11 != -1) {
                this.eTag = cursor.getString(columnIndex11);
            }
            int columnIndex12 = cursor.getColumnIndex("onlyWifi");
            if (columnIndex12 != -1) {
                this.onlyWifi = cursor.getInt(columnIndex12) != 0;
            }
            int columnIndex13 = cursor.getColumnIndex(TTDownloadField.TT_FORCE);
            if (columnIndex13 != -1) {
                this.force = cursor.getInt(columnIndex13) != 0;
            }
            int columnIndex14 = cursor.getColumnIndex("retryCount");
            if (columnIndex14 != -1) {
                this.retryCount = cursor.getInt(columnIndex14);
            }
            int columnIndex15 = cursor.getColumnIndex("extra");
            if (columnIndex15 != -1) {
                this.extra = cursor.getString(columnIndex15);
            }
            int columnIndex16 = cursor.getColumnIndex(TTDownloadField.TT_MIME_TYPE);
            if (columnIndex16 != -1) {
                this.mimeType = cursor.getString(columnIndex16);
            }
            int columnIndex17 = cursor.getColumnIndex("notificationEnable");
            if (columnIndex17 != -1) {
                this.showNotification = cursor.getInt(columnIndex17) != 0;
            }
            int columnIndex18 = cursor.getColumnIndex("notificationVisibility");
            if (columnIndex18 != -1) {
                this.notificationVisibility = cursor.getInt(columnIndex18);
            }
            int columnIndex19 = cursor.getColumnIndex("isFirstDownload");
            if (columnIndex19 != -1) {
                this.isFirstDownload = cursor.getInt(columnIndex19) == 1;
            }
            int columnIndex20 = cursor.getColumnIndex("isFirstSuccess");
            if (columnIndex20 != -1) {
                this.isFirstSuccess = cursor.getInt(columnIndex20) == 1;
            }
            int columnIndex21 = cursor.getColumnIndex("needHttpsToHttpRetry");
            if (columnIndex21 != -1) {
                this.needHttpsToHttpRetry = cursor.getInt(columnIndex21) == 1;
            }
            int columnIndex22 = cursor.getColumnIndex("downloadTime");
            if (columnIndex22 != -1) {
                this.downloadTime = cursor.getLong(columnIndex22);
            }
            int columnIndex23 = cursor.getColumnIndex(TTDownloadField.TT_PACKAGE_NAME);
            if (columnIndex23 != -1) {
                this.packageName = cursor.getString(columnIndex23);
            }
            int columnIndex24 = cursor.getColumnIndex(TTDownloadField.TT_MD5);
            if (columnIndex24 != -1) {
                this.md5 = cursor.getString(columnIndex24);
            }
            int columnIndex25 = cursor.getColumnIndex("retryDelay");
            if (columnIndex25 != -1) {
                this.needRetryDelay = cursor.getInt(columnIndex25) == 1;
            }
            int columnIndex26 = cursor.getColumnIndex("curRetryTime");
            if (columnIndex26 != -1) {
                this.curRetryTime = cursor.getInt(columnIndex26);
            }
            int columnIndex27 = cursor.getColumnIndex("retryDelayStatus");
            if (columnIndex27 != -1) {
                int i5 = cursor.getInt(columnIndex27);
                g gVar2 = g.DELAY_RETRY_WAITING;
                if (i5 == gVar2.ordinal()) {
                    this.retryDelayStatus = gVar2;
                } else {
                    g gVar3 = g.DELAY_RETRY_DOWNLOADING;
                    if (i5 == gVar3.ordinal()) {
                        this.retryDelayStatus = gVar3;
                    } else {
                        g gVar4 = g.DELAY_RETRY_DOWNLOADED;
                        if (i5 == gVar4.ordinal()) {
                            this.retryDelayStatus = gVar4;
                        } else {
                            this.retryDelayStatus = gVar;
                        }
                    }
                }
            }
            int columnIndex28 = cursor.getColumnIndex("defaultHttpServiceBackUp");
            if (columnIndex28 != -1) {
                this.needDefaultHttpServiceBackUp = cursor.getInt(columnIndex28) == 1;
            }
            int columnIndex29 = cursor.getColumnIndex("chunkRunnableReuse");
            if (columnIndex29 != -1) {
                this.needReuseChunkRunnable = cursor.getInt(columnIndex29) == 1;
            }
            int columnIndex30 = cursor.getColumnIndex("retryDelayTimeArray");
            if (columnIndex30 != -1) {
                this.retryDelayTimeArray = cursor.getString(columnIndex30);
            }
            int columnIndex31 = cursor.getColumnIndex("chunkDowngradeRetry");
            if (columnIndex31 != -1) {
                this.needChunkDowngradeRetry = cursor.getInt(columnIndex31) == 1;
            }
            int columnIndex32 = cursor.getColumnIndex("backUpUrlsStr");
            if (columnIndex32 != -1) {
                setBackUpUrlsStr(cursor.getString(columnIndex32));
            }
            int columnIndex33 = cursor.getColumnIndex("backUpUrlRetryCount");
            if (columnIndex33 != -1) {
                this.backUpUrlRetryCount = cursor.getInt(columnIndex33);
            }
            int columnIndex34 = cursor.getColumnIndex("realDownloadTime");
            if (columnIndex34 != -1) {
                this.realDownloadTime = cursor.getLong(columnIndex34);
            }
            int columnIndex35 = cursor.getColumnIndex("retryScheduleMinutes");
            if (columnIndex35 != -1) {
                this.retryScheduleMinutes = cursor.getInt(columnIndex35);
            }
            int columnIndex36 = cursor.getColumnIndex("independentProcess");
            if (columnIndex36 != -1) {
                if (cursor.getInt(columnIndex36) != 1) {
                    z4 = false;
                }
                this.needIndependentProcess = z4;
            }
            int columnIndex37 = cursor.getColumnIndex("auxiliaryJsonobjectString");
            if (columnIndex37 != -1) {
                this.dbJsonDataString = cursor.getString(columnIndex37);
            }
            int columnIndex38 = cursor.getColumnIndex("iconUrl");
            if (columnIndex38 != -1) {
                this.iconUrl = cursor.getString(columnIndex38);
            }
            int columnIndex39 = cursor.getColumnIndex("appVersionCode");
            if (columnIndex39 != -1) {
                this.appVersionCode = cursor.getInt(columnIndex39);
            }
            int columnIndex40 = cursor.getColumnIndex("taskId");
            if (columnIndex40 != -1) {
                this.taskId = cursor.getString(columnIndex40);
            }
            parseMonitorSetting();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
