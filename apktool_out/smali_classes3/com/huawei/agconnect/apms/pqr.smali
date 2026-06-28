.class public Lcom/huawei/agconnect/apms/pqr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/opq;


# static fields
.field public static final bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

.field public static cde:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public abc:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/huawei/agconnect/apms/log/AgentLogManager;->getAgentLog()Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 6
    .line 7
    new-instance v0, Lcom/huawei/agconnect/apms/pqr$abc;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/huawei/agconnect/apms/pqr$abc;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/huawei/agconnect/apms/pqr;->cde:Ljava/util/Comparator;

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/huawei/agconnect/apms/pqr;->abc:Ljava/lang/String;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public abc(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 27
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    iget-object v1, p0, Lcom/huawei/agconnect/apms/pqr;->abc:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    .line 29
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-nez p1, :cond_1

    .line 30
    sget-object p1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v0, "create dir failed."

    invoke-interface {p1, v0}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v0
.end method

.method public abc(Landroid/content/Context;Z)Ljava/util/List;
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/huawei/agconnect/apms/pqr;->abc:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 20
    sget-object p1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "please set dir name."

    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_1

    .line 23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object p1

    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    .line 25
    sget-object p2, Lcom/huawei/agconnect/apms/pqr;->cde:Ljava/util/Comparator;

    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :cond_2
    if-nez p1, :cond_3

    .line 26
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public abc(Landroid/content/Context;Lcom/huawei/agconnect/apms/qrs;)V
    .locals 4

    const-string v0, "close file failed: "

    .line 1
    iget-object v1, p0, Lcom/huawei/agconnect/apms/pqr;->abc:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    sget-object p1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "please set dir name."

    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 3
    sget-object p1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string p2, "file content is null."

    invoke-interface {p1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_1
    sget-object v1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    const-string v2, "start save file."

    invoke-interface {v1, v2}, Lcom/huawei/agconnect/apms/log/AgentLog;->debug(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/apms/pqr;->abc(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "not found dir."

    .line 6
    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    return-void

    .line 7
    :cond_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    .line 8
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 9
    :try_start_0
    invoke-static {v2}, Lokio/y0;->n(Ljava/io/File;)Lokio/l1;

    move-result-object v1

    invoke-static {v1}, Lokio/y0;->d(Lokio/l1;)Lokio/m;

    move-result-object p1

    .line 10
    invoke-virtual {p2}, Lcom/huawei/agconnect/apms/qrs;->abc()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-interface {p1, p2, v1}, Lokio/m;->n0(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/m;

    .line 11
    invoke-interface {p1}, Lokio/l1;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    :try_start_1
    invoke-interface {p1}, Lokio/l1;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p2

    .line 13
    :try_start_2
    sget-object v1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write file error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v1, p2}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p1, :cond_3

    .line 14
    :try_start_3
    invoke-interface {p1}, Lokio/l1;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 15
    :goto_0
    sget-object p2, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void

    :catchall_2
    move-exception p2

    if-eqz p1, :cond_4

    .line 16
    :try_start_4
    invoke-interface {p1}, Lokio/l1;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    .line 17
    sget-object v1, Lcom/huawei/agconnect/apms/pqr;->bcd:Lcom/huawei/agconnect/apms/log/AgentLog;

    invoke-static {v0}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Lcom/huawei/agconnect/apms/log/AgentLog;->error(Ljava/lang/String;)V

    .line 18
    :cond_4
    :goto_2
    throw p2
.end method
