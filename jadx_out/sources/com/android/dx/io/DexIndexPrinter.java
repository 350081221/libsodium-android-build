package com.android.dx.io;

import com.android.dex.ClassDef;
import com.android.dex.Dex;
import com.android.dex.FieldId;
import com.android.dex.MethodId;
import com.android.dex.ProtoId;
import com.android.dex.TableOfContents;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class DexIndexPrinter {
    private final Dex dex;
    private final TableOfContents tableOfContents;

    public DexIndexPrinter(File file) throws IOException {
        Dex dex = new Dex(file);
        this.dex = dex;
        this.tableOfContents = dex.getTableOfContents();
    }

    public static void main(String[] strArr) throws IOException {
        DexIndexPrinter dexIndexPrinter = new DexIndexPrinter(new File(strArr[0]));
        dexIndexPrinter.printMap();
        dexIndexPrinter.printStrings();
        dexIndexPrinter.printTypeIds();
        dexIndexPrinter.printProtoIds();
        dexIndexPrinter.printFieldIds();
        dexIndexPrinter.printMethodIds();
        dexIndexPrinter.printTypeLists();
        dexIndexPrinter.printClassDefs();
    }

    private void printClassDefs() {
        int i5 = 0;
        for (ClassDef classDef : this.dex.classDefs()) {
            System.out.println("class def " + i5 + ": " + classDef);
            i5++;
        }
    }

    private void printFieldIds() throws IOException {
        int i5 = 0;
        for (FieldId fieldId : this.dex.fieldIds()) {
            System.out.println("field " + i5 + ": " + fieldId);
            i5++;
        }
    }

    private void printMap() {
        for (TableOfContents.Section section : this.tableOfContents.sections) {
            if (section.off != -1) {
                System.out.println("section " + Integer.toHexString(section.type) + " off=" + Integer.toHexString(section.off) + " size=" + Integer.toHexString(section.size) + " byteCount=" + Integer.toHexString(section.byteCount));
            }
        }
    }

    private void printMethodIds() throws IOException {
        int i5 = 0;
        for (MethodId methodId : this.dex.methodIds()) {
            System.out.println("methodId " + i5 + ": " + methodId);
            i5++;
        }
    }

    private void printProtoIds() throws IOException {
        int i5 = 0;
        for (ProtoId protoId : this.dex.protoIds()) {
            System.out.println("proto " + i5 + ": " + protoId);
            i5++;
        }
    }

    private void printStrings() throws IOException {
        int i5 = 0;
        for (String str : this.dex.strings()) {
            System.out.println("string " + i5 + ": " + str);
            i5++;
        }
    }

    private void printTypeIds() throws IOException {
        int i5 = 0;
        for (Integer num : this.dex.typeIds()) {
            System.out.println("type " + i5 + ": " + this.dex.strings().get(num.intValue()));
            i5++;
        }
    }

    private void printTypeLists() throws IOException {
        int i5 = this.tableOfContents.typeLists.off;
        if (i5 == -1) {
            System.out.println("No type lists");
            return;
        }
        Dex.Section open = this.dex.open(i5);
        for (int i6 = 0; i6 < this.tableOfContents.typeLists.size; i6++) {
            int readInt = open.readInt();
            System.out.print("Type list i=" + i6 + ", size=" + readInt + ", elements=");
            for (int i7 = 0; i7 < readInt; i7++) {
                System.out.print(" " + this.dex.typeNames().get(open.readShort()));
            }
            if (readInt % 2 == 1) {
                open.readShort();
            }
            System.out.println();
        }
    }
}
