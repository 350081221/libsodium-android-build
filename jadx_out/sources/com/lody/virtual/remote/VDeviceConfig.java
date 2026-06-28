package com.lody.virtual.remote;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.lody.virtual.os.VEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes3.dex */
public class VDeviceConfig implements Parcelable {
    public static final int VERSION = 3;
    public String androidId;
    public String bluetoothMac;
    public final Map<String, String> buildProp = new HashMap();
    public String deviceId;
    public boolean enable;
    public String gmsAdId;
    public String iccId;
    public String serial;
    public String wifiMac;
    private static final UsedDeviceInfoPool mPool = new UsedDeviceInfoPool();
    public static final Parcelable.Creator<VDeviceConfig> CREATOR = new Parcelable.Creator<VDeviceConfig>() { // from class: com.lody.virtual.remote.VDeviceConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VDeviceConfig createFromParcel(Parcel parcel) {
            return new VDeviceConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VDeviceConfig[] newArray(int i5) {
            return new VDeviceConfig[i5];
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class UsedDeviceInfoPool {
        final List<String> androidIds;
        final List<String> bluetoothMacs;
        final List<String> deviceIds;
        final List<String> iccIds;
        final List<String> wifiMacs;

        private UsedDeviceInfoPool() {
            this.deviceIds = new ArrayList();
            this.androidIds = new ArrayList();
            this.wifiMacs = new ArrayList();
            this.bluetoothMacs = new ArrayList();
            this.iccIds = new ArrayList();
        }
    }

    public VDeviceConfig() {
    }

    public static void addToPool(VDeviceConfig vDeviceConfig) {
        UsedDeviceInfoPool usedDeviceInfoPool = mPool;
        usedDeviceInfoPool.deviceIds.add(vDeviceConfig.deviceId);
        usedDeviceInfoPool.androidIds.add(vDeviceConfig.androidId);
        usedDeviceInfoPool.wifiMacs.add(vDeviceConfig.wifiMac);
        usedDeviceInfoPool.bluetoothMacs.add(vDeviceConfig.bluetoothMac);
        usedDeviceInfoPool.iccIds.add(vDeviceConfig.iccId);
    }

    public static String generate10(long j5, int i5) {
        Random random = new Random(j5);
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public static String generateDeviceId() {
        return generate10(System.currentTimeMillis(), 15);
    }

    public static String generateHex(long j5, int i5) {
        Random random = new Random(j5);
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < i5; i6++) {
            int nextInt = random.nextInt(16);
            if (nextInt < 10) {
                sb.append(nextInt);
            } else {
                sb.append((char) ((nextInt - 10) + 97));
            }
        }
        return sb.toString();
    }

    private static String generateMac() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int i5 = 1;
        for (int i6 = 0; i6 < 12; i6++) {
            int nextInt = random.nextInt(16);
            if (nextInt < 10) {
                sb.append(nextInt);
            } else {
                sb.append((char) (nextInt + 87));
            }
            if (i6 == i5 && i6 != 11) {
                sb.append(":");
                i5 += 2;
            }
        }
        return sb.toString();
    }

    @SuppressLint({"HardwareIds"})
    private static String generateSerial() {
        String str = Build.SERIAL;
        if (str == null || str.length() <= 0) {
            str = "0123456789ABCDEF";
        }
        ArrayList arrayList = new ArrayList();
        for (char c5 : str.toCharArray()) {
            arrayList.add(Character.valueOf(c5));
        }
        Collections.shuffle(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((Character) it.next()).charValue());
        }
        return sb.toString();
    }

    public static VDeviceConfig random() {
        String generateDeviceId;
        String generateHex;
        String generateMac;
        String generateMac2;
        String generate10;
        VDeviceConfig vDeviceConfig = new VDeviceConfig();
        do {
            generateDeviceId = generateDeviceId();
            vDeviceConfig.deviceId = generateDeviceId;
        } while (mPool.deviceIds.contains(generateDeviceId));
        do {
            generateHex = generateHex(System.currentTimeMillis(), 16);
            vDeviceConfig.androidId = generateHex;
        } while (mPool.androidIds.contains(generateHex));
        do {
            generateMac = generateMac();
            vDeviceConfig.wifiMac = generateMac;
        } while (mPool.wifiMacs.contains(generateMac));
        do {
            generateMac2 = generateMac();
            vDeviceConfig.bluetoothMac = generateMac2;
        } while (mPool.bluetoothMacs.contains(generateMac2));
        do {
            generate10 = generate10(System.currentTimeMillis(), 20);
            vDeviceConfig.iccId = generate10;
        } while (mPool.iccIds.contains(generate10));
        vDeviceConfig.serial = generateSerial();
        addToPool(vDeviceConfig);
        return vDeviceConfig;
    }

    public void clear() {
        this.deviceId = null;
        this.androidId = null;
        this.wifiMac = null;
        this.bluetoothMac = null;
        this.iccId = null;
        this.serial = null;
        this.gmsAdId = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getProp(String str) {
        return this.buildProp.get(str);
    }

    public File getWifiFile(int i5, boolean z4) {
        if (TextUtils.isEmpty(this.wifiMac)) {
            return null;
        }
        File wifiMacFile = VEnvironment.getWifiMacFile(i5, z4);
        if (!wifiMacFile.exists()) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(wifiMacFile, "rws");
                randomAccessFile.write((this.wifiMac + "\n").getBytes());
                randomAccessFile.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return wifiMacFile;
    }

    public void setProp(String str, String str2) {
        this.buildProp.put(str, str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.androidId);
        parcel.writeString(this.wifiMac);
        parcel.writeString(this.bluetoothMac);
        parcel.writeString(this.iccId);
        parcel.writeString(this.serial);
        parcel.writeString(this.gmsAdId);
        parcel.writeInt(this.buildProp.size());
        for (Map.Entry<String, String> entry : this.buildProp.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public VDeviceConfig(Parcel parcel) {
        this.enable = parcel.readByte() != 0;
        this.deviceId = parcel.readString();
        this.androidId = parcel.readString();
        this.wifiMac = parcel.readString();
        this.bluetoothMac = parcel.readString();
        this.iccId = parcel.readString();
        this.serial = parcel.readString();
        this.gmsAdId = parcel.readString();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            this.buildProp.put(parcel.readString(), parcel.readString());
        }
    }
}
