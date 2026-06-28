.class public Lcom/huawei/agconnect/common/api/AGCInstanceID;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final preferences:Lcom/huawei/agconnect/credential/obs/e;

.field private final wrapper:Lcom/huawei/agconnect/credential/obs/d;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/huawei/agconnect/credential/obs/d;

    invoke-direct {v0, p1}, Lcom/huawei/agconnect/credential/obs/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    new-instance v0, Lcom/huawei/agconnect/credential/obs/e;

    const-string v1, "aaid"

    invoke-direct {v0, p1, v1}, Lcom/huawei/agconnect/credential/obs/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/agconnect/common/api/AGCInstanceID;
    .locals 1

    new-instance v0, Lcom/huawei/agconnect/common/api/AGCInstanceID;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/common/api/AGCInstanceID;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public deleteAAID()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/d;->d()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    const-string v1, "aaid"

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/credential/obs/e;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/credential/obs/e;->f(Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    const-string v1, "creationTime"

    invoke-virtual {v0, v1}, Lcom/huawei/agconnect/credential/obs/e;->f(Ljava/lang/String;)Z

    :cond_1
    return-void
.end method

.method public getCreationTime()J
    .locals 2

    const-string v0, "creationTime"

    iget-object v1, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    invoke-virtual {v1}, Lcom/huawei/agconnect/credential/obs/d;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/d;->c()J

    move-result-wide v0

    return-wide v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/credential/obs/e;->e(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/huawei/agconnect/common/api/AGCInstanceID;->getId()Ljava/lang/String;

    :cond_1
    iget-object v1, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    invoke-virtual {v1, v0}, Lcom/huawei/agconnect/credential/obs/e;->d(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->wrapper:Lcom/huawei/agconnect/credential/obs/d;

    invoke-virtual {v0}, Lcom/huawei/agconnect/credential/obs/d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/agconnect/common/api/AGCInstanceID;->preferences:Lcom/huawei/agconnect/credential/obs/e;

    invoke-static {v0}, Lcom/huawei/agconnect/credential/obs/c;->a(Lcom/huawei/agconnect/credential/obs/e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
