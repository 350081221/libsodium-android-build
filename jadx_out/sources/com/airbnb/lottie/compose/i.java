package com.airbnb.lottie.compose;

import android.net.Uri;
import androidx.annotation.RawRes;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface i {

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @u3.f
    /* loaded from: classes2.dex */
    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final String f1226a;

        private /* synthetic */ a(String str) {
            this.f1226a = str;
        }

        public static final /* synthetic */ a a(String str) {
            return new a(str);
        }

        @p4.l
        public static String b(@p4.l String assetName) {
            l0.p(assetName, "assetName");
            return assetName;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof a) && l0.g(str, ((a) obj).h());
        }

        public static final boolean d(String str, String str2) {
            return l0.g(str, str2);
        }

        public static int f(String str) {
            return str.hashCode();
        }

        public static String g(String str) {
            return "Asset(assetName=" + str + ")";
        }

        @p4.l
        public final String e() {
            return this.f1226a;
        }

        public boolean equals(Object obj) {
            return c(this.f1226a, obj);
        }

        public final /* synthetic */ String h() {
            return this.f1226a;
        }

        public int hashCode() {
            return f(this.f1226a);
        }

        public String toString() {
            return g(this.f1226a);
        }
    }

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "equals", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Landroid/net/Uri;)I", "toString", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @u3.f
    /* loaded from: classes2.dex */
    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final Uri f1227a;

        private /* synthetic */ b(Uri uri) {
            this.f1227a = uri;
        }

        public static final /* synthetic */ b a(Uri uri) {
            return new b(uri);
        }

        @p4.l
        public static Uri b(@p4.l Uri uri) {
            l0.p(uri, "uri");
            return uri;
        }

        public static boolean c(Uri uri, Object obj) {
            return (obj instanceof b) && l0.g(uri, ((b) obj).h());
        }

        public static final boolean d(Uri uri, Uri uri2) {
            return l0.g(uri, uri2);
        }

        public static int f(Uri uri) {
            return uri.hashCode();
        }

        public static String g(Uri uri) {
            return "ContentProvider(uri=" + uri + ")";
        }

        @p4.l
        public final Uri e() {
            return this.f1227a;
        }

        public boolean equals(Object obj) {
            return c(this.f1227a, obj);
        }

        public final /* synthetic */ Uri h() {
            return this.f1227a;
        }

        public int hashCode() {
            return f(this.f1227a);
        }

        public String toString() {
            return g(this.f1227a);
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", TTDownloadField.TT_FILE_NAME, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @u3.f
    /* loaded from: classes2.dex */
    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final String f1228a;

        private /* synthetic */ c(String str) {
            this.f1228a = str;
        }

        public static final /* synthetic */ c a(String str) {
            return new c(str);
        }

        @p4.l
        public static String b(@p4.l String fileName) {
            l0.p(fileName, "fileName");
            return fileName;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof c) && l0.g(str, ((c) obj).h());
        }

        public static final boolean d(String str, String str2) {
            return l0.g(str, str2);
        }

        public static int f(String str) {
            return str.hashCode();
        }

        public static String g(String str) {
            return "File(fileName=" + str + ")";
        }

        @p4.l
        public final String e() {
            return this.f1228a;
        }

        public boolean equals(Object obj) {
            return c(this.f1228a, obj);
        }

        public final /* synthetic */ String h() {
            return this.f1228a;
        }

        public int hashCode() {
            return f(this.f1228a);
        }

        public String toString() {
            return g(this.f1228a);
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @u3.f
    /* loaded from: classes2.dex */
    public static final class d implements i {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final String f1229a;

        private /* synthetic */ d(String str) {
            this.f1229a = str;
        }

        public static final /* synthetic */ d a(String str) {
            return new d(str);
        }

        @p4.l
        public static String b(@p4.l String jsonString) {
            l0.p(jsonString, "jsonString");
            return jsonString;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof d) && l0.g(str, ((d) obj).h());
        }

        public static final boolean d(String str, String str2) {
            return l0.g(str, str2);
        }

        public static int f(String str) {
            return str.hashCode();
        }

        public static String g(String str) {
            return "JsonString(jsonString=" + str + ")";
        }

        @p4.l
        public final String e() {
            return this.f1229a;
        }

        public boolean equals(Object obj) {
            return c(this.f1229a, obj);
        }

        public final /* synthetic */ String h() {
            return this.f1229a;
        }

        public int hashCode() {
            return f(this.f1229a);
        }

        public String toString() {
            return g(this.f1229a);
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "constructor-impl", "(I)I", "getResId", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @u3.f
    /* loaded from: classes2.dex */
    public static final class e implements i {

        /* renamed from: a, reason: collision with root package name */
        private final int f1230a;

        private /* synthetic */ e(@RawRes int i5) {
            this.f1230a = i5;
        }

        public static final /* synthetic */ e a(int i5) {
            return new e(i5);
        }

        public static int b(@RawRes int i5) {
            return i5;
        }

        public static boolean c(int i5, Object obj) {
            return (obj instanceof e) && i5 == ((e) obj).h();
        }

        public static final boolean d(int i5, int i6) {
            return i5 == i6;
        }

        public static int f(int i5) {
            return Integer.hashCode(i5);
        }

        public static String g(int i5) {
            return "RawRes(resId=" + i5 + ")";
        }

        public final int e() {
            return this.f1230a;
        }

        public boolean equals(Object obj) {
            return c(this.f1230a, obj);
        }

        public final /* synthetic */ int h() {
            return this.f1230a;
        }

        public int hashCode() {
            return f(this.f1230a);
        }

        public String toString() {
            return g(this.f1230a);
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "url", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", TTDownloadField.TT_HASHCODE, "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @u3.f
    /* loaded from: classes2.dex */
    public static final class f implements i {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final String f1231a;

        private /* synthetic */ f(String str) {
            this.f1231a = str;
        }

        public static final /* synthetic */ f a(String str) {
            return new f(str);
        }

        @p4.l
        public static String b(@p4.l String url) {
            l0.p(url, "url");
            return url;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof f) && l0.g(str, ((f) obj).h());
        }

        public static final boolean d(String str, String str2) {
            return l0.g(str, str2);
        }

        public static int f(String str) {
            return str.hashCode();
        }

        public static String g(String str) {
            return "Url(url=" + str + ")";
        }

        @p4.l
        public final String e() {
            return this.f1231a;
        }

        public boolean equals(Object obj) {
            return c(this.f1231a, obj);
        }

        public final /* synthetic */ String h() {
            return this.f1231a;
        }

        public int hashCode() {
            return f(this.f1231a);
        }

        public String toString() {
            return g(this.f1231a);
        }
    }
}
