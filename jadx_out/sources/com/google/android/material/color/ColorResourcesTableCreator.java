package com.google.android.material.color;

import android.content.Context;
import android.content.pm.SharedLibraryInfo;
import android.util.Pair;
import androidx.annotation.ColorInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.y1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ColorResourcesTableCreator {
    private static final byte ANDROID_PACKAGE_ID = 1;
    private static final byte APPLICATION_PACKAGE_ID = Byte.MAX_VALUE;
    private static final short HEADER_TYPE_PACKAGE = 512;
    private static final short HEADER_TYPE_RES_TABLE = 2;
    private static final short HEADER_TYPE_STRING_POOL = 1;
    private static final short HEADER_TYPE_TYPE = 513;
    private static final short HEADER_TYPE_TYPE_SPEC = 514;
    private static final String RESOURCE_TYPE_NAME_COLOR = "color";
    private static byte typeIdColor;
    private static final PackageInfo ANDROID_PACKAGE_INFO = new PackageInfo(1, SharedLibraryInfo.PLATFORM_PACKAGE_NAME);
    private static final Comparator<ColorResource> COLOR_RESOURCE_COMPARATOR = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.entryId - colorResource2.entryId;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ColorResource {
        private final short entryId;
        private final String name;
        private final byte packageId;
        private final byte typeId;

        @ColorInt
        private final int value;

        ColorResource(int i5, String str, int i6) {
            this.name = str;
            this.value = i6;
            this.entryId = (short) (65535 & i5);
            this.typeId = (byte) ((i5 >> 16) & 255);
            this.packageId = (byte) ((i5 >> 24) & 255);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PackageChunk {
        private static final short HEADER_SIZE = 288;
        private static final int PACKAGE_NAME_MAX_LENGTH = 128;
        private final ResChunkHeader header;
        private final StringPoolChunk keyStrings;
        private final PackageInfo packageInfo;
        private final TypeSpecChunk typeSpecChunk;
        private final StringPoolChunk typeStrings = new StringPoolChunk(false, "?1", "?2", "?3", "?4", "?5", "color");

        PackageChunk(PackageInfo packageInfo, List<ColorResource> list) {
            this.packageInfo = packageInfo;
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = list.get(i5).name;
            }
            this.keyStrings = new StringPoolChunk(true, strArr);
            this.typeSpecChunk = new TypeSpecChunk(list);
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, HEADER_SIZE, getChunkSize());
        }

        int getChunkSize() {
            return this.typeStrings.getChunkSize() + 288 + this.keyStrings.getChunkSize() + this.typeSpecChunk.getChunkSizeWithTypeChunk();
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageInfo.id));
            char[] charArray = this.packageInfo.name.toCharArray();
            for (int i5 = 0; i5 < 128; i5++) {
                if (i5 < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray(charArray[i5]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.charToByteArray((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.typeStrings.getChunkSize() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(0));
            this.typeStrings.writeTo(byteArrayOutputStream);
            this.keyStrings.writeTo(byteArrayOutputStream);
            this.typeSpecChunk.writeTo(byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class PackageInfo {
        private final int id;
        private final String name;

        PackageInfo(int i5, String str) {
            this.id = i5;
            this.name = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ResChunkHeader {
        private final int chunkSize;
        private final short headerSize;
        private final short type;

        ResChunkHeader(short s5, short s6, int i5) {
            this.type = s5;
            this.headerSize = s6;
            this.chunkSize = i5;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.type));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(this.headerSize));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.chunkSize));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ResEntry {
        private static final byte DATA_TYPE_AARRGGBB = 28;
        private static final short ENTRY_SIZE = 8;
        private static final short FLAG_PUBLIC = 2;
        private static final int SIZE = 16;
        private static final short VALUE_SIZE = 8;
        private final int data;
        private final int keyStringIndex;

        ResEntry(int i5, @ColorInt int i6) {
            this.keyStringIndex = i5;
            this.data = i6;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray(FLAG_PUBLIC));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.keyStringIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.shortToByteArray((short) 8));
            byteArrayOutputStream.write(new byte[]{0, DATA_TYPE_AARRGGBB});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.data));
        }
    }

    /* loaded from: classes2.dex */
    private static class ResTable {
        private static final short HEADER_SIZE = 12;
        private final ResChunkHeader header;
        private final int packageCount;
        private final List<PackageChunk> packageChunks = new ArrayList();
        private final StringPoolChunk stringPool = new StringPoolChunk(new String[0]);

        ResTable(Map<PackageInfo, List<ColorResource>> map) {
            this.packageCount = map.size();
            for (Map.Entry<PackageInfo, List<ColorResource>> entry : map.entrySet()) {
                List<ColorResource> value = entry.getValue();
                Collections.sort(value, ColorResourcesTableCreator.COLOR_RESOURCE_COMPARATOR);
                this.packageChunks.add(new PackageChunk(entry.getKey(), value));
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_RES_TABLE, HEADER_SIZE, getOverallSize());
        }

        private int getOverallSize() {
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                i5 += it.next().getChunkSize();
            }
            return this.stringPool.getChunkSize() + 12 + i5;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.packageCount));
            this.stringPool.writeTo(byteArrayOutputStream);
            Iterator<PackageChunk> it = this.packageChunks.iterator();
            while (it.hasNext()) {
                it.next().writeTo(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class StringPoolChunk {
        private static final int FLAG_UTF8 = 256;
        private static final short HEADER_SIZE = 28;
        private static final int STYLED_SPAN_LIST_END = -1;
        private final int chunkSize;
        private final ResChunkHeader header;
        private final int stringCount;
        private final List<Integer> stringIndex;
        private final List<byte[]> strings;
        private final int stringsPaddingSize;
        private final int stringsStart;
        private final int styledSpanCount;
        private final List<Integer> styledSpanIndex;
        private final List<List<StringStyledSpan>> styledSpans;
        private final int styledSpansStart;
        private final boolean utf8Encode;

        StringPoolChunk(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<StringStyledSpan>> processString(String str) {
            byte[] stringToByteArray;
            if (this.utf8Encode) {
                stringToByteArray = ColorResourcesTableCreator.stringToByteArrayUtf8(str);
            } else {
                stringToByteArray = ColorResourcesTableCreator.stringToByteArray(str);
            }
            return new Pair<>(stringToByteArray, Collections.emptyList());
        }

        int getChunkSize() {
            return this.chunkSize;
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            int i5;
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpanCount));
            if (this.utf8Encode) {
                i5 = 256;
            } else {
                i5 = 0;
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i5));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.stringsStart));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.styledSpansStart));
            Iterator<Integer> it = this.stringIndex.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.styledSpanIndex.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.strings.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i6 = this.stringsPaddingSize;
            if (i6 > 0) {
                byteArrayOutputStream.write(new byte[i6]);
            }
            Iterator<List<StringStyledSpan>> it4 = this.styledSpans.iterator();
            while (it4.hasNext()) {
                Iterator<StringStyledSpan> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().writeTo(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(-1));
            }
        }

        StringPoolChunk(boolean z4, String... strArr) {
            this.stringIndex = new ArrayList();
            this.styledSpanIndex = new ArrayList();
            this.strings = new ArrayList();
            this.styledSpans = new ArrayList();
            this.utf8Encode = z4;
            int i5 = 0;
            for (String str : strArr) {
                Pair<byte[], List<StringStyledSpan>> processString = processString(str);
                this.stringIndex.add(Integer.valueOf(i5));
                Object obj = processString.first;
                i5 += ((byte[]) obj).length;
                this.strings.add((byte[]) obj);
                this.styledSpans.add((List) processString.second);
            }
            int i6 = 0;
            for (List<StringStyledSpan> list : this.styledSpans) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.stringIndex.add(Integer.valueOf(i5));
                    i5 += stringStyledSpan.styleString.length;
                    this.strings.add(stringStyledSpan.styleString);
                }
                this.styledSpanIndex.add(Integer.valueOf(i6));
                i6 += (list.size() * 12) + 4;
            }
            int i7 = i5 % 4;
            int i8 = i7 == 0 ? 0 : 4 - i7;
            this.stringsPaddingSize = i8;
            int size = this.strings.size();
            this.stringCount = size;
            this.styledSpanCount = this.strings.size() - strArr.length;
            boolean z5 = this.strings.size() - strArr.length > 0;
            if (!z5) {
                this.styledSpanIndex.clear();
                this.styledSpans.clear();
            }
            int size2 = (size * 4) + 28 + (this.styledSpanIndex.size() * 4);
            this.stringsStart = size2;
            int i9 = i5 + i8;
            this.styledSpansStart = z5 ? size2 + i9 : 0;
            int i10 = size2 + i9 + (z5 ? i6 : 0);
            this.chunkSize = i10;
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL, HEADER_SIZE, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class StringStyledSpan {
        private int firstCharacterIndex;
        private int lastCharacterIndex;
        private int nameReference;
        private byte[] styleString;

        private StringStyledSpan() {
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.nameReference));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.firstCharacterIndex));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.lastCharacterIndex));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class TypeChunk {
        private static final byte CONFIG_SIZE = 64;
        private static final short HEADER_SIZE = 84;
        private static final int OFFSET_NO_ENTRY = -1;
        private final byte[] config;
        private final int entryCount;
        private final ResChunkHeader header;
        private final int[] offsetTable;
        private final ResEntry[] resEntries;

        TypeChunk(List<ColorResource> list, Set<Short> set, int i5) {
            byte[] bArr = new byte[64];
            this.config = bArr;
            this.entryCount = i5;
            bArr[0] = CONFIG_SIZE;
            this.resEntries = new ResEntry[list.size()];
            for (int i6 = 0; i6 < list.size(); i6++) {
                this.resEntries[i6] = new ResEntry(i6, list.get(i6).value);
            }
            this.offsetTable = new int[i5];
            int i7 = 0;
            for (short s5 = 0; s5 < i5; s5 = (short) (s5 + ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL)) {
                if (set.contains(Short.valueOf(s5))) {
                    this.offsetTable[s5] = i7;
                    i7 += 16;
                } else {
                    this.offsetTable[s5] = -1;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE, HEADER_SIZE, getChunkSize());
        }

        private int getEntryStart() {
            return getOffsetTableSize() + 84;
        }

        private int getOffsetTableSize() {
            return this.offsetTable.length * 4;
        }

        int getChunkSize() {
            return getEntryStart() + (this.resEntries.length * 16);
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(getEntryStart()));
            byteArrayOutputStream.write(this.config);
            for (int i5 : this.offsetTable) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i5));
            }
            for (ResEntry resEntry : this.resEntries) {
                resEntry.writeTo(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class TypeSpecChunk {
        private static final short HEADER_SIZE = 16;
        private static final int SPEC_PUBLIC = 1073741824;
        private final int entryCount;
        private final int[] entryFlags;
        private final ResChunkHeader header;
        private final TypeChunk typeChunk;

        TypeSpecChunk(List<ColorResource> list) {
            this.entryCount = list.get(list.size() - 1).entryId + ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL;
            HashSet hashSet = new HashSet();
            Iterator<ColorResource> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().entryId));
            }
            this.entryFlags = new int[this.entryCount];
            for (short s5 = 0; s5 < this.entryCount; s5 = (short) (s5 + ColorResourcesTableCreator.HEADER_TYPE_STRING_POOL)) {
                if (hashSet.contains(Short.valueOf(s5))) {
                    this.entryFlags[s5] = 1073741824;
                }
            }
            this.header = new ResChunkHeader(ColorResourcesTableCreator.HEADER_TYPE_TYPE_SPEC, HEADER_SIZE, getChunkSize());
            this.typeChunk = new TypeChunk(list, hashSet, this.entryCount);
        }

        private int getChunkSize() {
            return (this.entryCount * 4) + 16;
        }

        int getChunkSizeWithTypeChunk() {
            return getChunkSize() + this.typeChunk.getChunkSize();
        }

        void writeTo(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.header.writeTo(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.typeIdColor, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(this.entryCount));
            for (int i5 : this.entryFlags) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.intToByteArray(i5));
            }
            this.typeChunk.writeTo(byteArrayOutputStream);
        }
    }

    private ColorResourcesTableCreator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] charToByteArray(char c5) {
        return new byte[]{(byte) (c5 & 255), (byte) ((c5 >> '\b') & 255)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] create(Context context, Map<Integer, Integer> map) throws IOException {
        PackageInfo packageInfo;
        if (!map.entrySet().isEmpty()) {
            PackageInfo packageInfo2 = new PackageInfo(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            ColorResource colorResource = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ColorResource colorResource2 = new ColorResource(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
                if (context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                    if (colorResource2.packageId == 1) {
                        packageInfo = ANDROID_PACKAGE_INFO;
                    } else if (colorResource2.packageId == Byte.MAX_VALUE) {
                        packageInfo = packageInfo2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) colorResource2.packageId));
                    }
                    if (!hashMap.containsKey(packageInfo)) {
                        hashMap.put(packageInfo, new ArrayList());
                    }
                    ((List) hashMap.get(packageInfo)).add(colorResource2);
                    colorResource = colorResource2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + colorResource2.name + ", typeId=" + Integer.toHexString(colorResource2.typeId & y1.f19838d));
                }
            }
            byte b5 = colorResource.typeId;
            typeIdColor = b5;
            if (b5 != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new ResTable(hashMap).writeTo(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] intToByteArray(int i5) {
        return new byte[]{(byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] shortToByteArray(short s5) {
        return new byte[]{(byte) (s5 & 255), (byte) ((s5 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArray(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] shortToByteArray = shortToByteArray((short) charArray.length);
        bArr[0] = shortToByteArray[0];
        bArr[1] = shortToByteArray[1];
        for (int i5 = 0; i5 < charArray.length; i5++) {
            byte[] charToByteArray = charToByteArray(charArray[i5]);
            int i6 = i5 * 2;
            bArr[i6 + 2] = charToByteArray[0];
            bArr[i6 + 3] = charToByteArray[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] stringToByteArrayUtf8(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
