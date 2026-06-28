.class final Lcom/efs/sdk/net/OkHttpListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/EventListener$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/net/OkHttpListener;->get()Lokhttp3/EventListener$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lokhttp3/Call;)Lokhttp3/EventListener;
    .locals 0
    .param p1    # Lokhttp3/Call;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance p1, Lcom/efs/sdk/net/OkHttpListener;

    invoke-direct {p1}, Lcom/efs/sdk/net/OkHttpListener;-><init>()V

    return-object p1
.end method
