package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.b1;
import kotlin.collections.b0;
import kotlin.i0;
import kotlin.internal.n;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlin.q1;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlin.u0;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p4.l;
import t0.b;
import u3.h;

@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 '2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002('B\u0017\b\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006)"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/u0;", "", "name", "get", "Ljava/util/Date;", "getDate", "Ljava/time/Instant;", "getInstant", "", "-deprecated_size", "()I", "size", "index", b.f22420d, "", "names", "", "values", "", "byteCount", "", "iterator", "Lokhttp3/Headers$Builder;", "newBuilder", "", "other", "", "equals", TTDownloadField.TT_HASHCODE, "toString", "", "toMultimap", "", "namesAndValues", "[Ljava/lang/String;", "<init>", "([Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Headers implements Iterable<u0<? extends String, ? extends String>>, w3.a {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final String[] namesAndValues;

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0010J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0087\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rH\u0086\u0002J\u0019\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lokhttp3/Headers$Builder;", "", "()V", "namesAndValues", "", "", "getNamesAndValues$okhttp", "()Ljava/util/List;", "add", "line", "name", b.f22420d, "Ljava/time/Instant;", "Ljava/util/Date;", "addAll", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "addLenient", "addLenient$okhttp", "addUnsafeNonAscii", "build", "get", "removeAll", "set", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {

        @l
        private final List<String> namesAndValues = new ArrayList(20);

        @l
        public final Builder add(@l String line) {
            int o32;
            CharSequence C5;
            l0.p(line, "line");
            o32 = f0.o3(line, ':', 0, false, 6, null);
            if (o32 != -1) {
                String substring = line.substring(0, o32);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                C5 = f0.C5(substring);
                String obj = C5.toString();
                String substring2 = line.substring(o32 + 1);
                l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(("Unexpected header: " + line).toString());
        }

        @l
        public final Builder addAll(@l Headers headers) {
            l0.p(headers, "headers");
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                addLenient$okhttp(headers.name(i5), headers.value(i5));
            }
            return this;
        }

        @l
        public final Builder addLenient$okhttp(@l String line) {
            int o32;
            l0.p(line, "line");
            o32 = f0.o3(line, ':', 1, false, 4, null);
            if (o32 != -1) {
                String substring = line.substring(0, o32);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(o32 + 1);
                l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                l0.o(substring3, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp("", substring3);
            } else {
                addLenient$okhttp("", line);
            }
            return this;
        }

        @l
        public final Builder addUnsafeNonAscii(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            Headers.Companion.checkName(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @l
        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        /* JADX WARN: Incorrect condition in loop: B:4:0x0022 */
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String get(@p4.l java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.l0.p(r5, r0)
                java.util.List<java.lang.String> r0 = r4.namesAndValues
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = kotlin.internal.n.c(r0, r1, r2)
                if (r1 > r0) goto L33
            L15:
                java.util.List<java.lang.String> r2 = r4.namesAndValues
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                boolean r2 = kotlin.text.v.K1(r5, r2, r3)
                if (r2 == 0) goto L2e
                java.util.List<java.lang.String> r5 = r4.namesAndValues
                int r0 = r0 + r3
                java.lang.Object r5 = r5.get(r0)
                java.lang.String r5 = (java.lang.String) r5
                return r5
            L2e:
                if (r0 == r1) goto L33
                int r0 = r0 + (-2)
                goto L15
            L33:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Builder.get(java.lang.String):java.lang.String");
        }

        @l
        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        @l
        public final Builder removeAll(@l String name) {
            boolean K1;
            l0.p(name, "name");
            int i5 = 0;
            while (i5 < this.namesAndValues.size()) {
                K1 = e0.K1(name, this.namesAndValues.get(i5), true);
                if (K1) {
                    this.namesAndValues.remove(i5);
                    this.namesAndValues.remove(i5);
                    i5 -= 2;
                }
                i5 += 2;
            }
            return this;
        }

        @l
        public final Builder set(@l String name, @l Date value) {
            l0.p(name, "name");
            l0.p(value, "value");
            set(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder set(@l String name, @l Instant value) {
            long epochMilli;
            l0.p(name, "name");
            l0.p(value, "value");
            epochMilli = value.toEpochMilli();
            return set(name, new Date(epochMilli));
        }

        @l
        public final Builder set(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            removeAll(name);
            addLenient$okhttp(name, value);
            return this;
        }

        @l
        public final Builder add(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            Companion companion = Headers.Companion;
            companion.checkName(name);
            companion.checkValue(value, name);
            addLenient$okhttp(name, value);
            return this;
        }

        @l
        public final Builder addLenient$okhttp(@l String name, @l String value) {
            CharSequence C5;
            l0.p(name, "name");
            l0.p(value, "value");
            this.namesAndValues.add(name);
            List<String> list = this.namesAndValues;
            C5 = f0.C5(value);
            list.add(C5.toString());
            return this;
        }

        @l
        public final Builder add(@l String name, @l Date value) {
            l0.p(name, "name");
            l0.p(value, "value");
            add(name, DatesKt.toHttpDateString(value));
            return this;
        }

        @l
        @IgnoreJRERequirement
        public final Builder add(@l String name, @l Instant value) {
            long epochMilli;
            l0.p(name, "name");
            l0.p(value, "value");
            epochMilli = value.toEpochMilli();
            add(name, new Date(epochMilli));
            return this;
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0012J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0010\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/Headers$Companion;", "", "", "", "namesAndValues", "name", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/r2;", "checkName", b.f22420d, "checkValue", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "headersOf", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;", "toHeaders", TTDownloadField.TT_HEADERS, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            boolean z4;
            boolean z5;
            if (str.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                int length = str.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = str.charAt(i5);
                    if ('!' <= charAt && charAt < 127) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i5), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[LOOP:0: B:2:0x0006->B:13:0x006f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void checkValue(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                int r0 = r7.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L72
                char r3 = r7.charAt(r2)
                r4 = 9
                r5 = 1
                if (r3 == r4) goto L21
                r4 = 32
                if (r4 > r3) goto L1b
                r4 = 127(0x7f, float:1.78E-43)
                if (r3 >= r4) goto L1b
                r4 = r5
                goto L1c
            L1b:
                r4 = r1
            L1c:
                if (r4 == 0) goto L1f
                goto L21
            L1f:
                r4 = r1
                goto L22
            L21:
                r4 = r5
            L22:
                if (r4 != 0) goto L6f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r4[r5] = r1
                r1 = 2
                r4[r1] = r8
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = okhttp3.internal.Util.format(r1, r4)
                r0.append(r1)
                boolean r8 = okhttp3.internal.Util.isSensitiveHeader(r8)
                if (r8 == 0) goto L4d
                java.lang.String r7 = ""
                goto L5e
            L4d:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r1 = ": "
                r8.append(r1)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
            L5e:
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r7 = r7.toString()
                r8.<init>(r7)
                throw r8
            L6f:
                int r2 = r2 + 1
                goto L6
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.checkValue(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String get(java.lang.String[] r5, java.lang.String r6) {
            /*
                r4 = this;
                int r0 = r5.length
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = kotlin.internal.n.c(r0, r1, r2)
                if (r1 > r0) goto L1d
            Lb:
                r2 = r5[r0]
                r3 = 1
                boolean r2 = kotlin.text.v.K1(r6, r2, r3)
                if (r2 == 0) goto L18
                int r0 = r0 + r3
                r5 = r5[r0]
                return r5
            L18:
                if (r0 == r1) goto L1d
                int r0 = r0 + (-2)
                goto Lb
            L1d:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.get(java.lang.String[], java.lang.String):java.lang.String");
        }

        @l
        @h(name = "-deprecated_of")
        @k(level = m.ERROR, message = "function name changed", replaceWith = @b1(expression = "headersOf(*namesAndValues)", imports = {}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m6507deprecated_of(@l String... namesAndValues) {
            l0.p(namesAndValues, "namesAndValues");
            return of((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        @l
        @h(name = "of")
        @u3.m
        public final Headers of(@l String... namesAndValues) {
            CharSequence C5;
            l0.p(namesAndValues, "namesAndValues");
            int i5 = 0;
            if (namesAndValues.length % 2 == 0) {
                String[] strArr = (String[]) namesAndValues.clone();
                int length = strArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    String str = strArr[i6];
                    if (str != null) {
                        C5 = f0.C5(str);
                        strArr[i6] = C5.toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int c5 = n.c(0, strArr.length - 1, 2);
                if (c5 >= 0) {
                    while (true) {
                        String str2 = strArr[i5];
                        String str3 = strArr[i5 + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i5 == c5) {
                            break;
                        }
                        i5 += 2;
                    }
                }
                return new Headers(strArr, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        @l
        @h(name = "-deprecated_of")
        @k(level = m.ERROR, message = "function moved to extension", replaceWith = @b1(expression = "headers.toHeaders()", imports = {}))
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m6506deprecated_of(@l Map<String, String> headers) {
            l0.p(headers, "headers");
            return of(headers);
        }

        @l
        @h(name = "of")
        @u3.m
        public final Headers of(@l Map<String, String> map) {
            CharSequence C5;
            CharSequence C52;
            l0.p(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i5 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C5 = f0.C5(key);
                String obj = C5.toString();
                C52 = f0.C5(value);
                String obj2 = C52.toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i5] = obj;
                strArr[i5 + 1] = obj2;
                i5 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, w wVar) {
        this(strArr);
    }

    @l
    @h(name = "of")
    @u3.m
    public static final Headers of(@l Map<String, String> map) {
        return Companion.of(map);
    }

    @l
    @h(name = "of")
    @u3.m
    public static final Headers of(@l String... strArr) {
        return Companion.of(strArr);
    }

    @h(name = "-deprecated_size")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m6505deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i5 = 0; i5 < strArr.length; i5++) {
            length += this.namesAndValues[i5].length();
        }
        return length;
    }

    public boolean equals(@p4.m Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    @p4.m
    public final String get(@l String name) {
        l0.p(name, "name");
        return Companion.get(this.namesAndValues, name);
    }

    @p4.m
    public final Date getDate(@l String name) {
        l0.p(name, "name");
        String str = get(name);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    @IgnoreJRERequirement
    @p4.m
    public final Instant getInstant(@l String name) {
        Instant instant;
        l0.p(name, "name");
        Date date = getDate(name);
        if (date != null) {
            instant = date.toInstant();
            return instant;
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    @l
    public Iterator<u0<? extends String, ? extends String>> iterator() {
        int size = size();
        u0[] u0VarArr = new u0[size];
        for (int i5 = 0; i5 < size; i5++) {
            u0VarArr[i5] = q1.a(name(i5), value(i5));
        }
        return i.a(u0VarArr);
    }

    @l
    public final String name(int i5) {
        return this.namesAndValues[i5 * 2];
    }

    @l
    public final Set<String> names() {
        Comparator Q1;
        Q1 = e0.Q1(t1.f19457a);
        TreeSet treeSet = new TreeSet(Q1);
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            treeSet.add(name(i5));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        l0.o(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @l
    public final Builder newBuilder() {
        Builder builder = new Builder();
        b0.p0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    @h(name = "size")
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @l
    public final Map<String, List<String>> toMultimap() {
        Comparator Q1;
        Q1 = e0.Q1(t1.f19457a);
        TreeMap treeMap = new TreeMap(Q1);
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            String name = name(i5);
            Locale US = Locale.US;
            l0.o(US, "US");
            String lowerCase = name.toLowerCase(US);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i5));
        }
        return treeMap;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            String name = name(i5);
            String value = value(i5);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @l
    public final String value(int i5) {
        return this.namesAndValues[(i5 * 2) + 1];
    }

    @l
    public final List<String> values(@l String name) {
        List<String> E;
        boolean K1;
        l0.p(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            K1 = e0.K1(name, name(i5), true);
            if (K1) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i5));
            }
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            l0.o(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        E = kotlin.collections.w.E();
        return E;
    }
}
