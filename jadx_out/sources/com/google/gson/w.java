package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w DEFAULT;
    public static final w STRING;

    /* loaded from: classes2.dex */
    enum a extends w {
        a(String str, int i5) {
            super(str, i5, null);
        }

        @Override // com.google.gson.w
        public l serialize(Long l5) {
            return new r((Number) l5);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        w wVar = new w("STRING", 1) { // from class: com.google.gson.w.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.w
            public l serialize(Long l5) {
                return new r(String.valueOf(l5));
            }
        };
        STRING = wVar;
        $VALUES = new w[]{aVar, wVar};
    }

    private w(String str, int i5) {
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public abstract l serialize(Long l5);

    /* synthetic */ w(String str, int i5, a aVar) {
        this(str, i5);
    }
}
