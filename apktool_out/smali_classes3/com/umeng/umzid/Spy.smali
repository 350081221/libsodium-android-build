.class public Lcom/umeng/umzid/Spy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static initSuccess:Z = false


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "umeng-spy"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/umeng/umzid/Spy;->initSuccess:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getID()Ljava/lang/String;
    .locals 1

    sget-boolean v0, Lcom/umeng/umzid/Spy;->initSuccess:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/umeng/umzid/Spy;->getNativeID()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static native getNativeID()Ljava/lang/String;
.end method

.method public static native getNativeLibraryVersion()Ljava/lang/String;
.end method

.method public static native getNativeTag(ZZ)Ljava/lang/String;
.end method

.method public static declared-synchronized getTag(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-class v0, Lcom/umeng/umzid/Spy;

    monitor-enter v0

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-static {p0}, Lcom/umeng/umzid/d;->j(Landroid/content/Context;)Z

    move-result v2

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/umeng/umzid/d;->i(Landroid/content/Context;)Z

    move-result v1

    :cond_1
    invoke-static {v2, v1}, Lcom/umeng/umzid/Spy;->getNativeTag(ZZ)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0

    throw p0
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    sget-boolean v0, Lcom/umeng/umzid/Spy;->initSuccess:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/umeng/umzid/Spy;->getNativeLibraryVersion()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
