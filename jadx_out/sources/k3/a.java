package k3;

/* loaded from: classes3.dex */
public final class a<L, R> extends b<L, R> {
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    public a(L l5, R r5) {
        this.left = l5;
        this.right = r5;
    }

    public static <L, R> a<L, R> of(L l5, R r5) {
        return new a<>(l5, r5);
    }

    @Override // k3.b
    public L getLeft() {
        return this.left;
    }

    @Override // k3.b
    public R getRight() {
        return this.right;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r5) {
        throw new UnsupportedOperationException();
    }
}
