.class public Lcom/huawei/agconnect/apms/hij;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/apms/fgh;


# instance fields
.field public abc:Lcom/huawei/agconnect/apms/l1;

.field public final bcd:Lcom/huawei/agconnect/apms/efg;

.field public final cde:Lcom/huawei/agconnect/apms/ijk;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/huawei/agconnect/apms/l1;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/l1;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/hij;->abc:Lcom/huawei/agconnect/apms/l1;

    .line 3
    new-instance v0, Lcom/huawei/agconnect/apms/efg;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/efg;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/hij;->bcd:Lcom/huawei/agconnect/apms/efg;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/huawei/agconnect/apms/hij;->cde:Lcom/huawei/agconnect/apms/ijk;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/agconnect/apms/efg;Lcom/huawei/agconnect/apms/ijk;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lcom/huawei/agconnect/apms/l1;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/l1;-><init>()V

    iput-object v0, p0, Lcom/huawei/agconnect/apms/hij;->abc:Lcom/huawei/agconnect/apms/l1;

    .line 7
    iput-object p1, p0, Lcom/huawei/agconnect/apms/hij;->bcd:Lcom/huawei/agconnect/apms/efg;

    .line 8
    iput-object p2, p0, Lcom/huawei/agconnect/apms/hij;->cde:Lcom/huawei/agconnect/apms/ijk;

    return-void
.end method


# virtual methods
.method public abc()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public abc(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public abc(Z)V
    .locals 0

    return-void
.end method

.method public bcd(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hij;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/huawei/agconnect/apms/hij;->bcd:Lcom/huawei/agconnect/apms/efg;

    .line 7
    .line 8
    xor-int/lit8 v2, p1, 0x1

    .line 9
    .line 10
    iput-boolean v2, v1, Lcom/huawei/agconnect/apms/efg;->abc:Z

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Lcom/huawei/agconnect/apms/ijk;->abc(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hij;->cde:Lcom/huawei/agconnect/apms/ijk;

    .line 16
    .line 17
    const-string v1, "apms.enable.remote.config"

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Lcom/huawei/agconnect/apms/ijk;->abc(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bcd()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public cde()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/apms/hij;->abc:Lcom/huawei/agconnect/apms/l1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput v1, v0, Lcom/huawei/agconnect/apms/l1;->bcd:I

    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    iput-wide v1, v0, Lcom/huawei/agconnect/apms/l1;->abc:J

    .line 11
    .line 12
    return-void
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
.end method

.method public cde(Z)V
    .locals 0

    return-void
.end method

.method public def()Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;

    invoke-direct {v0}, Lcom/huawei/agconnect/apms/collect/model/basic/UserSettingsInformation;-><init>()V

    return-object v0
.end method

.method public efg()Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;
    .locals 8

    new-instance v7, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const-string v4, "null"

    const-wide/16 v5, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/huawei/agconnect/apms/collect/model/basic/RuntimeEnvInformation;-><init>(JILjava/lang/String;J)V

    return-object v7
.end method

.method public fgh()Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;
    .locals 2

    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;

    const-string v1, ""

    invoke-direct {v0, v1, v1, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/PlatformInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public ghi()Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;
    .locals 3

    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;

    const-string v1, "null"

    const-string v2, "0.0"

    invoke-direct {v0, v1, v2, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/ApplicationInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public hij()Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;
    .locals 2

    new-instance v0, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;

    const-string v1, ""

    invoke-direct {v0, v1, v1, v1}, Lcom/huawei/agconnect/apms/collect/model/basic/DeviceInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public ijk()Lcom/huawei/agconnect/apms/util/Session;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public jkl()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public klm()Landroid/content/Context;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public lmn()Lcom/huawei/agconnect/apms/efg;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/apms/hij;->bcd:Lcom/huawei/agconnect/apms/efg;

    return-object v0
.end method
