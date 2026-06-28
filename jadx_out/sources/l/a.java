package l;

/* loaded from: classes2.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f20700a = "Thread: ";

    @Override // e.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Thread thread) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Thread: ");
        stringBuffer.append(thread.getName());
        return stringBuffer.toString();
    }
}
