.class Lcom/huawei/agconnect/https/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<HttpsRequest:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "THttpsRequest;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(THttpsRequest;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/agconnect/https/f;->a:Ljava/lang/Object;

    return-void
.end method

.method static a(Ljava/lang/Object;)Lcom/huawei/agconnect/https/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<HttpsRequest:",
            "Ljava/lang/Object;",
            ">(THttpsRequest;)",
            "Lcom/huawei/agconnect/https/f;"
        }
    .end annotation

    new-instance v0, Lcom/huawei/agconnect/https/f;

    invoke-direct {v0, p0}, Lcom/huawei/agconnect/https/f;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method a()Lokhttp3/Request$Builder;
    .locals 1

    iget-object v0, p0, Lcom/huawei/agconnect/https/f;->a:Ljava/lang/Object;

    invoke-static {v0}, Lcom/huawei/agconnect/https/a;->a(Ljava/lang/Object;)Lokhttp3/Request$Builder;

    move-result-object v0

    return-object v0
.end method
