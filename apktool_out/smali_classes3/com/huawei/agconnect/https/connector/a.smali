.class public Lcom/huawei/agconnect/https/connector/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/https/connector/Connector;


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lcom/huawei/agconnect/https/connector/a;


# instance fields
.field private final c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/https/connector/a;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lcom/huawei/agconnect/https/connector/a;->c:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/agconnect/https/connector/a;
    .locals 2

    sget-object v0, Lcom/huawei/agconnect/https/connector/a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/https/connector/a;->b:Lcom/huawei/agconnect/https/connector/a;

    if-nez v1, :cond_0

    new-instance v1, Lcom/huawei/agconnect/https/connector/a;

    invoke-direct {v1, p0}, Lcom/huawei/agconnect/https/connector/a;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/huawei/agconnect/https/connector/a;->b:Lcom/huawei/agconnect/https/connector/a;

    :cond_0
    sget-object p0, Lcom/huawei/agconnect/https/connector/a;->b:Lcom/huawei/agconnect/https/connector/a;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public hasActiveNetwork()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/agconnect/https/connector/a;->c:Landroid/content/Context;

    if-eqz v0, :cond_0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public logger(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
