.class public final Lcom/airbnb/lottie/compose/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u001f\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007B@\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\'\u0010\u0008\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00028\u00000\t\u00a2\u0006\u0002\u0010\u000eR5\u0010\u0008\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00028\u00000\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00028\u0000X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/airbnb/lottie/compose/LottieDynamicProperty;",
        "T",
        "",
        "property",
        "keyPath",
        "Lcom/airbnb/lottie/model/KeyPath;",
        "value",
        "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Ljava/lang/Object;)V",
        "callback",
        "Lkotlin/Function1;",
        "Lcom/airbnb/lottie/value/LottieFrameInfo;",
        "Lkotlin/ParameterName;",
        "name",
        "frameInfo",
        "(Ljava/lang/Object;Lcom/airbnb/lottie/model/KeyPath;Lkotlin/jvm/functions/Function1;)V",
        "getCallback$lottie_compose_release",
        "()Lkotlin/jvm/functions/Function1;",
        "getKeyPath$lottie_compose_release",
        "()Lcom/airbnb/lottie/model/KeyPath;",
        "getProperty$lottie_compose_release",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "lottie-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:I = 0x8


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final b:Lcom/airbnb/lottie/model/e;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final c:Lv3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/l<",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/airbnb/lottie/model/e;Ljava/lang/Object;)V
    .locals 1
    .param p2    # Lcom/airbnb/lottie/model/e;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/airbnb/lottie/model/e;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "keyPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lcom/airbnb/lottie/compose/m$a;

    invoke-direct {v0, p3}, Lcom/airbnb/lottie/compose/m$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/airbnb/lottie/compose/m;-><init>(Ljava/lang/Object;Lcom/airbnb/lottie/model/e;Lv3/l;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lcom/airbnb/lottie/model/e;Lv3/l;)V
    .locals 1
    .param p2    # Lcom/airbnb/lottie/model/e;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/airbnb/lottie/model/e;",
            "Lv3/l<",
            "-",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;+TT;>;)V"
        }
    .end annotation

    const-string v0, "keyPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/airbnb/lottie/compose/m;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lcom/airbnb/lottie/compose/m;->b:Lcom/airbnb/lottie/model/e;

    .line 4
    iput-object p3, p0, Lcom/airbnb/lottie/compose/m;->c:Lv3/l;

    return-void
.end method


# virtual methods
.method public final a()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Lcom/airbnb/lottie/value/b<",
            "TT;>;TT;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/m;->c:Lv3/l;

    return-object v0
.end method

.method public final b()Lcom/airbnb/lottie/model/e;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/m;->b:Lcom/airbnb/lottie/model/e;

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/compose/m;->a:Ljava/lang/Object;

    return-object v0
.end method
