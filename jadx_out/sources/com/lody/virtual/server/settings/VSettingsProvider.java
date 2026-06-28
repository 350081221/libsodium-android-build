package com.lody.virtual.server.settings;

import android.content.ContentResolver;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseArray;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.os.VEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mirror.android.providers.Settings;

/* loaded from: classes3.dex */
public class VSettingsProvider {
    private static final int MSG_QUITE = 2;
    private static final int MSG_SAVE_SETTINGS_TO_FILE = 1;
    private static final int SETTINGS_FILE_VERIFY_FLAG = 1;
    public static final int TABLE_INDEX_CONFIG = 3;
    public static final int TABLE_INDEX_GLOBAL = 2;
    public static final int TABLE_INDEX_SECURE = 1;
    public static final int TABLE_INDEX_SYSTEM = 0;
    private static final long TIME_TO_QUITE = 60000;
    public static final List<String> sConfigTableCanLookup;
    private static VSettingsProvider sVSettingsProvider;
    private final SparseArray<HashMap<String, String>> mConfig;
    private final ContentResolver mContentResolver;
    private final SparseArray<HashMap<String, String>> mGlobal;
    private HandlerThread mHandleThread;
    private Handler mHandlerSettingsSync;
    private final SparseArray<HashMap<String, String>> mSystem;
    private final SparseArray[] mTables;
    private final SparseArray<HashMap<String, String>> sSecure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class HandlerSM extends Handler {
        HandlerSM(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 1) {
                synchronized (VSettingsProvider.class) {
                    VSettingsProvider.this.saveSettingsToFile(message.arg1);
                    if (!VSettingsProvider.this.mHandlerSettingsSync.hasMessages(1)) {
                        VSettingsProvider.this.mHandlerSettingsSync.sendEmptyMessageDelayed(2, 60000L);
                    }
                }
                return;
            }
            if (i5 == 2) {
                synchronized (VSettingsProvider.class) {
                    if (!hasMessages(1)) {
                        removeMessages(2);
                        if (VSettingsProvider.this.mHandleThread != null) {
                            VSettingsProvider.this.mHandleThread.quit();
                        }
                        VSettingsProvider.this.mHandleThread = null;
                        VSettingsProvider.this.mHandlerSettingsSync = null;
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        sConfigTableCanLookup = arrayList;
        arrayList.add("textclassifier");
        arrayList.add("runtime");
        sVSettingsProvider = new VSettingsProvider();
    }

    private VSettingsProvider() {
        SparseArray<HashMap<String, String>> sparseArray = new SparseArray<>();
        this.mSystem = sparseArray;
        SparseArray<HashMap<String, String>> sparseArray2 = new SparseArray<>();
        this.sSecure = sparseArray2;
        SparseArray<HashMap<String, String>> sparseArray3 = new SparseArray<>();
        this.mGlobal = sparseArray3;
        SparseArray<HashMap<String, String>> sparseArray4 = new SparseArray<>();
        this.mConfig = sparseArray4;
        this.mTables = new SparseArray[]{sparseArray, sparseArray2, sparseArray3, sparseArray4};
        this.mContentResolver = VirtualCore.get().getContext().getContentResolver();
    }

    public static VSettingsProvider getInstance() {
        return sVSettingsProvider;
    }

    private File getSystemSettingsFile(int i5) {
        return VEnvironment.getSystemSettingsFile(i5);
    }

    private void loadSettingsFromFile(int i5) {
        FileInputStream fileInputStream;
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> hashMap2 = new HashMap<>();
        HashMap<String, String> hashMap3 = new HashMap<>();
        HashMap<String, String> hashMap4 = new HashMap<>();
        this.mSystem.put(i5, hashMap);
        this.sSecure.put(i5, hashMap2);
        this.mGlobal.put(i5, hashMap3);
        this.mConfig.put(i5, hashMap4);
        File systemSettingsFile = getSystemSettingsFile(i5);
        if (!systemSettingsFile.exists()) {
            return;
        }
        int length = (int) systemSettingsFile.length();
        byte[] bArr = new byte[length];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(systemSettingsFile);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e5) {
            e = e5;
        }
        try {
            int read = fileInputStream.read(bArr);
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            if (length != read) {
                systemSettingsFile.delete();
                return;
            }
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, length);
            obtain.setDataPosition(0);
            if (obtain.readInt() != 1) {
                obtain.recycle();
                return;
            }
            int readInt = obtain.readInt();
            for (int i6 = 0; i6 < readInt; i6++) {
                hashMap.put(obtain.readString(), obtain.readString());
            }
            int readInt2 = obtain.readInt();
            for (int i7 = 0; i7 < readInt2; i7++) {
                hashMap2.put(obtain.readString(), obtain.readString());
            }
            int readInt3 = obtain.readInt();
            for (int i8 = 0; i8 < readInt3; i8++) {
                hashMap3.put(obtain.readString(), obtain.readString());
            }
            int readInt4 = obtain.readInt();
            for (int i9 = 0; i9 < readInt4; i9++) {
                hashMap4.put(obtain.readString(), obtain.readString());
            }
            obtain.recycle();
        } catch (Exception e6) {
            e = e6;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            systemSettingsFile.delete();
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused2) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    private static void writeMapToParcel(HashMap<String, String> hashMap, Parcel parcel) {
        if (hashMap != null && hashMap.size() > 0) {
            parcel.writeInt(hashMap.size());
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
            return;
        }
        parcel.writeInt(0);
    }

    public final String getSettingsProvider(int i5, int i6, String str) {
        try {
            SparseArray[] sparseArrayArr = this.mTables;
            if (i6 < sparseArrayArr.length && i5 >= 0) {
                SparseArray sparseArray = sparseArrayArr[i6];
                HashMap hashMap = (HashMap) sparseArray.get(i5);
                if (hashMap == null) {
                    synchronized (VSettingsProvider.class) {
                        loadSettingsFromFile(i5);
                    }
                    hashMap = (HashMap) sparseArray.get(i5);
                }
                String str2 = (String) hashMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                if (i6 == 1) {
                    return Settings.Secure.getString(this.mContentResolver, str);
                }
                if (i6 == 2) {
                    return Settings.Global.getString(this.mContentResolver, str);
                }
                if (i6 == 3 && Build.VERSION.SDK_INT >= 29 && sConfigTableCanLookup.contains(str.split("/")[0])) {
                    return (String) Settings.Config.getString(this.mContentResolver, str);
                }
                return str2;
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void saveSettingsToFile(int i5) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInt(1);
            writeMapToParcel(this.mSystem.get(i5), obtain);
            writeMapToParcel(this.sSecure.get(i5), obtain);
            writeMapToParcel(this.mGlobal.get(i5), obtain);
            writeMapToParcel(this.mConfig.get(i5), obtain);
            File systemSettingsFile = getSystemSettingsFile(i5);
            if (!systemSettingsFile.exists()) {
                systemSettingsFile.createNewFile();
            }
        } catch (Exception unused) {
        }
        obtain.recycle();
    }

    public final void setSettingsProvider(int i5, int i6, String str, String str2) {
        boolean z4;
        try {
            SparseArray[] sparseArrayArr = this.mTables;
            if (i6 < sparseArrayArr.length && i5 >= 0) {
                SparseArray sparseArray = sparseArrayArr[i6];
                synchronized (VSettingsProvider.class) {
                    if (sparseArray.get(i5) == null) {
                        loadSettingsFromFile(i5);
                    }
                    HashMap hashMap = (HashMap) sparseArray.get(i5);
                    if (!TextUtils.equals((CharSequence) hashMap.get(str), str2)) {
                        hashMap.put(str, str2);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (this.mHandleThread == null) {
                            HandlerThread handlerThread = new HandlerThread("SETTINGS_SAVE_TO_FILE");
                            this.mHandleThread = handlerThread;
                            handlerThread.start();
                            this.mHandlerSettingsSync = new HandlerSM(this.mHandleThread.getLooper());
                        }
                        this.mHandlerSettingsSync.removeMessages(1);
                        Handler handler = this.mHandlerSettingsSync;
                        handler.sendMessageDelayed(handler.obtainMessage(1, i5, 0), 5000L);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
