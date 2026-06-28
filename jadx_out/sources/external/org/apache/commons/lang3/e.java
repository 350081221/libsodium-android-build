package external.org.apache.commons.lang3;

/* loaded from: classes3.dex */
public enum e {
    JAVA_0_9(1.5f, "0.9"),
    JAVA_1_1(1.1f, "1.1"),
    JAVA_1_2(1.2f, "1.2"),
    JAVA_1_3(1.3f, "1.3"),
    JAVA_1_4(1.4f, "1.4"),
    JAVA_1_5(1.5f, "1.5"),
    JAVA_1_6(1.6f, "1.6"),
    JAVA_1_7(1.7f, "1.7"),
    JAVA_1_8(1.8f, "1.8");

    private String name;
    private float value;

    e(float f5, String str) {
        this.value = f5;
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e get(String str) {
        if ("0.9".equals(str)) {
            return JAVA_0_9;
        }
        if ("1.1".equals(str)) {
            return JAVA_1_1;
        }
        if ("1.2".equals(str)) {
            return JAVA_1_2;
        }
        if ("1.3".equals(str)) {
            return JAVA_1_3;
        }
        if ("1.4".equals(str)) {
            return JAVA_1_4;
        }
        if ("1.5".equals(str)) {
            return JAVA_1_5;
        }
        if ("1.6".equals(str)) {
            return JAVA_1_6;
        }
        if ("1.7".equals(str)) {
            return JAVA_1_7;
        }
        if ("1.8".equals(str)) {
            return JAVA_1_8;
        }
        return null;
    }

    static e getJavaVersion(String str) {
        return get(str);
    }

    public boolean atLeast(e eVar) {
        return this.value >= eVar.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
