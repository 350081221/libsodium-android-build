package com.uc.crashsdk.a;

/* loaded from: classes3.dex */
public class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f11909a = true;

    /* renamed from: b, reason: collision with root package name */
    private final int f11910b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f11911c;

    public e(int i5) {
        this.f11910b = i5;
        this.f11911c = null;
    }

    public final boolean a() {
        int i5 = this.f11910b;
        if (i5 != 451 && i5 != 452) {
            switch (i5) {
                case 351:
                case 352:
                case 353:
                case 354:
                    return h.b(i5, this.f11911c);
                default:
                    switch (i5) {
                        case 751:
                        case 752:
                        case 753:
                        case 754:
                        case 755:
                        case 756:
                            return com.uc.crashsdk.f.a(i5, this.f11911c);
                        default:
                            a.d("crashsdk", "Unknown sync runnable: " + toString());
                            if (f11909a) {
                                return false;
                            }
                            throw new AssertionError();
                    }
            }
        }
        return com.uc.crashsdk.e.b(i5, this.f11911c);
    }

    @Override // java.lang.Runnable
    public void run() {
        int i5 = this.f11910b;
        if (i5 != 10) {
            if (i5 != 500) {
                if (i5 != 700) {
                    if (i5 != 800) {
                        if (i5 != 201 && i5 != 202) {
                            switch (i5) {
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                    com.uc.crashsdk.b.a(i5);
                                    return;
                                default:
                                    switch (i5) {
                                        case 301:
                                        case 302:
                                        case 303:
                                            h.a(i5, this.f11911c);
                                            return;
                                        default:
                                            switch (i5) {
                                                case 401:
                                                case 402:
                                                case 403:
                                                    break;
                                                default:
                                                    switch (i5) {
                                                        case 405:
                                                        case 406:
                                                        case 407:
                                                        case 408:
                                                        case 409:
                                                        case 410:
                                                        case 411:
                                                        case 412:
                                                        case 413:
                                                        case 414:
                                                        case 415:
                                                        case 416:
                                                            break;
                                                        default:
                                                            a.d("crashsdk", "Unknown async runnable: " + toString());
                                                            if (f11909a) {
                                                                return;
                                                            } else {
                                                                throw new AssertionError();
                                                            }
                                                    }
                                            }
                                            com.uc.crashsdk.e.a(i5, this.f11911c);
                                            return;
                                    }
                            }
                        }
                        com.uc.crashsdk.a.a(i5);
                        return;
                    }
                    g.a(i5);
                    return;
                }
                com.uc.crashsdk.f.b(i5);
                return;
            }
            d.a(i5);
            return;
        }
        f.a(i5, this.f11911c);
    }

    public String toString() {
        return super.toString() + "@action_" + this.f11910b;
    }

    public e(int i5, Object[] objArr) {
        this.f11910b = i5;
        this.f11911c = objArr;
    }
}
