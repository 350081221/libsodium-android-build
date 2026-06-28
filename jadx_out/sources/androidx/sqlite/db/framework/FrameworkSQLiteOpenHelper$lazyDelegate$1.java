package androidx.sqlite.db.framework;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends n0 implements v3.a<FrameworkSQLiteOpenHelper.OpenHelper> {
    final /* synthetic */ FrameworkSQLiteOpenHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.this$0 = frameworkSQLiteOpenHelper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
        String str;
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        Context context;
        String str2;
        SupportSQLiteOpenHelper.Callback callback;
        boolean z4;
        boolean z5;
        boolean z6;
        Context context2;
        String str3;
        Context context3;
        SupportSQLiteOpenHelper.Callback callback2;
        boolean z7;
        str = this.this$0.name;
        if (str != null) {
            z6 = this.this$0.useNoBackupDirectory;
            if (z6) {
                context2 = this.this$0.context;
                File noBackupFilesDir = SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(context2);
                str3 = this.this$0.name;
                File file = new File(noBackupFilesDir, str3);
                context3 = this.this$0.context;
                String absolutePath = file.getAbsolutePath();
                FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder = new FrameworkSQLiteOpenHelper.DBRefHolder(null);
                callback2 = this.this$0.callback;
                z7 = this.this$0.allowDataLossOnRecovery;
                openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context3, absolutePath, dBRefHolder, callback2, z7);
                z5 = this.this$0.writeAheadLoggingEnabled;
                SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z5);
                return openHelper;
            }
        }
        context = this.this$0.context;
        str2 = this.this$0.name;
        FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder2 = new FrameworkSQLiteOpenHelper.DBRefHolder(null);
        callback = this.this$0.callback;
        z4 = this.this$0.allowDataLossOnRecovery;
        openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context, str2, dBRefHolder2, callback, z4);
        z5 = this.this$0.writeAheadLoggingEnabled;
        SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z5);
        return openHelper;
    }
}
