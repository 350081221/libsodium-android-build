package com.lody.virtual.server.memory;

/* loaded from: classes3.dex */
public class MappedMemoryRegion {
    public final String description;
    public final long endAddress;
    public final FileMapping fileMapInfo;
    public final boolean isExecutable;
    public final boolean isReadable;
    public final boolean isShared;
    public final boolean isWritable;
    public final long startAddress;

    /* loaded from: classes3.dex */
    public static class FileMapping {
        public final long inode;
        public final long majorDeviceNumber;
        public final long minorDeviceNumber;
        public final long offset;

        public FileMapping(long j5, long j6, long j7, long j8) {
            this.offset = j5;
            this.majorDeviceNumber = j6;
            this.minorDeviceNumber = j7;
            this.inode = j8;
        }
    }

    public MappedMemoryRegion(long j5, long j6, boolean z4, boolean z5, boolean z6, boolean z7, long j7, long j8, long j9, long j10, String str) {
        FileMapping fileMapping;
        this.startAddress = j5;
        this.endAddress = j6;
        this.isReadable = z4;
        this.isWritable = z5;
        this.isExecutable = z6;
        this.isShared = z7;
        if (j10 == 0) {
            fileMapping = null;
        } else {
            fileMapping = new FileMapping(j7, j8, j9, j10);
        }
        this.fileMapInfo = fileMapping;
        this.description = str;
    }

    public boolean isMappedFromFile() {
        return this.fileMapInfo != null;
    }
}
