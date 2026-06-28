package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class CLContainer extends CLElement {
    ArrayList<CLElement> mElements;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.mElements = new ArrayList<>();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLContainer(cArr);
    }

    public void add(CLElement cLElement) {
        this.mElements.add(cLElement);
        if (CLParser.DEBUG) {
            System.out.println("added element " + cLElement + " to " + this);
        }
    }

    public CLElement get(String str) throws CLParsingException {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    public CLArray getArray(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public CLArray getArrayOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLArray) {
            return (CLArray) orNull;
        }
        return null;
    }

    public boolean getBoolean(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException("no boolean found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public float getFloat(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public float getFloatOrNaN(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLNumber) {
            return orNull.getFloat();
        }
        return Float.NaN;
    }

    public int getInt(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public CLObject getObject(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + cLElement.getStrClass() + "] : " + cLElement, this);
    }

    public CLObject getObjectOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLObject) {
            return (CLObject) orNull;
        }
        return null;
    }

    public CLElement getOrNull(String str) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                return cLKey.getValue();
            }
        }
        return null;
    }

    public String getString(String str) throws CLParsingException {
        CLElement cLElement = get(str);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + (cLElement != null ? cLElement.getStrClass() : null) + "] : " + cLElement, this);
    }

    public String getStringOrNull(String str) {
        CLElement orNull = getOrNull(str);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public boolean has(String str) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if ((next instanceof CLKey) && ((CLKey) next).content().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> names() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (next instanceof CLKey) {
                arrayList.add(((CLKey) next).content());
            }
        }
        return arrayList;
    }

    public void put(String str, CLElement cLElement) {
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) it.next();
            if (cLKey.content().equals(str)) {
                cLKey.set(cLElement);
                return;
            }
        }
        this.mElements.add((CLKey) CLKey.allocate(str, cLElement));
    }

    public void putNumber(String str, float f5) {
        put(str, new CLNumber(f5));
    }

    public void remove(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (((CLKey) next).content().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.mElements.remove((CLElement) it2.next());
        }
    }

    public int size() {
        return this.mElements.size();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<CLElement> it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement next = it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(next);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public String getStringOrNull(int i5) {
        CLElement orNull = getOrNull(i5);
        if (orNull instanceof CLString) {
            return orNull.content();
        }
        return null;
    }

    public float getFloat(int i5) throws CLParsingException {
        CLElement cLElement = get(i5);
        if (cLElement != null) {
            return cLElement.getFloat();
        }
        throw new CLParsingException("no float at index " + i5, this);
    }

    public int getInt(int i5) throws CLParsingException {
        CLElement cLElement = get(i5);
        if (cLElement != null) {
            return cLElement.getInt();
        }
        throw new CLParsingException("no int at index " + i5, this);
    }

    public CLElement getOrNull(int i5) {
        if (i5 < 0 || i5 >= this.mElements.size()) {
            return null;
        }
        return this.mElements.get(i5);
    }

    public CLElement get(int i5) throws CLParsingException {
        if (i5 >= 0 && i5 < this.mElements.size()) {
            return this.mElements.get(i5);
        }
        throw new CLParsingException("no element at index " + i5, this);
    }

    public CLArray getArray(int i5) throws CLParsingException {
        CLElement cLElement = get(i5);
        if (cLElement instanceof CLArray) {
            return (CLArray) cLElement;
        }
        throw new CLParsingException("no array at index " + i5, this);
    }

    public boolean getBoolean(int i5) throws CLParsingException {
        CLElement cLElement = get(i5);
        if (cLElement instanceof CLToken) {
            return ((CLToken) cLElement).getBoolean();
        }
        throw new CLParsingException("no boolean at index " + i5, this);
    }

    public CLObject getObject(int i5) throws CLParsingException {
        CLElement cLElement = get(i5);
        if (cLElement instanceof CLObject) {
            return (CLObject) cLElement;
        }
        throw new CLParsingException("no object at index " + i5, this);
    }

    public String getString(int i5) throws CLParsingException {
        CLElement cLElement = get(i5);
        if (cLElement instanceof CLString) {
            return cLElement.content();
        }
        throw new CLParsingException("no string at index " + i5, this);
    }
}
