.class public abstract Lcom/efs/sdk/base/protocol/AbsLog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/protocol/ILogProtocol;


# instance fields
.field private cp:Ljava/lang/String;

.field private de:B

.field private logType:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "none"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/efs/sdk/base/protocol/AbsLog;->cp:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-byte v0, p0, Lcom/efs/sdk/base/protocol/AbsLog;->de:B

    .line 10
    .line 11
    iput-object p1, p0, Lcom/efs/sdk/base/protocol/AbsLog;->logType:Ljava/lang/String;

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public getLogType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/efs/sdk/base/protocol/AbsLog;->logType:Ljava/lang/String;

    return-object v0
.end method

.method public isCp()Z
    .locals 2

    iget-object v0, p0, Lcom/efs/sdk/base/protocol/AbsLog;->cp:Ljava/lang/String;

    const-string v1, "none"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDe()Z
    .locals 2

    iget-byte v0, p0, Lcom/efs/sdk/base/protocol/AbsLog;->de:B

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setCp(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/base/protocol/AbsLog;->cp:Ljava/lang/String;

    return-void
.end method

.method public setDe(B)V
    .locals 0

    iput-byte p1, p0, Lcom/efs/sdk/base/protocol/AbsLog;->de:B

    return-void
.end method
