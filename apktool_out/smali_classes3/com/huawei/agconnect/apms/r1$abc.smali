.class public Lcom/huawei/agconnect/apms/r1$abc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/agconnect/apms/r1;->cde()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic abc:Lcom/huawei/agconnect/apms/r1;


# direct methods
.method public constructor <init>(Lcom/huawei/agconnect/apms/r1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/apms/r1$abc;->abc:Lcom/huawei/agconnect/apms/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/agconnect/apms/r1$abc;->abc:Lcom/huawei/agconnect/apms/r1;

    .line 2
    .line 3
    const-wide/32 v1, 0x15180

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1, v2}, Lcom/huawei/agconnect/apms/r1;->abc(Lcom/huawei/agconnect/apms/r1;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    sget-object v1, Lcom/huawei/agconnect/apms/r1;->efg:Lcom/huawei/agconnect/apms/log/AgentLog;

    .line 12
    .line 13
    const-string v2, "exception occurred while fetch remote config: "

    .line 14
    .line 15
    invoke-static {v2}, Lcom/huawei/agconnect/apms/abc;->abc(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v2, v1}, Lcom/huawei/agconnect/apms/abc;->bcd(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Lcom/huawei/agconnect/apms/log/AgentLog;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-void
    .line 23
.end method
