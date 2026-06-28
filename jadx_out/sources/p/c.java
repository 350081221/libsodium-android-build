package p;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c implements FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f22252a;

    public c(b bVar) {
        this.f22252a = bVar;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }
}
