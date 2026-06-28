.class public Lcom/huawei/agconnect/credential/obs/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/huawei/agconnect/credential/obs/s;

.field private b:Ljava/lang/Boolean;

.field private c:Lokhttp3/OkHttpClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/agconnect/credential/obs/s;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/huawei/agconnect/credential/obs/u;->b:Ljava/lang/Boolean;

    iput-object p2, p0, Lcom/huawei/agconnect/credential/obs/u;->a:Lcom/huawei/agconnect/credential/obs/s;

    invoke-direct {p0, p1}, Lcom/huawei/agconnect/credential/obs/u;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/u;)Lcom/huawei/agconnect/credential/obs/s;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/credential/obs/u;->a:Lcom/huawei/agconnect/credential/obs/s;

    return-object p0
.end method

.method static synthetic a(Lcom/huawei/agconnect/credential/obs/u;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/u;->b:Ljava/lang/Boolean;

    return-object p1
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lcom/huawei/agconnect/credential/obs/u$1;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/credential/obs/u$1;-><init>(Lcom/huawei/agconnect/credential/obs/u;)V

    new-instance v1, Lcom/huawei/agconnect/credential/obs/q;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {v1, p1, v0, v2}, Lcom/huawei/agconnect/credential/obs/q;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    invoke-virtual {v1}, Lcom/huawei/agconnect/credential/obs/q;->a()Lokhttp3/OkHttpClient;

    move-result-object p1

    iput-object p1, p0, Lcom/huawei/agconnect/credential/obs/u;->c:Lokhttp3/OkHttpClient;

    return-void
.end method

.method static synthetic b(Lcom/huawei/agconnect/credential/obs/u;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/credential/obs/u;->b:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public a()Lokhttp3/OkHttpClient;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/u;->c:Lokhttp3/OkHttpClient;

    return-object v0
.end method

.method public b()Lcom/huawei/agconnect/credential/obs/s;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/u;->a:Lcom/huawei/agconnect/credential/obs/s;

    return-object v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/credential/obs/u;->b:Ljava/lang/Boolean;

    return-object v0
.end method
