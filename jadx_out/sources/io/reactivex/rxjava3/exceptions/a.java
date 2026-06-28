package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* renamed from: io.reactivex.rxjava3.exceptions.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0452a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        C0452a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class b {
        b() {
        }

        abstract void a(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintStream f16244a;

        c(PrintStream printStream) {
            this.f16244a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.a.b
        void a(Object obj) {
            this.f16244a.println(obj);
        }
    }

    /* loaded from: classes3.dex */
    static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final PrintWriter f16245a;

        d(PrintWriter printWriter) {
            this.f16245a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.a.b
        void a(Object obj) {
            this.f16245a.println(obj);
        }
    }

    public a(@l3.f Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    private void appendStackTrace(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            appendStackTrace(sb, th.getCause(), "");
        }
    }

    @Override // java.lang.Throwable
    @l3.f
    public synchronized Throwable getCause() {
        int i5;
        if (this.cause == null) {
            String property = System.getProperty("line.separator");
            if (this.exceptions.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb = new StringBuilder();
                sb.append("Multiple exceptions (");
                sb.append(this.exceptions.size());
                sb.append(")");
                sb.append(property);
                for (Throwable th : this.exceptions) {
                    int i6 = 0;
                    while (true) {
                        if (th != null) {
                            for (int i7 = 0; i7 < i6; i7++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(th.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = th.getMessage();
                            if (message != null && message.contains(property)) {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i8 = 0; i8 < i6 + 2; i8++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            } else {
                                sb.append(message);
                                sb.append(property);
                            }
                            int i9 = 0;
                            while (true) {
                                i5 = i6 + 2;
                                if (i9 >= i5) {
                                    break;
                                }
                                sb.append("  ");
                                i9++;
                            }
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (!identityHashMap.containsKey(th)) {
                                identityHashMap.put(th, Boolean.TRUE);
                                th = th.getCause();
                                i6++;
                            } else {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    for (int i10 = 0; i10 < i5; i10++) {
                                        sb.append("  ");
                                    }
                                    sb.append("|-- ");
                                    sb.append("(cause not expanded again) ");
                                    sb.append(cause.getClass().getCanonicalName());
                                    sb.append(": ");
                                    sb.append(cause.getMessage());
                                    sb.append(property);
                                }
                            }
                        }
                    }
                }
                this.cause = new C0452a(sb.toString().trim());
            } else {
                this.cause = this.exceptions.get(0);
            }
        }
        return this.cause;
    }

    @l3.f
    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    @Override // java.lang.Throwable
    @l3.f
    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.exceptions.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStackTrace(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printStackTrace(new d(printWriter));
    }

    public a(@l3.f Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof a) {
                    linkedHashSet.addAll(((a) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.exceptions = unmodifiableList;
            this.message = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    private void printStackTrace(b bVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i5 = 1;
        for (Throwable th : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i5);
            sb.append(" :\n");
            appendStackTrace(sb, th, "\t");
            i5++;
        }
        bVar.a(sb.toString());
    }
}
