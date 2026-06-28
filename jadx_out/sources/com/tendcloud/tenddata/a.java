package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a {
    public static final a ENV;
    private static volatile List<String> FeaturesList = new ArrayList();
    public static final String MF_JSON = "UNIFIED_SDK_JSON";
    public static final a UNIVERSAL;
    private static final a[] service;
    private int indexNum;
    private String nameString;

    static {
        a aVar = new a("ENV", 2) { // from class: com.tendcloud.tenddata.a.1
            @Override // com.tendcloud.tenddata.a
            public String getCert() {
                return "";
            }

            @Override // com.tendcloud.tenddata.a
            public String getDataFolder() {
                return super.getDataFolder();
            }

            @Override // com.tendcloud.tenddata.a
            public int getFileLimitType() {
                return super.getFileLimitType();
            }

            @Override // com.tendcloud.tenddata.a
            public String getHost() {
                return aa.f11335l;
            }

            @Override // com.tendcloud.tenddata.a
            public String getIP() {
                return aa.f11337n;
            }

            @Override // com.tendcloud.tenddata.a
            public String getMessageFormat() {
                return a.MF_JSON;
            }

            @Override // com.tendcloud.tenddata.a
            public String getRootFolder() {
                return super.getRootFolder();
            }

            @Override // com.tendcloud.tenddata.a
            public String getUrl() {
                return "https://me.cpatrk.net";
            }
        };
        ENV = aVar;
        a aVar2 = new a("SDK", 99) { // from class: com.tendcloud.tenddata.a.2
            private boolean isUrlUpdated = false;
            private String url;

            @Override // com.tendcloud.tenddata.a
            public String getCert() {
                return "";
            }

            @Override // com.tendcloud.tenddata.a
            public String getDataFolder() {
                return super.getDataFolder();
            }

            @Override // com.tendcloud.tenddata.a
            public int getFileLimitType() {
                return super.getFileLimitType();
            }

            @Override // com.tendcloud.tenddata.a
            public String getHost() {
                return aa.f11325b;
            }

            @Override // com.tendcloud.tenddata.a
            public String getIP() {
                return aa.f11330g;
            }

            @Override // com.tendcloud.tenddata.a
            public String getMessageFormat() {
                return a.MF_JSON;
            }

            @Override // com.tendcloud.tenddata.a
            public String getRootFolder() {
                return super.getRootFolder();
            }

            @Override // com.tendcloud.tenddata.a
            public String getUrl() {
                String str = aa.f11334k;
                if (this.isUrlUpdated) {
                    return this.url;
                }
                return str;
            }

            @Override // com.tendcloud.tenddata.a
            public void setUrl(String str) {
                this.isUrlUpdated = true;
                this.url = str;
            }
        };
        UNIVERSAL = aVar2;
        service = new a[]{aVar, aVar2};
    }

    protected a(String str, int i5) {
        this.nameString = str;
        this.indexNum = i5;
        addFeatures2List(str);
    }

    private void addFeatures2List(String str) {
        try {
            if (!y.b(str) && !FeaturesList.contains(str)) {
                FeaturesList.add(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static ArrayList<a> getFeaturesList() {
        ArrayList<a> arrayList = new ArrayList<>();
        for (int i5 = 0; i5 < FeaturesList.size(); i5++) {
            try {
                if (valueOf(FeaturesList.get(i5)) != null) {
                    arrayList.add(valueOf(FeaturesList.get(i5)));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    public static List<String> getFeaturesNameList() {
        return FeaturesList;
    }

    public static a valueOf(String str) {
        a aVar = ENV;
        if (str.equals(aVar.name())) {
            return aVar;
        }
        a aVar2 = UNIVERSAL;
        if (str.equals(aVar2.name())) {
            return aVar2;
        }
        return null;
    }

    public static a[] values() {
        a[] aVarArr = service;
        return (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
    }

    public abstract String getCert();

    public String getDataFolder() {
        return "td_database" + index() + cz.f11650c;
    }

    public int getFileLimitType() {
        return 1;
    }

    public abstract String getHost();

    public abstract String getIP();

    public abstract String getMessageFormat();

    public String getRootFolder() {
        return aa.f11341r;
    }

    public abstract String getUrl();

    public int index() {
        return this.indexNum;
    }

    public String name() {
        return this.nameString;
    }

    public boolean needToSendData() {
        return true;
    }

    public void setUrl(String str) {
    }

    protected a(String str, int i5, boolean z4) {
        this.nameString = str;
        this.indexNum = i5;
    }
}
