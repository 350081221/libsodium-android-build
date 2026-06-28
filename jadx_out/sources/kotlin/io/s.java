package kotlin.io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "reader", "Ljava/io/BufferedReader;", "(Ljava/io/BufferedReader;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s implements kotlin.sequences.m<String> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final BufferedReader f19370a;

    @i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "done", "", "nextValue", "hasNext", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<String>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        @p4.m
        private String f19371a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19372b;

        a() {
        }

        @Override // java.util.Iterator
        @p4.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f19371a;
                this.f19371a = null;
                l0.m(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19371a == null && !this.f19372b) {
                String readLine = s.this.f19370a.readLine();
                this.f19371a = readLine;
                if (readLine == null) {
                    this.f19372b = true;
                }
            }
            if (this.f19371a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(@p4.l BufferedReader reader) {
        l0.p(reader, "reader");
        this.f19370a = reader;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<String> iterator() {
        return new a();
    }
}
