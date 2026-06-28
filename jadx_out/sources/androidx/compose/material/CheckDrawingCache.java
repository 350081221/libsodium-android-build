package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/material/CheckDrawingCache;", "", "checkPath", "Landroidx/compose/ui/graphics/Path;", "pathMeasure", "Landroidx/compose/ui/graphics/PathMeasure;", "pathToDraw", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathMeasure;Landroidx/compose/ui/graphics/Path;)V", "getCheckPath", "()Landroidx/compose/ui/graphics/Path;", "getPathMeasure", "()Landroidx/compose/ui/graphics/PathMeasure;", "getPathToDraw", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class CheckDrawingCache {

    @l
    private final Path checkPath;

    @l
    private final PathMeasure pathMeasure;

    @l
    private final Path pathToDraw;

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }

    public CheckDrawingCache(@l Path path, @l PathMeasure pathMeasure, @l Path path2) {
        this.checkPath = path;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = path2;
    }

    @l
    public final Path getCheckPath() {
        return this.checkPath;
    }

    @l
    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    @l
    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i5, w wVar) {
        this((i5 & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i5 & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i5 & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }
}
