package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.collections.c;
import kotlin.i0;
import p4.l;
import w3.a;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\bJ\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "subList", "fromIndex", "", "toIndex", "SubList", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, a {

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Lkotlin/collections/c;", "", "index", "get", "(I)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "source", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "I", "_size", "getSize", "()I", "size", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;II)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class SubList<E> extends c<E> implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;

        @l
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(@l ImmutableList<? extends E> immutableList, int i5, int i6) {
            this.source = immutableList;
            this.fromIndex = i5;
            this.toIndex = i6;
            ListImplementation.checkRangeIndexes$runtime_release(i5, i6, immutableList.size());
            this._size = i6 - i5;
        }

        @Override // kotlin.collections.c, java.util.List
        public E get(int i5) {
            ListImplementation.checkElementIndex$runtime_release(i5, this._size);
            return this.source.get(this.fromIndex + i5);
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return this._size;
        }

        @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        @l
        public ImmutableList<E> subList(int i5, int i6) {
            ListImplementation.checkRangeIndexes$runtime_release(i5, i6, this._size);
            ImmutableList<E> immutableList = this.source;
            int i7 = this.fromIndex;
            return new SubList(immutableList, i5 + i7, i7 + i6);
        }
    }

    @Override // java.util.List
    @l
    default ImmutableList<E> subList(int i5, int i6) {
        return new SubList(this, i5, i6);
    }
}
