package m;

/* loaded from: classes2.dex */
public class a extends g1.a {
    public a(String str, String str2, long j5) {
        super(str, str2, j5);
    }

    public static a e(g1.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new a(aVar.a(), aVar.b(), aVar.c());
    }
}
