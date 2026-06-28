package com.lody.virtual.server.memory;

import com.lody.virtual.helper.utils.VLog;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class MemoryScanEngine {
    private static final int PAGE = 4096;
    private List<Match> matches;
    private ProcessMemory memory;
    private int pid;
    private List<MappedMemoryRegion> regions;

    /* loaded from: classes3.dex */
    public class Match {
        long address;
        int len;
        MappedMemoryRegion region;

        public Match(MappedMemoryRegion mappedMemoryRegion, long j5, int i5) {
            this.region = mappedMemoryRegion;
            this.address = j5;
            this.len = i5;
        }
    }

    public MemoryScanEngine(int i5) throws IOException {
        this.pid = i5;
        this.memory = new ProcessMemory(i5);
        updateMemoryLayout();
    }

    private List<Match> matchBytes(MappedMemoryRegion mappedMemoryRegion, long j5, byte[] bArr, int i5, byte[] bArr2) {
        boolean z4;
        LinkedList linkedList = new LinkedList();
        int length = bArr2.length;
        for (int i6 = 0; i6 < i5; i6 += 2) {
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 + i6;
                if (i8 >= i5) {
                    break;
                }
                if (bArr[i8] != bArr2[i7]) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
            if (z4) {
                linkedList.add(new Match(mappedMemoryRegion, j5 + i6, length));
            }
        }
        return linkedList;
    }

    public void close() {
        try {
            this.memory.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public List<Match> getMatches() {
        return this.matches;
    }

    public void modify(Match match, MemoryValue memoryValue) throws IOException {
        this.memory.write(match.address, memoryValue.toBytes());
    }

    public void modifyAll(MemoryValue memoryValue) throws IOException {
        Iterator<Match> it = this.matches.iterator();
        while (it.hasNext()) {
            modify(it.next(), memoryValue);
        }
    }

    public void search(MemoryValue memoryValue) throws IOException {
        this.matches = new LinkedList();
        int i5 = 4096;
        byte[] bArr = new byte[4096];
        byte[] bytes = memoryValue.toBytes();
        for (MappedMemoryRegion mappedMemoryRegion : this.regions) {
            long j5 = mappedMemoryRegion.startAddress;
            long j6 = mappedMemoryRegion.endAddress;
            long j7 = j5;
            while (j7 < j6) {
                try {
                    long j8 = j7;
                    this.matches.addAll(matchBytes(mappedMemoryRegion, j7, bArr, this.memory.read(j7, bArr, Math.min(i5, (int) (j6 - j7))), bytes));
                    j7 = j8 + 4096;
                    i5 = 4096;
                } catch (IOException unused) {
                    VLog.e(getClass().getSimpleName(), "Unable to read region : " + mappedMemoryRegion.description);
                }
            }
            i5 = 4096;
        }
    }

    public void updateMemoryLayout() {
        try {
            this.regions = MemoryRegionParser.getMemoryRegions(this.pid);
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }
}
