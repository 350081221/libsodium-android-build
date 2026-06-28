.class public interface abstract Landroidx/sqlite/db/SupportSQLiteQuery;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/sqlite/db/SupportSQLiteQuery;",
        "",
        "Landroidx/sqlite/db/SupportSQLiteProgram;",
        "statement",
        "Lkotlin/r2;",
        "bindTo",
        "",
        "getSql",
        "()Ljava/lang/String;",
        "sql",
        "",
        "getArgCount",
        "()I",
        "argCount",
        "sqlite_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract bindTo(Landroidx/sqlite/db/SupportSQLiteProgram;)V
    .param p1    # Landroidx/sqlite/db/SupportSQLiteProgram;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getArgCount()I
.end method

.method public abstract getSql()Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end method
