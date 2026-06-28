package com.huawei.hms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import com.huawei.hms.common.sqlite.HMSCursorWrapper;
import com.huawei.hms.support.log.HMSLog;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    private static final String TAG = "DataHolder";
    public static final String TYPE_BOOLEAN = "type_boolean";
    public static final String TYPE_BYTE_ARRAY = "type_byte_array";
    public static final String TYPE_DOUBLE = "type_double";
    public static final String TYPE_FLOAT = "type_float";
    public static final String TYPE_INT = "type_int";
    public static final String TYPE_LONG = "type_long";
    public static final String TYPE_STRING = "type_string";
    private String[] columns;
    private Bundle columnsBundle;
    private CursorWindow[] cursorWindows;
    private int dataCount;
    private boolean isInstance;
    private boolean mClosed;
    private Bundle metadata;
    private int[] perCursorCounts;
    private int statusCode;
    private int version;
    public static final Parcelable.Creator<DataHolder> CREATOR = new DataHolderCreator();
    private static final Builder BUILDER = new DataHolderBuilderCreator(new String[0], null);

    /* loaded from: classes3.dex */
    public static class Builder {
        private String[] builderColumns;
        private final ArrayList<HashMap<String, Object>> dataCollectionList;
        private final String type;
        private final HashMap<Object, Integer> typeAndDataCollectionCountMapping;

        /* JADX WARN: Multi-variable type inference failed */
        public DataHolder build(int i5) {
            return new DataHolder(this, i5, (Bundle) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.huawei.hms.common.data.DataHolder.Builder setDataForContentValuesHashMap(java.util.HashMap<java.lang.String, java.lang.Object> r4) {
            /*
                r3 = this;
                java.lang.String r0 = "contentValuesHashMap cannot be null"
                com.huawei.hms.common.internal.Preconditions.checkNotNull(r4, r0)
                java.lang.String r0 = r3.type
                if (r0 == 0) goto L2e
                java.lang.Object r0 = r4.get(r0)
                if (r0 == 0) goto L2e
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.typeAndDataCollectionCountMapping
                java.lang.Object r1 = r1.get(r0)
                java.lang.Integer r1 = (java.lang.Integer) r1
                if (r1 == 0) goto L1f
                int r0 = r1.intValue()
                r1 = 1
                goto L30
            L1f:
                java.util.HashMap<java.lang.Object, java.lang.Integer> r1 = r3.typeAndDataCollectionCountMapping
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r2 = r3.dataCollectionList
                int r2 = r2.size()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.put(r0, r2)
            L2e:
                r0 = 0
                r1 = r0
            L30:
                if (r1 == 0) goto L3d
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.dataCollectionList
                r1.remove(r0)
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r1 = r3.dataCollectionList
                r1.add(r0, r4)
                goto L42
            L3d:
                java.util.ArrayList<java.util.HashMap<java.lang.String, java.lang.Object>> r0 = r3.dataCollectionList
                r0.add(r4)
            L42:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.Builder.setDataForContentValuesHashMap(java.util.HashMap):com.huawei.hms.common.data.DataHolder$Builder");
        }

        public Builder withRow(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "contentValues cannot be null");
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return setDataForContentValuesHashMap(hashMap);
        }

        private Builder(String[] strArr, String str) {
            Preconditions.checkNotNull(strArr, "builderColumnsP cannot be null");
            this.builderColumns = strArr;
            this.dataCollectionList = new ArrayList<>();
            this.type = str;
            this.typeAndDataCollectionCountMapping = new HashMap<>();
        }

        public DataHolder build(int i5, Bundle bundle) {
            return new DataHolder(this, i5, bundle, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(String[] strArr, String str, DataHolderBuilderCreator dataHolderBuilderCreator) {
            this(strArr, null);
        }
    }

    /* loaded from: classes3.dex */
    public static class DataHolderException extends RuntimeException {
        public DataHolderException(String str) {
            super(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, (String) null);
    }

    private void checkAvailable(String str, int i5) {
        String str2;
        Bundle bundle = this.columnsBundle;
        if (bundle != null && bundle.containsKey(str)) {
            if (isClosed()) {
                str2 = "buffer has been closed";
            } else if (i5 >= 0 && i5 < this.dataCount) {
                str2 = "";
            } else {
                str2 = "row is out of index:" + i5;
            }
        } else {
            str2 = "cannot find column: " + str;
        }
        Preconditions.checkArgument(str2.isEmpty(), str2);
    }

    public static DataHolder empty(int i5) {
        return new DataHolder(BUILDER, i5, (Bundle) null);
    }

    private static CursorWindow[] getCursorWindows(HMSCursorWrapper hMSCursorWrapper) {
        int i5;
        ArrayList arrayList = new ArrayList();
        try {
            int count = hMSCursorWrapper.getCount();
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                i5 = 0;
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
                arrayList.add(window);
                i5 = window.getNumRows();
            }
            arrayList.addAll(iterCursorWrapper(hMSCursorWrapper, i5, count));
            return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        } catch (Throwable th) {
            try {
                HMSLog.e(TAG, "fail to getCursorWindows: " + th.getMessage());
                return new CursorWindow[0];
            } finally {
                hMSCursorWrapper.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<android.database.CursorWindow> iterCursorWindow(com.huawei.hms.common.data.DataHolder.Builder r10, int r11, java.util.List r12) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.CursorWindow r1 = new android.database.CursorWindow
            r2 = 0
            r1.<init>(r2)
            java.lang.String[] r3 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)
            int r3 = r3.length
            r1.setNumColumns(r3)
            r0.add(r1)
            r3 = 0
            r4 = r3
        L18:
            if (r4 >= r11) goto Lb0
            boolean r5 = r1.allocRow()     // Catch: java.lang.RuntimeException -> L9a
            java.lang.String r6 = "DataHolder"
            if (r5 != 0) goto L46
            java.lang.String r1 = "Failed to allocate a row"
            com.huawei.hms.support.log.HMSLog.d(r6, r1)     // Catch: java.lang.RuntimeException -> L9a
            android.database.CursorWindow r1 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L9a
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L9a
            r1.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L9a
            java.lang.String[] r5 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L9a
            int r5 = r5.length     // Catch: java.lang.RuntimeException -> L9a
            r1.setNumColumns(r5)     // Catch: java.lang.RuntimeException -> L9a
            boolean r5 = r1.allocRow()     // Catch: java.lang.RuntimeException -> L9a
            if (r5 != 0) goto L43
            java.lang.String r10 = "Failed to retry to allocate a row"
            com.huawei.hms.support.log.HMSLog.e(r6, r10)     // Catch: java.lang.RuntimeException -> L9a
            return r0
        L43:
            r0.add(r1)     // Catch: java.lang.RuntimeException -> L9a
        L46:
            java.lang.Object r5 = r12.get(r4)     // Catch: java.lang.RuntimeException -> L9a
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.RuntimeException -> L9a
            r7 = 1
            r8 = r3
        L4e:
            java.lang.String[] r9 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L9a
            int r9 = r9.length     // Catch: java.lang.RuntimeException -> L9a
            if (r8 >= r9) goto L69
            java.lang.String[] r7 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L9a
            r7 = r7[r8]     // Catch: java.lang.RuntimeException -> L9a
            java.lang.Object r7 = r5.get(r7)     // Catch: java.lang.RuntimeException -> L9a
            boolean r7 = putValue(r1, r7, r4, r8)     // Catch: java.lang.RuntimeException -> L9a
            if (r7 != 0) goto L66
            goto L69
        L66:
            int r8 = r8 + 1
            goto L4e
        L69:
            if (r7 != 0) goto L96
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L9a
            r11.<init>()     // Catch: java.lang.RuntimeException -> L9a
            java.lang.String r12 = "fail to put data for row "
            r11.append(r12)     // Catch: java.lang.RuntimeException -> L9a
            r11.append(r4)     // Catch: java.lang.RuntimeException -> L9a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.RuntimeException -> L9a
            com.huawei.hms.support.log.HMSLog.d(r6, r11)     // Catch: java.lang.RuntimeException -> L9a
            r1.freeLastRow()     // Catch: java.lang.RuntimeException -> L9a
            android.database.CursorWindow r11 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L9a
            r11.<init>(r2)     // Catch: java.lang.RuntimeException -> L9a
            r11.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L9a
            java.lang.String[] r10 = com.huawei.hms.common.data.DataHolder.Builder.access$200(r10)     // Catch: java.lang.RuntimeException -> L9a
            int r10 = r10.length     // Catch: java.lang.RuntimeException -> L9a
            r11.setNumColumns(r10)     // Catch: java.lang.RuntimeException -> L9a
            r0.add(r11)     // Catch: java.lang.RuntimeException -> L9a
            goto Lb0
        L96:
            int r4 = r4 + 1
            goto L18
        L9a:
            r10 = move-exception
            java.util.Iterator r11 = r0.iterator()
        L9f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Laf
            java.lang.Object r12 = r11.next()
            android.database.CursorWindow r12 = (android.database.CursorWindow) r12
            r12.close()
            goto L9f
        Laf:
            throw r10
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.data.DataHolder.iterCursorWindow(com.huawei.hms.common.data.DataHolder$Builder, int, java.util.List):java.util.ArrayList");
    }

    private static ArrayList<CursorWindow> iterCursorWrapper(HMSCursorWrapper hMSCursorWrapper, int i5, int i6) {
        ArrayList<CursorWindow> arrayList = new ArrayList<>();
        while (i5 < i6 && hMSCursorWrapper.moveToPosition(i5)) {
            CursorWindow window = hMSCursorWrapper.getWindow();
            if (window == null) {
                window = new CursorWindow((String) null);
                window.setStartPosition(i5);
                hMSCursorWrapper.fillWindow(i5, window);
            } else {
                window.acquireReference();
                hMSCursorWrapper.setWindow(null);
            }
            if (window.getNumRows() == 0) {
                break;
            }
            arrayList.add(window);
            i5 = window.getNumRows() + window.getStartPosition();
        }
        return arrayList;
    }

    private static boolean putValue(CursorWindow cursorWindow, Object obj, int i5, int i6) throws IllegalArgumentException {
        long j5;
        if (obj == null) {
            return cursorWindow.putNull(i5, i6);
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            return cursorWindow.putLong(j5, i5, i6);
        }
        if (obj instanceof Integer) {
            return cursorWindow.putLong(((Integer) obj).intValue(), i5, i6);
        }
        if (obj instanceof Long) {
            return cursorWindow.putLong(((Long) obj).longValue(), i5, i6);
        }
        if (obj instanceof Float) {
            return cursorWindow.putDouble(((Float) obj).floatValue(), i5, i6);
        }
        if (obj instanceof Double) {
            return cursorWindow.putDouble(((Double) obj).doubleValue(), i5, i6);
        }
        if (obj instanceof String) {
            return cursorWindow.putString((String) obj, i5, i6);
        }
        if (obj instanceof byte[]) {
            return cursorWindow.putBlob((byte[]) obj, i5, i6);
        }
        throw new IllegalArgumentException("unsupported type for column: " + obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.mClosed) {
            for (CursorWindow cursorWindow : this.cursorWindows) {
                cursorWindow.close();
            }
            this.mClosed = true;
        }
    }

    public final void collectColumsAndCount() {
        this.columnsBundle = new Bundle();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr = this.columns;
            if (i6 >= strArr.length) {
                break;
            }
            this.columnsBundle.putInt(strArr[i6], i6);
            i6++;
        }
        this.perCursorCounts = new int[this.cursorWindows.length];
        int i7 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.cursorWindows;
            if (i5 < cursorWindowArr.length) {
                this.perCursorCounts[i5] = i7;
                i7 = cursorWindowArr[i5].getStartPosition() + this.cursorWindows[i5].getNumRows();
                i5++;
            } else {
                this.dataCount = i7;
                return;
            }
        }
    }

    public final void copyToBuffer(String str, int i5, int i6, CharArrayBuffer charArrayBuffer) {
        checkAvailable(str, i5);
        this.cursorWindows[i6].copyStringToBuffer(i5, this.columnsBundle.getInt(str), charArrayBuffer);
    }

    protected final void finalize() throws Throwable {
        if (this.isInstance && this.cursorWindows.length > 0 && !isClosed()) {
            close();
        }
        super.finalize();
    }

    public final int getCount() {
        return this.dataCount;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final Object getValue(String str, int i5, int i6, String str2) {
        str2.hashCode();
        boolean z4 = true;
        char c5 = 65535;
        switch (str2.hashCode()) {
            case -1092271849:
                if (str2.equals(TYPE_FLOAT)) {
                    c5 = 0;
                    break;
                }
                break;
            case -870070237:
                if (str2.equals(TYPE_BOOLEAN)) {
                    c5 = 1;
                    break;
                }
                break;
            case -675993238:
                if (str2.equals(TYPE_INT)) {
                    c5 = 2;
                    break;
                }
                break;
            case 445002870:
                if (str2.equals(TYPE_DOUBLE)) {
                    c5 = 3;
                    break;
                }
                break;
            case 519136353:
                if (str2.equals(TYPE_LONG)) {
                    c5 = 4;
                    break;
                }
                break;
            case 878975158:
                if (str2.equals(TYPE_STRING)) {
                    c5 = 5;
                    break;
                }
                break;
            case 1300508295:
                if (str2.equals(TYPE_BYTE_ARRAY)) {
                    c5 = 6;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                checkAvailable(str, i5);
                return Float.valueOf(this.cursorWindows[i6].getFloat(i5, this.columnsBundle.getInt(str)));
            case 1:
                checkAvailable(str, i5);
                if (this.cursorWindows[i6].getLong(i5, this.columnsBundle.getInt(str)) != 1) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 2:
                checkAvailable(str, i5);
                return Integer.valueOf(this.cursorWindows[i6].getInt(i5, this.columnsBundle.getInt(str)));
            case 3:
                checkAvailable(str, i5);
                return Double.valueOf(this.cursorWindows[i6].getDouble(i5, this.columnsBundle.getInt(str)));
            case 4:
                checkAvailable(str, i5);
                return Long.valueOf(this.cursorWindows[i6].getLong(i5, this.columnsBundle.getInt(str)));
            case 5:
                checkAvailable(str, i5);
                return this.cursorWindows[i6].getString(i5, this.columnsBundle.getInt(str));
            case 6:
                checkAvailable(str, i5);
                return this.cursorWindows[i6].getBlob(i5, this.columnsBundle.getInt(str));
            default:
                return null;
        }
    }

    public final int getWindowIndex(int i5) {
        boolean z4;
        int[] iArr;
        int i6 = 0;
        if (i5 < 0 && i5 >= this.dataCount) {
            z4 = false;
        } else {
            z4 = true;
        }
        Preconditions.checkArgument(z4, "rowIndex is out of index:" + i5);
        while (true) {
            iArr = this.perCursorCounts;
            if (i6 >= iArr.length) {
                break;
            }
            if (i5 < iArr[i6]) {
                i6--;
                break;
            }
            i6++;
        }
        if (i6 == iArr.length) {
            return i6 - 1;
        }
        return i6;
    }

    public final boolean hasColumn(String str) {
        return this.columnsBundle.containsKey(str);
    }

    public final boolean hasNull(String str, int i5, int i6) {
        checkAvailable(str, i5);
        if (this.cursorWindows[i6].getType(i5, this.columnsBundle.getInt(str)) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, this.columns, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.cursorWindows, i5, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.version);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i5 & 1) != 0) {
            close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i5, String[] strArr, CursorWindow[] cursorWindowArr, int i6, Bundle bundle) {
        this.mClosed = false;
        this.isInstance = true;
        this.version = i5;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i6;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i5, Bundle bundle) {
        Preconditions.checkNotNull(strArr, "columnsP cannot be null");
        Preconditions.checkNotNull(cursorWindowArr, "cursorWindowP cannot be null");
        this.mClosed = false;
        this.isInstance = true;
        this.version = 1;
        this.columns = strArr;
        this.cursorWindows = cursorWindowArr;
        this.statusCode = i5;
        this.metadata = bundle;
        collectColumsAndCount();
    }

    private static CursorWindow[] getCursorWindows(Builder builder, int i5) {
        if (builder.builderColumns.length == 0) {
            return new CursorWindow[0];
        }
        if (i5 < 0 || i5 >= builder.dataCollectionList.size()) {
            i5 = builder.dataCollectionList.size();
        }
        ArrayList<CursorWindow> iterCursorWindow = iterCursorWindow(builder, i5, builder.dataCollectionList.subList(0, i5));
        return (CursorWindow[]) iterCursorWindow.toArray(new CursorWindow[iterCursorWindow.size()]);
    }

    private DataHolder(HMSCursorWrapper hMSCursorWrapper, int i5, Bundle bundle) {
        this(hMSCursorWrapper.getColumnNames(), getCursorWindows(hMSCursorWrapper), i5, bundle);
    }

    public DataHolder(Cursor cursor, int i5, Bundle bundle) {
        this(new HMSCursorWrapper(cursor), i5, bundle);
    }

    private DataHolder(Builder builder, int i5, Bundle bundle) {
        this(builder.builderColumns, getCursorWindows(builder, -1), i5, (Bundle) null);
    }

    private DataHolder(Builder builder, int i5, Bundle bundle, int i6) {
        this(builder.builderColumns, getCursorWindows(builder, -1), i5, bundle);
    }
}
