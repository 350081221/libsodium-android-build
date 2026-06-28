package com.lody.virtual.server.content;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncStatusInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.lody.virtual.helper.utils.AtomicFile;
import com.lody.virtual.helper.utils.FastXmlSerializer;
import com.lody.virtual.helper.utils.FileUtils;
import com.lody.virtual.os.VEnvironment;
import com.lody.virtual.server.accounts.AccountAndUser;
import com.lody.virtual.server.content.SyncManager;
import com.swift.sandhook.annotation.MethodReflectParams;
import com.tendcloud.tenddata.da;
import com.umeng.analytics.pro.bm;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;
import t0.b;

/* loaded from: classes3.dex */
public class SyncStorageEngine extends Handler {
    private static final int ACCOUNTS_VERSION = 2;
    private static final boolean DEBUG = false;
    private static final double DEFAULT_FLEX_PERCENT_SYNC = 0.04d;
    private static final long DEFAULT_MIN_FLEX_ALLOWED_SECS = 5;
    private static final long DEFAULT_POLL_FREQUENCY_SECONDS = 86400;
    public static final int EVENT_START = 0;
    public static final int EVENT_STOP = 1;
    public static final int MAX_HISTORY = 100;
    public static final String MESG_CANCELED = "canceled";
    public static final String MESG_SUCCESS = "success";
    private static final int MSG_WRITE_STATISTICS = 2;
    private static final int MSG_WRITE_STATUS = 1;
    public static final long NOT_IN_BACKOFF_MODE = -1;
    private static final int PENDING_FINISH_TO_WRITE = 4;
    public static final int PENDING_OPERATION_VERSION = 3;
    public static final int SOURCE_LOCAL = 1;
    public static final int SOURCE_PERIODIC = 4;
    public static final int SOURCE_POLL = 2;
    public static final int SOURCE_SERVER = 0;
    public static final int SOURCE_USER = 3;
    public static final int STATISTICS_FILE_END = 0;
    public static final int STATISTICS_FILE_ITEM = 101;
    public static final int STATISTICS_FILE_ITEM_OLD = 100;
    public static final int STATUS_FILE_END = 0;
    public static final int STATUS_FILE_ITEM = 100;
    private static final boolean SYNC_ENABLED_DEFAULT = false;
    private static final String TAG = "SyncManager";
    private static final String TAG_FILE = "SyncManagerFile";
    private static final long WRITE_STATISTICS_DELAY = 1800000;
    private static final long WRITE_STATUS_DELAY = 600000;
    private static final String XML_ATTR_AUTHORITYID = "authority_id";
    private static final String XML_ATTR_ENABLED = "enabled";
    private static final String XML_ATTR_EXPEDITED = "expedited";
    private static final String XML_ATTR_LISTEN_FOR_TICKLES = "listen-for-tickles";
    private static final String XML_ATTR_NEXT_AUTHORITY_ID = "nextAuthorityId";
    private static final String XML_ATTR_REASON = "reason";
    private static final String XML_ATTR_SOURCE = "source";
    private static final String XML_ATTR_SYNC_RANDOM_OFFSET = "offsetInSeconds";
    private static final String XML_ATTR_USER = "user";
    private static final String XML_ATTR_VERSION = "version";
    private static final String XML_TAG_LISTEN_FOR_TICKLES = "listenForTickles";
    private static HashMap<String, String> sAuthorityRenames;
    private static volatile SyncStorageEngine sSyncStorageEngine;
    private final AtomicFile mAccountInfoFile;
    private final Calendar mCal;
    private final Context mContext;
    private boolean mDefaultMasterSyncAutomatically;
    private final AtomicFile mPendingFile;
    private final AtomicFile mStatisticsFile;
    private final AtomicFile mStatusFile;
    private int mSyncRandomOffset;
    private OnSyncRequestListener mSyncRequestListener;
    private int mYear;
    private int mYearInDays;
    public static final String[] EVENTS = {"START", "STOP"};
    public static final String[] SOURCES = {"SERVER", "LOCAL", "POLL", "USER", "PERIODIC"};
    private final SparseArray<AuthorityInfo> mAuthorities = new SparseArray<>();
    private final HashMap<AccountAndUser, AccountInfo> mAccounts = new HashMap<>();
    private final ArrayList<PendingOperation> mPendingOperations = new ArrayList<>();
    private final SparseArray<ArrayList<VSyncInfo>> mCurrentSyncs = new SparseArray<>();
    private final SparseArray<SyncStatusInfo> mSyncStatus = new SparseArray<>();
    private final ArrayList<SyncHistoryItem> mSyncHistory = new ArrayList<>();
    private final RemoteCallbackList<ISyncStatusObserver> mChangeListeners = new RemoteCallbackList<>();
    private final HashMap<ComponentName, SparseArray<AuthorityInfo>> mServices = new HashMap<>();
    private int mNextAuthorityId = 0;
    private final DayStats[] mDayStats = new DayStats[28];
    private int mNumPendingFinished = 0;
    private int mNextHistoryId = 0;
    private SparseArray<Boolean> mMasterSyncAutomatically = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class AccountInfo {
        final AccountAndUser accountAndUser;
        final HashMap<String, AuthorityInfo> authorities = new HashMap<>();

        AccountInfo(AccountAndUser accountAndUser) {
            this.accountAndUser = accountAndUser;
        }
    }

    /* loaded from: classes3.dex */
    public static class DayStats {
        public final int day;
        public int failureCount;
        public long failureTime;
        public int successCount;
        public long successTime;

        public DayStats(int i5) {
            this.day = i5;
        }
    }

    /* loaded from: classes3.dex */
    public interface OnSyncRequestListener {
        void onSyncRequest(Account account, int i5, int i6, String str, Bundle bundle);
    }

    /* loaded from: classes3.dex */
    public static class SyncHistoryItem {
        int authorityId;
        long downstreamActivity;
        long elapsedTime;
        int event;
        long eventTime;
        Bundle extras;
        int historyId;
        boolean initialization;
        String mesg;
        int reason;
        int source;
        long upstreamActivity;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        sAuthorityRenames = hashMap;
        hashMap.put("contacts", "com.android.contacts");
        sAuthorityRenames.put("calendar", "com.android.calendar");
        sSyncStorageEngine = null;
    }

    private SyncStorageEngine(Context context, File file) {
        this.mContext = context;
        sSyncStorageEngine = this;
        this.mCal = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        this.mDefaultMasterSyncAutomatically = false;
        maybeDeleteLegacyPendingInfoLocked(file);
        this.mAccountInfoFile = new AtomicFile(new File(file, "accounts.xml"));
        this.mStatusFile = new AtomicFile(new File(file, "status.bin"));
        this.mPendingFile = new AtomicFile(new File(file, "pending.xml"));
        this.mStatisticsFile = new AtomicFile(new File(file, "stats.bin"));
        readAccountInfoLocked();
        readStatusLocked();
        readPendingOperationsLocked();
        readStatisticsLocked();
        readAndDeleteLegacyAccountInfoLocked();
        writeAccountInfoLocked();
        writeStatusLocked();
        writePendingOperationsLocked();
        writeStatisticsLocked();
    }

    private void appendPendingOperationLocked(PendingOperation pendingOperation) {
        Log.v(TAG, "Appending to " + this.mPendingFile.getBaseFile());
        try {
            FileOutputStream openAppend = this.mPendingFile.openAppend();
            try {
                try {
                    XmlSerializer fastXmlSerializer = new FastXmlSerializer();
                    fastXmlSerializer.setOutput(openAppend, "utf-8");
                    writePendingOperationLocked(pendingOperation, fastXmlSerializer);
                    fastXmlSerializer.endDocument();
                    this.mPendingFile.finishWrite(openAppend);
                } catch (Throwable th) {
                    try {
                        openAppend.close();
                    } catch (IOException unused) {
                    }
                    throw th;
                }
            } catch (IOException e5) {
                Log.w(TAG, "Error writing appending operation", e5);
                this.mPendingFile.failWrite(openAppend);
            }
            try {
                openAppend.close();
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            Log.v(TAG, "Failed append; writing full file");
            writePendingOperationsLocked();
        }
    }

    public static long calculateDefaultFlexTime(long j5) {
        if (j5 < 5) {
            return 0L;
        }
        if (j5 < DEFAULT_POLL_FREQUENCY_SECONDS) {
            return (long) (j5 * DEFAULT_FLEX_PERCENT_SYNC);
        }
        return 3456L;
    }

    private Pair<AuthorityInfo, SyncStatusInfo> createCopyPairOfAuthorityWithSyncStatusLocked(AuthorityInfo authorityInfo) {
        return Pair.create(new AuthorityInfo(authorityInfo), new SyncStatusInfo(getOrCreateSyncStatusLocked(authorityInfo.ident)));
    }

    private void extrasToXml(XmlSerializer xmlSerializer, Bundle bundle) throws IOException {
        for (String str : bundle.keySet()) {
            xmlSerializer.startTag(null, "extra");
            xmlSerializer.attribute(null, "name", str);
            Object obj = bundle.get(str);
            if (obj instanceof Long) {
                xmlSerializer.attribute(null, "type", MethodReflectParams.LONG);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Integer) {
                xmlSerializer.attribute(null, "type", TypedValues.Custom.S_INT);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Boolean) {
                xmlSerializer.attribute(null, "type", "boolean");
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Float) {
                xmlSerializer.attribute(null, "type", "float");
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Double) {
                xmlSerializer.attribute(null, "type", MethodReflectParams.DOUBLE);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof String) {
                xmlSerializer.attribute(null, "type", TypedValues.Custom.S_STRING);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Account) {
                xmlSerializer.attribute(null, "type", ServiceManagerNative.ACCOUNT);
                Account account = (Account) obj;
                xmlSerializer.attribute(null, "value1", account.name);
                xmlSerializer.attribute(null, "value2", account.type);
            }
            xmlSerializer.endTag(null, "extra");
        }
    }

    private static byte[] flattenBundle(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            bundle.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    private AuthorityInfo getAuthorityLocked(Account account, int i5, String str, String str2) {
        AuthorityInfo authorityInfo;
        AccountInfo accountInfo = this.mAccounts.get(new AccountAndUser(account, i5));
        if (accountInfo == null || (authorityInfo = accountInfo.authorities.get(str)) == null) {
            return null;
        }
        return authorityInfo;
    }

    private int getCurrentDayLocked() {
        this.mCal.setTimeInMillis(System.currentTimeMillis());
        int i5 = this.mCal.get(6);
        if (this.mYear != this.mCal.get(1)) {
            this.mYear = this.mCal.get(1);
            this.mCal.clear();
            this.mCal.set(1, this.mYear);
            this.mYearInDays = (int) (this.mCal.getTimeInMillis() / 86400000);
        }
        return i5 + this.mYearInDays;
    }

    private List<VSyncInfo> getCurrentSyncs(int i5) {
        List<VSyncInfo> currentSyncsLocked;
        synchronized (this.mAuthorities) {
            currentSyncsLocked = getCurrentSyncsLocked(i5);
        }
        return currentSyncsLocked;
    }

    private List<VSyncInfo> getCurrentSyncsLocked(int i5) {
        ArrayList<VSyncInfo> arrayList = this.mCurrentSyncs.get(i5);
        if (arrayList == null) {
            ArrayList<VSyncInfo> arrayList2 = new ArrayList<>();
            this.mCurrentSyncs.put(i5, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    static int getIntColumn(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    static long getLongColumn(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    private AuthorityInfo getOrCreateAuthorityLocked(ComponentName componentName, int i5, int i6, boolean z4) {
        SparseArray<AuthorityInfo> sparseArray = this.mServices.get(componentName);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.mServices.put(componentName, sparseArray);
        }
        AuthorityInfo authorityInfo = sparseArray.get(i5);
        if (authorityInfo == null) {
            if (i6 < 0) {
                i6 = this.mNextAuthorityId;
                this.mNextAuthorityId = i6 + 1;
                z4 = true;
            }
            authorityInfo = new AuthorityInfo(componentName, i5, i6);
            sparseArray.put(i5, authorityInfo);
            this.mAuthorities.put(i6, authorityInfo);
            if (z4) {
                writeAccountInfoLocked();
            }
        }
        return authorityInfo;
    }

    private SyncStatusInfo getOrCreateSyncStatusLocked(int i5) {
        SyncStatusInfo syncStatusInfo = this.mSyncStatus.get(i5);
        if (syncStatusInfo == null) {
            SyncStatusInfo syncStatusInfo2 = new SyncStatusInfo(i5);
            this.mSyncStatus.put(i5, syncStatusInfo2);
            return syncStatusInfo2;
        }
        return syncStatusInfo;
    }

    public static SyncStorageEngine getSingleton() {
        if (sSyncStorageEngine != null) {
            return sSyncStorageEngine;
        }
        throw new IllegalStateException("not initialized");
    }

    public static void init(Context context) {
        if (sSyncStorageEngine != null) {
            return;
        }
        File syncDirectory = VEnvironment.getSyncDirectory();
        FileUtils.ensureDirCreate(syncDirectory);
        sSyncStorageEngine = new SyncStorageEngine(context, syncDirectory);
    }

    private void maybeDeleteLegacyPendingInfoLocked(File file) {
        File file2 = new File(file, "pending.bin");
        if (!file2.exists()) {
            return;
        }
        file2.delete();
    }

    private boolean maybeMigrateSettingsForRenamedAuthorities() {
        ArrayList arrayList = new ArrayList();
        int size = this.mAuthorities.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            AuthorityInfo valueAt = this.mAuthorities.valueAt(i5);
            String str = sAuthorityRenames.get(valueAt.authority);
            if (str != null) {
                arrayList.add(valueAt);
                if (valueAt.enabled && getAuthorityLocked(valueAt.account, valueAt.userId, str, "cleanup") == null) {
                    getOrCreateAuthorityLocked(valueAt.account, valueAt.userId, str, -1, false).enabled = true;
                    z4 = true;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AuthorityInfo authorityInfo = (AuthorityInfo) it.next();
            removeAuthorityLocked(authorityInfo.account, authorityInfo.userId, authorityInfo.authority, false);
            z4 = true;
        }
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.lody.virtual.server.content.SyncStorageEngine.AuthorityInfo parseAuthority(org.xmlpull.v1.XmlPullParser r18, int r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.parseAuthority(org.xmlpull.v1.XmlPullParser, int):com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo");
    }

    private void parseExtra(XmlPullParser xmlPullParser, Bundle bundle) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "value1");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "value2");
        try {
            if (MethodReflectParams.LONG.equals(attributeValue2)) {
                bundle.putLong(attributeValue, Long.parseLong(attributeValue3));
            } else if (TypedValues.Custom.S_INT.equals(attributeValue2)) {
                bundle.putInt(attributeValue, Integer.parseInt(attributeValue3));
            } else if (MethodReflectParams.DOUBLE.equals(attributeValue2)) {
                bundle.putDouble(attributeValue, Double.parseDouble(attributeValue3));
            } else if ("float".equals(attributeValue2)) {
                bundle.putFloat(attributeValue, Float.parseFloat(attributeValue3));
            } else if ("boolean".equals(attributeValue2)) {
                bundle.putBoolean(attributeValue, Boolean.parseBoolean(attributeValue3));
            } else if (TypedValues.Custom.S_STRING.equals(attributeValue2)) {
                bundle.putString(attributeValue, attributeValue3);
            } else if (ServiceManagerNative.ACCOUNT.equals(attributeValue2)) {
                bundle.putParcelable(attributeValue, new Account(attributeValue3, attributeValue4));
            }
        } catch (NullPointerException e5) {
            Log.e(TAG, "error parsing bundle value", e5);
        } catch (NumberFormatException e6) {
            Log.e(TAG, "error parsing bundle value", e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseListenForTickles(org.xmlpull.v1.XmlPullParser r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SyncManager"
            java.lang.String r1 = "user"
            r2 = 0
            java.lang.String r1 = r6.getAttributeValue(r2, r1)
            r3 = 0
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NullPointerException -> Lf java.lang.NumberFormatException -> L16
            goto L1d
        Lf:
            r1 = move-exception
            java.lang.String r4 = "the user in listen-for-tickles is null"
            android.util.Log.e(r0, r4, r1)
            goto L1c
        L16:
            r1 = move-exception
            java.lang.String r4 = "error parsing the user for listen-for-tickles"
            android.util.Log.e(r0, r4, r1)
        L1c:
            r0 = r3
        L1d:
            java.lang.String r1 = "enabled"
            java.lang.String r6 = r6.getAttributeValue(r2, r1)
            if (r6 == 0) goto L2b
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            if (r6 == 0) goto L2c
        L2b:
            r3 = 1
        L2c:
            android.util.SparseArray<java.lang.Boolean> r6 = r5.mMasterSyncAutomatically
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r6.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.parseListenForTickles(org.xmlpull.v1.XmlPullParser):void");
    }

    private PeriodicSync parsePeriodicSync(XmlPullParser xmlPullParser, AuthorityInfo authorityInfo) {
        long calculateDefaultFlexTime;
        long j5;
        Bundle bundle = new Bundle();
        String attributeValue = xmlPullParser.getAttributeValue(null, "period");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "flex");
        try {
            long parseLong = Long.parseLong(attributeValue);
            try {
                calculateDefaultFlexTime = Long.parseLong(attributeValue2);
            } catch (NullPointerException unused) {
                long calculateDefaultFlexTime2 = calculateDefaultFlexTime(parseLong);
                Log.d(TAG, "No flex time specified for this sync, using a default. period: " + parseLong + " flex: " + calculateDefaultFlexTime2);
                j5 = calculateDefaultFlexTime2;
            } catch (NumberFormatException unused2) {
                Log.e(TAG, "Error formatting value parsed for periodic sync flex: " + attributeValue2);
                calculateDefaultFlexTime = calculateDefaultFlexTime(parseLong);
            }
            j5 = calculateDefaultFlexTime;
            PeriodicSync periodicSync = new PeriodicSync(authorityInfo.account, authorityInfo.authority, bundle, parseLong);
            mirror.android.content.PeriodicSync.flexTime.set(periodicSync, j5);
            authorityInfo.periodicSyncs.add(periodicSync);
            return periodicSync;
        } catch (NullPointerException e5) {
            Log.e(TAG, "the period of a periodic sync is null", e5);
            return null;
        } catch (NumberFormatException e6) {
            Log.e(TAG, "error parsing the period of a periodic sync", e6);
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0142: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:323), block:B:112:0x0142 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[Catch: all -> 0x0141, IOException -> 0x0144, XmlPullParserException -> 0x0146, TryCatch #0 {all -> 0x0141, blocks: (B:5:0x000d, B:7:0x0035, B:8:0x0043, B:11:0x0051, B:13:0x0056, B:15:0x0062, B:19:0x0072, B:20:0x0078, B:23:0x0086, B:74:0x0082, B:24:0x008e, B:27:0x009c, B:28:0x00a1, B:30:0x00a5, B:31:0x00b7, B:33:0x00bb, B:37:0x00c5, B:39:0x00d4, B:41:0x00de, B:43:0x00e6, B:46:0x00f1, B:48:0x00f9, B:49:0x00fd, B:51:0x0104, B:54:0x010e, B:55:0x0113, B:58:0x011c, B:60:0x0124, B:62:0x0129, B:70:0x0098, B:68:0x009f, B:88:0x0150, B:98:0x0156, B:100:0x016c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: all -> 0x0141, IOException -> 0x0144, XmlPullParserException -> 0x0146, TryCatch #0 {all -> 0x0141, blocks: (B:5:0x000d, B:7:0x0035, B:8:0x0043, B:11:0x0051, B:13:0x0056, B:15:0x0062, B:19:0x0072, B:20:0x0078, B:23:0x0086, B:74:0x0082, B:24:0x008e, B:27:0x009c, B:28:0x00a1, B:30:0x00a5, B:31:0x00b7, B:33:0x00bb, B:37:0x00c5, B:39:0x00d4, B:41:0x00de, B:43:0x00e6, B:46:0x00f1, B:48:0x00f9, B:49:0x00fd, B:51:0x0104, B:54:0x010e, B:55:0x0113, B:58:0x011c, B:60:0x0124, B:62:0x0129, B:70:0x0098, B:68:0x009f, B:88:0x0150, B:98:0x0156, B:100:0x016c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readAccountInfoLocked() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.readAccountInfoLocked():void");
    }

    private void readAndDeleteLegacyAccountInfoLocked() {
        SQLiteDatabase sQLiteDatabase;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z7;
        boolean z8;
        File databasePath = this.mContext.getDatabasePath("syncmanager.db");
        if (!databasePath.exists()) {
            return;
        }
        String path = databasePath.getPath();
        try {
            sQLiteDatabase = SQLiteDatabase.openDatabase(path, null, 1);
        } catch (SQLiteException unused) {
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.getVersion() >= 11) {
                z4 = true;
            } else {
                z4 = false;
            }
            Log.v(TAG, "Reading legacy sync accounts db");
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables("stats, status");
            HashMap hashMap = new HashMap();
            hashMap.put(bm.f12336d, "status._id as _id");
            String str10 = ServiceManagerNative.ACCOUNT;
            hashMap.put(ServiceManagerNative.ACCOUNT, "stats.account as account");
            String str11 = "account_type";
            if (z4) {
                hashMap.put("account_type", "stats.account_type as account_type");
            }
            String str12 = "authority";
            hashMap.put("authority", "stats.authority as authority");
            String str13 = "totalElapsedTime";
            hashMap.put("totalElapsedTime", "totalElapsedTime");
            hashMap.put("numSyncs", "numSyncs");
            hashMap.put("numSourceLocal", "numSourceLocal");
            hashMap.put("numSourcePoll", "numSourcePoll");
            hashMap.put("numSourceServer", "numSourceServer");
            hashMap.put("numSourceUser", "numSourceUser");
            hashMap.put("lastSuccessSource", "lastSuccessSource");
            hashMap.put("lastSuccessTime", "lastSuccessTime");
            hashMap.put("lastFailureSource", "lastFailureSource");
            String str14 = "lastFailureSource";
            hashMap.put("lastFailureTime", "lastFailureTime");
            String str15 = "lastFailureTime";
            hashMap.put("lastFailureMesg", "lastFailureMesg");
            String str16 = "lastFailureMesg";
            String str17 = "pending";
            hashMap.put("pending", "pending");
            sQLiteQueryBuilder.setProjectionMap(hashMap);
            sQLiteQueryBuilder.appendWhere("stats._id = status.stats_id");
            String str18 = "numSourceUser";
            String str19 = "numSourceServer";
            String str20 = "numSourcePoll";
            String str21 = "numSourceLocal";
            Cursor query = sQLiteQueryBuilder.query(sQLiteDatabase, null, null, null, null, null, null);
            while (query.moveToNext()) {
                String string = query.getString(query.getColumnIndex(str10));
                if (z4) {
                    str = query.getString(query.getColumnIndex(str11));
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "com.google";
                }
                String string2 = query.getString(query.getColumnIndex(str12));
                Account account = new Account(string, str);
                String str22 = str20;
                String str23 = str13;
                String str24 = str12;
                String str25 = str11;
                String str26 = str10;
                String str27 = str17;
                String str28 = str14;
                String str29 = str15;
                String str30 = str16;
                AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(account, 0, string2, -1, false);
                if (orCreateAuthorityLocked != null) {
                    int size = this.mSyncStatus.size();
                    SyncStatusInfo syncStatusInfo = null;
                    while (true) {
                        if (size > 0) {
                            size--;
                            syncStatusInfo = this.mSyncStatus.valueAt(size);
                            if (syncStatusInfo.authorityId == orCreateAuthorityLocked.ident) {
                                z7 = true;
                                break;
                            }
                        } else {
                            z7 = false;
                            break;
                        }
                    }
                    if (!z7) {
                        syncStatusInfo = new SyncStatusInfo(orCreateAuthorityLocked.ident);
                        this.mSyncStatus.put(orCreateAuthorityLocked.ident, syncStatusInfo);
                    }
                    syncStatusInfo.totalElapsedTime = getLongColumn(query, str23);
                    syncStatusInfo.numSyncs = getIntColumn(query, "numSyncs");
                    str5 = str21;
                    syncStatusInfo.numSourceLocal = getIntColumn(query, str5);
                    str6 = str22;
                    syncStatusInfo.numSourcePoll = getIntColumn(query, str6);
                    str4 = str19;
                    syncStatusInfo.numSourceServer = getIntColumn(query, str4);
                    str23 = str23;
                    str3 = str18;
                    syncStatusInfo.numSourceUser = getIntColumn(query, str3);
                    syncStatusInfo.numSourcePeriodic = 0;
                    syncStatusInfo.lastSuccessSource = getIntColumn(query, "lastSuccessSource");
                    syncStatusInfo.lastSuccessTime = getLongColumn(query, "lastSuccessTime");
                    str9 = str28;
                    syncStatusInfo.lastFailureSource = getIntColumn(query, str9);
                    str2 = str26;
                    str8 = str29;
                    syncStatusInfo.lastFailureTime = getLongColumn(query, str8);
                    syncStatusInfo.lastFailureMesg = query.getString(query.getColumnIndex(str30));
                    str7 = str27;
                    if (getIntColumn(query, str7) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    syncStatusInfo.pending = z8;
                } else {
                    str2 = str26;
                    str3 = str18;
                    str4 = str19;
                    str5 = str21;
                    str6 = str22;
                    str7 = str27;
                    str8 = str29;
                    str9 = str28;
                }
                str21 = str5;
                str20 = str6;
                str19 = str4;
                str11 = str25;
                str14 = str9;
                str15 = str8;
                str12 = str24;
                str18 = str3;
                str10 = str2;
                str16 = str30;
                str17 = str7;
                str13 = str23;
            }
            query.close();
            SQLiteQueryBuilder sQLiteQueryBuilder2 = new SQLiteQueryBuilder();
            sQLiteQueryBuilder2.setTables("settings");
            Cursor query2 = sQLiteQueryBuilder2.query(sQLiteDatabase, null, null, null, null, null, null);
            while (query2.moveToNext()) {
                String string3 = query2.getString(query2.getColumnIndex("name"));
                String string4 = query2.getString(query2.getColumnIndex(b.f22420d));
                if (string3 != null) {
                    if (string3.equals("listen_for_tickles")) {
                        if (string4 != null && !Boolean.parseBoolean(string4)) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        setMasterSyncAutomatically(z6, 0);
                    } else if (string3.startsWith("sync_provider_")) {
                        String substring = string3.substring(14, string3.length());
                        int size2 = this.mAuthorities.size();
                        while (size2 > 0) {
                            size2--;
                            AuthorityInfo valueAt = this.mAuthorities.valueAt(size2);
                            if (valueAt.authority.equals(substring)) {
                                if (string4 != null && !Boolean.parseBoolean(string4)) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                valueAt.enabled = z5;
                                valueAt.syncable = 1;
                            }
                        }
                    }
                }
            }
            query2.close();
            sQLiteDatabase.close();
            new File(path).delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0183, code lost:
    
        if (r5 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0177, code lost:
    
        if (r5 == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void readPendingOperationsLocked() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.readPendingOperationsLocked():void");
    }

    private void readStatisticsLocked() {
        try {
            byte[] readFully = this.mStatisticsFile.readFully();
            Parcel obtain = Parcel.obtain();
            int i5 = 0;
            obtain.unmarshall(readFully, 0, readFully.length);
            obtain.setDataPosition(0);
            while (true) {
                int readInt = obtain.readInt();
                if (readInt != 0) {
                    if (readInt != 101 && readInt != 100) {
                        Log.w(TAG, "Unknown stats token: " + readInt);
                        return;
                    }
                    int readInt2 = obtain.readInt();
                    if (readInt == 100) {
                        readInt2 = (readInt2 - 2009) + 14245;
                    }
                    DayStats dayStats = new DayStats(readInt2);
                    dayStats.successCount = obtain.readInt();
                    dayStats.successTime = obtain.readLong();
                    dayStats.failureCount = obtain.readInt();
                    dayStats.failureTime = obtain.readLong();
                    DayStats[] dayStatsArr = this.mDayStats;
                    if (i5 < dayStatsArr.length) {
                        dayStatsArr[i5] = dayStats;
                        i5++;
                    }
                } else {
                    return;
                }
            }
        } catch (IOException unused) {
            Log.i(TAG, "No initial statistics");
        }
    }

    private void readStatusLocked() {
        Log.v(TAG, "Reading " + this.mStatusFile.getBaseFile());
        try {
            byte[] readFully = this.mStatusFile.readFully();
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(readFully, 0, readFully.length);
            obtain.setDataPosition(0);
            while (true) {
                int readInt = obtain.readInt();
                if (readInt != 0) {
                    if (readInt == 100) {
                        SyncStatusInfo syncStatusInfo = new SyncStatusInfo(obtain);
                        if (this.mAuthorities.indexOfKey(syncStatusInfo.authorityId) >= 0) {
                            syncStatusInfo.pending = false;
                            Log.v(TAG, "Adding status for id " + syncStatusInfo.authorityId);
                            this.mSyncStatus.put(syncStatusInfo.authorityId, syncStatusInfo);
                        }
                    } else {
                        Log.w(TAG, "Unknown status token: " + readInt);
                        return;
                    }
                } else {
                    return;
                }
            }
        } catch (IOException unused) {
            Log.i(TAG, "No initial status");
        }
    }

    private void removeAuthorityLocked(Account account, int i5, String str, boolean z4) {
        AuthorityInfo remove;
        AccountInfo accountInfo = this.mAccounts.get(new AccountAndUser(account, i5));
        if (accountInfo != null && (remove = accountInfo.authorities.remove(str)) != null) {
            this.mAuthorities.remove(remove.ident);
            if (z4) {
                writeAccountInfoLocked();
            }
        }
    }

    private void reportChange(int i5) {
        ArrayList arrayList;
        synchronized (this.mAuthorities) {
            int beginBroadcast = this.mChangeListeners.beginBroadcast();
            arrayList = null;
            while (beginBroadcast > 0) {
                beginBroadcast--;
                if ((((Integer) this.mChangeListeners.getBroadcastCookie(beginBroadcast)).intValue() & i5) != 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(beginBroadcast);
                    }
                    arrayList.add(this.mChangeListeners.getBroadcastItem(beginBroadcast));
                }
            }
            this.mChangeListeners.finishBroadcast();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (size > 0) {
                size--;
                try {
                    ((ISyncStatusObserver) arrayList.get(size)).onStatusChanged(i5);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    private void requestSync(Account account, int i5, int i6, String str, Bundle bundle) {
        OnSyncRequestListener onSyncRequestListener;
        if (Process.myUid() == VEnvironment.SYSTEM_UID && (onSyncRequestListener = this.mSyncRequestListener) != null) {
            onSyncRequestListener.onSyncRequest(account, i5, i6, str, bundle);
        } else {
            ContentResolver.requestSync(account, str, bundle);
        }
    }

    private static Bundle unflattenBundle(byte[] bArr) {
        Bundle bundle;
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                bundle = obtain.readBundle();
            } catch (RuntimeException unused) {
                bundle = new Bundle();
            }
            return bundle;
        } finally {
            obtain.recycle();
        }
    }

    private void updateOrRemovePeriodicSync(PeriodicSync periodicSync, int i5, boolean z4) {
        synchronized (this.mAuthorities) {
            if (periodicSync.period <= 0 && z4) {
                Log.e(TAG, "period < 0, should never happen in updateOrRemovePeriodicSync: add-" + z4);
            }
            if (periodicSync.extras == null) {
                Log.e(TAG, "null extras, should never happen in updateOrRemovePeriodicSync: add-" + z4);
            }
            try {
                AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(periodicSync.account, i5, periodicSync.authority, -1, false);
                boolean z5 = false;
                if (z4) {
                    int size = orCreateAuthorityLocked.periodicSyncs.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        PeriodicSync periodicSync2 = orCreateAuthorityLocked.periodicSyncs.get(i6);
                        if (mirror.android.content.PeriodicSync.syncExtrasEquals(periodicSync.extras, periodicSync2.extras)) {
                            if (periodicSync.period == periodicSync2.period && mirror.android.content.PeriodicSync.flexTime.get(periodicSync) == mirror.android.content.PeriodicSync.flexTime.get(periodicSync2)) {
                                return;
                            }
                            orCreateAuthorityLocked.periodicSyncs.set(i6, mirror.android.content.PeriodicSync.clone(periodicSync));
                            z5 = true;
                        } else {
                            i6++;
                        }
                    }
                    if (!z5) {
                        orCreateAuthorityLocked.periodicSyncs.add(mirror.android.content.PeriodicSync.clone(periodicSync));
                        getOrCreateSyncStatusLocked(orCreateAuthorityLocked.ident).setPeriodicSyncTime(orCreateAuthorityLocked.periodicSyncs.size() - 1, 0L);
                    }
                } else {
                    SyncStatusInfo syncStatusInfo = this.mSyncStatus.get(orCreateAuthorityLocked.ident);
                    Iterator<PeriodicSync> it = orCreateAuthorityLocked.periodicSyncs.iterator();
                    int i7 = 0;
                    while (it.hasNext()) {
                        if (mirror.android.content.PeriodicSync.syncExtrasEquals(it.next().extras, periodicSync.extras)) {
                            it.remove();
                            if (syncStatusInfo != null) {
                                syncStatusInfo.removePeriodicSyncTime(i7);
                            } else {
                                Log.e(TAG, "Tried removing sync status on remove periodic sync butdid not find it.");
                            }
                            z5 = true;
                        } else {
                            i7++;
                        }
                    }
                    if (!z5) {
                        return;
                    }
                }
                reportChange(1);
            } finally {
                writeAccountInfoLocked();
                writeStatusLocked();
            }
        }
    }

    private void writeAccountInfoLocked() {
        String str;
        boolean z4;
        String str2 = "Writing new " + this.mAccountInfoFile.getBaseFile();
        String str3 = TAG;
        Log.v(TAG, str2);
        FileOutputStream fileOutputStream = null;
        String str4 = null;
        try {
            FileOutputStream startWrite = this.mAccountInfoFile.startWrite();
            try {
                XmlSerializer fastXmlSerializer = new FastXmlSerializer();
                fastXmlSerializer.setOutput(startWrite, "utf-8");
                fastXmlSerializer.startDocument(null, Boolean.TRUE);
                fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
                fastXmlSerializer.startTag(null, da.f11669a);
                fastXmlSerializer.attribute(null, "version", Integer.toString(2));
                fastXmlSerializer.attribute(null, XML_ATTR_NEXT_AUTHORITY_ID, Integer.toString(this.mNextAuthorityId));
                fastXmlSerializer.attribute(null, XML_ATTR_SYNC_RANDOM_OFFSET, Integer.toString(this.mSyncRandomOffset));
                int size = this.mMasterSyncAutomatically.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = this.mMasterSyncAutomatically.keyAt(i5);
                    Boolean valueAt = this.mMasterSyncAutomatically.valueAt(i5);
                    fastXmlSerializer.startTag(null, XML_TAG_LISTEN_FOR_TICKLES);
                    fastXmlSerializer.attribute(null, "user", Integer.toString(keyAt));
                    fastXmlSerializer.attribute(null, XML_ATTR_ENABLED, Boolean.toString(valueAt.booleanValue()));
                    fastXmlSerializer.endTag(null, XML_TAG_LISTEN_FOR_TICKLES);
                }
                int size2 = this.mAuthorities.size();
                int i6 = 0;
                while (i6 < size2) {
                    AuthorityInfo valueAt2 = this.mAuthorities.valueAt(i6);
                    fastXmlSerializer.startTag(str4, "authority");
                    fastXmlSerializer.attribute(str4, "id", Integer.toString(valueAt2.ident));
                    fastXmlSerializer.attribute(str4, "user", Integer.toString(valueAt2.userId));
                    fastXmlSerializer.attribute(str4, XML_ATTR_ENABLED, Boolean.toString(valueAt2.enabled));
                    ComponentName componentName = valueAt2.service;
                    if (componentName == null) {
                        fastXmlSerializer.attribute(str4, ServiceManagerNative.ACCOUNT, valueAt2.account.name);
                        fastXmlSerializer.attribute(str4, "type", valueAt2.account.type);
                        fastXmlSerializer.attribute(str4, "authority", valueAt2.authority);
                    } else {
                        fastXmlSerializer.attribute(str4, "package", componentName.getPackageName());
                        fastXmlSerializer.attribute(str4, "class", valueAt2.service.getClassName());
                    }
                    int i7 = valueAt2.syncable;
                    if (i7 < 0) {
                        fastXmlSerializer.attribute(str4, "syncable", "unknown");
                    } else {
                        if (i7 != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        fastXmlSerializer.attribute(str4, "syncable", Boolean.toString(z4));
                    }
                    Iterator<PeriodicSync> it = valueAt2.periodicSyncs.iterator();
                    while (it.hasNext()) {
                        PeriodicSync next = it.next();
                        fastXmlSerializer.startTag(str4, "periodicSync");
                        str = str3;
                        try {
                            fastXmlSerializer.attribute(null, "period", Long.toString(next.period));
                            fastXmlSerializer.attribute(null, "flex", Long.toString(mirror.android.content.PeriodicSync.flexTime.get(next)));
                            extrasToXml(fastXmlSerializer, next.extras);
                            fastXmlSerializer.endTag(null, "periodicSync");
                            str3 = str;
                            str4 = null;
                        } catch (IOException e5) {
                            e = e5;
                            fileOutputStream = startWrite;
                            Log.w(str, "Error writing accounts", e);
                            if (fileOutputStream != null) {
                                this.mAccountInfoFile.failWrite(fileOutputStream);
                                return;
                            }
                            return;
                        }
                    }
                    fastXmlSerializer.endTag(str4, "authority");
                    i6++;
                    str3 = str3;
                    str4 = null;
                }
                str = str3;
                fastXmlSerializer.endTag(str4, da.f11669a);
                fastXmlSerializer.endDocument();
                this.mAccountInfoFile.finishWrite(startWrite);
            } catch (IOException e6) {
                e = e6;
                str = str3;
            }
        } catch (IOException e7) {
            e = e7;
            str = TAG;
        }
    }

    private void writeDefaultAccountInfo() {
        FileOutputStream startWrite;
        FileOutputStream fileOutputStream = null;
        try {
            startWrite = this.mAccountInfoFile.startWrite();
        } catch (IOException e5) {
            e = e5;
        }
        try {
            FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
            fastXmlSerializer.setOutput(startWrite, "utf-8");
            fastXmlSerializer.startDocument(null, Boolean.TRUE);
            fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
            fastXmlSerializer.startTag(null, da.f11669a);
            fastXmlSerializer.attribute(null, "version", Integer.toString(2));
            fastXmlSerializer.attribute(null, XML_ATTR_NEXT_AUTHORITY_ID, "0");
            fastXmlSerializer.attribute(null, XML_ATTR_SYNC_RANDOM_OFFSET, "0");
            fastXmlSerializer.endTag(null, da.f11669a);
            fastXmlSerializer.endDocument();
            this.mAccountInfoFile.finishWrite(startWrite);
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = startWrite;
            Log.w(TAG, "Error writing default account info", e);
            this.mAccountInfoFile.failWrite(fileOutputStream);
        }
    }

    private void writePendingOperationLocked(PendingOperation pendingOperation, XmlSerializer xmlSerializer) throws IOException {
        xmlSerializer.startTag(null, "op");
        xmlSerializer.attribute(null, "version", Integer.toString(3));
        xmlSerializer.attribute(null, XML_ATTR_AUTHORITYID, Integer.toString(pendingOperation.authorityId));
        xmlSerializer.attribute(null, XML_ATTR_SOURCE, Integer.toString(pendingOperation.syncSource));
        xmlSerializer.attribute(null, XML_ATTR_EXPEDITED, Boolean.toString(pendingOperation.expedited));
        xmlSerializer.attribute(null, "reason", Integer.toString(pendingOperation.reason));
        extrasToXml(xmlSerializer, pendingOperation.extras);
        xmlSerializer.endTag(null, "op");
    }

    private void writePendingOperationsLocked() {
        int size = this.mPendingOperations.size();
        try {
            if (size == 0) {
                Log.v(TAG_FILE, "Truncating " + this.mPendingFile.getBaseFile());
                this.mPendingFile.truncate();
                return;
            }
            Log.v(TAG_FILE, "Writing new " + this.mPendingFile.getBaseFile());
            FileOutputStream startWrite = this.mPendingFile.startWrite();
            XmlSerializer fastXmlSerializer = new FastXmlSerializer();
            fastXmlSerializer.setOutput(startWrite, "utf-8");
            for (int i5 = 0; i5 < size; i5++) {
                writePendingOperationLocked(this.mPendingOperations.get(i5), fastXmlSerializer);
            }
            fastXmlSerializer.endDocument();
            this.mPendingFile.finishWrite(startWrite);
        } catch (IOException e5) {
            Log.w(TAG, "Error writing pending operations", e5);
            if (0 != 0) {
                this.mPendingFile.failWrite(null);
            }
        }
    }

    private void writeStatisticsLocked() {
        Log.v(TAG, "Writing new " + this.mStatisticsFile.getBaseFile());
        removeMessages(2);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.mStatisticsFile.startWrite();
            Parcel obtain = Parcel.obtain();
            int length = this.mDayStats.length;
            for (int i5 = 0; i5 < length; i5++) {
                DayStats dayStats = this.mDayStats[i5];
                if (dayStats == null) {
                    break;
                }
                obtain.writeInt(101);
                obtain.writeInt(dayStats.day);
                obtain.writeInt(dayStats.successCount);
                obtain.writeLong(dayStats.successTime);
                obtain.writeInt(dayStats.failureCount);
                obtain.writeLong(dayStats.failureTime);
            }
            obtain.writeInt(0);
            fileOutputStream.write(obtain.marshall());
            obtain.recycle();
            this.mStatisticsFile.finishWrite(fileOutputStream);
        } catch (IOException e5) {
            Log.w(TAG, "Error writing stats", e5);
            if (fileOutputStream != null) {
                this.mStatisticsFile.failWrite(fileOutputStream);
            }
        }
    }

    private void writeStatusLocked() {
        Log.v(TAG, "Writing new " + this.mStatusFile.getBaseFile());
        removeMessages(1);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = this.mStatusFile.startWrite();
            Parcel obtain = Parcel.obtain();
            int size = this.mSyncStatus.size();
            for (int i5 = 0; i5 < size; i5++) {
                SyncStatusInfo valueAt = this.mSyncStatus.valueAt(i5);
                obtain.writeInt(100);
                valueAt.writeToParcel(obtain, 0);
            }
            obtain.writeInt(0);
            fileOutputStream.write(obtain.marshall());
            obtain.recycle();
            this.mStatusFile.finishWrite(fileOutputStream);
        } catch (IOException e5) {
            Log.w(TAG, "Error writing status", e5);
            if (fileOutputStream != null) {
                this.mStatusFile.failWrite(fileOutputStream);
            }
        }
    }

    public VSyncInfo addActiveSync(SyncManager.ActiveSyncContext activeSyncContext) {
        VSyncInfo vSyncInfo;
        synchronized (this.mAuthorities) {
            SyncOperation syncOperation = activeSyncContext.mSyncOperation;
            AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(syncOperation.account, syncOperation.userId, syncOperation.authority, -1, true);
            vSyncInfo = new VSyncInfo(orCreateAuthorityLocked.ident, orCreateAuthorityLocked.account, orCreateAuthorityLocked.authority, activeSyncContext.mStartTime);
            getCurrentSyncs(orCreateAuthorityLocked.userId).add(vSyncInfo);
        }
        reportActiveChange();
        return vSyncInfo;
    }

    public void addPeriodicSync(PeriodicSync periodicSync, int i5) {
        updateOrRemovePeriodicSync(periodicSync, i5, true);
    }

    public void addStatusChangeListener(int i5, ISyncStatusObserver iSyncStatusObserver) {
        synchronized (this.mAuthorities) {
            this.mChangeListeners.register(iSyncStatusObserver, Integer.valueOf(i5));
        }
    }

    public void clearAllBackoffsLocked(SyncQueue syncQueue) {
        boolean z4;
        synchronized (this.mAuthorities) {
            z4 = false;
            for (AccountInfo accountInfo : this.mAccounts.values()) {
                for (AuthorityInfo authorityInfo : accountInfo.authorities.values()) {
                    if (authorityInfo.backoffTime != -1 || authorityInfo.backoffDelay != -1) {
                        authorityInfo.backoffTime = -1L;
                        authorityInfo.backoffDelay = -1L;
                        AccountAndUser accountAndUser = accountInfo.accountAndUser;
                        syncQueue.onBackoffChanged(accountAndUser.account, accountAndUser.userId, authorityInfo.authority, 0L);
                        z4 = true;
                    }
                }
            }
        }
        if (z4) {
            reportChange(1);
        }
    }

    public void clearAndReadState() {
        synchronized (this.mAuthorities) {
            this.mAuthorities.clear();
            this.mAccounts.clear();
            this.mServices.clear();
            this.mPendingOperations.clear();
            this.mSyncStatus.clear();
            this.mSyncHistory.clear();
            readAccountInfoLocked();
            readStatusLocked();
            readPendingOperationsLocked();
            readStatisticsLocked();
            readAndDeleteLegacyAccountInfoLocked();
            writeAccountInfoLocked();
            writeStatusLocked();
            writePendingOperationsLocked();
            writeStatisticsLocked();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000c, B:8:0x0015, B:11:0x001b, B:12:0x0024, B:14:0x0032, B:16:0x003b, B:18:0x004d, B:20:0x0057, B:25:0x0065, B:27:0x005f, B:33:0x001f, B:34:0x006e), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean deleteFromPending(com.lody.virtual.server.content.SyncStorageEngine.PendingOperation r10) {
        /*
            r9 = this;
            android.util.SparseArray<com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo> r0 = r9.mAuthorities
            monitor-enter(r0)
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$PendingOperation> r1 = r9.mPendingOperations     // Catch: java.lang.Throwable -> L74
            boolean r1 = r1.remove(r10)     // Catch: java.lang.Throwable -> L74
            r2 = 0
            if (r1 == 0) goto L6e
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$PendingOperation> r1 = r9.mPendingOperations     // Catch: java.lang.Throwable -> L74
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L74
            r3 = 1
            if (r1 == 0) goto L1f
            int r1 = r9.mNumPendingFinished     // Catch: java.lang.Throwable -> L74
            r4 = 4
            if (r1 < r4) goto L1b
            goto L1f
        L1b:
            int r1 = r1 + r3
            r9.mNumPendingFinished = r1     // Catch: java.lang.Throwable -> L74
            goto L24
        L1f:
            r9.writePendingOperationsLocked()     // Catch: java.lang.Throwable -> L74
            r9.mNumPendingFinished = r2     // Catch: java.lang.Throwable -> L74
        L24:
            android.accounts.Account r1 = r10.account     // Catch: java.lang.Throwable -> L74
            int r4 = r10.userId     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = r10.authority     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "deleteFromPending"
            com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo r1 = r9.getAuthorityLocked(r1, r4, r5, r6)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L6d
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$PendingOperation> r4 = r9.mPendingOperations     // Catch: java.lang.Throwable -> L74
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L74
            r5 = r2
        L39:
            if (r5 >= r4) goto L62
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$PendingOperation> r6 = r9.mPendingOperations     // Catch: java.lang.Throwable -> L74
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L74
            com.lody.virtual.server.content.SyncStorageEngine$PendingOperation r6 = (com.lody.virtual.server.content.SyncStorageEngine.PendingOperation) r6     // Catch: java.lang.Throwable -> L74
            android.accounts.Account r7 = r6.account     // Catch: java.lang.Throwable -> L74
            android.accounts.Account r8 = r10.account     // Catch: java.lang.Throwable -> L74
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L5f
            java.lang.String r7 = r6.authority     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r10.authority     // Catch: java.lang.Throwable -> L74
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L5f
            int r6 = r6.userId     // Catch: java.lang.Throwable -> L74
            int r7 = r10.userId     // Catch: java.lang.Throwable -> L74
            if (r6 != r7) goto L5f
            r10 = r3
            goto L63
        L5f:
            int r5 = r5 + 1
            goto L39
        L62:
            r10 = r2
        L63:
            if (r10 != 0) goto L6d
            int r10 = r1.ident     // Catch: java.lang.Throwable -> L74
            android.content.SyncStatusInfo r10 = r9.getOrCreateSyncStatusLocked(r10)     // Catch: java.lang.Throwable -> L74
            r10.pending = r2     // Catch: java.lang.Throwable -> L74
        L6d:
            r2 = r3
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            r10 = 2
            r9.reportChange(r10)
            return r2
        L74:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L74
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.deleteFromPending(com.lody.virtual.server.content.SyncStorageEngine$PendingOperation):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r7 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r7 = r7 - 1;
        r8 = r1.keyAt(r7);
        r6.mAuthorities.remove(r8);
        r2 = r6.mSyncStatus.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if (r2 <= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r6.mSyncStatus.keyAt(r2) != r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r3 = r6.mSyncStatus;
        r3.remove(r3.keyAt(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        r2 = r6.mSyncHistory.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r2 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r6.mSyncHistory.get(r2).authorityId != r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        r6.mSyncHistory.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        writeAccountInfoLocked();
        writeStatusLocked();
        writePendingOperationsLocked();
        writeStatisticsLocked();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doDatabaseCleanup(android.accounts.Account[] r7, int r8) {
        /*
            r6 = this;
            android.util.SparseArray<com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo> r0 = r6.mAuthorities
            monitor-enter(r0)
            android.util.SparseArray r1 = new android.util.SparseArray     // Catch: java.lang.Throwable -> La7
            r1.<init>()     // Catch: java.lang.Throwable -> La7
            java.util.HashMap<com.lody.virtual.server.accounts.AccountAndUser, com.lody.virtual.server.content.SyncStorageEngine$AccountInfo> r2 = r6.mAccounts     // Catch: java.lang.Throwable -> La7
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La7
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La7
            com.lody.virtual.server.content.SyncStorageEngine$AccountInfo r3 = (com.lody.virtual.server.content.SyncStorageEngine.AccountInfo) r3     // Catch: java.lang.Throwable -> La7
            com.lody.virtual.server.accounts.AccountAndUser r4 = r3.accountAndUser     // Catch: java.lang.Throwable -> La7
            android.accounts.Account r4 = r4.account     // Catch: java.lang.Throwable -> La7
            boolean r4 = com.lody.virtual.helper.utils.ArrayUtils.contains(r7, r4)     // Catch: java.lang.Throwable -> La7
            if (r4 != 0) goto L12
            com.lody.virtual.server.accounts.AccountAndUser r4 = r3.accountAndUser     // Catch: java.lang.Throwable -> La7
            int r4 = r4.userId     // Catch: java.lang.Throwable -> La7
            if (r4 != r8) goto L12
            java.util.HashMap<java.lang.String, com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo> r3 = r3.authorities     // Catch: java.lang.Throwable -> La7
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La7
        L38:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> La7
            com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo r4 = (com.lody.virtual.server.content.SyncStorageEngine.AuthorityInfo) r4     // Catch: java.lang.Throwable -> La7
            int r5 = r4.ident     // Catch: java.lang.Throwable -> La7
            r1.put(r5, r4)     // Catch: java.lang.Throwable -> La7
            goto L38
        L4a:
            r2.remove()     // Catch: java.lang.Throwable -> La7
            goto L12
        L4e:
            int r7 = r1.size()     // Catch: java.lang.Throwable -> La7
            if (r7 <= 0) goto La5
        L54:
            if (r7 <= 0) goto L99
            int r7 = r7 + (-1)
            int r8 = r1.keyAt(r7)     // Catch: java.lang.Throwable -> La7
            android.util.SparseArray<com.lody.virtual.server.content.SyncStorageEngine$AuthorityInfo> r2 = r6.mAuthorities     // Catch: java.lang.Throwable -> La7
            r2.remove(r8)     // Catch: java.lang.Throwable -> La7
            android.util.SparseArray<android.content.SyncStatusInfo> r2 = r6.mSyncStatus     // Catch: java.lang.Throwable -> La7
            int r2 = r2.size()     // Catch: java.lang.Throwable -> La7
        L67:
            if (r2 <= 0) goto L7d
            int r2 = r2 + (-1)
            android.util.SparseArray<android.content.SyncStatusInfo> r3 = r6.mSyncStatus     // Catch: java.lang.Throwable -> La7
            int r3 = r3.keyAt(r2)     // Catch: java.lang.Throwable -> La7
            if (r3 != r8) goto L67
            android.util.SparseArray<android.content.SyncStatusInfo> r3 = r6.mSyncStatus     // Catch: java.lang.Throwable -> La7
            int r4 = r3.keyAt(r2)     // Catch: java.lang.Throwable -> La7
            r3.remove(r4)     // Catch: java.lang.Throwable -> La7
            goto L67
        L7d:
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$SyncHistoryItem> r2 = r6.mSyncHistory     // Catch: java.lang.Throwable -> La7
            int r2 = r2.size()     // Catch: java.lang.Throwable -> La7
        L83:
            if (r2 <= 0) goto L54
            int r2 = r2 + (-1)
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$SyncHistoryItem> r3 = r6.mSyncHistory     // Catch: java.lang.Throwable -> La7
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> La7
            com.lody.virtual.server.content.SyncStorageEngine$SyncHistoryItem r3 = (com.lody.virtual.server.content.SyncStorageEngine.SyncHistoryItem) r3     // Catch: java.lang.Throwable -> La7
            int r3 = r3.authorityId     // Catch: java.lang.Throwable -> La7
            if (r3 != r8) goto L83
            java.util.ArrayList<com.lody.virtual.server.content.SyncStorageEngine$SyncHistoryItem> r3 = r6.mSyncHistory     // Catch: java.lang.Throwable -> La7
            r3.remove(r2)     // Catch: java.lang.Throwable -> La7
            goto L83
        L99:
            r6.writeAccountInfoLocked()     // Catch: java.lang.Throwable -> La7
            r6.writeStatusLocked()     // Catch: java.lang.Throwable -> La7
            r6.writePendingOperationsLocked()     // Catch: java.lang.Throwable -> La7
            r6.writeStatisticsLocked()     // Catch: java.lang.Throwable -> La7
        La5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            return
        La7:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.doDatabaseCleanup(android.accounts.Account[], int):void");
    }

    public void dumpPendingOperations(StringBuilder sb) {
        sb.append("Pending Ops: ");
        sb.append(this.mPendingOperations.size());
        sb.append(" operation(s)\n");
        Iterator<PendingOperation> it = this.mPendingOperations.iterator();
        while (it.hasNext()) {
            PendingOperation next = it.next();
            sb.append("(" + next.account);
            sb.append(", u" + next.userId);
            sb.append(", " + next.authority);
            sb.append(", " + next.extras);
            sb.append(")\n");
        }
    }

    public AuthorityInfo getAuthority(int i5) {
        AuthorityInfo authorityInfo;
        synchronized (this.mAuthorities) {
            authorityInfo = this.mAuthorities.get(i5);
        }
        return authorityInfo;
    }

    public Pair<Long, Long> getBackoff(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            AuthorityInfo authorityLocked = getAuthorityLocked(account, i5, str, "getBackoff");
            if (authorityLocked != null) {
                long j5 = authorityLocked.backoffTime;
                if (j5 >= 0) {
                    return Pair.create(Long.valueOf(j5), Long.valueOf(authorityLocked.backoffDelay));
                }
            }
            return null;
        }
    }

    public ArrayList<Pair<AuthorityInfo, SyncStatusInfo>> getCopyOfAllAuthoritiesWithSyncStatus() {
        ArrayList<Pair<AuthorityInfo, SyncStatusInfo>> arrayList;
        synchronized (this.mAuthorities) {
            arrayList = new ArrayList<>(this.mAuthorities.size());
            for (int i5 = 0; i5 < this.mAuthorities.size(); i5++) {
                arrayList.add(createCopyPairOfAuthorityWithSyncStatusLocked(this.mAuthorities.valueAt(i5)));
            }
        }
        return arrayList;
    }

    public Pair<AuthorityInfo, SyncStatusInfo> getCopyOfAuthorityWithSyncStatus(Account account, int i5, String str) {
        Pair<AuthorityInfo, SyncStatusInfo> createCopyPairOfAuthorityWithSyncStatusLocked;
        synchronized (this.mAuthorities) {
            createCopyPairOfAuthorityWithSyncStatusLocked = createCopyPairOfAuthorityWithSyncStatusLocked(getOrCreateAuthorityLocked(account, i5, str, -1, true));
        }
        return createCopyPairOfAuthorityWithSyncStatusLocked;
    }

    public List<VSyncInfo> getCurrentSyncsCopy(int i5) {
        ArrayList arrayList;
        synchronized (this.mAuthorities) {
            List<VSyncInfo> currentSyncsLocked = getCurrentSyncsLocked(i5);
            arrayList = new ArrayList();
            Iterator<VSyncInfo> it = currentSyncsLocked.iterator();
            while (it.hasNext()) {
                arrayList.add(new VSyncInfo(it.next()));
            }
        }
        return arrayList;
    }

    public DayStats[] getDayStatistics() {
        DayStats[] dayStatsArr;
        synchronized (this.mAuthorities) {
            DayStats[] dayStatsArr2 = this.mDayStats;
            int length = dayStatsArr2.length;
            dayStatsArr = new DayStats[length];
            System.arraycopy(dayStatsArr2, 0, dayStatsArr, 0, length);
        }
        return dayStatsArr;
    }

    public long getDelayUntilTime(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            AuthorityInfo authorityLocked = getAuthorityLocked(account, i5, str, "getDelayUntil");
            if (authorityLocked == null) {
                return 0L;
            }
            return authorityLocked.delayUntil;
        }
    }

    public int getIsSyncable(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            if (account != null) {
                AuthorityInfo authorityLocked = getAuthorityLocked(account, i5, str, "getIsSyncable");
                if (authorityLocked == null) {
                    return -1;
                }
                return authorityLocked.syncable;
            }
            int size = this.mAuthorities.size();
            while (size > 0) {
                size--;
                AuthorityInfo valueAt = this.mAuthorities.valueAt(size);
                if (valueAt.authority.equals(str)) {
                    return valueAt.syncable;
                }
            }
            return -1;
        }
    }

    public boolean getMasterSyncAutomatically(int i5) {
        boolean booleanValue;
        synchronized (this.mAuthorities) {
            Boolean bool = this.mMasterSyncAutomatically.get(i5);
            if (bool == null) {
                booleanValue = this.mDefaultMasterSyncAutomatically;
            } else {
                booleanValue = bool.booleanValue();
            }
        }
        return booleanValue;
    }

    public int getPendingOperationCount() {
        int size;
        synchronized (this.mAuthorities) {
            size = this.mPendingOperations.size();
        }
        return size;
    }

    public ArrayList<PendingOperation> getPendingOperations() {
        ArrayList<PendingOperation> arrayList;
        synchronized (this.mAuthorities) {
            arrayList = new ArrayList<>(this.mPendingOperations);
        }
        return arrayList;
    }

    public List<PeriodicSync> getPeriodicSyncs(Account account, int i5, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mAuthorities) {
            AuthorityInfo authorityLocked = getAuthorityLocked(account, i5, str, "getPeriodicSyncs");
            if (authorityLocked != null) {
                Iterator<PeriodicSync> it = authorityLocked.periodicSyncs.iterator();
                while (it.hasNext()) {
                    arrayList.add(mirror.android.content.PeriodicSync.clone(it.next()));
                }
            }
        }
        return arrayList;
    }

    public SyncStatusInfo getStatusByAccountAndAuthority(Account account, int i5, String str) {
        if (account == null || str == null) {
            return null;
        }
        synchronized (this.mAuthorities) {
            int size = this.mSyncStatus.size();
            for (int i6 = 0; i6 < size; i6++) {
                SyncStatusInfo valueAt = this.mSyncStatus.valueAt(i6);
                AuthorityInfo authorityInfo = this.mAuthorities.get(valueAt.authorityId);
                if (authorityInfo != null && authorityInfo.authority.equals(str) && authorityInfo.userId == i5 && account.equals(authorityInfo.account)) {
                    return valueAt;
                }
            }
            return null;
        }
    }

    public boolean getSyncAutomatically(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            boolean z4 = true;
            if (account != null) {
                AuthorityInfo authorityLocked = getAuthorityLocked(account, i5, str, "getSyncAutomatically");
                if (authorityLocked == null || !authorityLocked.enabled) {
                    z4 = false;
                }
                return z4;
            }
            int size = this.mAuthorities.size();
            while (size > 0) {
                size--;
                AuthorityInfo valueAt = this.mAuthorities.valueAt(size);
                if (valueAt.authority.equals(str) && valueAt.userId == i5 && valueAt.enabled) {
                    return true;
                }
            }
            return false;
        }
    }

    public ArrayList<SyncHistoryItem> getSyncHistory() {
        ArrayList<SyncHistoryItem> arrayList;
        synchronized (this.mAuthorities) {
            int size = this.mSyncHistory.size();
            arrayList = new ArrayList<>(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(this.mSyncHistory.get(i5));
            }
        }
        return arrayList;
    }

    public int getSyncRandomOffset() {
        return this.mSyncRandomOffset;
    }

    public ArrayList<SyncStatusInfo> getSyncStatus() {
        ArrayList<SyncStatusInfo> arrayList;
        synchronized (this.mAuthorities) {
            int size = this.mSyncStatus.size();
            arrayList = new ArrayList<>(size);
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(this.mSyncStatus.valueAt(i5));
            }
        }
        return arrayList;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 1) {
            synchronized (this.mAuthorities) {
                writeStatusLocked();
            }
        } else if (i5 == 2) {
            synchronized (this.mAuthorities) {
                writeStatisticsLocked();
            }
        }
    }

    public PendingOperation insertIntoPending(PendingOperation pendingOperation) {
        synchronized (this.mAuthorities) {
            AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(pendingOperation.account, pendingOperation.userId, pendingOperation.authority, -1, true);
            if (orCreateAuthorityLocked == null) {
                return null;
            }
            PendingOperation pendingOperation2 = new PendingOperation(pendingOperation);
            pendingOperation2.authorityId = orCreateAuthorityLocked.ident;
            this.mPendingOperations.add(pendingOperation2);
            appendPendingOperationLocked(pendingOperation2);
            getOrCreateSyncStatusLocked(orCreateAuthorityLocked.ident).pending = true;
            reportChange(2);
            return pendingOperation2;
        }
    }

    public long insertStartSyncEvent(Account account, int i5, int i6, String str, long j5, int i7, boolean z4, Bundle bundle) {
        synchronized (this.mAuthorities) {
            AuthorityInfo authorityLocked = getAuthorityLocked(account, i5, str, "insertStartSyncEvent");
            if (authorityLocked == null) {
                return -1L;
            }
            SyncHistoryItem syncHistoryItem = new SyncHistoryItem();
            syncHistoryItem.initialization = z4;
            syncHistoryItem.authorityId = authorityLocked.ident;
            int i8 = this.mNextHistoryId;
            int i9 = i8 + 1;
            this.mNextHistoryId = i9;
            syncHistoryItem.historyId = i8;
            if (i9 < 0) {
                this.mNextHistoryId = 0;
            }
            syncHistoryItem.eventTime = j5;
            syncHistoryItem.source = i7;
            syncHistoryItem.reason = i6;
            syncHistoryItem.extras = bundle;
            syncHistoryItem.event = 0;
            this.mSyncHistory.add(0, syncHistoryItem);
            while (this.mSyncHistory.size() > 100) {
                this.mSyncHistory.remove(r3.size() - 1);
            }
            long j6 = syncHistoryItem.historyId;
            reportChange(8);
            return j6;
        }
    }

    public boolean isSyncActive(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            Iterator<VSyncInfo> it = getCurrentSyncs(i5).iterator();
            while (it.hasNext()) {
                AuthorityInfo authority = getAuthority(it.next().authorityId);
                if (authority != null && authority.account.equals(account) && authority.authority.equals(str) && authority.userId == i5) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean isSyncPending(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            int size = this.mSyncStatus.size();
            for (int i6 = 0; i6 < size; i6++) {
                SyncStatusInfo valueAt = this.mSyncStatus.valueAt(i6);
                AuthorityInfo authorityInfo = this.mAuthorities.get(valueAt.authorityId);
                if (authorityInfo != null && i5 == authorityInfo.userId && ((account == null || authorityInfo.account.equals(account)) && authorityInfo.authority.equals(str) && valueAt.pending)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void removeActiveSync(VSyncInfo vSyncInfo, int i5) {
        synchronized (this.mAuthorities) {
            getCurrentSyncs(i5).remove(vSyncInfo);
        }
        reportActiveChange();
    }

    public void removeAuthority(Account account, int i5, String str) {
        synchronized (this.mAuthorities) {
            removeAuthorityLocked(account, i5, str, true);
        }
    }

    public void removePeriodicSync(PeriodicSync periodicSync, int i5) {
        updateOrRemovePeriodicSync(periodicSync, i5, false);
    }

    public void removeStatusChangeListener(ISyncStatusObserver iSyncStatusObserver) {
        synchronized (this.mAuthorities) {
            this.mChangeListeners.unregister(iSyncStatusObserver);
        }
    }

    public void reportActiveChange() {
        reportChange(4);
    }

    public void setBackoff(Account account, int i5, String str, long j5, long j6) {
        boolean z4;
        synchronized (this.mAuthorities) {
            if (account != null && str != null) {
                AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(account, i5, str, -1, true);
                if (orCreateAuthorityLocked.backoffTime == j5 && orCreateAuthorityLocked.backoffDelay == j6) {
                    return;
                }
                orCreateAuthorityLocked.backoffTime = j5;
                orCreateAuthorityLocked.backoffDelay = j6;
                z4 = true;
            } else {
                z4 = false;
                for (AccountInfo accountInfo : this.mAccounts.values()) {
                    if (account == null || account.equals(accountInfo.accountAndUser.account) || i5 == accountInfo.accountAndUser.userId) {
                        for (AuthorityInfo authorityInfo : accountInfo.authorities.values()) {
                            if (str == null || str.equals(authorityInfo.authority)) {
                                if (authorityInfo.backoffTime != j5 || authorityInfo.backoffDelay != j6) {
                                    authorityInfo.backoffTime = j5;
                                    authorityInfo.backoffDelay = j6;
                                    z4 = true;
                                }
                            }
                        }
                    }
                }
            }
            if (z4) {
                reportChange(1);
            }
        }
    }

    public void setDelayUntilTime(Account account, int i5, String str, long j5) {
        synchronized (this.mAuthorities) {
            AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(account, i5, str, -1, true);
            if (orCreateAuthorityLocked.delayUntil == j5) {
                return;
            }
            orCreateAuthorityLocked.delayUntil = j5;
            reportChange(1);
        }
    }

    public void setIsSyncable(Account account, int i5, String str, int i6) {
        if (i6 > 1) {
            i6 = 1;
        } else if (i6 < -1) {
            i6 = -1;
        }
        synchronized (this.mAuthorities) {
            AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(account, i5, str, -1, false);
            if (orCreateAuthorityLocked.syncable == i6) {
                return;
            }
            orCreateAuthorityLocked.syncable = i6;
            writeAccountInfoLocked();
            if (i6 > 0) {
                requestSync(account, i5, -5, str, new Bundle());
            }
            reportChange(1);
        }
    }

    public void setMasterSyncAutomatically(boolean z4, int i5) {
        synchronized (this.mAuthorities) {
            Boolean bool = this.mMasterSyncAutomatically.get(i5);
            if (bool != null && bool.booleanValue() == z4) {
                return;
            }
            this.mMasterSyncAutomatically.put(i5, Boolean.valueOf(z4));
            writeAccountInfoLocked();
            if (z4) {
                requestSync(null, i5, -7, null, new Bundle());
            }
            reportChange(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnSyncRequestListener(OnSyncRequestListener onSyncRequestListener) {
        if (this.mSyncRequestListener == null) {
            this.mSyncRequestListener = onSyncRequestListener;
        }
    }

    public void setPeriodicSyncTime(int i5, PeriodicSync periodicSync, long j5) {
        AuthorityInfo authorityInfo;
        boolean z4;
        synchronized (this.mAuthorities) {
            authorityInfo = this.mAuthorities.get(i5);
            z4 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= authorityInfo.periodicSyncs.size()) {
                    break;
                }
                if (periodicSync.equals(authorityInfo.periodicSyncs.get(i6))) {
                    this.mSyncStatus.get(i5).setPeriodicSyncTime(i6, j5);
                    z4 = true;
                    break;
                }
                i6++;
            }
        }
        if (!z4) {
            Log.w(TAG, "Ignoring setPeriodicSyncTime request for a sync that does not exist. Authority: " + authorityInfo.authority);
        }
    }

    public void setSyncAutomatically(Account account, int i5, String str, boolean z4) {
        synchronized (this.mAuthorities) {
            AuthorityInfo orCreateAuthorityLocked = getOrCreateAuthorityLocked(account, i5, str, -1, false);
            if (orCreateAuthorityLocked.enabled == z4) {
                return;
            }
            orCreateAuthorityLocked.enabled = z4;
            writeAccountInfoLocked();
            if (z4) {
                requestSync(account, i5, -6, str, new Bundle());
            }
            reportChange(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[Catch: all -> 0x015f, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:11:0x0028, B:12:0x003e, B:15:0x0040, B:24:0x008c, B:26:0x0097, B:28:0x00b4, B:30:0x00c7, B:32:0x00cf, B:34:0x00d6, B:36:0x012d, B:38:0x0143, B:39:0x0158, B:42:0x0147, B:44:0x014e, B:45:0x0131, B:47:0x0137, B:49:0x00f5, B:51:0x0100, B:54:0x010d, B:56:0x011d, B:57:0x011f, B:60:0x009f, B:62:0x00a3, B:63:0x006f, B:64:0x0075, B:65:0x007b, B:66:0x0081, B:67:0x0087), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d A[Catch: all -> 0x015f, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:11:0x0028, B:12:0x003e, B:15:0x0040, B:24:0x008c, B:26:0x0097, B:28:0x00b4, B:30:0x00c7, B:32:0x00cf, B:34:0x00d6, B:36:0x012d, B:38:0x0143, B:39:0x0158, B:42:0x0147, B:44:0x014e, B:45:0x0131, B:47:0x0137, B:49:0x00f5, B:51:0x0100, B:54:0x010d, B:56:0x011d, B:57:0x011f, B:60:0x009f, B:62:0x00a3, B:63:0x006f, B:64:0x0075, B:65:0x007b, B:66:0x0081, B:67:0x0087), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143 A[Catch: all -> 0x015f, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:11:0x0028, B:12:0x003e, B:15:0x0040, B:24:0x008c, B:26:0x0097, B:28:0x00b4, B:30:0x00c7, B:32:0x00cf, B:34:0x00d6, B:36:0x012d, B:38:0x0143, B:39:0x0158, B:42:0x0147, B:44:0x014e, B:45:0x0131, B:47:0x0137, B:49:0x00f5, B:51:0x0100, B:54:0x010d, B:56:0x011d, B:57:0x011f, B:60:0x009f, B:62:0x00a3, B:63:0x006f, B:64:0x0075, B:65:0x007b, B:66:0x0081, B:67:0x0087), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147 A[Catch: all -> 0x015f, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:11:0x0028, B:12:0x003e, B:15:0x0040, B:24:0x008c, B:26:0x0097, B:28:0x00b4, B:30:0x00c7, B:32:0x00cf, B:34:0x00d6, B:36:0x012d, B:38:0x0143, B:39:0x0158, B:42:0x0147, B:44:0x014e, B:45:0x0131, B:47:0x0137, B:49:0x00f5, B:51:0x0100, B:54:0x010d, B:56:0x011d, B:57:0x011f, B:60:0x009f, B:62:0x00a3, B:63:0x006f, B:64:0x0075, B:65:0x007b, B:66:0x0081, B:67:0x0087), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131 A[Catch: all -> 0x015f, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:11:0x0028, B:12:0x003e, B:15:0x0040, B:24:0x008c, B:26:0x0097, B:28:0x00b4, B:30:0x00c7, B:32:0x00cf, B:34:0x00d6, B:36:0x012d, B:38:0x0143, B:39:0x0158, B:42:0x0147, B:44:0x014e, B:45:0x0131, B:47:0x0137, B:49:0x00f5, B:51:0x0100, B:54:0x010d, B:56:0x011d, B:57:0x011f, B:60:0x009f, B:62:0x00a3, B:63:0x006f, B:64:0x0075, B:65:0x007b, B:66:0x0081, B:67:0x0087), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5 A[Catch: all -> 0x015f, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:11:0x0028, B:12:0x003e, B:15:0x0040, B:24:0x008c, B:26:0x0097, B:28:0x00b4, B:30:0x00c7, B:32:0x00cf, B:34:0x00d6, B:36:0x012d, B:38:0x0143, B:39:0x0158, B:42:0x0147, B:44:0x014e, B:45:0x0131, B:47:0x0137, B:49:0x00f5, B:51:0x0100, B:54:0x010d, B:56:0x011d, B:57:0x011f, B:60:0x009f, B:62:0x00a3, B:63:0x006f, B:64:0x0075, B:65:0x007b, B:66:0x0081, B:67:0x0087), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void stopSyncEvent(long r18, long r20, java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.server.content.SyncStorageEngine.stopSyncEvent(long, long, java.lang.String, long, long):void");
    }

    public void writeAllState() {
        synchronized (this.mAuthorities) {
            if (this.mNumPendingFinished > 0) {
                writePendingOperationsLocked();
            }
            writeStatusLocked();
            writeStatisticsLocked();
        }
    }

    private AuthorityInfo getAuthorityLocked(ComponentName componentName, int i5, String str) {
        AuthorityInfo authorityInfo = this.mServices.get(componentName).get(i5);
        if (authorityInfo == null) {
            return null;
        }
        return authorityInfo;
    }

    /* loaded from: classes3.dex */
    public static class PendingOperation {
        final Account account;
        final String authority;
        int authorityId;
        final boolean expedited;
        final Bundle extras;
        byte[] flatExtras;
        final int reason;
        final ComponentName serviceName;
        final int syncSource;
        final int userId;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PendingOperation(Account account, int i5, int i6, int i7, String str, Bundle bundle, boolean z4) {
            this.account = account;
            this.userId = i5;
            this.syncSource = i7;
            this.reason = i6;
            this.authority = str;
            this.extras = bundle != null ? new Bundle(bundle) : bundle;
            this.expedited = z4;
            this.authorityId = -1;
            this.serviceName = null;
        }

        PendingOperation(PendingOperation pendingOperation) {
            this.account = pendingOperation.account;
            this.userId = pendingOperation.userId;
            this.reason = pendingOperation.reason;
            this.syncSource = pendingOperation.syncSource;
            this.authority = pendingOperation.authority;
            this.extras = pendingOperation.extras;
            this.authorityId = pendingOperation.authorityId;
            this.expedited = pendingOperation.expedited;
            this.serviceName = pendingOperation.serviceName;
        }
    }

    private AuthorityInfo getOrCreateAuthorityLocked(Account account, int i5, String str, int i6, boolean z4) {
        AccountAndUser accountAndUser = new AccountAndUser(account, i5);
        AccountInfo accountInfo = this.mAccounts.get(accountAndUser);
        if (accountInfo == null) {
            accountInfo = new AccountInfo(accountAndUser);
            this.mAccounts.put(accountAndUser, accountInfo);
        }
        AuthorityInfo authorityInfo = accountInfo.authorities.get(str);
        if (authorityInfo == null) {
            if (i6 < 0) {
                i6 = this.mNextAuthorityId;
                this.mNextAuthorityId = i6 + 1;
                z4 = true;
            }
            authorityInfo = new AuthorityInfo(account, i5, str, i6);
            accountInfo.authorities.put(str, authorityInfo);
            this.mAuthorities.put(i6, authorityInfo);
            if (z4) {
                writeAccountInfoLocked();
            }
        }
        return authorityInfo;
    }

    /* loaded from: classes3.dex */
    public static class AuthorityInfo {
        final Account account;
        final String authority;
        long backoffDelay;
        long backoffTime;
        long delayUntil;
        boolean enabled;
        final int ident;
        final ArrayList<PeriodicSync> periodicSyncs;
        final ComponentName service;
        int syncable;
        final int userId;

        AuthorityInfo(AuthorityInfo authorityInfo) {
            this.account = authorityInfo.account;
            this.userId = authorityInfo.userId;
            this.authority = authorityInfo.authority;
            this.service = authorityInfo.service;
            this.ident = authorityInfo.ident;
            this.enabled = authorityInfo.enabled;
            this.syncable = authorityInfo.syncable;
            this.backoffTime = authorityInfo.backoffTime;
            this.backoffDelay = authorityInfo.backoffDelay;
            this.delayUntil = authorityInfo.delayUntil;
            this.periodicSyncs = new ArrayList<>();
            Iterator<PeriodicSync> it = authorityInfo.periodicSyncs.iterator();
            while (it.hasNext()) {
                this.periodicSyncs.add(mirror.android.content.PeriodicSync.clone(it.next()));
            }
        }

        AuthorityInfo(Account account, int i5, String str, int i6) {
            this.account = account;
            this.userId = i5;
            this.authority = str;
            this.service = null;
            this.ident = i6;
            this.enabled = false;
            this.syncable = -1;
            this.backoffTime = -1L;
            this.backoffDelay = -1L;
            ArrayList<PeriodicSync> arrayList = new ArrayList<>();
            this.periodicSyncs = arrayList;
            PeriodicSync periodicSync = new PeriodicSync(account, str, new Bundle(), SyncStorageEngine.DEFAULT_POLL_FREQUENCY_SECONDS);
            mirror.android.content.PeriodicSync.flexTime.set(periodicSync, SyncStorageEngine.calculateDefaultFlexTime(SyncStorageEngine.DEFAULT_POLL_FREQUENCY_SECONDS));
            arrayList.add(periodicSync);
        }

        AuthorityInfo(ComponentName componentName, int i5, int i6) {
            this.account = null;
            this.userId = i5;
            this.authority = null;
            this.service = componentName;
            this.ident = i6;
            this.enabled = true;
            this.syncable = -1;
            this.backoffTime = -1L;
            this.backoffDelay = -1L;
            ArrayList<PeriodicSync> arrayList = new ArrayList<>();
            this.periodicSyncs = arrayList;
            PeriodicSync periodicSync = new PeriodicSync(null, null, new Bundle(), SyncStorageEngine.DEFAULT_POLL_FREQUENCY_SECONDS);
            mirror.android.content.PeriodicSync.flexTime.set(periodicSync, SyncStorageEngine.calculateDefaultFlexTime(SyncStorageEngine.DEFAULT_POLL_FREQUENCY_SECONDS));
            arrayList.add(periodicSync);
        }
    }
}
