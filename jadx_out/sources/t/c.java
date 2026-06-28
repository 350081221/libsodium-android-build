package t;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f22408a;

    public c(b bVar) {
        this.f22408a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22408a.d();
        } catch (Exception e5) {
            d.c(e5);
        }
    }
}
